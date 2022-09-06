package com.poe.poe2220718.poe20220718.panierplantes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class PlanteDAO {
    
    public static void create(Plante planteToCreate) {
        
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
                
        try {
            tx.begin();
            entityManager.persist(planteToCreate);
            tx.commit();
        }
        catch(Exception e) {
            System.out.println("Exception dans create() : "+e.getMessage());
            tx.rollback();
        }
    }
    
    public static Plante findById(Long id){
         EntityManager entityManager = EntityManagerSingleton.getEntityManager();
         
         Plante c = entityManager.find(Plante.class, id);
         
         return c;
    }
    
    public static List<Plante> findAll(){
        
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();     
        
        Query query = entityManager.createQuery("SELECT p from Plante p");
        return query.getResultList();
    }
    
    public static void delete(Plante plante){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();     
            EntityTransaction tx = entityManager.getTransaction();
        
        tx.begin();
        entityManager.remove(plante);
        tx.commit();
    }
    
    public static void deleteById(Long id) {
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();     
        EntityTransaction tx = entityManager.getTransaction();
        
        tx.begin();
        Query query = entityManager.createQuery("DELETE from Plante p where p.id= :id");
        query.setParameter("id", id);
        query.executeUpdate();
        tx.commit();
    }
    
    public static void update(Long id, Plante newData){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        Plante planteToUpdate = findById(id);
        
        planteToUpdate.setNotNullData(newData);
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(planteToUpdate);
        tx.commit();
    }
}

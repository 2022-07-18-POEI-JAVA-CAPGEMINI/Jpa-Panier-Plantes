package com.poe.poe2220718.poe20220718.panierplantes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plantes")
public class Plante {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
    private String nom;
    private Integer prix;
    private Integer quantite;

    public Plante() {
    }

    
    public Plante(String nom, Integer prix, Integer quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Plante{" + "id=" + id + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + '}';
    }
    
    public void setNotNullData(Plante newPlanteData){
        
//      if(newPersonData.getAge() != null) {
//          this.setAge(newPersonData.getAge());
//      }
//      if(newPersonData.getCity() != null) {
//          this.setCity(newPersonData.getCity());
//      }
//      if(newPersonData.getFirstName()!= null) {
//          this.setFirstName(newPersonData.getFirstName());
//      }
//      if(newPersonData.getLastName()!= null) {
//          this.setLastName(newPersonData.getLastName());
//      }
    }
}

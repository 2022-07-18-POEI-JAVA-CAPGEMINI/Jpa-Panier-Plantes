package com.poe.poe2220718.poe20220718.panierplantes;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/plantes")
public class PlantesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException
    {
       
        List<Plante> plantes = PlanteDAO.findAll();
        request.setAttribute("plantes", plantes);
        
        request.getRequestDispatcher("WEB-INF/plantes.jsp").forward(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException
     {
            String nom = request.getParameter("nom");
            String prixString = request.getParameter("prix");
            String quantiteString = request.getParameter("quantite");
            
            Plante newPlante = new Plante(nom, Integer.parseInt(prixString), Integer.parseInt(quantiteString));
            
            PlanteDAO.create(newPlante);
            
            doGet(request, response);
     }
}

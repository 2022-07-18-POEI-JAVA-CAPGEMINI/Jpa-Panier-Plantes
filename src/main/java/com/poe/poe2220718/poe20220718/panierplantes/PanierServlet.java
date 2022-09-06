package com.poe.poe2220718.poe20220718.panierplantes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/panier")
public class PanierServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException
    {   
        request.getRequestDispatcher("WEB-INF/panier.jsp").forward(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException
     {
            String idString = request.getParameter("id");
            Long id = Long.parseLong(idString);
            
            List<Plante> panier = (List<Plante>)request.getSession().getAttribute("panier");
            if(panier == null) {
                panier = new ArrayList<Plante>();
            }
            
            Plante plante = PlanteDAO.findById(id);
            panier.add(plante);
            request.getSession().setAttribute("panier", panier);
            
    
            doGet(request, response);
     }
}

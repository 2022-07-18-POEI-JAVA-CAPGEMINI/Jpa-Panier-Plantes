<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Boutique de plantes</title>
    </head>
    <body>
        <h1>Mon panier</h1>
        
          <a href="plantes">Affichier Boutique</a>
          
        <ul>
         <c:forEach items="${panier}" var="plante">
            
            <li>Nom: <c:out value="${plante.nom}"/> 
                Prix : <c:out value="${plante.prix}"/>                 
        </c:forEach>
        </ul>
        
   
    </body>
</html>

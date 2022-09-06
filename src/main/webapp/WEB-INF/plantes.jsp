<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Boutique de plantes</title>
    </head>
    <body>
        <h1>Boutique de plantes</h1>
        
        <a href="panier">Affichier Panier</a>
        
        <ul>
         <c:forEach items="${plantes}" var="plante">
            
            <li>Nom: <c:out value="${plante.nom}"/> 
                Prix : <c:out value="${plante.prix}"/>
                Quantité:<c:out value="${plante.quantite}"/>
                 <form action="panier" method="POST">
                    <input type="hidden" name="id" id="id" value="${plante.id}" />
                    <input type="submit" value="Ajouter au panier" />
                </form>
        </c:forEach>
        </ul>
        
        <form action="plantes" method="POST">
            <br />
            <label for="nom">Nom de la plante:</label>
            <input type="text" name="nom" id="nom" required/>
            <br />
            <label for="nom">Prix:</label>
            <input type="text" name="prix" id="prix" required/>
            <br />     
            <label for="nom">Quantite:</label>
            <input type="text" name="quantite" id="quantite" required/>
            <br />
            <input type="submit" value="Ajouter" />
       </form>

    </body>
</html>

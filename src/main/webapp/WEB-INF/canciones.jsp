<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Canciones</title>
</head>
<body>
	<h1>Lista de Canciones</h1>
    <table>
        <thead>
         	<tr>
            <th>Título</th>
            <th>Artista</th>
			<th>Detalle</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cancion" items="${canciones}">
                <tr>
                    <td>${cancion.título}</td>
                    <td>${cancion.artista}</td>
                    <td><a href="/canciones/detalle/${cancion.id}">Detalle</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <form action="/canciones/formulario/agregar/{idCancion}" method="GET">
		<button>Agregar Cancion</button>
	</form>
    
</body>
</html>
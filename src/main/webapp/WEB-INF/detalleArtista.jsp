<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h2>Detalle del Artista</h2>
    <p>Nombre: ${artista.nombre}</p>
    <p>Apellido: ${artista.apellido}</p>
    <p>Biografía: ${artista.biografia}</p>
    <h3>Canciones:</h3>
    <ul>
        <c:forEach items="${artista.canciones}" var="cancion">
            <li>${cancion.título}</li>
        </c:forEach>
    </ul>
    <a href="/artistas">Volver a lista de artistas</a>
</body>
</html>
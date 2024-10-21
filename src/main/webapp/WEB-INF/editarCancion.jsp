<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar cancion</title>
</head>
<body>
	<h2>Editar Canción</h2>

    <form:form method="POST" action="/canciones/procesa/editar/${idCancion}" modelAttribute="cancion">
    	<input type="hidden" name="_method" value="PUT"/>
        <div>
            <label for="título">Título:</label>
            <form:input path="título" />
            <form:errors path="título" cssClass="error" />
        </div>
        <div>
            <label for="artista">Artista:</label>
            <form:input path="artista" />
            <form:errors path="artista" cssClass="error" />
        </div>
        <div>
            <label for="álbum">Álbum:</label>
            <form:input path="álbum" />
            <form:errors path="álbum" cssClass="error" />
        </div>
        <div>
            <label for="género">Género:</label>
            <form:input path="género" />
            <form:errors path="género" cssClass="error" />
        </div>
        <div>
            <label for="idioma">Idioma:</label>
            <form:input path="idioma" />
            <form:errors path="idioma" cssClass="error" />
        </div>

            <button>Editar</button>
    </form:form>

    <a href="/canciones">Volver a lista de canciones</a>
</body>
</html>
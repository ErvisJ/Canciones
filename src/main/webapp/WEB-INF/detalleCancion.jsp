<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle cancion</title>
</head>
<body>
	<h1>Detalle de la Canción</h1>
    <p><strong>Título:</strong> ${cancion.título}</p>
    <p><strong>Artista:</strong> ${cancion.artista.nombre} ${cancion.artista.apellido}</p>
    <p><strong>Álbum:</strong> ${cancion.álbum}</p>
    <p><strong>Género:</strong> ${cancion.género}</p>
    <p><strong>Idioma:</strong> ${cancion.idioma}</p>
    <a href="/canciones">Volver a la lista de canciones</a>
    
   <form action="/canciones/formulario/editar/${idCancion}">
   		<button>
   			Editar
   		</button>
   </form>
   
   <form method="POST" action="/canciones/eliminar/${idCancion}">
   	<input type="hidden" name="_method" value="DELETE"/>
	   	<button>
	   	Eliminar cancion
	   	</button>
   </form>
</body>
</html>
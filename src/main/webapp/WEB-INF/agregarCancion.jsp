<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>agregar cancion</title>
</head>
<body>
	<h2>Agregar una nueva canción</h2>

	<form:form action="/canciones/procesa/agregar" method="POST" modelAttribute="cancion">
					<div>
						<form:label path="título"> Título: </form:label>
						<form:input path="título" />
						<form:errors path="título" /> 
					</div>
					<div>
						<form:label path="artista"> Artista: </form:label>
						<form:input path="artista"/>
						<form:errors path="artista" /> 
					</div>
					<div>
						<form:label path="álbum"> Álbum: </form:label>
						<form:input path="álbum" />
						<form:errors path="álbum" /> 
					</div>
					<div>
						<form:label path="género"> Género: </form:label>
						<form:input  path="género" />
						<form:errors  path="género" /> 
					</div>
					<div>
						<form:label path="idioma"> Idioma: </form:label>
						<form:input path="idioma" />
						<form:errors path="idioma" /> 
					</div>
					<button>Agregar Canción</button>
				</form:form>


<!--<form action="${pageContext.request.contextPath}/canciones/procesa/agregar" method="post">
    <label for="título">Título:</label>
    <input type="text" id="título" name="título" value="${cancion.título}">
   

    <label for="artista">Artista:</label>
    <input type="text" id="artista" name="artista" value="${cancion.artista}">
    

    <label for="álbum">Álbum:</label>
    <input type="text" id="álbum" name="álbum" value="${cancion.álbum}"><br>

    <label for="género">Género:</label>
    <input type="text" id="género" name="género" value="${cancion.género}"><br>

    <label for="idioma">Idioma:</label>
    <input type="text" id="idioma" name="idioma" value="${cancion.idioma}"><br>

    <button type="submit">Agregar Canción</button>
</form>-->

<a href="${pageContext.request.contextPath}/canciones">Volver a lista de canciones</a>
</body>
</html>
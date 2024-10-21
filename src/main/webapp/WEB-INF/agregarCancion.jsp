<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
						    <select name="artistaId">
						        <c:forEach var="artista" items="${artistas}">
						            <option value="${artista.id}">${artista.nombre} ${artista.apellido}</option>
						        </c:forEach>
						    </select>
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

<a href="${pageContext.request.contextPath}/canciones">Volver a lista de canciones</a>
</body>
</html>
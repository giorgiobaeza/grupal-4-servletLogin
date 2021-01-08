<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Listado de capacitaciones</title>
	<link rel="stylesheet" href="estilo.css">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="script.js"></script>
</head>
<body>

	<%
	if(session.getAttribute("nombresesion")==null)
	{
		response.sendRedirect("login.jsp");
	}
	%>	
	<header id="seccion">
        <h2> LISTADO DE CAPACITACIONES</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"></label>
		<p>Bienvenido usuario: <c:out value="${nombresesion}"></c:out></p>
		<a href="./LogoutServlet">
		cerrar sesión
		</a>
        <nav class="menu">
            <ul>
                <li><a href="contactoServlet">Contacto</a></li>
                <li><a href="loginServlet">Ingreso</a></li>
                <li><a href="CrearUsuarioServlet">Crear Usuario</a></li>
                <li><a href="FormCrearCapServlet">Crear Capacitaciones</a></li>
                <li><a href="ListarCapServlet">Listar Capacitaciones</a></li>
                <li><a href="administrarasistentes.html">Asistentes Capacitaciones</a></li>
                <li><a href="listadovisitas.html">Listado Visitas</a></li>
                <li><a href="listadopago.html">Listado Pago</a></li>
                <li><a href="listadoasesorias.html">Listado Asesorías</a></li>
                <li><a href="listadoaccidentes.html">Listado Accidentes</a></li>
                <li><a href="reportes.html">Reportes</a></li>

            </ul>
        </nav>
        </div>
    </header>

    <fieldset class="cel- agrupar-t agrupar-e">
        <table class="cel- tablaadm-t tablaadm-e">
            <tr class="negrita">
            	<th>Id Capacitación</th>
            	<th>Fecha</th>
            	<th>Hora</th>
            	<th>Lugar</th>
            	<th>Duración</th>
            </tr>
            <c:forEach items="${lcapacitacion}" var="lc">
			<tr>
				<td><c:out value="${lc.getIdCapacitacion()}" /></td>
				<td><c:out value="${lc.getCapFecha()}" /></td>
				<td><c:out value="${lc.getCapHora()}" /></td>
				<td><c:out value="${lc.getCapLugar()}" /></td>
				<td><c:out value="${lc.getCapDuracion()}" /></td>
			</tr>
			</c:forEach>
			
				
			
        </table>
        <a href="./FormCrearCapServlet"><button>Crear capacitación</button></a>
    </fieldset>
    <footer id="pie">
        <blockquote><a href="inicioServlet">Volver a la página de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Capacitación</title>
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
        <h2> CREAR CAPACITACION</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"></label>
		<p>Bienvenido usuario: <c:out value="${nombresesion}"></c:out></p>
        <a href="./LogoutServlet">
		cerrar sesión
		</a>
        <nav class="menu">
            <ul>
                <li><a href="contacto.jsp">Contacto</a></li>
                <li><a href="login.html">Ingreso</a></li>
                <li><a href="crearusuario.html">Crear Usuario</a></li>
                <li><a href="crearCapacitacion.jsp">Crear Capacitaciones</a></li>
                <li><a href="listarCapacitacion.jsp">Listar Capacitaciones</a></li>
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
        <form method="post" action="CrearCapServlet">
            <table class="cel- tablas-t tablas-e">
                <tr>
                	<td>id capacitación</td>
                	<td><input type="date" name="idcap" /></td>
                </tr>
                <tr>
                    <td>Fecha de capacitación</td>
                    <td><input type="date" name="capfecha" /></td>
                </tr>
                <tr>
                    <td>Hora de capacitación</td>
                    <td><input type="time" name="caphora" /></td>
                </tr>
                <tr>
                    <td>Lugar</td>
                    <td><input type="text" name="caplugar" /></td>
                </tr>
                <tr>
                    <td>Duración</td>
                    <td><input type="text" name="capduracion" /></td>
                </tr>
				<tr>
					<td><input type="submit" value="Enviar"></td>
				</tr>
                </table>
        </form>
    </fieldset>
    <footer id="pie">
        <blockquote><a href="index.html">Volver a la página de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>
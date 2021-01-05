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
        <table class="cel- tablaadm-t tablaadm-e">
            <tr class="negrita">
                <td>Id Capacitación</td>
                <td>Fecha de Capacitación
                </td>
                <td>Hora de Capacitación</td>
                <td>Nombre del Cliente</td>
            </tr>
            <tr>
                <td>1</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Alamiro Ramírez</td>
            </tr>
            <tr>
                <td>2</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Esteban Piro Po</td>
            </tr>
            <tr>
                <td>3</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Romulo Remo Romano</td>
            </tr>
            <tr>
                <td>4</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Rosa Espinoza</td>
            </tr>
            <tr>
                <td>5</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Elsa Pato</td>
            </tr>
            <tr>
                <td>6</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Ramón Roman</td>
            </tr>
            <tr>
                <td>7</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Maike Tyson</td>
            </tr>
            <tr>
                <td>8</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Elba Lazo</td>
            </tr>
            <tr>
                <td>9</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Aquiles Baeza</td>
            </tr>
            <tr>
                <td>10</td>
                <td>23/12/2008</td>
                <td>13:00 horas</td>
                <td>Adrián Droide</td>
            </tr>
        </table>
    </fieldset>
    <footer id="pie">
        <blockquote><a href="index.html">Volver a la página de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>
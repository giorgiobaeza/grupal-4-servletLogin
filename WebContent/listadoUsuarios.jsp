<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Usuarios</title>
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
        <h2> Listado de Usuarios</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"></label>
		<p>Bienvenido usuario: <c:out value="${nombresesion}"></c:out></p>
        <a href="./LogoutServlet">
		cerrar sesi�n
		</a>
        <nav class="menu">
            <ul>
                <li><a href="contacto.html">Contacto</a></li>
                <li><a href="login.html">Ingreso</a></li>
                <li><a href="crearusuario.html">Crear Usuario</a></li>
                <li><a href="crearcapacitacion.html">Crear Capacitaciones</a></li>
                <li><a href="listarcapacitaciones.html">Listar Capacitaciones</a></li>
                <li><a href="administrarasistentes.html">Asistentes Capacitaciones</a></li>
                <li><a href="listadovisitas.html">Listado Visitas</a></li>
                <li><a href="listadopago.html">Listado Pago</a></li>
                <li><a href="listadoasesorias.html">Listado Asesor�as</a></li>
                <li><a href="listadoaccidentes.html">Listado Accidentes</a></li>
                <li><a href="reportes.html">Reportes</a></li>

            </ul>
        </nav>
        </div>
    </header>
    <fieldset class="cel- agrupar-t agrupar-e">
        <table class="cel- tablaadm-t tablaadm-e">
            <tr class="negrita">
                <td>RUN</td>
                <td>Nombre</td>
                <td>Apellidos</td>
                <td>Tipo de Usuario</td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>12555777-6</td>
                <td>Kevin</td>
                <td>Chuka</td>
                <td>Administrativo</td>
                <td><input type="button" value="Eliminar"></td>
                <td><input type="button" value="Modificar" name="modif"
                        onclick="location.href='editaradministrativo.html'" /></td>
            </tr>
            <tr>
                <td>13666444-7</td>
                <td>Alan</td>
                <td>Brito</td>
                <td>Profesional</td>
                <td><input type="button" value="Eliminar"></td>
                <td><input type="button" value="Modificar" name="modif"
                        onclick="location.href='editarprofesional.html'"></td>
            </tr>
            <tr>
                <td>16444777-3</td>
                <td>Ramiro</td>
                <td>Ramirez</td>
                <td>Cliente</td>
                <td><input type="button" value="Eliminar"></td>
                <td><input type="button" value="Modificar" name="modif" onclick="location.href='editarcliente.html'">
                </td>
            </tr>
        </table>

    </fieldset>
    <footer id="pie">
        <blockquote><a href="index.html">Volver a la p�gina de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>
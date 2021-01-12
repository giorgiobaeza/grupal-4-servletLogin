<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
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
        <h2> FORMULARIO DE CONTACTO</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"></label>
		<p>Bienvenido usuario: <c:out value="${nombresesion}"></c:out></p>		
        <a href="./LogoutServlet">
		cerrar sesión
		</a>
        <nav class="menu">
            <ul>
            	<li><a href="inicioServlet">Inicio</a></li>
                <li><a href="contactoServlet">Contacto</a></li>
                <li><a href="loginServlet">Ingreso</a></li>
                <li><a href="FormCrearUsuarioServlet">Crear Usuario</a></li>
                <li><a href="FormCrearCapServlet">Crear Capacitaciones</a></li>
                <li><a href="listarUsuarioServlet">Listado de Usuarios</a></li>
                <li><a href="ListarCapServlet">Listar Capacitaciones</a></li>
                <!--  <li><a href="administrarasistentes.html">Asistentes Capacitaciones</a></li>
                <li><a href="listadovisitas.html">Listado Visitas</a></li>
                <li><a href="listadopago.html">Listado Pago</a></li>
                <li><a href="listadoasesorias.html">Listado Asesorías</a></li>
                <li><a href="listadoaccidentes.html">Listado Accidentes</a></li>
                <li><a href="reportes.html">Reportes</a></li>-->
            </ul>
        </nav>
        </div>
    </header>

    <fieldset class="cel- agrupar-t agrupar-e">
        <form method="post" action="CrearContactoServlet" class="cmxform" id="contForm"> 
            <table class="cel- tablas-t tablas-e">
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre" /></td>
                </tr>
                <tr>
                    <td>Correo Electrónico</td>
                    <td><input type="email" name="email" /></td>
                </tr>
                <tr>
                    <td>Teléfono</td>
                    <td><input type="text" name="telefono" /></td>
                </tr>
                <tr>
                    <td>Mensaje</td>
                    <td><input type="text" name="mensaje" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Enviar" /></td>
                </tr>
            </table>
        </form>
        
    </fieldset>

    <footer id="pie">
        <blockquote><a href="inicioServlet">Volver a la página de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>
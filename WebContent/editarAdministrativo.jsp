<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Administrativo</title>
	<link rel="stylesheet" href="estilo.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
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
        <h2>Editar Administrativo</h2>
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
                <li><a href="FormCrearUsuarioServlet">Crear Usuario</a></li>
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
        <form method="post" action="CrearAdministrativoServlet" class="cmxform" id="admForm">
            <table class="cel- tablas-t tablas-e">
                <tr>
                    <td>RUN</td>
                    <td><input type="text" name="run" /></td>
                </tr>

                <tr>
                    <td>Nombres</td>
                    <td><input type="text" name="nombre" /></td>
                </tr>
                <tr>
                    <td>Apellidos</td>
                    <td><input type="text" name="apellido" /></td>
                </tr>
                <tr>
                    <td>Correo electrónico</td>
                    <td><input type="text" name="email" /></td>
                </tr>
                <tr>
                    <td>Area</td>
                    <td><input type="text" name="area" /></td>
                </tr>
                <tr>
                    <td>run usuario</td>
                    <td><input type="text" name="runusuario" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Enviar" /></td>
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
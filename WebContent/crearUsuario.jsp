<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
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
        <h2> Crear Usuario</h2>
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
        <form>
            <table class="tablausr-t tablausr-e">
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre" /></td>

                </tr>
                <tr>
                    <td>Apellidos</td>
                    <td> <input type="text" name="apellidos" /></td>

                </tr>
                <tr>
                    <td>Fecha de nacimiento</td>
                    <td><input type="date" name="fnacimiento" /></td>

                </tr>
                <tr>
                    <td>RUT</td>
                    <td><input type="text" name="rut" /></td>

                </tr>
                <tr>
                    <td> Tipo de usuario</td>
                    <td>
                        <input type="radio" name="tipousuario" value="clie" />Cliente
                        <input type="radio" name="tipousuario" value="pro" />Profesional
                        <input type="radio" name="tipousuario" value="adm" />Administrativo
                    </td>
                </tr>


            </table>
        </form>
    </fieldset>
    <footer id="pie">
        <blockquote><a href="index.html">Volver a la p�gina de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>
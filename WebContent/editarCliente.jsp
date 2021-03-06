<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Cliente</title>
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
        <h2>Editar Cliente</h2>
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
        <form method="post" action="ActualizarClienteServlet" class="cmxform" id="cliForm">
        <fieldset class="cel- agrupar-t agrupar-e">
            <table class="cel- tablas-t tablas-e">
                <tr>
                    <td><label for="run">RUN</label></td>
                    <td><input id="run" type="number" name="run" value='<c:out value="${us.getRutCliente()}" />' /></td>

                </tr>
                <tr>
                    <td><label for="nombre">Nombre</label></td>
                    <td><input id="nombre" type="text" name="nombre" value='<c:out value="${us.getCliNombre()}" />' /></td>

                </tr>
                <tr>
                    <td><label for="apellido">Apellido</label></td>
                    <td><input id="apellido" type="text" name="apellido" value='<c:out value="${us.getCliApellido()}" />'/></td>

                </tr>
                <tr>
                    <td><label for="telefono">Teléfono</label></td>
                    <td><input id="telefono" type="number" name="telefono" value='<c:out value="${us.getCliTelefono()}" />'/></td>

                </tr>
                <tr>
                    <td><label for="afp">AFP</label></td>
                    <td><input id="afp" type="text" name="afp" value='<c:out value="${us.getCliAfp()}" />'/></td>

                </tr>
                <tr>
                    <td><label for="sissalud">Sistema de Salud</label></td>
                    <td><select style="margin-right:10px" id="sissalud" name="sissalud">
                            <option value="default">seleccione...</option>
                            <option value="Fonasa">Fonasa</option>
                            <option value="Isapre">Isapre</option>
                        </select></td>

                </tr>
                <tr>
                    <td><label for="direc">Direccion </label></td>
                    <td><input id="direc" type="text" name="direc" value='<c:out value="${us.getCliDireccion()}" />'/></td>

                </tr>
                <tr>
                    <td><label for="comuna">Comuna</label></td>
                    <td><input id="comuna" type="text" name="comuna" value='<c:out value="${us.getCliComuna()}" />'/></td>

                </tr>
                <tr>
                    <td><label for="edad">Edad</label></td>
                    <td><input id="edad" type="number" name="edad" value='<c:out value="${us.getCliEdad()}" />'/></td>

                </tr>
                <tr>
                    <td><label for="runusuario">Run usuario</label></td>
                    <td><input id="runusuario" type="number" name="runusuario" value='<c:out value="${us.getUsuarioRun()}" />'/></td>

                </tr>
                <tr>
                    <td><input type="submit" id="validar" value="validar" /></td>
                </tr>
            </table>
        </fieldset>
    </form>
    <footer id="pie">
        <blockquote><a href="index.html">Volver a la página de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>

</body>
</html>
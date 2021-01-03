<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<link rel="stylesheet" href="estilo.css">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="script.js"></script>
</head>
<body>
<body>
    <header id="seccion">
        <h2> INICIO</h2>
        <h2>Nombre de nuestra Empresa</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check">
        <img src="iconos/icono-menu.png" alt="" class="icon-menu"></label>

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
        <section>

                <h3>�CU�L ES EL OBJETIVO DEL SISTEMA DE INFORMACI�N?</h3>

                <p class="cel- texto-t texto-e">Administrar los principales procesos que se llevan a cabo en ella d�a a d�a.</p>
        </section>

        <section>

                <h3>�QUI�NES DEBER�AN USAR EL SISTEMA?</h3>

                <p class="cel- texto-t texto-e">Personal responsable de los principales procesos</p>
        </section>

        <section>

                <h3>�QU� PROCESOS CONSIDERA LA PLATAFORMA ACTUALMENTE?</h3>

                <p class="cel- texto-t texto-e">Asesor�as en prevenci�n de riesgos</p>
        </section>
    </fieldset>
    <footer id="pie">
        <p>Derechos Reservados G3 &copy; 2020</p>
    </footer>
</body>
</html>
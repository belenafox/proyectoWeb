<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>Exito</title>
	<link rel="stylesheet" href="css/style.css">
    <!-- CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<% if (session.getAttribute("usuario") == null) { %>
        <% response.sendRedirect("Login"); %>
    <% } else { %>
	<main class="container-fluid main-mensaje-exito">
		<div class="mensaje-exito">
			<lottie-player src="https://lottie.host/d2cad16c-ed06-4e6f-b677-339845cc6852/baP3hln3dS.json" background="transparent"  speed="1"  style="width: 200px; height: 200px; margin: 24px auto;" autoplay></lottie-player>
			<h3>Este usuario no existe</strong></h3>
			<a href="/ProyectoWeb/ListadoDeUsuarios" class="btn btn-dark">Volver</a>
		</div>
		
	</main>
	<% } %>

	<!-- JS de Bootstrap -->
	<script src="https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</html>
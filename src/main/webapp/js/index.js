document.addEventListener("DOMContentLoaded", function() {
	var navLinks = document.querySelectorAll(".navbar-nav .nav-link");
    var currentURL = window.location.href;

    navLinks.forEach(function(navLink) {
      if (currentURL.includes(navLink.getAttribute("href"))) {
       	navLink.classList.add("active");
       	navLink.classList.add("link-active");
      }
    });
    
    // botón cerrar sesión
    var logoutButton = document.getElementById("btnCerrarSesion");
    var confirmLogoutModal = new bootstrap.Modal(document.getElementById("confirmLogoutModal"));

    logoutButton.addEventListener("click", function() {
    	 confirmLogoutModal.show();
    });
    
    // mostrar tablas segun el tipo de usuario
  	if(window.location.pathname.includes("listadoDeUsuarios.jsp") || window.location.pathname.includes("ListadoDeUsuarios")) {
		const chkAdmin = document.getElementById("chkAdmin");
	    const chkCliente = document.getElementById("chkCliente");
	    const chkProfesional = document.getElementById("chkProfesional");
	    const tablaAdmin = document.getElementById("tblAdministrativo");
	    const tablaCliente = document.getElementById("tblCliente");
	    const tablaProfesional = document.getElementById("tblProfesional");
	
	    function mostrarTabla(tabla, mostrar) {
	        tabla.style.display = mostrar ? "table" : "none";
	    }
	
	    function mostrarTodasTablas() {
	        const mostrar = chkAdmin.checked || chkCliente.checked || chkProfesional.checked;
	
	        mostrarTabla(tablaAdmin, mostrar && chkAdmin.checked);
	        mostrarTabla(tablaCliente, mostrar && chkCliente.checked);
	        mostrarTabla(tablaProfesional, mostrar && chkProfesional.checked);
	    }
	
	    // Mostrar el formulario de "Administrativo" seleccionado al cargar la página
	    chkAdmin.checked = true;
	    mostrarTodasTablas();
	
	    // Escuchar el evento change en los checkboxes
	    chkAdmin.addEventListener("change", mostrarTodasTablas);
	    chkCliente.addEventListener("change", mostrarTodasTablas);
	    chkProfesional.addEventListener("change", mostrarTodasTablas);
	 }
});

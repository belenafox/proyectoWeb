package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioDAOImpl;
import model.Administrativo;
import model.Cliente;
import model.Profesional;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		String nombre = request.getParameter("nombre");
		String fecha = request.getParameter("fecha");
		String rut = request.getParameter("rut");
		String formulario = request.getParameter("formulario");
		request.setAttribute("formulario", formulario);
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		
		switch(tipo) {
			case "Administrativo":
				Administrativo admin = new Administrativo();
				String area = request.getParameter("area");
				String experiencia = request.getParameter("experiencia");
				
				admin.setTipo(tipo);
				admin.setNombre(nombre);
				admin.setFechaNacimiento(fecha);
				admin.setRut(rut);
				admin.setArea(area);
				admin.setExperiencia(experiencia);
				usuarioDAO.registrarUsuario(admin);
	            break;
	        case "Cliente":
	        	Cliente cliente = new Cliente();
	        	String telefono = request.getParameter("telefono");
	        	String afp = request.getParameter("afp");
	        	String salud = request.getParameter("salud");
	        	String direccion = request.getParameter("direccion");
	        	String comuna = request.getParameter("comuna");
	        	String edad = request.getParameter("edad");
	        	
	        	
	        	cliente.setNombre(nombre);
	        	cliente.setFechaNacimiento(fecha);
	        	cliente.setRut(rut);
	        	cliente.setTelefono(telefono);
	        	cliente.setAfp(afp);
	        	cliente.setSistemaSalud(Integer.parseInt(salud));
	        	cliente.setDireccion(direccion);
	        	cliente.setComuna(comuna);
	        	cliente.setEdad(Integer.parseInt(edad));
	        	usuarioDAO.registrarUsuario(cliente);
	            break;
	        case "Profesional":
	        	Profesional profesional = new Profesional();
	        	String titulo = request.getParameter("titulo");
	        	String fechaIngreso = request.getParameter("fechaIngreso");
	        	
	        	profesional.setNombre(nombre);
	        	profesional.setFechaNacimiento(fecha);
	        	profesional.setRut(rut);
	        	profesional.setTitulo(titulo);
	        	profesional.setFechaIngreso(fechaIngreso);
	        	usuarioDAO.registrarUsuario(profesional);
	            break;
	        default:
	            break;
		}
		request.getRequestDispatcher("mensajeExito.jsp").forward(request, response);
	}

}

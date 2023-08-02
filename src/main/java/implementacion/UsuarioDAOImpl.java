package implementacion;

import java.util.ArrayList;
import java.util.List;

import interfaces.IUsuarioDAO;
import model.Usuario;
import model.Administrativo;
import model.Cliente;
import model.Profesional;

public class UsuarioDAOImpl implements IUsuarioDAO {

	@Override
	public List<Usuario> obtenerListaUsuario() {
		List<Usuario> usuarios = new ArrayList<>();
		
		Administrativo usuarioAdministrativo = new Administrativo();
		usuarioAdministrativo.setId(1);
		usuarioAdministrativo.setNombre("administrativo1");
		usuarioAdministrativo.setTipo("Administrativo");
		usuarioAdministrativo.setFechaNacimiento("2020-01-01");
		usuarioAdministrativo.setRutUsuario("11111111-1");
		usuarioAdministrativo.setArea("area1");
		usuarioAdministrativo.setExperienciaPrevia("experiencia 1");
		usuarios.add(usuarioAdministrativo);
		
		Cliente usuarioCliente = new Cliente();
		usuarioCliente.setId(2);
		usuarioCliente.setNombre("cliente2");
		usuarioCliente.setTipo("Cliente");
		usuarioCliente.setFechaNacimiento("2020-02-02");
		usuarioCliente.setRutUsuario("22222222-2");
		usuarioCliente.setTelefono("+56988888888");
		usuarioCliente.setAfp("modelo");
		usuarioCliente.setSistemaDeSalud(1);
		usuarioCliente.setDireccion("calle cliente 123");
		usuarioCliente.setComuna("Santiago");
		usuarioCliente.setEdad(34);
		usuarios.add(usuarioCliente);
		
		Profesional usuarioProfesional = new Profesional();
		usuarioProfesional.setId(3);
		usuarioProfesional.setNombre("profesional3");
		usuarioProfesional.setTipo("Profesional");
		usuarioProfesional.setFechaNacimiento("2020-03-03");
		usuarioProfesional.setRutUsuario("33333333-3");
		usuarioProfesional.setTitulo("test titulo");
		usuarioProfesional.setFechaIngreso("2023-07-01");
		usuarios.add(usuarioProfesional);
		System.out.println("usuarios: "+usuarios);
		return usuarios;
	}


}

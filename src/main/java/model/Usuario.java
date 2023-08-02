package model;

public class Usuario {
	private int id;
	private String nombre;
	private String fechaNacimiento;
	private String rutUsuario;
	private String tipo;
	
	public Usuario(int id, String nombre, String fechaNacimiento, String rutUsuario, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rutUsuario = rutUsuario;
		this.tipo = tipo;
	}
	
	public Usuario() {
		
	}

	@Override
	public String toString() {
		return "Usuario [id="+ id +", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rutUsuario=" + rutUsuario
				+ ", tipo=" + tipo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRutUsuario() {
		return rutUsuario;
	}

	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

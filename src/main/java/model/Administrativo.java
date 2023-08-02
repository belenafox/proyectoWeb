package model;

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	public Administrativo(int id, String nombre, String fechaNacimiento, String rutUsuario, String tipo, String area, String experienciaPrevia) {
		super(id, nombre, fechaNacimiento, rutUsuario, tipo);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	public Administrativo() {
		
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", getId()=" + getId()
				+ ", getNombre()=" + getNombre() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", getRutUsuario()=" + getRutUsuario() + ", getTipo()=" + getTipo() + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	
}

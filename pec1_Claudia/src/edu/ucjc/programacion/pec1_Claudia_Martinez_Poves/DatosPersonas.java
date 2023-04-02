package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;

public class DatosPersonas {

	//Genero atributos.
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Genero constructor.
	public DatosPersonas(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//Genero getters and setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	

}

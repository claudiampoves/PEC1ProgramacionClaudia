package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;

public class Profesor extends DatosPersonas {
	
	//Genero atributos.
	private String asignatura;

	//Genero constructor de la clase padre.
	public Profesor(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}

	//Genero constructor de esta clase.
	public Profesor(String nombre, String apellidos, String dni, String asignatura) {
		super(nombre, apellidos, dni);
		this.asignatura = asignatura;
	}
	
	//Genero getters and setters.
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	
	
	
}

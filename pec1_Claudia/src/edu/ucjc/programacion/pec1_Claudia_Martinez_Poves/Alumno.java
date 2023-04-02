package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;

public class Alumno extends DatosPersonas {
	
	//Genero atributos.
	private double notaMedia;

	//Genero constructor de la clase padre.
	public Alumno(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}

	//Genero constructor de esta clase.
	public Alumno(String nombre, String apellidos, String dni, double notaMedia) {
		super(nombre, apellidos, dni);
		this.notaMedia = notaMedia;
	}
	
	//Genero getters and setters.
	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
	

}

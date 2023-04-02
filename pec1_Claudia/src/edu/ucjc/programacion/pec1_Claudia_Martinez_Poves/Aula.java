package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;

public class Aula {

	//Genero atributos.
	private int numero;
	private int planta;
	private Profesor profesor;
	private Alumno[] asientos;
	public static int numAsientos = 3;
	
	//Genero constructor.
	public Aula(int numero, int planta, Profesor profesor, Alumno[] asientos) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.profesor = profesor;
		asientos = new Alumno[3];
	}

	//Genero getters and setters.
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Alumno[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}
	
	
	
	
	
	
}

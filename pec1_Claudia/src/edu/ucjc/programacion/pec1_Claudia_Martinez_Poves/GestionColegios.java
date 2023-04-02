package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;

//Enlace repositorio github --> https://github.com/claudiampoves/PEC1ProgramacionClaudia.git
public class GestionColegios {
	//Genero atributos.
	public static int numAlumnos = 9;
	public static int numAulas = 4;
	//Llamo al colegio.
	Colegio colegio;
	
	//Genero getters and setters
	public static int getNumAlumnos() {
		return numAlumnos;
	}
	
	public static void setNumAlumnos(int numAlumnos) {
		GestionColegios.numAlumnos = numAlumnos;
	}
	
	public static int getNumAulas() {
		return numAulas;
	}
	
	public static void setNumAulas(int numAulas) {
		GestionColegios.numAulas = numAulas;
	}
	
	
	
	public static void main(String[] args) {
		//Genero un objeto de tipo colegio
		Colegio colegio = new Colegio("Mendoza", "Avenida america", 4);
		//Llamo al método crearAlumnos creado en la clase UtilsColegio.
		UtilsColegio.crearAlumnos();
		
	}
	
	public static void recogidaDatos(UtilsColegio variableGuardarDatosAlumnos, GestionColegios colegio) {
		
	}
}

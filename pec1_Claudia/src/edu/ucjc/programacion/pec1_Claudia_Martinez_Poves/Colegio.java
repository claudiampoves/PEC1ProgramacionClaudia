package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;

public class Colegio {

	//Genero atributos.
	private String nombre;
	private String direccion;
	private static int numAulas;
	private static Aula[]aulas = new Aula[numAulas];
	
	//Genero constructor
	public Colegio(String nombre, String direccion, int numAulas, Aula[] aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numAulas = numAulas;
	}

	public Colegio(String nombre, String direccion, int numAulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numAulas = numAulas;
	}

	//Genero getters and setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static int getNumAulas() {
		return numAulas;
	}

	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}

	public Aula[] getAulas() {
		return aulas;
	}

	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}
	
	//Genero el método asignarAsientos. Para que a cada alumno que entre se le asigne un asiento de un aula.
	public static void asignarAsiento(Alumno[] Asientos) {
		//Genero un objeto de tipo alumno para comprobar si devuelve bien los datos el System.out.println.
		Alumno alumno = new Alumno("Claudia", "Martinez", "48472948H");
		
		int asientosOcupados = 0;
		//Creo una variable para que vaya contando el número de aulas, la inicio en 1 porque no puede haber un aula 0.
		int numAula = 1;
		
		//Creo dos bucles for para que recorra todas las aulas y dentro de estas, los asientos para ver cuantos quedan libres.
		for (Aula aula : aulas) {
			for (Alumno asientos : Asientos) {
				//Si los asientosOcupados son menor a 3 significa que hay asientos libres.
				if (asientosOcupados < 3) {
					//Se añade el asiento a los asientos ocupados.
					Asientos[asientosOcupados]= asientos;
					//Se incrementa la variable de asientos ocupados.
					asientosOcupados += 1;
					System.out.println("El alumno " + alumno.getNombre() + alumno.getApellidos() + " con dni " + alumno.getDni() +
							" se encuentra sentado en el asiento " + asientosOcupados + " del aula " + numAula);

				}
				//Sino, se imprimirá por pantalla que no hay asientos libres en ese aula
				else {
					System.out.println("No se pueden sentar más alumnos en este aula");
					//La variable asientosOcupados volverá a estar a 0 para que vuelva a contar hasta los 3 que tiene cada aula.
					asientosOcupados = 0;
					//Y se incrementa el la variable numAula.
					numAula++;
				}
			}
			
		}
		
	}

}

package edu.ucjc.programacion.pec1_Claudia_Martinez_Poves;
import java.util.Scanner;

public class UtilsColegio {

	//Genero el método crearAlumnos con String[][] porque va a devolver un array bidimensional.
	public static String[][] crearAlumnos() {
		//Genero el array bidimensional con la dimension del numero de alumnos y el número de asientos.
		String[][] datosAlumnos = new String[GestionColegios.getNumAlumnos()][3];
	   //Creo un bucle que pida nombre, apellidos y dni del alumno y los guarde en un array mientras se cumpla la condición del bucle.
		for (int i = 0; i < GestionColegios.getNumAlumnos(); i++) {
		//Scanner para permitir que el usuario introduzca los valores por teclado.
	    Scanner scan = new Scanner(System.in);
	      System.out.println("Introduce el nombre del alumno " + (i+1) + ":");
	      String nombre = scan.nextLine();
	      
	      System.out.println("Introduce los apellidos del alumno " + (i+1) + ":");
	      String apellidos = scan.nextLine();
	      
	      System.out.println("Introduce el DNI del alumno " + (i+1) + ":");
	      String dni = scan.nextLine();
	      
	      //Se guardan el nombre, apellidos y dni en el array datosAlumnos.
	      datosAlumnos[i][0] = nombre;
	      datosAlumnos[i][1] = apellidos;
	      datosAlumnos[i][2] = dni;
	    }
	    
		//Genero otro array como el definido al principio.
	    String[][] guardarDatosAlumnos = new String[GestionColegios.getNumAlumnos()][3];
	    //Genero un bucle for que guarde el dato de la posicion indicada del array datosAlumnos en la misma posición del array guardarDatosAlumnos.
	    for (int i = 0; i < GestionColegios.getNumAlumnos(); i++) {
	    	guardarDatosAlumnos[i] = datosAlumnos[i];
	    }
	    
	    //Genero bucle for que recorre los dos arrays anteriores de forma que va imprimiendo todos los datos de todos los alumnos introducidos anteriormente;
	    for (int i = 0; i < GestionColegios.getNumAlumnos(); i++) {
	      for (int j = 0; j < 3; j++) {
	        System.out.print(datosAlumnos[i][j] + " ");
	      }
	      System.out.println();
	    }
	    //Convierto el array bidimensional en una variable para poder guardarlo.
	    String[] [] variableGuardarDatosAlumnos = guardarDatosAlumnos;
	    //Devuelvo el array convertido en variable anteriormente.
	    return variableGuardarDatosAlumnos;
	    
	}

	//Genero el método llamado crearProfesores con String[][] porque va a devolver un array bidimensional.
	public static String[][] crearProfesores() {
		//Genero el array bidimensional con la dimension del numero de aulas y el número de asientos.
		String[][] datosProfesores = new String[GestionColegios.numAulas][3];
		//Creo un bucle que pida nombre, apellidos y dni del alumno y los guarde en un array mientras se cumpla la condición del bucle.
		for (int i = 0; i < GestionColegios.numAulas; i++) {
		//Scanner para permitir que el usuario introduzca los valores por teclado.
		Scanner scan = new Scanner(System.in);
	      System.out.println("Introduce el nombre del profesor " + (i+1) + ":");
	      String nombre = scan.nextLine();
	      
	      System.out.println("Introduce los apellidos del profesor " + (i+1) + ":");
	      String apellidos = scan.nextLine();
	      
	      System.out.println("Introduce el DNI del profesor " + (i+1) + ":");
	      String dni = scan.nextLine();
	      
	      //Se guardan el nombre, apellidos y dni en el array datosProfesores.
	      datosProfesores[i][0] = nombre;
	      datosProfesores[i][1] = apellidos;
	      datosProfesores[i][2] = dni;
	    }
	    
		//Genero otro array como el definido al principio.
	    String[][] guardarDatosProfesores = new String[4][3];
	    //Genero un bucle for que guarde el dato de la posicion indicada del array datosProfesores en la misma posición del array guardarDatosProfesores.
	    for (int i = 0; i < GestionColegios.numAulas; i++) {
	    	guardarDatosProfesores[i] = datosProfesores[i];
	    }
	    
	  //Genero bucle for que recorre los dos arrays anteriores de forma que va imprimiendo todos los datos de todos los profesores introducidos anteriormente;
	    for (int i = 0; i < GestionColegios.numAulas; i++) {
	      for (int j = 0; j < 3; j++) {
	        System.out.print(datosProfesores[i][j] + " ");
	      }
	      System.out.println();
	    }
	    //Convierto el array bidimensional en una variable para poder guardarlo.
	    String[] [] variableGuardarDatosProfesores = guardarDatosProfesores;
	    //Devuelvo el array convertido en variable anteriormente.
	    return variableGuardarDatosProfesores;
	}
	
}

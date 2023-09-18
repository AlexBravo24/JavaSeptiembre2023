package condicionales;

import java.util.Scanner;

public class Condicionales7_MARB {

	public static void main(String[] args) {
	    //  El director de una escuela está organizando un viaje de estudios y requiere 
		//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de
		//viajes por el servicio. La forma de cobrar es la siguiente: * Si son 100 alumnos o más, 
		//el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. 
		//* De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos,
		//el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y 
	    // o que debe pagar cada alumno por el viaje.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el número de alumnos: ");
		int numeroAlumnos = scanner.nextInt();
		
		int pagoCompañia;
		
		if (numeroAlumnos >= 100) {
            pagoCompañia = numeroAlumnos * 65;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            pagoCompañia = numeroAlumnos * 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            pagoCompañia = numeroAlumnos * 95;
        } else {
            pagoCompañia = 4000;
        }
		
		double costoPorAlumno = (double) pagoCompañia / numeroAlumnos;
		System.out.println("Pago a la compañía de autobuses: " + pagoCompañia + " euros");
		System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
		


		
	}
}

package condicionales;

import java.util.Scanner;

public class Condicionales7_MARB {

	public static void main(String[] args) {
	    //  El director de una escuela est� organizando un viaje de estudios y requiere 
		//determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de
		//viajes por el servicio. La forma de cobrar es la siguiente: * Si son 100 alumnos o m�s, 
		//el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. 
		//* De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos,
		//el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y 
	    // o que debe pagar cada alumno por el viaje.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el n�mero de alumnos: ");
		int numeroAlumnos = scanner.nextInt();
		
		int pagoCompa�ia;
		
		if (numeroAlumnos >= 100) {
            pagoCompa�ia = numeroAlumnos * 65;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            pagoCompa�ia = numeroAlumnos * 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            pagoCompa�ia = numeroAlumnos * 95;
        } else {
            pagoCompa�ia = 4000;
        }
		
		double costoPorAlumno = (double) pagoCompa�ia / numeroAlumnos;
		System.out.println("Pago a la compa��a de autobuses: " + pagoCompa�ia + " euros");
		System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
		


		
	}
}

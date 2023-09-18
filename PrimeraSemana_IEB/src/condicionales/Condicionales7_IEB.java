package condicionales;

import java.util.Scanner;

public class Condicionales7_IEB {
	public static void main(String[] args) {
		/*
		7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto
		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de
		cobrar es la siguiente:
		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de
		alumnos.
		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe
		pagar cada alumno por el viaje.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        double costoPorAlumno;
        double costoTotal;

        if (cantidadAlumnos >= 100) {
            costoPorAlumno = 65.0;
            costoTotal = cantidadAlumnos * costoPorAlumno;
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
            costoPorAlumno = 70.0;
            costoTotal = cantidadAlumnos * costoPorAlumno;
        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
            costoPorAlumno = 95.0;
            costoTotal = cantidadAlumnos * costoPorAlumno;
        } else if (cantidadAlumnos < 30) {
            costoTotal = 4000.0;
            costoPorAlumno = costoTotal / cantidadAlumnos;
        } else {
            System.out.println("N�mero de alumnos no v�lido.");
            scanner.close();
            return;
        }

        System.out.println("Costo por alumno: " + costoPorAlumno + " euros.");
        System.out.println("Total a pagar a la compa��a de autobuses: " + costoTotal + " euros.");

        scanner.close();
	}
}

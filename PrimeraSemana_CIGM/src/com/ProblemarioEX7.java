package com;

import java.util.Scanner;

public class ProblemarioEX7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numeroAlumnos = scanner.nextInt();

        double costoPorAlumno = 0.0;
        double costoTotalCompania = 0.0;

        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65.0;
            costoTotalCompania = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            costoPorAlumno = 70.0;
            costoTotalCompania = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            costoPorAlumno = 95.0;
            costoTotalCompania = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos < 30) {
            costoTotalCompania = 4000.0;
        }

        double costoPorAlumnoFinal = costoTotalCompania / numeroAlumnos;

        System.out.println("El costo total para la compañía de autobuses es de " + costoTotalCompania + " euros.");
        System.out.println("Cada alumno debe pagar " + costoPorAlumnoFinal + " euros por el viaje.");

        scanner.close();
	}

}

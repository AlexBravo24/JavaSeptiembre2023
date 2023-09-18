package condicionales;

import java.util.Scanner;

public class Condicionales7_OIDA {

	public static void main(String[] args) {
		// Ejercicio 7  El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
//		debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
//		cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
//		pagar cada alumno por el viaje.
		int alumnos;
		int preciominimo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce cuantos alumnos iran al viaje");
		alumnos = entrada.nextInt();
		entrada.close();
		if(alumnos >= 100) {
			System.out.println("La cantidad total a pagar de la compañía es de " + (alumnos*65) + " Cada alumno debe pagar 65 euros");
		}else if (alumnos > 50 && alumnos < 99) {
			System.out.println("La cantidad total a pagar de la compañía es de " + (alumnos*70) + " Cada alumno debe pagar 70 euros");
		}else if (alumnos > 30 && alumnos < 49) {
			System.out.println("La cantidad total a pagar de la compañía es de " + (alumnos*95) + " Cada alumno debe pagar 95 euros");
		}else if (alumnos < 30) {
			preciominimo = 4000/alumnos;
			System.out.println("La cantidad total a pagar de la compañía es de 4000, Cada alumno debe pagar " + (preciominimo)+ " euros");
		}
	}

}

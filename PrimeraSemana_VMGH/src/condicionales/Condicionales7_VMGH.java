package condicionales;

import java.util.Scanner;

public class Condicionales7_VMGH {

	public static void main(String[] args) {
//		// 7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
//		debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
//		pagar cada alumno por el viaje
		
		int alumnosNum;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de colocar el # de alumnos que asistiran al viaje: ");
		alumnosNum = entrada.nextInt();
		
		if (alumnosNum >= 100) {
			int pago = alumnosNum * 65;
			System.out.println("El pago a la agencia de viajes es de: " + pago + " euros y cada alumno debe pagar 65 euros");
		}else if (alumnosNum >= 50 && alumnosNum <= 99) {
			int pago = alumnosNum * 70;
			System.out.println("El pago a la agencia de viajes es de: " + pago + " euros y cada alumno debe pagar 70 euros");
		}else if (alumnosNum >= 30 && alumnosNum <= 49) {
			int pago = alumnosNum * 95;
			System.out.println("El pago a la agencia de viajes es de: " + pago + " euros y cada alumno debe pagar 95 euros");
		}else if (alumnosNum < 30) {
			int pago = 4000 / alumnosNum;
			System.out.println("El pago a la agencia de viajes es de: " + 4000 +" euros y cada alumno debe pagar " + pago + " euros");
		}else {
			System.out.println("Favor de ingresar un valor correcto de alumnos");
		}
		
		entrada.close();

	}

}

package condicionales;

import java.util.Scanner;

public class Condicionales11_OIDA {

	public static void main(String[] args) {
//		// Ejercicio 11 Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
//		Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
//			Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
//			cuestiones de logística y seguridad.
//			Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
//			de la entrega.
//		
		int destino;
		double peso;
		Scanner entrada= new Scanner(System.in);
		System.out.println("¿Cuanto pesa tu paquete en Kg?");
		peso= entrada.nextDouble();
		if (peso <= 5) {
			System.out.println("Elige tu destino: 1 = Norteamerica, 2 = Centroamerica, 3 = Suramerica, 4 = Europa, 5 = Asia");
			destino = entrada.nextInt();
			if(destino == 1) {
				System.out.println("El costo de su carga es " + (peso*24) + " euros");
			}else if (destino == 2) {

				System.out.println("El costo de su carga es " + (peso*20) + " euros");
			}else if (destino == 3) {

				System.out.println("El costo de su carga es " + (peso*21) + " eruos");
			}else if (destino == 4) {

				System.out.println("El costo de su carga es " + (peso*10) + " euros");
			}else if (destino == 5) {

				System.out.println("El costo de su carga es " + (peso*18) + " euros");
			}
		}else {
			System.out.println("Carga excedida, se rechaza servicio");
		}
		
	}

}

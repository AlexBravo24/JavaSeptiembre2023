package condicionales;

import java.util.Scanner;

public class Condicionales9_AMCP {

	public static void main(String[] args) {
		
		
		//ealiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si 
		//introducimos otro n�mero nos da un error.
		
		Scanner scanner = new Scanner (System.in);
		int d�a;
		
		//Solicitud de datos al usuario
		System.out.println("El programa te devuelve el d�a de la semana seleccionado");
		System.out.println("1.- Lunes.");
		System.out.println("2.- Martes.");
		System.out.println("2.- Miercoles.");
		System.out.println("2.- Jueves.");
		System.out.println("2.- Viernes.");
		System.out.println("2.- S�bado.");
		System.out.println("2.- Domingo.");
		d�a = scanner.nextInt();
		
		//Realizamos comparaciones y mostramos resultados
		switch (d�a) {
		case 1:
			System.out.println("El d�a seleccionado es Lunes");
			break;
		case 2:
			System.out.println("El d�a seleccionado es Martes");
			break;
		case 3:
			System.out.println("El d�a seleccionado es Miercoles");
			break;
		case 4:
			System.out.println("El d�a seleccionado es Jueves");
			break;
		case 5:
			System.out.println("El d�a seleccionado es Viernes");
			break;
		case 6:
			System.out.println("El d�a seleccionado es S�bado");
			break;
		case 7:
			System.out.println("El d�a seleccionado es Domingo");
			break;
			default:
				System.out.println("ERROR: n�mero incorrecto");
		}
	}

}

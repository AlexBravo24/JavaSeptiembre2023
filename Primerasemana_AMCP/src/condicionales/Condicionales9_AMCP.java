package condicionales;

import java.util.Scanner;

public class Condicionales9_AMCP {

	public static void main(String[] args) {
		
		
		//ealiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error.
		
		Scanner scanner = new Scanner (System.in);
		int día;
		
		//Solicitud de datos al usuario
		System.out.println("El programa te devuelve el día de la semana seleccionado");
		System.out.println("1.- Lunes.");
		System.out.println("2.- Martes.");
		System.out.println("2.- Miercoles.");
		System.out.println("2.- Jueves.");
		System.out.println("2.- Viernes.");
		System.out.println("2.- Sábado.");
		System.out.println("2.- Domingo.");
		día = scanner.nextInt();
		
		//Realizamos comparaciones y mostramos resultados
		switch (día) {
		case 1:
			System.out.println("El día seleccionado es Lunes");
			break;
		case 2:
			System.out.println("El día seleccionado es Martes");
			break;
		case 3:
			System.out.println("El día seleccionado es Miercoles");
			break;
		case 4:
			System.out.println("El día seleccionado es Jueves");
			break;
		case 5:
			System.out.println("El día seleccionado es Viernes");
			break;
		case 6:
			System.out.println("El día seleccionado es Sábado");
			break;
		case 7:
			System.out.println("El día seleccionado es Domingo");
			break;
			default:
				System.out.println("ERROR: número incorrecto");
		}
	}

}

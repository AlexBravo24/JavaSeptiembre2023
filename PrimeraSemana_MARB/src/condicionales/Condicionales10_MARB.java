package condicionales;

import java.util.Scanner;

public class Condicionales10_MARB {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		//mes correspondiente.
		
		Scanner numero= new Scanner(System.in);
		System.out.println("Ingresa el numero del mes ");
		int x1 = numero.nextInt();
		
		switch (x1) {
		
		case 1:
			System.out.println("Enero tine 31 dias ");
			break;
		case 2:
			System.out.println("Febrero tiene 28 dias ");
			break;
		case 3:
			System.out.println("Marzo tiene 31 dias ");
			break;
		case 4:
			System.out.println("Abril tiene 30 dias ");
			break;
		case 5:
			System.out.println("Mayo tiene 31 dias ");
			break;
		case 6:
			System.out.println("Junio tiene 30 dias");
			break;
		case 7:
			System.out.println("Julio tiene 31 dias");
			break;	
		case 8:
			System.out.println("Agosto tiene 31 dias");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 dias");
			break;
		case 10:
			System.out.println("Octubre tiene 31 dias");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 dias");
			break;
		case 12:
			System.out.println("diciembre tiene 310 dias");
			break;
		default:
			System.out.println("desconocido");
			break;	
		}

	}

}

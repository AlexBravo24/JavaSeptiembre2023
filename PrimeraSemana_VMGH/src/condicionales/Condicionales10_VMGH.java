package condicionales;

import java.util.Scanner;

public class Condicionales10_VMGH {

	public static void main(String[] args) {
//		// 10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
//		mes correspondiente.
		
		byte mes;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el # del mes para saber el n�mero de d�as que tiene: ");
		mes = entrada.nextByte();
		
		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 d�as");
			break;
		case 2:
			System.out.println("Febrero tiene 28 d�as o 29 d�as cuando es a�o bisiesto");
			break;
		case 3: 
			System.out.println("Marzo tiene 31 d�as");
			break;
		case 4:
			System.out.println("Abril tiene 30 d�as");
			break;
		case 5:
			System.out.println("Mayo tiene 31 d�as");
			break;
		case 6:
			System.out.println("Junio tiene 30 d�as");
			break;
		case 7:
			System.out.println("Julio tiene 31 d�as");
			break;
		case 8:
			System.out.println("Agosto tiene 31 d�as");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 d�as");
			break;
		case 10:
			System.out.println("Octubre tiene 31 d�as");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 d�as");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 d�as");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		entrada.close();

	}

}

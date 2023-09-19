package condicionales;

import java.util.Scanner;

public class Condicionales9_EHG {

	public static void main(String[] args) {
		//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error.
		
		//DECLARAMOS VARIABLE
		int dia;
		
		//SE PIDE INGRESAR DATOS
		System.out.println("INTRODUCE DIA");
		Scanner entrada = new Scanner (System.in);
		dia = entrada.nextInt();
		entrada.close();
		
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("ERROR: dia no encontrado");
		}
		
		

	}//FIN DEL MAIN

}//FIN DE LA CLASE

package condicionales;

import java.util.Scanner;

public class Condicionales9_OIDA {

	public static void main(String[] args) {
		// Ejercicio 9 Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		//introducimos otro número nos da un error.
		int numerodedia;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el numero del día");
		numerodedia= entrada.nextInt();
		entrada.close();
		if (numerodedia >=1 && numerodedia <=7) {
			if (numerodedia == 1) {
				System.out.println("lunes");
			}else if(numerodedia == 2) {
				System.out.println("martes");
			}else if (numerodedia == 3) {
				System.out.println("miercoles");
			}else if(numerodedia == 4) {
				System.out.println("jueves");
			}else if(numerodedia == 5) {
				System.out.println("viernes");
			}else if(numerodedia == 6) {
				System.out.println("sabado");
			}else if (numerodedia == 7) {
				System.out.println("domingo");
			}
		}else {
			System.out.println("error");
		}
	}
}

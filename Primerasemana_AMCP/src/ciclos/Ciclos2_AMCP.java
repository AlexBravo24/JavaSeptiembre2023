package ciclos;

import java.util.Scanner;

public class Ciclos2_AMCP {

	public static void main(String[] args) {
		
		
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner scanner = new Scanner (System.in);
		
		int Multiplicando;
		int Multiplicador;
		
		System.out.println("Introduzca Multiplicando");
		Scanner valor1 = new Scanner (System.in);
		Multiplicando = valor1.nextInt();
		System.out.println("Introduzca Multiplicador");
		Scanner valor2 = new Scanner (System.in);
		Multiplicador = valor2.nextInt();
		
		System.out.println(Multiplicando + "X" + Multiplicador + "=" + Multiplicando*Multiplicador);	
		
				

	}

}

package ciclos;

import java.util.Scanner;

public class Ciclos12_OBRO {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25

		Scanner entrada = new Scanner(System.in);
		int edad, personas=0;
		double promedio, sumae=0;
		
		do {
			System.out.println("Ingrese edad: ");
			edad = entrada.nextInt();
			sumae = sumae + edad;
			personas++;
			promedio = sumae/personas;
		}while (promedio <= 25);
		System.out.println("El promedio de edad es: " + promedio);
	}
}

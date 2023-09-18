package Ciclos;

import java.util.Scanner;

public class ciclos12_gamg {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades de personas por teclado. El programa 
		// finalizará cuando el promedio de las edades sea superior a 25.
		
		Scanner entrada = new Scanner(System.in);
		int edad, personas=0;
		double promedio, suma_edad=0;
				
		do {
		System.out.println(" Ingrese edad");
		edad = entrada.nextInt();		
		suma_edad= suma_edad+edad;
		personas++;
		promedio=suma_edad/personas;
		}while (promedio<=25);
						
		System.out.println("El promedio de edad es: " +promedio);	
		}

	}


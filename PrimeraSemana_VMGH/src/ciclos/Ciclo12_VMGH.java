package ciclos;

import java.util.Scanner;

public class Ciclo12_VMGH {

	public static void main(String[] args) {
//		// 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
//		cuando el promedio de las edades sea superior a 25
		
		int edad;
		Scanner entrada = new Scanner(System.in);
		int tedad = 0;
		int personasn = 0;
		
		while (true) {
			System.out.println("Ingresar su edad: ");
			edad = entrada.nextInt();
			
			if (edad < 0) {
				break;
			}
			
			tedad += edad;
			personasn++;
			float promedio = tedad / personasn;
			System.out.println("El promedio de las edades va en: " + promedio);
			
			if (promedio > 25) {
				System.out.println("El programa ha finalizado, ya que se tiene un promedio de: " + promedio);
				break;
			}
		}
		
		entrada.close();

	}

}

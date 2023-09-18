package ciclos;

import java.util.Scanner;

public class Ciclo12_MARB {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25.
		
		Scanner scanner = new Scanner(System.in);
		
		int sumaEdades = 0;
        int contadorEdades = 0;
        
        while (true) {
            System.out.print("Ingrese una edad (o ingrese un número negativo para terminar): ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                break;
            }

            sumaEdades += edad;
            contadorEdades++;

            double promedio = (double) sumaEdades / contadorEdades;

            if (promedio > 25) {
                System.out.println("El promedio de edades es superior a 25.");
                break;
            }
        }
    

	}

}

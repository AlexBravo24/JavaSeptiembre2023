package ciclos;

import java.util.Scanner;

public class Problemario2EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        int sumaEdades = 0;
        int cantidadEdades = 0;
        
        while (true) {
            System.out.print("Ingrese una edad (o -1 para finalizar): ");
            int edad = scanner.nextInt();
            
            if (edad == -1) {
                break; // Salir del bucle si se ingresa -1
            }
            
            sumaEdades += edad;
            cantidadEdades++;
        }
        
        scanner.close();
        
        if (cantidadEdades > 0) {
            double promedio = (double) sumaEdades / cantidadEdades;
            System.out.println("El promedio de las edades ingresadas es: " + promedio);
            
            if (promedio > 25) {
                System.out.println("El promedio es superior a 25. El programa finaliza.");
            } else {
                System.out.println("El promedio no es superior a 25. El programa continúa.");
            }
        } else {
            System.out.println("No se ingresaron edades.");
        }
	}

}

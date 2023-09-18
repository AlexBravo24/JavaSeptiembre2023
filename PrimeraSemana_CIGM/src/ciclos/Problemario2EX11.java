package ciclos;

import java.util.Scanner;

public class Problemario2EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce el ancho del cuadrado: ");
	        int ancho = scanner.nextInt();
	        
	        System.out.print("Introduce el alto del cuadrado: ");
	        int alto = scanner.nextInt();
	        
	        for (int i = 0; i < alto; i++) {
	            for (int j = 0; j < ancho; j++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // Cambiar de línea al final de cada fila
	        }
	        
	        scanner.close();
	}

}

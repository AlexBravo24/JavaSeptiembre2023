package ciclos;

import java.util.Scanner;

public class Problemario2EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduce el n�mero para la tabla de multiplicar: ");
	        int numero = sc.nextInt();
	        
	        System.out.print("Introduce el l�mite de la iteraci�n: ");
	        int limite = sc.nextInt();
	        
	        System.out.println("Tabla de multiplicar del " + numero + " hasta " + limite + ":");
	        
	        for (int i = 1; i <= limite; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	        
	        sc.close();
	}

}

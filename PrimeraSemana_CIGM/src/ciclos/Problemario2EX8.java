package ciclos;

import java.util.Scanner;

public class Problemario2EX8 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese el primer n�mero: ");
	        int numero1 = sc.nextInt();

	        System.out.print("Ingrese el segundo n�mero: ");
	        int numero2 = sc.nextInt();

	        sc.close();

	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        System.out.println("N�meros desde el menor hasta el mayor:");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }
	    }
}

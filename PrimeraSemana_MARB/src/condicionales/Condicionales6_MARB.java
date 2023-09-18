package condicionales;

import java.util.Scanner;

public class Condicionales6_MARB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c,d;
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el pecio requerido");
		float precio = entrada.nextFloat();
		a = precio+20;
		b = precio+30;
		c = precio-30;
		d = precio-50;
		System.out.println("Cuando es tipo A y tamaño 1 el precio es: "+a);
		System.out.println("Cuando es tipo A y tamaño 2 el precio es: "+b);
		System.out.println("Cuando es tipo B y tamaño 1 el precio es: "+c);
		System.out.println("Cuando es tipo B y tamaño 2 el precio es: "+d);
		
		
				
				
		
		
		

	}

}

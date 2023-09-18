package condicionales;

import java.util.Scanner;

public class Condicionales3_OBRO {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error
		
		float numero1, numero2;
		
		Scanner entrada1= new Scanner(System.in);
		System.out.println("Dijite el numero del numerador");
		numero1=entrada1.nextInt();
		
		Scanner entrada2= new Scanner(System.in);
		System.out.println("Dijite el numero del denominador");
		numero2=entrada2.nextInt();
		
		if(numero2==0) {
			System.out.println("ERROR");
		}else {
			System.out.println("La division es: "+(numero1/numero2));
		}

	}

}

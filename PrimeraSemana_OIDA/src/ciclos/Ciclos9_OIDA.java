package ciclos;

import java.util.Scanner;

public class Ciclos9_OIDA {

	public static void main(String[] args) {
		// Ejercicio 9  Programa Java que lea dos números y muestre los números pares entre ellos
		int numero1;
		int numero2;
		int residuo1;
		int residuo2;
		int acomodados=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = entrada.nextInt();
		entrada.close();
		residuo1=numero1%2;
		residuo2=numero2%2;
		while(numero2<numero1) {//este while hace que imprima bien si el numero inicial es mayor que el segundo siendo par
			//se ejecuta si el numero2 es par 
			 if (residuo2==0) {//se ejecuta si el numero1 es par 
					do {
						numero2=numero2+2;
						if(numero2<numero1) {
							System.out.println(numero2);
						}
					}while(numero2<numero1);
				}
			if (residuo2!=0) {//se ejecuta si el numero2 es impar 
				do {
					if(acomodados==0) {
						numero2=numero2+1;
						acomodados=1;
						System.out.println(numero2);
					}
					numero2=numero2+2;
					if(numero2<numero1) {
						System.out.println(numero2);
					}
				}while(numero2<numero1);
				 
				}
			}
		while(numero1<numero2) {//este while debe imprimir los pares cuando el numero inicial es menor que el segundo 
			if (residuo1==0) {//se ejecuta si el numero1 es par 
				do {
					numero1=numero1+2;
					if(numero1<numero2) {
						System.out.println(numero1);
					}
				}while(numero1<numero2);
				}
			if(residuo1!=0) {
				do {
					if(acomodados==0) {
						numero1=numero1+1;
						acomodados=1;
						System.out.println(numero1);
					}
					numero1=numero1+2;
					if(numero1<numero2) {
						System.out.println(numero1);
					}
				}while(numero1<numero2);
			}
	}
}}


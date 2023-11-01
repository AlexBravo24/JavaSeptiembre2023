package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aqui vamos a introducir datos por teclado
		
		int numero;  //declaro una variable 
		//donde guardare el valor que le asigne por teclado
		Scanner entrada = new Scanner(System.in); //aqui llamamos a la funcion Scanner para obtener numero que yo quiera introducir
		System.out.println("Introduce un numero");
		numero = entrada.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt(); // aqui declaramos otra variable que se llama numero2 para asignarle el valor que yo le quiera poner del teclado
		entrada.close(); //aqui cerramos el Scanner para ya no usarlo 
		System.out.println("La suma del primer numero con el segundo es: " + (numero+numero2));
		
		//una vez que almacenamos el numero, podemos continuar con el programa para hacer una operacion con el
		//System.out.println("El cuadrado de " + numero + " es " + (numero*numero));
		
		
		//Operador modulo 
		  // el "%" nos da el residuo del resultado de una división 
		
		
		int n = 10;
		int resultado = n%2;
		System.out.println(resultado);
		
	}

}

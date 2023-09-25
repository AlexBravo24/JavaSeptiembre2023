package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		// Entrada de datos 
		// Introducir datos por Teclado 
		
		int numero; //Declare una variable 
		//donde guardare el valor que asignare por teclado
		Scanner entrada = new Scanner(System.in);
		//Scanner nos permite crear objetos para poder 
		//introduciir valores por teclado 
		System.out.println("Introduce un numero");
		numero = entrada.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();//Puedo seguir utilizando el mismo
		//Scanner para seguir introduciendo valores por teclado 
		entrada.close();//Cuando no tenga necesidad de seguir tecleando
		//valores, entonces cierroel Scanner 
		System.out.println("La suma del primer numero con el segundo es: " + (numero+numero2));
		
		//Una vez que almacenamos el numero tecleado 
		//Podemos continuar el programa y realiar una 
		//operacion con el 
	//	System.out.println("El cuadrado de " + numero + " es: " + (numero*numero));
		
		//comentar varias lineas al mismo tiempo seleccionando las lineas 
		//y presionan la tecla Ctrl+7
		
		/*Operador Modulo
		 * % //Nos da el resultado del residuo de una division 
		 */
		int n = 10;
		
		int resultado = n / 3 ;
		
		System.out.println(resultado);
		
		
	
		

	}

}

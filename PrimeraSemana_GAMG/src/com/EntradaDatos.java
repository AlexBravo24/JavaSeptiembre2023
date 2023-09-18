package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		// Entrada de datos
		//Introducir datos por teclado
		
		int numero; //Declaro una variable
		// donde guardaré el valor que asignaré por teclado
		Scanner entrada = new Scanner(System.in);
		//Scanner nos permite crear objetos para poder introducir
		//valores por teclado
//		System.out.println("Introduce un numero");
//		numero = entrada.nextInt();
//		System.out.println("Introduce otro numero");
//		int numero2 = entrada.nextInt();//Puedo seguir utilizando el mismo
//		//Scanner para seguir introduciendo valores por teclado
//		entrada.close(); //Cuando no tenga necesidad de seguir tecleando
//		//valores, entonces cierro el Scanner
//		System.out.println("La suma del primer numero con el segundo es:" + (numero+numero2));
		
//		Una vez que almacenamos el numero tecleado
//		Podemos continuar el programa y realizar una 
//		operacion con él
//		System.out.println("El cuadrado de "+ numero + " es " + (numero*numero));

		//Comentar varias lineas al mismo tiempo - Seleccionan las lineas
		//y presionasn las teclas Ctrl + 7 
		
		/*Operador modulo
		 * % nos da el resultado de un residuo de una division
		 */
		int n = 10;
		
		int resultado = n/3;
		
		System.out.println(resultado);
		
	}

}

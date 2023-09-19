package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		//Entrada de datos
		//Introducir datos por teclado
		
	int numero; //Declaro una variable donde guardare el valor que asignare por teclado
		Scanner entrada = new Scanner(System.in);
		//Scanner nos permite crear objetos para poder introducir valores por teclado
	//System.out.println("Introduce un numero");
		numero = entrada.nextInt();
		//System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();//Puedo seguir utilizando en mismi Scanner
	// para seguir introduciendo valores por teclado
		entrada.close(); //Cuando no tenga la necesidad de seguir tecleando valores
		//entonces cierro el Scanner
		//System.out.println("la suma del primer numero con el segundo es: " + (numero+numero2));
	//una vez que alamcenamos el numero tecleado podemos continujar el programa
		//realizar una operacion en el
		//System.out.println("El cuadrado de " + numero + " es: " +(numero*numero));
		
		/*operador modulo
		 * % /Nos da el resultado del residuo de una division
		 */
		
		int n = 10;
		
		int resultado = n % 3;
		System.out.println(resultado);

	}

}

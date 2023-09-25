package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda 
		/*Son funciones "anónimas" 
		 * que implementan una interface funcional
		 * Lo cual nos permite escribir el método para
		 * su uso inmediato
		 * Sin necesidad de que una clase defina CÓMO
		 * va a realizarse
		 * Su operación es (->)
		 * Su sintaxis es la sig: (parametros) -> {Cuerpo de lambda}
		 * 
		 * EXPLICACIÓN
		 * (parametros,sin tipo de dato) -> {Qué se va a realizar con los parámetros}
		 */

		//Traemos una instancia de la "interface" y definimos
		//cómo realizar este método
		
		//Esto nos permite saltarnos que una clase implemente la interface
		//y declare el método
		
		/*
		 *  public void sumar(int a, int b);
		 *  
		 * public void sumar (int a, int b){
		 * System.out.println ("La suma es: " +(a+b));
		 * }
		 */
		
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y)); 
		IMetodo resta = (a,b) -> System.out.println("La resta es: " + (a-b));
		
		//Suma es una instancia anónima, y a través de ella llamamos al método 
		//operación
		suma.operacion(13, 7);
		
		resta.operacion(15, 8);
		
		//Pregunta posible de entrevista
		//¿Podemos crear una instancia de una interface? 
		List<String> lista = new ArrayList<String>();
		
		//La respuesta es NO. No podemos crear una instancia de una interfase
		//Las instancias son propias de una clase
		//Y las clases son las que implementan las interfases.
		//En el ejemplo de arriba (IMetodo suma), esto es una instancia
		//de una clase anónima para que podamos implementar el método
		
	}

}

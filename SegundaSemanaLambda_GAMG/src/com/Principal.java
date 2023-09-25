package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda 
		/*Son funciones "an�nimas" 
		 * que implementan una interface funcional
		 * Lo cual nos permite escribir el m�todo para
		 * su uso inmediato
		 * Sin necesidad de que una clase defina C�MO
		 * va a realizarse
		 * Su operaci�n es (->)
		 * Su sintaxis es la sig: (parametros) -> {Cuerpo de lambda}
		 * 
		 * EXPLICACI�N
		 * (parametros,sin tipo de dato) -> {Qu� se va a realizar con los par�metros}
		 */

		//Traemos una instancia de la "interface" y definimos
		//c�mo realizar este m�todo
		
		//Esto nos permite saltarnos que una clase implemente la interface
		//y declare el m�todo
		
		/*
		 *  public void sumar(int a, int b);
		 *  
		 * public void sumar (int a, int b){
		 * System.out.println ("La suma es: " +(a+b));
		 * }
		 */
		
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y)); 
		IMetodo resta = (a,b) -> System.out.println("La resta es: " + (a-b));
		
		//Suma es una instancia an�nima, y a trav�s de ella llamamos al m�todo 
		//operaci�n
		suma.operacion(13, 7);
		
		resta.operacion(15, 8);
		
		//Pregunta posible de entrevista
		//�Podemos crear una instancia de una interface? 
		List<String> lista = new ArrayList<String>();
		
		//La respuesta es NO. No podemos crear una instancia de una interfase
		//Las instancias son propias de una clase
		//Y las clases son las que implementan las interfases.
		//En el ejemplo de arriba (IMetodo suma), esto es una instancia
		//de una clase an�nima para que podamos implementar el m�todo
		
	}

}

package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
 //Expreciones lambda
	/* son funciones anonimas 
	 * que implementan una interface funcional lo cual nos permite
	 * escribir el metodo para su uso inmediato.
	 * sin nesesidad de que una clase definida como va a realizarse
	 * su operador es (->)
	 * su sintaxis es: (parametros) -> {cuerpo de lambda}
	 * explicacion de parametros, sin tipo de dato -> {que se debe realizar con los parametros}
	 * 
	 */
	
	public static void main(String[] args) {
		
		IMetodo suma = (x,y) -> System.out.println("la suma es: " + (x+y));
		IMetodo resta = (x,y) -> System.out.println("la resta es: " + (x-y));

		
		// suma es una instancia anonima, y a traves de ella llamamos al metodo operacion+
		
		suma.operacion(12, 3);
		resta.operacion(12, 3);
		
		//pregunta posible de entrevista
		//podemos crear una instancia de una interface?
		//respuesta: 
		
		List<String>lista = new ArrayList<String>();
		
		//la respuesta es no. no podemos crear una instancia de una interface
		//las instancias son propias de una clase y las clases son las que implementan las
		//interfaces en el ejemplo de arriba (IMetodo suma), esto es una instancia
		//de una clase anonima para que podamos implementar el metodo.
	}
}

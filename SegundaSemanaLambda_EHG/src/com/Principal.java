package com;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		//Expreciones Lambda
		//Estas son funciones anonimas que implementan una interface funcional
		//lo cual nis permite escribir su uso inmediato sin necesidad de que una clase 
		//defina como va a realizarse
		//Su operador es (->)
		//su sintaxis es la sig: (parametros,) -> {cuerpo de lambda)
		
		//Explicacion 
		//(parametros, sin tipo de dato) -> {que se va a realizar con los parametros}
		
		//Traemos una instancia de la interface y definimos como realizar este metodo
		
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y));
		IMetodo resta = (a,b) -> System.out.println("La resta es: " + (a-b));
		//Suma es una instancia anonima, y atravez de ella llamamos al metodo operacion
		suma.operacion(13, 7);
		resta.operacion(15, 8);
		
		//Pregunta posible de entrevista
		//¿Podemos crear una instancia de una Interface?
		ArrayList<String> lista = new ArrayList<String>();
		
		//La respuesta es NO. No podemos crear Instancias en una interface
		//Las instancias son propias de una clase
		//Y las clases son las que implementan las interfaces
		//En el ejemplo de arriba (IMetodo suma) esto es una instancia
		//de una clase anonima para que podamos implementar el metodo

	}

}

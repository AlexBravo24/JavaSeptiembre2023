package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son funciones "anonimas"
		//que implementan una interface funcional
		//lo cual nos permite escribir el metodo para 
		//su uso inmediato 
		//Sin necesidad de que una clase defina COMO va realizar 
		//va a realizarse
		//su operador es (->)
		//su sintaxis es la sig: (parametros, sin tipo de dato)->(cuerpo)
		
//		Explicacion 
//		(parametros, sin tipo )- ¿QUE SE VA A realizar con los parametros)
		
		
		//TRaemos una instancia de la "Instancia o Interface" y  definimos 
		//como realizar este metodo 
		
		//Este nos permite saltarnos que una clase implemente la interface
		//y y decirle el metodo 
		
		//Este nos permite saltarnos que una clase implemete la interface 
		//y declare el metodo
		
//		public void sumar(int a, int b);
		
//		public void sumar (int a , int b)
//		
//		System.out.println("La suma es : " + (x, y));
		
		
		
		IMetodo suma = (x,y) -> System.out.println("La suma es : " +(x+y) );
		IMetodo resta =(x,y) -> System.out.println("La resta es : " + (x-y));

		//suma es una instancia anonima, y a traves de ella llamamos al metodo
		//operacion
		suma.operacion(13, 7);
		
		resta.operacion(15, 8);
		
		//Pregunta posible entrevista 
		//¿Podemos crear una instancia de una interface?
		List<String> lista =new ArrayList<String>();
		
		//LA RESPUESTA ES NO. No podemos crear de una interface 
		//Las instancias son propias de una clase 
		//Y las clases son las qe son las que implementan las interfaces 
		//En el ejemplo de arriba (IMetodo suma), este es uns instancia 
		//de una clase anonima para que podemos implementar el metodo
		
	    
	}

}

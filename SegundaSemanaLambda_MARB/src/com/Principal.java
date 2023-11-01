package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda
		//son funciones anonimas que implementan 
		//una interface funcional
		//Lo cual nos permite escribir el metodo para su uso inmediato 
		//sin necesidad de que una clase defina COMO va a realizarse.
		//Su operador es (->)
		//Su sintaxis es la sig: (parametros, sin tipo de dato) -> {cuerpo de lambda}
		
		//Explicacion 
		//(parametros, sin tipo de dato) -> {QUE se va a realizar con los parametros}
		
		//Traemos una instancia de la "interface" y definimos 
		//como realizar este metodo 
		
		//Esto nos permite saltarnos que una clase implemente la interface
		//y declare el metodo 
		
		//public void operacion(int a, int b);
		
		//public void operacion(int a, int b);
		//System.out.println("La suma es: " + (x+y));
		//}
		
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y));
		IMetodo resta= (a,b) -> System.out.println("La resta es: "+ (a-b));
		
		//Suma es una instancia anonima, y atraves de ella llamamos al metodo 
		//operacion.
		
		suma.operacion(13, 7);
		resta.operacion(15, 8);
		
		//Pregunta posible de entrevista
		//¿Podemos crear una instancia de una interface?
		List<String> lista = new ArrayList<String>();
		
		//La respuesta es NO. No podemos crear instancias de una interface 
		//Las instancias son propias de una clase 
		//Y las clases son las que implementan las interfaces 
		//En el ejemplo de arriba (IMetodo suma), esto es una instancia 
		//de una clase anonima para que podamos implementar el metodo.
		
		
		

	}

}

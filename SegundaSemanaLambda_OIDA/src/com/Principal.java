package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones lambda 
		//Estas son funciones anonimas que implementan una interface funcional 
		//Esto nos permite escribir el metodo para su uso inmediato sin necesidad que una clase defina como va a realizarse 
		//Su operador es (->)
		//su sintaxtis es la siguiente , (parametros) -> (cuerpo lambda)
		
		//(parametros, sin tipo de datos)-> que se va a realizar con los parametros 
		
		//Traemos una instancia de la "Interface" y definimos como se va a realizar el metodo 
		
		//Esto nos permite saltarnos que una clase implemente la interface y declare un metodo
		
		IMetodo suma = (x,y) -> System.out.println("la suma es: " + (x+y));
		IMetodo resta = (a,b) -> System.out.println("La resta es: " +(a-b));
		//suma es una instancia anonima , y a traves de ella llamamos al metodo operacion
	
		suma.operacion(13, 7);
		resta.operacion(15, 8);
		
		//pregunta posible de entrevista 
		//¿podemos crear una instancia de una interface?
		//No. no podemos crear instancias de una interface, las instancias de una interface 
		//las instancias son propias de una clase, y las clases son las que implementan las interfaces 
		//en el ejemplo de arriba (metodo suma), esto es una instancia de una clase anonima para que podamos implementar el metodo
		
		
		
		
		
		//una instancia seria un onjeto de una clse, clase persona - instancia persona1
		
		
		

	}

}

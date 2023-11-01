package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras de decisi�n if - Evaluar valores booleanos
		//Si la condici�n se cumple, se ejecuta el bloque de c�digo
		
		int x = 211;
		
		if(x < 10) {
			System.out.println("Si se cumple");
		}else {
			
			System.out.println("No se cumple");
		}
		//Condiciones con operadores l�gicos
		//AND, OR, NOT, Diferente de, Igualdad
		//AND - && - Devuelve el valor true cuando se cumplen todas las condiciones 
		
		int y = 5;
		
		if(y <= 9 && y > 0) {
			
			System.out.println("Si se cumple");
			
		}else {
			
			System.out.println("No se cumple");
			
		}
		//OR - || - Devuelve el valor true cuando se cumple alguna de las condiciones
		
		if(x < 9 || x > 0) {
			
			System.out.println("Si se cumple");
			
		}else {
			
			System.out.println("No se cumple");
			
		}
		//Igualdad - == - Devuelve el valor true cuando son iguales las condiciones
		
		if(x == 5) {
			
			System.out.println("Si se cumple");
			
		}else {
			
			System.out.println("No se cumple");
		}
		//NOT - ! - Cambia el valor de true a false y viceversa
		
		if(!(x == 5)) {
			
			System.out.println("Si se cumple");
			
		}else {
			
			System.out.println("No se cumple");
		}
		//Diferente de - != - Compara valores, pero si es diferente manda true
		
		if(x != 23) {
			
			System.out.println("Si se cumple");
			
		}else {
			
			System.out.println("No se cumple");
		}
			
		}

}

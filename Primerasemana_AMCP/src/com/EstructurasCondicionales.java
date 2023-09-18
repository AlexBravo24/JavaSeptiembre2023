package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras de decisión IF = Evaluar valores booleanos
		
		//Si la condición se cumple, se ejecuta un bloque de codigo
		//o una acción, si no, ejecutamos otra cosa
		
		int x = 9;
		
		if (x<=9) { //Ejecuta lo siguiente, si se cumple la condición
			System.out.println("Si se cumple");
		}else { //En otro caso/si no se cumple la condición, realiza
			//lo siguiente
			System.out.println("No se cumple");
		}
		
		//Condiciones con Operadores Lógicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND = && = Devuelve el valor true cuando se cumplan TODAS 
		//Las condiciones
		if (x<9 && x>0) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//OR = || = Devuelve el valor true cuando se cumplan ALGUNA 
		//De las condiciones
		if (x<9 || x>0) {
					System.out.println("Si se cumple");
		}else {
					System.out.println("No se cumple");
				}
		
		//IGUALDAD = == = Compara el valor y revisa si es igual
		//a otro
		//Cuando asignamos un = a una variable es para asignar valor
		//Para compararlo contra otro es con doble igual
		if (x==15) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//NOT = ! = Cambia el valor de TRUE a FALSE y viceversa
		if (!(x==9)) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//DIFERENTE DE = != = Compara el valor, pero si es DIFERENTE
		//manda TRUE
		if (x!=11) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		
		
		

	}

}

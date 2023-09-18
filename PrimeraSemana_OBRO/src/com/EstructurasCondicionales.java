package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estrocturas de decicion IF-Evaluar valores booleanos
		
		//Si la condicion se cumple se ejecuta un bloque de codigo o una accion
		//si no ejecutamos otro bloque
		
		int x=9;
		
		if(x<=9) { //Ejecuta lo siguiente si se cumple la condicion
			System.out.println("Si se cumple");
			
		}else { //En otro caso/si no se cumple la condicion realizar lo siguente
			System.out.println("No se cumple");
			
		}

		//Condiciones con operadores logicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelve el valor TRUE cuando se cumplan TODAS las condiciones
		if (x<9 && x>0) {
			System.out.println("Si se cumple");
			
		}else {
			System.out.println("No se cumple");
		}
		
		
		//OR - || - Devuelve el valor TRUE cuando se cumplan ALGUNA de las condiciones
		if (x<9 || x>0) {
			System.out.println("Si se cumple");
					
		}else {
			System.out.println("No se cumple");
		}
			
		
		//IGUALDAD- == - Compara el valor y revisa si es igual a otro
		//Cuando asignamos un igual a una variable es para asignar valor
		//Para compararlo contra otro es con doble igual
		if (x==15) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		
		//NOT - ! - Cambia el valor de TRUE a FALSE y viceversa
		if (!(x==9)) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//DIFERENTE DE - != - Compara el valor, pero si es DIFERENTE manda TRUE
		if (x!=11) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructura de decision IF - Evaluar vaores booleanos 
		
		//Si la condicion se cumple, se ejecutan un bloque de codigo 
		//o una accion, si no, ejecuta otra cosa 
		
		int x = 9; 
		
		if (x<10) { //Ejecuta lo siguiente, si se cumple la condicion 
			
			System.out.println("Si se cumple");
			
		}else { //En otro caso/si no se cumple la condicion, realiza
			//lo siguiente 
			System.out.println("No se cumple");
		}
		
		
		//Condisiones con Operadores logicos 
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelve el valor true cuando se cumplan TODAS 
		//las condiciones 
		if (x<9 && x>0) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//OR - || - Devuelve el valor true cuando se cumplan ALGUNA 
		//las condiciones 
		if (x<9 || x>0) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//IGULDAD - == - Compara el vvalor o y revisa si es igual 
		//a otro 
		//Cuando asiganamos una = a una variable es para asignar valor 
		//Para comprobarlo contra otro es con doble igual 
		
		if (x==15) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//NOT - ! - Cambia el valo de TRUE a FALSE y viceversa 
		if (!(x==9)) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//DIFERENTE DE - != - Compara el valor, pero si es DIFERENTE 
		//manda TRUE
		if (x!=11) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}

	}

}

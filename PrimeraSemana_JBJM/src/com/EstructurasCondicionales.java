package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decision IF -Evaluar valores booleanos 
		
		//Si la condicion se cumple, se ejecuta bloque de codigo
		//o una accion, si no , ejecutamos otra cosa
		
		int x = 9;
		
		if (x<9) {//Ejecuta la siguente si se cumple la condicion 
			System.out.println("Si se cumple");
		}else {//En otro caso /O si no se cumple la condicion realiza 
			//lo siguente
			System.out.println("No se cumple");
		}
		
		//Condiciones con Operadores Logicos 
		//AND, OR, NOT DIFERENTE DE, IGUALDAD 
		
		//AND - && - Devolverse el valor true cumplan TODAS 
		//Las condiciones 
		if (x<=9 && x>0) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		//OR - - Devuelve el valor true cuando se cumple ALGUNA
		//de las condiciones 
		
		if (x<=9 || x>0) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//IGUALDAD  - == -Compara el valor o y revisa al ser igual 
		//a otro 
		//Cuando asignamos un = a una variable es para asignar valor 
		//Para compararlo contra otro es con doble igual 
		if (x==15 ) {
			System.out.println("Si se cumple");
		}else {
			System.out.println("No se cumple");
		}
		
		//NOT - ! - Cambia el valor de TRUE a FALSE y viceverse 
		if (!(x==9 )) {
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

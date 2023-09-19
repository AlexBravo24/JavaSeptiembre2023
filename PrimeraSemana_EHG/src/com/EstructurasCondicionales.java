package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decicion if - Evaluar valores booleanos
		//Si la condicion se cumple se ejecuta un bloque de codigo o una accion
		
		int x = 9;
		
		if (x <= 9) {//Ejecuta lo siguiente, si se cumple la condicion
			System.out.println("Si se cumple");
		}else {//en otro caso si no se cumple la condicion realiza los siguiente
			System.out.println("No se cumple"); 
			
		} 
		
		//Condiciones con operadores Logicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND -&& - devuelve el valor true cuando se cumplan TODASlas condiciones
		if (x<9 && x>0){
			System.out.println("Si se cumple");
		} else {
			System.out.println("No se cumple");
		} 
		
		
		//OR -|| - Devuelve el valor true cuando se cumpla alguna de las condiciones
		if (x<9 || x>0){
					System.out.println("Si se cumple");
		} else {
					System.out.println("No se cumple");
		}
		
		
		//IGUALDAD - == - Compara el valor o y revisa si es igual
		//a otro
		//cuando asignamos un = a uan variable es para asignar valor
		//para compararlo contra otros es con doble igual
		if (x==15){
			System.out.println("Si se cumple");
        } else {
			System.out.println("No se cumple");
        }
		
		
		//NOT - ! - Cambia el valor de TRUE A FALSE y viceversa
		if (!(x==9)) {
			System.out.println("Si se cumple");
        } else {
			System.out.println("No se cumple");
        }
		
		//DIFERENTE DE - != - Compara el valor, pero si es diferente manda TRUE
		if (x!=11) {
			System.out.println("Si se cumple");
        } else {
			System.out.println("No se cumple");
        }
		
		
		
		

	}

}

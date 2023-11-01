package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estructuras de decision if - que evalua valores booleanos
		
		//Si la condicion se cumple se ejecuta una accion de codigo, si no, ejecutamos otra cosa
		
		int x =8;
		if (x<9){//ejecuta lo siguiente si se cumple la condicion 
			System.out.println("Si se cumple");
		}else { //En otro caso/ si no se cumple la condicion ejecuta lo siguiente
			System.out.println("No se cumple");
		}
		
		
		//condiciones con operadores logicos 
		//AND, OR, NOT, Diferente de, igualdad
		
		//AND  && devuelve el valor true cuando se cumplan todas las condiciones
		if (x<9 && x>0) {
			System.out.println("si se cumplen todas las condiciones");
			
		}else {
			System.out.println("no se cumplen");
		}
		
		//OR || devuelve el valor true cuando se cumpla alguna de las condiciones
		
		if (x<9 || x>0) {
			System.out.println("si se cumplió alguna");
			
		}else {
		System.out.println("no se cumplio");
	}
	
	// igualdad == compara el valor o y revisa si es igual a otro 
	// cuando asignamos un = a una variable es para asignarle un valor 
	// para compararlo con otro es con doble igual
		
		if (x==0) {
			System.out.println("si se cumplió alguna");
			
		}else {
		System.out.println("no se cumplio");
	}
		// NOT ! cambia el valor de true a false y viceversa
		
		if (!(x==8)) {
			System.out.println("si se cumplió alguna");
			
		}else {
		System.out.println("no se cumplio");
		
	
	}
		
		
		// Diferente de != compara el valor, pero si es diferente manda true 
		
		if (x!=0) {
			System.out.println("si es diferente");
			
		}else {
		System.out.println("no se cumplio");
	}
		
		
	}
}

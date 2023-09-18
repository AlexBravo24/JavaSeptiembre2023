package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS O BUCLES
		//Nos ayudan a ejecutar "n" veces una accion de acuerdo a una condicion
		
		/*
		 * En el caso de los ciclos nos apoyamos en el cambio de variables
		 * Porque de acuerdo a ese cambio, evaluaremos si la accion se sigue o no
		 * realizando
		 */
		
		
		//WHILE - MIENTRAS
		//La accion se ejecutara mientras se cumpla una condicion
		
		int x = 1;
//		
//		while(x<=5) { //Mientras x sea menos a 5 realiza lo siguiente
//			System.out.println(x + ". Hola mundo");
//			x ++ ; //Podemos indicar un incremento para controlar esta accion 
//		}
		
		
		//DO WHILE - Nos asegura que si la condicion no se cumple, el programa
		//se ejecute por lo menos una vez
		
		do { //Haz lo siguiente
			
			System.out.println("Hola mundo");
		}while(x>2); //La condicion no se cumple, pero el programa se ejecutara al menos una vez
		
		//FOR - PARA ESTOS ARGUMENTOS, REALIZA LO SIGUIENTE
		//DETERMINADO - Se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos
		//que se realice una accion
		
		//for(variable de control; una condicion; incremento)
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ". Hola mundo");
			
		}
		
		
		
		
		
		
		
		

	}

}

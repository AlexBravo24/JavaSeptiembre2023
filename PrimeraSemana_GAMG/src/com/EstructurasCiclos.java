package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		// CICLOS O BUCLES
		// Nos ayudan a ejecutar "n" veces una acci�n
		//de acuerdo a una condici�n
		
		/*En el caso de los ciclos nos apoyamos
		 * en el cambio de variable
		 * Porque de acuerdo a ese cambio, es como 
		 * evaluaremos si la acci�n se sigue o no
		 * realizando
		 */
		
		//WHILE - MIENTRAS
		//La acci�n se va a estar ejecutando mientras
		//se cumpla una condici�n
		
		int x=1; 
		
//		while(x<5) {                         //Mientras (x sea menor a 5) realiza lo siguiente
//	    	System.out.println(x + ". Hola mundo"); 
//	    	x++; //Incrementa el valor en uno. Podemos indicar un incremento para 
//	    	//controlar esta acci�n
//		}
		
	//DO WHILE - Nos aseguramos que si la condici�n 
	//no puede cumplirse, el programa se ejecute 
	//por lo menos una vez
	do { //Haz lo siguietnte
		System.out.println("Hola mundo");
	} while(x>2); //La condici�n no se cumple, pero el programa
		// ejecutar� por lo menos una vez
		
	// FOR - PARA ESTOS ARGUMENTOS, REALIZA LO SIGUIENTE
	//DETERMINADO - Se utiliza cuando conocemos o tenemos una idea
	//de cuantas veces queremos que se realice una acci�n
	
	//for(variable de control; una condici�n; un incremento)
	for (int i = 0; i <=5; i++) {
		System.out.println(i + ". Hola mundo");
	}
	
	}
}

package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		// CICLOS O BUCLES
		// Nos ayudan a ejecutar "n" veces una acción
		//de acuerdo a una condición
		
		/*En el caso de los ciclos nos apoyamos
		 * en el cambio de variable
		 * Porque de acuerdo a ese cambio, es como 
		 * evaluaremos si la acción se sigue o no
		 * realizando
		 */
		
		//WHILE - MIENTRAS
		//La acción se va a estar ejecutando mientras
		//se cumpla una condición
		
		int x=1; 
		
//		while(x<5) {                         //Mientras (x sea menor a 5) realiza lo siguiente
//	    	System.out.println(x + ". Hola mundo"); 
//	    	x++; //Incrementa el valor en uno. Podemos indicar un incremento para 
//	    	//controlar esta acción
//		}
		
	//DO WHILE - Nos aseguramos que si la condición 
	//no puede cumplirse, el programa se ejecute 
	//por lo menos una vez
	do { //Haz lo siguietnte
		System.out.println("Hola mundo");
	} while(x>2); //La condición no se cumple, pero el programa
		// ejecutará por lo menos una vez
		
	// FOR - PARA ESTOS ARGUMENTOS, REALIZA LO SIGUIENTE
	//DETERMINADO - Se utiliza cuando conocemos o tenemos una idea
	//de cuantas veces queremos que se realice una acción
	
	//for(variable de control; una condición; un incremento)
	for (int i = 0; i <=5; i++) {
		System.out.println(i + ". Hola mundo");
	}
	
	}
}

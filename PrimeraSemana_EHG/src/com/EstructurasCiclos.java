package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS O BUCLES
		//Nos ayuda a ejecutar "n" veces una accion de acuerdo a una condicion
		
		/*En el caso de los ciclos nos apoyamos
		 * en el cambio de variable
		 * porque de acuerdo de ese cambio es como
		 * evaluaremos si la accion se sigue o no realizando
		 */
		
		//WHILE - MIENTRAS
		//L accion se va a estar ejecutando mientras
		//se cumpla una condicion
		
		int x = 1;
		
	   //DO WHILE - Nos asegurames que si la condicion no puede cumplirse, el programa se ejecute por lo menos una vez
		
		do {//Haz lo siguiente
			System.out.println("Hola Mundo");
			
		}while(x>2);//La condicion no se cumple, pero el programa se ejecutara por lo menos 1 vez
		
		
		//FOR - para estos argumentos, realiza lo siguiente
		//determinado - se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos que se realice una accion
		
		//for (variable de control; una condicion; incremento)
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ". Hola Mundo");
			
		}
		
		

	}

}

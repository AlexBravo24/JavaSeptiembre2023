package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o Bucles
		// Nos ayudan a ejecutar n veces una acción de acuerdo a una ejecución
		/*En el caso de los ciclos nos apoyamos en el cambio de variable
		 * Por que de acuerdo a ese cambio, es como evaluaremos si la acción se
		 *sigue o no realizando
		 */  
		//While - Mientras / La acción se va a estar ejecutando mientras se cumpla la condición
		
		int x = 1;
		int y = 1;
		
		while (x <= 5) {
			System.out.println(x + ". Hola Mundo");
			x++;
		}
		
		// Do-while Nos aseguramos que si la condición no se cumpla, el programa se ejecute por lo menos 1 vez
		
		do {
			System.out.println("Hola Mundo");
		} while (y > 3);
		
		// For se utiiza cuando conocemos o tenemos una idea de cuantas veces queremos que se realice una acción
		// For (variable de control; una condición; incremento)
		
		for (int i = 0; i <= 6; i++) {
			System.out.println(i + ". Hola mundo");
		}
	}

}

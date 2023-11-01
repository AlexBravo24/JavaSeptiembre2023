package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o Bucles
		// Nos ayudan a ejecutar n veces una acci�n de acuerdo a una ejecuci�n
		/*En el caso de los ciclos nos apoyamos en el cambio de variable
		 * Por que de acuerdo a ese cambio, es como evaluaremos si la acci�n se
		 *sigue o no realizando
		 */  
		//While - Mientras / La acci�n se va a estar ejecutando mientras se cumpla la condici�n
		
		int x = 1;
		int y = 1;
		
		while (x <= 5) {
			System.out.println(x + ". Hola Mundo");
			x++;
		}
		
		// Do-while Nos aseguramos que si la condici�n no se cumpla, el programa se ejecute por lo menos 1 vez
		
		do {
			System.out.println("Hola Mundo");
		} while (y > 3);
		
		// For se utiiza cuando conocemos o tenemos una idea de cuantas veces queremos que se realice una acci�n
		// For (variable de control; una condici�n; incremento)
		
		for (int i = 0; i <= 6; i++) {
			System.out.println(i + ". Hola mundo");
		}
	}

}

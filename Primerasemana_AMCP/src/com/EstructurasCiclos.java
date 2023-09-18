package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		//CICLOS O BUCLES
		//Nos ayudan a ejecutar "n" veces una acci�n
		//de acuerdo a una condici�n
		
		/*En el caso de los ciclos nos apoyamos
		 * en el cambio de variable
		 * Porque de acuerdo a ese cambio, es como
		 * evaluaremos si la acci�n se sigue o no
		 * realizando
		 */
		
		//WHILE = MIENTRAS
		//La acci�n se va a estar ejecutando mientras
		//se cumpla una condici�n
		
		int x = 1;
		
//		while(x<5) {//Mientras (x sea menor a 5) realiza lo siguiente
//			System.out.println(x + ". Hola Mundo");
//			x++; //Podemos indicar un incremento para
//			//Controlar est� acci�n
//			
//		}
		
		//DO WHILE = Nos aseguramos que si la condici�n
		//no puede cumplirse, el programa se ejecute por lo menoz
		//1 vez
		
		do {//Haz lo siguiente
			System.out.println("Hola Mundo");
		}while(x>2);//La condici�n no se cumple, pero el programa
		//se ejecutar� por lo menos 1 vez
		
		//FOR = Para estas condiciones/argumentos, realiza lo siguiente
		//Determinado = se utiliza cuando conocemos o tenemos una idea
		//de cuantas veces queremos que se realice una acci�n
		
		//for (variable de control; una condici�n; incremento)
		for (int i = 0; i <=5; i++) {
			System.out.println(i + ". Hola Mundo");
			
		}

	}

}

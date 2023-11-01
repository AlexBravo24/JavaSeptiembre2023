package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS O BUCLES
		//Nos ayudan a ejecutar "n" veces un accion 
		//de acuerdo a una condicion 
		/*En el caso de los ciclos nos apoyamos
		 * en el cambio de variable
		 * Porque de acuerdo a ese cambio, es como 
		 * evaluaremos si  la accion se sigue o  no 
		 * realizando 
		 */
		
		//WHILE - MIENTRAS 
		//La accion se va estar ejecutando mientras
		//se cumpla una condicion 
		
		int x = 1 ;
		
//		while (x<=5) {//Mientras(x sea menor a 5) realiza lo sig
//			System.out.println(x + ". Hola mundo");
//			x++;//Podemos indicar un incremento para 
//			//controlar esta accion 
//			
			
		//DO WHILE - Nos aseguramos que si la condicion 
		//no puede cumplirse, el programa se ejecute por lo menos 
		//1 vez
		do { //Haz lo siguente
			System.out.println("Hola mundo ");
		} while (x>2);//La condicion no se cumple, pero el programa 
		//se ejecutara por lo menos 1 vez
		
		//FOR - PARA ESTOS ARGUMENTOS, REALIZA LO SIGUENTE -
		//DETENIENDO - Se utiliza cuando conocemos una idea
		//de cuantas veces queremos que se realice una accion
		
		//for (variable de control una condicion; incremento)
		for (int i = 0;  i<=5; i++) {
			System.out.println(i + ". Hola mundo");
		}
		
		}

	

}

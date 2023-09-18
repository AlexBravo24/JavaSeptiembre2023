package com;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// CICLOS O BUCLES 
		//Nos ayudan a ejecutar "n" veces una accion
		//de acuerdo a una condicion
		
		/*En l caso de los ciclos nos apoyamos 
		 * en el cambio de variable 
		 * Poruqe de acuerdo a ese cambio, e como 
		 * ecaluaremos si a accion se sigue o no 
		 * realizando 
		 */
		
		//WHILW - MIENTRAS 
		//La accion se va a estar ejecutando mientras 
		//se cumpla una condicion 
		
		int x = 1;
		
//		while(x<5) { //Mientras (x sea menor a 5) realiza lo sig 
//			System.out.println(x +" "+" Hola mundo ");
//			x++;  // Podemos iniciar un incremente para 
//			//controlar esta accion 
	
		//DO WHILE - Nos asegura que si la condicion
		//no puede cumplirse, el programa se ejecute por lo menos 
		//1 vez 
		
		
		do {   //Haz lo siguiente
			System.out.println("Hola mundo");
		}while(x>2);  //La condicion no se cumple, pero el programa 
		//se ejecutara por lo menos 1 vez 
		
		
		//FOR - PARA ESTOS ARGUMENTOS, REALIZA LO SIGUIENTE
		//DETERMINADO- Se utiliza cuando conocemos o tenemos una idea 
		//de cuantas veces queremos que se realice una accion 
		
		//for (variable de control; una condicion; incremento)
		for (int i = 0; i <=5; i++) {
			System.out.println(i + ". Hola mundo");
			
		}
		

	}

}

package com;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// Ciclos o bucles 
		// nos ayudan a ejecutar "n" veces un accion
		// de acuerdo a una condicion
		/* en el caso de los ciclos nos apoyamos en el cambio de variable
		 * porque de acuerdo a ese cambio , es como evaluaremos si la
		 * accion se sigue realizando
		 */
		
		// WHILE - MIENTRAS
		/* la accion se va estar ejecutando mientras sea verdadera y cumpa
		 * una condicion
		 */
		
	int x = 1;
	/*while(x<5) {
		System.out.println("hola gato");
		x++; //podemos indicar un incremento para controlar esta accion
	}*/
	
  System.out.println("hola mundo");
  while(x>2); // la condicion no se cumple, pero el progreso sigue.
  
  
  for (int i = 0; i<=5; i++) {
	  System.out.println(i + ". hola bitch");
  }
	}

}

package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o bucles 
		//nos ayudan a ejecutar n veces una accion de acuerdo a una condicion 
		
		//en el caso de los ciclos nos apoyamos en el cambio de variable, porque de ahí evaluaremos si la accion se sigue realizando 
		
		
		//while - mientras
		//se ejecuta mientras la accion sea verdadera 
		
		int x = 1;
//		while(x<5) {//mientras x sea menor a 5 se va a imprimir Hola mundo 
//			System.out.println(x + "Hola mundo");
//			x++;
//			
//		}

		
		//ciclo Do while.  con este nos aseguraques que si la condicion no puede cumplirse se ejecute por lo menos una vez 
		
		do {//haz lo siguiente
			System.out.println("hola mundo");
			
		}while(x>2);
		
		
		//for. para estos argumentos realiza lo siguiente 
		// se usa cuando sabemos cuantas veces queremos que se ejecute 
		
		//for (variable de control; una condicion; incremento)
	    for (int i = 0; i<=5; i++) {
	    	System.out.println( i +"Hola mundo");
	    	
	    }
	}

}

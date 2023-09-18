package com;

public class EstructurasDeDesicion {

	public static void main(String[] args) {
			
		//Estructura if-else anidado
		
		int d=10; 
		
//		if(d==1) {
//			System.out.println("Lunes");
//		}else if(d==2) { //Ademas evalua si...
//			System.out.println("Martes");
//		}else if(d==3) {
//			System.out.println("Miercoles");
//		}else if(d==4) {
//			System.out.println("Jueves");
//		}else if(d==5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		
		//Estructura de decision SWITCH-CASE
		
		switch (d) { //De acuerdo al valor que tome mi variable
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

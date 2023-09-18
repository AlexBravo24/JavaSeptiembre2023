package com;

public class EstructurasDecision {

	public static void main(String[] args) {
		int day = 3;
		
		// if anidados
		if(day == 1) {
			System.out.println("Lunes");
		}else if(day == 2) {
			System.out.println("Martes");
		}else if(day == 3) {
			System.out.println("Miércoles");
		}else if(day == 4) {
			System.out.println("Jueves");
		}else if(day == 5) {
			System.out.println("Viernes");
		}else if(day == 6) {
			System.out.println("Sábado");
		}else if(day == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Desconocido");
		}
		
		// switch
		switch(day) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Desconocido");
				break;
		}

	}

}

package com;

public class EstructurasDecisión {

	public static void main(String[] args) {
		// Estructura if-else anidadon 
		int d = 2;
		
		if(d == 1) {
			System.out.println("Lunes");
		}else if(d == 2) {
			System.out.println("Martes");
		}else if(d == 3) {
			System.out.println("Miercoles");
		}else if(d == 4) {
			System.out.println("Jueves");
		}else if(d == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}
		//Estructuras de decisión switch case
		
		switch (d) {
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

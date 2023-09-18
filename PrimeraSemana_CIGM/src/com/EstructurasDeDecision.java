package com;

public class EstructurasDeDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
  int d = 3;
		
//	if(d==1) {
//			System.out.println("lunes");
//		}
//		else if(d==2) {
//			System.out.println("martes");
//		}
//		else if(d==3) {
//			System.out.println("miercoles");
//		}
//		else if(d==4) {
//			System.out.println("jueves");
//		}
//      else if(d==5) {
//			System.out.println("viernes");
//		}
//		else if(d==6) {
//			System.out.println("sabado");
//		}
//		else{
//			System.out.println("desconocido");
//		}  
		
		switch (d) {
		
		case 1:
		System.out.println("lunes");
		break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		default:
			System.out.println("desconocido");
			break;
		}
	}

}

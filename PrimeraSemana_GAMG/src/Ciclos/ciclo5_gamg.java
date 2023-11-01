package Ciclos;

import java.io.ObjectInputStream.GetField;

public class ciclo5_gamg {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día,
		// desde las 00:00:00 horas hasta las 23:59:59 horas 

		for(int h=0;h<=23;h++) {
			for(int m=0;m<=59;m++) {
				for(int s=0;s<=59;s++) {
				
					System.out.println(h+":"+m+":"+s);
				}}}
		//Para usar los formatos, 
		
//		int horas=0, minutos=0, segundos=0;
//		
//		while(true) {
//			//se imprime la hora
//		if (h<10) {
//				System.out.print("0");
//			} else {
//				System.out.print(h+":");
//			}
//			if (m<10) {
//				System.out.print("0");
//			} else {
//				System.out.print(m+":");
//			}
//			if (s<10) {
//				System.out.print("0");
//			} else {
//				System.out.println(s);
//			}
//			
//			segundos++;
//			
//			//se cambia la hora
//			if(s==60) {
//				s=0;
//				m++;
//				if(m==60) {
//					m=0;
//					h++;
//					if(h==24) {
//						h=0;
//					}
//				}
//			}
//		}
	}

}

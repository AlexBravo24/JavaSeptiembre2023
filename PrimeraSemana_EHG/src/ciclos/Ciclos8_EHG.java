package ciclos;

import java.util.Scanner;

public class Ciclos8_EHG {

	public static void main(String[] args) {
		//Programa Java que lea dos números y muestre los números desde el menor hasta el 
		//mayor 
		
		int numero1, numero2, menor, mayor;
		
		 Scanner entrada = new Scanner(System.in); 
	        //Lectura de dos números enteros distintos
	        do {
	            System.out.println("Introduce un número entero: ");
	            numero1 = entrada.nextInt();
	            System.out.println("Introduce otro número entero distinto del anterior: ");                   
	            numero2 = entrada.nextInt();
	            entrada.close();
	            if(numero1 == numero2){
	                System.out.println("Debes introducir dos números distintos");
	                return ;
	            }
	        } while (numero1 == numero2);
	       
	        //Calcular cuál de los números es el mayor y cuál el menor
	        if (numero1 > numero2) {
	            mayor = numero1;
	            menor = numero2;
	        } else {
	            mayor = numero2;
	            menor = numero1;
	        }
	       
	        //Mostrar por pantalla los números desde el menor hasta el mayor.
	        System.out.println("Números desde " + menor + " hasta el " + mayor + " : ");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }

	}

}

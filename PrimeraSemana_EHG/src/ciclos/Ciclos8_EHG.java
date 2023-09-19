package ciclos;

import java.util.Scanner;

public class Ciclos8_EHG {

	public static void main(String[] args) {
		//Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
		//mayor 
		
		int numero1, numero2, menor, mayor;
		
		 Scanner entrada = new Scanner(System.in); 
	        //Lectura de dos n�meros enteros distintos
	        do {
	            System.out.println("Introduce un n�mero entero: ");
	            numero1 = entrada.nextInt();
	            System.out.println("Introduce otro n�mero entero distinto del anterior: ");                   
	            numero2 = entrada.nextInt();
	            entrada.close();
	            if(numero1 == numero2){
	                System.out.println("Debes introducir dos n�meros distintos");
	                return ;
	            }
	        } while (numero1 == numero2);
	       
	        //Calcular cu�l de los n�meros es el mayor y cu�l el menor
	        if (numero1 > numero2) {
	            mayor = numero1;
	            menor = numero2;
	        } else {
	            mayor = numero2;
	            menor = numero1;
	        }
	       
	        //Mostrar por pantalla los n�meros desde el menor hasta el mayor.
	        System.out.println("N�meros desde " + menor + " hasta el " + mayor + " : ");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }

	}

}

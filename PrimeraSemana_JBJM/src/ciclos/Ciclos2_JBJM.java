package ciclos;

import java.util.Scanner;

public class Ciclos2_JBJM {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//3 x 95 = ???
		int i;
        int j;
 
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero");
        i=leer.nextInt();
 
        System.out.println("introduce la iteracion deseada");
        j=leer.nextInt();
 
        for (i=i; i<=j; i++){
 
            int r=i*j;
            System.out.println(i+"*"+j+"="+r);
        }
    }
 



}

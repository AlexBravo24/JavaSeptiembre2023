package ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos12_OIDA {

	public static void main(String[] args) {
		// Ejercicio 12Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		//cuando el promedio de las edades sea superior a 25
		int edad;
		int masedad=1;
		double promedio, sumadeedades=0;
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("Ingresa la edad edad");
			edad = entrada.nextInt();
			sumadeedades = sumadeedades+edad;
			masedad++;
			promedio= sumadeedades/masedad;
	       }while (promedio<=25);
		System.out.println("El promedio es " + promedio);
	       entrada.close();
	}

}

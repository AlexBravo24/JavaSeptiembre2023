package condicionales;

import java.util.Scanner;

public class Condicionales8_OIDA {

	public static void main(String[] args) {
		// Ejercicio 8 Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
//		seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje:
//		�ERROR: n�mero incorrecto�.
		int caradecubo;
		String caracontraria;
		Scanner entrada= new Scanner(System.in);
		System.out.println("�Que numero sali� en la cara del dado?");
		caradecubo = entrada.nextInt();
		entrada.close();
		if(caradecubo >= 1 && caradecubo <= 6 ) {
			if (caradecubo == 1) {
				caracontraria = "seis";
				System.out.println("La cara contraria es " + (caracontraria));
		
		}else if (caradecubo == 2) {
			caracontraria = "cinco";
			System.out.println("La cara contraria es " + (caracontraria));
		}else if (caradecubo == 3) {
			caracontraria = "cuatro";
			System.out.println("La cara contraria es " + (caracontraria));
		}else if (caradecubo == 4) {
			caracontraria = "tres";
			System.out.println("La cara contraria es " + (caracontraria));
		}else if(caradecubo == 5) {
			caracontraria = "dos";
			System.out.println("La cara contraria es " + (caracontraria));
		}else if (caradecubo == 6) {
			caracontraria = "uno";
			System.out.println("La cara contraria es " + (caracontraria));
		}
			}else{
			System.out.println("n�mero incorrecto");
		}
	}

}

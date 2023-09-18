package Array;

import java.util.Scanner;

public class Problemario3EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Crear un array de caracteres para almacenar los caracteres de la frase
        char[] caracteres = frase.toCharArray();

        // Mostrar los caracteres en el array
        System.out.println("Los caracteres en la frase son:");
        for (char caracter : caracteres) {
            System.out.println(caracter);
        }

        scanner.close();
	}

}

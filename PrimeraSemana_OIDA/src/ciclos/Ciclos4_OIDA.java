package ciclos;

import java.util.Scanner;

public class Ciclos4_OIDA {

	public static void main(String[] args) {
		// Ejercicio 4 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
//		“Carácter no encontrado”. 
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);
        // Contador para contar cuántas veces aparece la letra
        int contador = 0;
        // Recorremos la frase y contamos la cantidad de veces que aparece la letra
        for (int i = 0; i < frase.length(); i++) {//En esta parte tomamos como condicion la longitud de la frase que pongan
            char caracter = frase.charAt(i); //para ir comparando letra por letra, indicamos que el char caracter es igual a lo que va incrementando de la longitud de la frase 
            if (caracter == letra) {// en caso de ser iguales, incrementas el contador que se usará para determinar cuantas veces aparece 
                contador++;
            }
        }
        // Verificamos si se encontró la letra y mostramos el resultado
        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
        scanner.close();
	}

}

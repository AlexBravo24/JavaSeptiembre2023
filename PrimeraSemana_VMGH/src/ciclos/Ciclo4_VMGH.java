 package ciclos;

import java.util.Scanner;

public class Ciclo4_VMGH {

    public static void main(String[] args) {
//    	// 4.Programa que reciba una frase y una letra por teclado. Deber� retornar como resultado 
//    	cu�ntas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//    	�Car�cter no encontrado�.
    	
        String cadena;
        char letra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor de anotar una frase: ");
        cadena = entrada.nextLine().toLowerCase();
        System.out.println("Favor de escribir una letra para saber cu�ntas veces est�: ");
        letra = Character.toLowerCase(entrada.next().charAt(0));
        int contador = 0; 

        for (int i = 0; i < cadena.length(); i++) {
            char letra1 = cadena.charAt(i);
            if (letra == letra1) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("La letra '" + letra + "' se encuentra " + contador + " veces en la frase.");
        } else {
            System.out.println("Car�cter no encontrado");
        }

        entrada.close(); 
    }
}

		

	
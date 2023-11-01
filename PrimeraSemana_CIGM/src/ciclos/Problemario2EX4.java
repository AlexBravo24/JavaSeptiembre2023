package ciclos;

import java.util.Scanner;

public class Problemario2EX4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase(); // Convertir la frase a minúsculas para hacer la búsqueda sin distinción de mayúsculas/minúsculas
        
        System.out.print("Introduce una letra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0); // Obtener el primer carácter de la letra introducida y convertirlo a minúsculas
        
        int contador = contarLetraEnFrase(frase, letra);
        
        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
        
        sc.close();
    }

    public static int contarLetraEnFrase(String frase, char letra) {
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        
        return contador;
    }
}

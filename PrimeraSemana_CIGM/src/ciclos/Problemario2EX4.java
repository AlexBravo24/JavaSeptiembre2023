package ciclos;

import java.util.Scanner;

public class Problemario2EX4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase(); // Convertir la frase a min�sculas para hacer la b�squeda sin distinci�n de may�sculas/min�sculas
        
        System.out.print("Introduce una letra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0); // Obtener el primer car�cter de la letra introducida y convertirlo a min�sculas
        
        int contador = contarLetraEnFrase(frase, letra);
        
        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Car�cter no encontrado.");
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

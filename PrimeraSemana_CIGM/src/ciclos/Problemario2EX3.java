package ciclos;

import java.util.Scanner;

public class Problemario2EX3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String reversa = "";
        System.out.print("Introduce una palabra o frase: ");
        String entrada = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        
        
      for (int i = entrada.length()-1; i >=0; i--) {
    	  
    	  reversa = reversa + entrada.charAt(i);
      }
        
        System.out.println("ORIGINAL:" + entrada.replace("", ""));
        System.out.println("REVERSA:" + reversa.replace("", ""));
        
        
        
        
        if (esPalindromo(entrada)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        
        sc.close();
    }

    public static boolean esPalindromo(String cadena) {
        int izquierda = 0;
        int derecha = cadena.length() - 1;

        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }
}

package ciclos;

import java.util.Scanner;

public class Ciclos11_OBRO {
	
    Scanner teclado = new Scanner(System.in);
    
    int n;
   
    public void entradato() {
        System.out.print("Por favor ingrese lado del cuadrado: ");
        n = teclado.nextInt();
    }
   
    public void proceso() {
        if(n >= 2 && n <= 50) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }else {
            System.out.println("Por favor ingrese un numero entre 2 y 50");
        }
    }
   
   
 
    public static void main(String[] args) {
    	Ciclos11_OBRO fc = new Ciclos11_OBRO();
        fc.entradato();
        fc.proceso();
    }
}


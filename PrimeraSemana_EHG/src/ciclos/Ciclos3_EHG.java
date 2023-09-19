package ciclos;

import java.util.Scanner;

public class Ciclos3_EHG {

	public static void  main(String[] args) {
		// . Realiza un programa para determinar si un String es palíndromo. 
		Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase. ");
        String palabra; 
     
        palabra = entrada.next();
        entrada.close();
        
        int fin = palabra.length()-1;
        int ini = 0;
        boolean espalindromo=true;
        
        while(ini < fin){
            if(palabra.charAt(ini)!=palabra.charAt(fin)){
                espalindromo=false;
            }
        ini++;
        fin--;
        }
        if(espalindromo)
            System.out.println("Es palindromo.");
        else {
        	 System.out.println("No es palindromo.");
        }
            
        
		
	}

}

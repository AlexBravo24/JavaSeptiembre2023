package condicionales;

import java.util.Scanner;

public class condicionales9_gamg85 {

	public static void main(String[] args) {
		// Realiza un programa que pida el n�mero de la semana (del 1 al 7) y escriba el d�a 
		//correspondiente. Si introducimos otro n�mero, nos da un error.
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero:");
		numero = entrada.nextInt();
		
		switch(numero) {
		case 1:  
					System.out.println("El d�a es Lunes");
					break; 
		case 2: 
		            System.out.println("El d�a es Martes" );
			        break;
		case 3: 
					System.out.println("El d�a es Mi�rcoles" );
					break;
		case 4: 
					System.out.println("El d�a es Jueves " );
					break;
		case 5: 
					System.out.println("El d�a es Viernes ");
					break;
		case 6: 
					System.out.println("El d�a es S�bado " );
					break;
		case 7: 
					System.out.println("El d�a es Domingo " );
					break;
		default: System.out.println("ERROR:d�a no existe");
		}

	}

}

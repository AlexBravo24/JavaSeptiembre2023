package condicionales;

import java.util.Scanner;

public class condicionales9_gamg85 {

	public static void main(String[] args) {
		// Realiza un programa que pida el número de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número, nos da un error.
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
		numero = entrada.nextInt();
		
		switch(numero) {
		case 1:  
					System.out.println("El día es Lunes");
					break; 
		case 2: 
		            System.out.println("El día es Martes" );
			        break;
		case 3: 
					System.out.println("El día es Miércoles" );
					break;
		case 4: 
					System.out.println("El día es Jueves " );
					break;
		case 5: 
					System.out.println("El día es Viernes ");
					break;
		case 6: 
					System.out.println("El día es Sábado " );
					break;
		case 7: 
					System.out.println("El día es Domingo " );
					break;
		default: System.out.println("ERROR:día no existe");
		}

	}

}

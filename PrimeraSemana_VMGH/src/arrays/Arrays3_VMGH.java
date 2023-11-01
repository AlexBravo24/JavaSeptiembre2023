package arrays;

import java.util.Scanner;

public class Arrays3_VMGH {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		String frase;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducir una frase: ");
		frase = entrada.nextLine();
		char [] car = frase.toCharArray();
		
		for (char i : car) {
			System.out.println(i);
		}
		
		entrada.close();
	}
}

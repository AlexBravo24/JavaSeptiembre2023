package condicionales;

import java.util.Scanner;

public class Condiionales8_MARB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el resultado del dado (1-6): ");
		int resultadoDado = scanner.nextInt();
		
		String numeroEnLetras;
		
		switch (resultadoDado) {
		case 1:
            numeroEnLetras = "Seis";
            break;
        case 2:
            numeroEnLetras = "Cinco";
            break;
        case 3:
            numeroEnLetras = "Cuatro";
            break;
        case 4:
            numeroEnLetras = "Tres";
            break;
        case 5:
            numeroEnLetras = "Dos";
            break;
        case 6:
            numeroEnLetras = "Uno";
            break;
        default:
            numeroEnLetras = "ERROR: número incorrecto";
            break;
    }
		System.out.println("Número en letras de la cara opuesta: " + numeroEnLetras);
		
		}
	

	

}

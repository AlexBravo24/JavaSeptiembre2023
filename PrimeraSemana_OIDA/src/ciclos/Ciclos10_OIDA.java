package ciclos;

import java.util.Scanner;

public class Ciclos10_OIDA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int totalNumeros = 20;
        int sumaPositivos = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Ingrese el n�mero #" + i + ": ");
            int numero = scanner.nextInt();

            // Verificar si es positivo o negativo
            if (numero > 0) {
                System.out.println("El n�mero es positivo.");
                sumaPositivos += numero; //La funcion += es para ir sumando valores a una variable, por lo tanto no se deben crear mas variables 
            } else if (numero < 0) {
                System.out.println("El n�mero es negativo.");
            } else {  //En esta parte se salta el "else" del "el numero es cero" podemos anotar que else significa "sino son las condiciones anteriores, es esta, pero si alguna de las anteriores fue, entonces si 
                System.out.println("El n�mero es cero.");
            }

            // Verificar si es par o impar
            if (numero % 2 == 0) {
                System.out.println("El n�mero es par.");
            } else {
                System.out.println("El n�mero es impar.");
                sumaImpares += numero;
            }
        }

        System.out.println("Suma de n�meros positivos: " + sumaPositivos);
        System.out.println("Suma de n�meros impares: " + sumaImpares);

        scanner.close();

	}

}

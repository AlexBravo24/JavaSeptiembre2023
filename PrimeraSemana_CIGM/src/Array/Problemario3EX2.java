package Array;

public class Problemario3EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear un array de números del 1 al 100
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de todos los números
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / 100;

        // Mostrar la suma y la media
        System.out.println("Suma de todos los números: " + suma);
        System.out.println("Media de todos los números: " + media);
	}

}

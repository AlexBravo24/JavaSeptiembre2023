package Array;

public class Problemario3EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array original
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        
        // Crear un nuevo array con la misma longitud que el original
        int[] arrayInvertido = new int[arrayOriginal.length];
        
        // Copiar los valores del array original en orden inverso
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        
        // Mostrar el nuevo array con los valores invertidos
        System.out.print("Array invertido: ");
        for (int valor : arrayInvertido) {
            System.out.print(valor + " ");
        }
	}

}

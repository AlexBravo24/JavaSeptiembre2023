package arrays;

public class Arrays4_OIDA {

	public static void main(String[] args) {
		// Ejercicio 4 Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.
		int [] numeros1 = {1,2,3,4,5};
		int [] numeros2 = new int[5];
		int o=0;
		int s=4;
		for (int i = 0; i<numeros1.length; i++) {
				numeros2 [o]= numeros1 [i];
				o++;
		}
		for (int i = 0; i <numeros1.length; i++) {
			System.out.print(numeros1[i]);
		}
		System.out.println();
		for (int p = 0; p<numeros2.length; p++) {
			System.out.print(numeros2[s]);
			s--;
		}
	}

}

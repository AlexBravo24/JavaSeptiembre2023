package Arrays;

public class Arrays4_gamg {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
		// Guardar los valores de este array en otro array distinto pero con los valores invertidos, 
		// es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.

		int[] numeros1 = {1,2,3,4,5};
		int[] numeros2 = new int[5];
		int j=0;
		
		System.out.print("El arreglo original es: ");
		for (int i=0; i<numeros1.length;i++) {
		System.out.print(numeros1[i] + " ");
		}
		
		System.out.println();
		
		for(int i=4; i>=0;i--) {
			numeros2[i]=numeros1[j];
			j++;
		}
		
		
		System.out.print("El nuevo arreglo es: "  );
		for (int i=0; i<numeros1.length;i++) {
			System.out.print(numeros2[i] + " ");
			}
		
		
	}

}

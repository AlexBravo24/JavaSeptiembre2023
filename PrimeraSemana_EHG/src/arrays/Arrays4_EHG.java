package arrays;

public class Arrays4_EHG {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
		int[] num1 = {1,2,3,4,5};
		int[] num2 = new int[num1.length];
		for (int i = num1.length-1, j = 0; i >=0; i--, j++) {
			num2[j] = num1[i];
			System.out.println(num2[j]);
		}

	}

}

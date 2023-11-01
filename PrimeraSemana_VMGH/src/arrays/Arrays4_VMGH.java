package arrays;

public class Arrays4_VMGH {

	public static void main(String[] args) {
		// 4. Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
//		Guardar los valores de este array en otro array distinto pero con los valores invertidos, es 
//		decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		
		int [] a1 = {1, 2, 3, 4, 5};   
		int [] a2 = new int [a1.length];
		
		for (int i = 0; i < a1.length; i++) {
			a2 [i] = a1 [a1.length -1 -i];
			System.out.println(a2 [i]);
		}
	}
}

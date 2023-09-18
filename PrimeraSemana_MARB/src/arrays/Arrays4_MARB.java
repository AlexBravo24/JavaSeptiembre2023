package arrays;

public class Arrays4_MARB {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
		
		int[] array1 = {1, 2, 3, 4, 5};
		int[] arrayinvertido = new int[array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			arrayinvertido[i] = array1[array1.length - 1 -i];
		}
		System.out.println("Array original ");
		System.out.println(arrayinvertido);
		
						
		}
		
	

}

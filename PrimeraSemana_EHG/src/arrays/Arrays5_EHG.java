package arrays;

public class Arrays5_EHG {

	public static void main(String[] args) {
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		
		
		String tecnologia[] = {"Smarphone", "Tv", "Laptop", "ConsolaVidejuegos","Impresoras"};
		double precios[] = {9000,10000,20000,8000,5000};
		System.out.println("===LISTA DE PRODUCTOS Y SUS PRECIOS===");
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println(tecnologia[i] + ":  " + "$" + precios[i]);
			
		}
	}

}

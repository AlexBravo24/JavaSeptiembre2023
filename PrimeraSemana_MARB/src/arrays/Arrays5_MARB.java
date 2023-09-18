package arrays;

public class Arrays5_MARB {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.
		
		String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        int[] precios = {20, 15, 9, 8, 5};
        
        System.out.println("Lista de productos y precios:");
        
        for (int i = 0; i < productos.length; i++) {
        System.out.println(productos[i] +""+ " :  $"+ "" + precios[i]);
        }   


	}

}

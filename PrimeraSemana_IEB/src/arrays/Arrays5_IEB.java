package arrays;

public class Arrays5_IEB {

	public static void main(String[] args) {
		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 */

		String[] productos = { "Camiseta", "Zapatos", "Pantalones", "Reloj", "Gafas de sol" };
		double[] precios = { 319.99, 779.99, 539.99, 899.99, 149.99 };

		System.out.println("Lista de Productos y Precios:");
		System.out.println("------------------------------");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		}

	}

}

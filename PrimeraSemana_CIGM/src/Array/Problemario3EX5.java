package Array;

public class Problemario3EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un array de productos y otro de precios
        String[] productos = {"Producto A", "Producto B", "Producto C", "Producto D", "Producto E"};
        double[] precios = {10.99, 25.49, 7.99, 15.99, 12.79};

        // Mostrar la lista de productos y sus precios
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
	}

}

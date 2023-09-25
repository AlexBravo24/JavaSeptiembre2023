package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// Aqui nuevamente vamos a instaciar o crear objetos de nuestras plantillas (clases)
		
		//Antes de crear a nuestro objeto Laptop, debemos crear a los objetos ram, disco y cpu
		//para que formen parte de Laptop
		
		RAM adata = new RAM("ADATA", 8, 2133);
		Almacenamiento ssd = new Almacenamiento("Kingstone", "SSD", 480);
		Procesador cpu = new Procesador("Intel", "i5", 2.4);
		
		Laptop hp = new Laptop("HP", "44OG7", 13000, "Plata", true, adata, ssd, cpu);
		
		//Imprimir valores en pantalla de mi objeto Laptop
		System.out.println(hp);
		
		
		//Crear un solo objeto de composicion
		
		//Por ejemplo, Carro
		//Crear una clase Carro, por ejemplo con atributos como marca y color
		//y ademas 3 objetos que formen parte del carro
		//Traccion -atributos
		//Frenos - atributos
		//Direccion - atributos
		
		Traccion traccion = new Traccion("Bosch", "Delantera");
		Frenos frenado = new Frenos("Tensa", "Disco");
		Direccion direccion = new Direccion("Akron", "Hidraulica");
		
		Carro Toyota = new Carro("Hilux", "Plata", 2007, 127000, traccion, frenado, direccion);
		
		System.out.println(Toyota);
		
		//
		Traccion traccion2 = new Traccion("Bosch", "Trasera");
		Frenos frenado2 = new Frenos("Tensa", "ABS");
		Direccion direccion2 = new Direccion("Akron", "Electrica");
		
		Carro Ford = new Carro("Mustang", "Rojo", 2023, 1500000, traccion2, frenado2, direccion2);
		
		System.out.println(Ford);

		//
		Traccion traccion3 = new Traccion("GMC", "4x4");
		Frenos frenado3 = new Frenos("TRW", "ABS");
		Direccion direccion3 = new Direccion("GMC", "Hidraulica");
		
		Carro Chevrolet = new Carro("Captiva", "Negro", 2022, 450000, traccion3, frenado3, direccion3);

		System.out.println(Chevrolet);

	}

}

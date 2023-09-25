package com;

public class Pricipal {

	public static void main(String[] args) {
		// Aqui nuevamente vamos a instanciar objetos de plantillas o nuestras classes
		
		//antes de crear nuestra laptop, debemos crear a los objetos ram, disco y cpu para que formen parte de laptop
		RAM ram = new RAM("Adata", 8, 2133);
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Procesador cpu = new Procesador("Intel", "i5", 2.4);
		
		Laptop hp = new Laptop("HP", "4490", 12000, "negra", ram, disco, cpu);
		
		System.out.println(hp);
		
		
		// actividad 
		
		Habitaciones habitaciones = new Habitaciones("Grande", 4, "muy grandes");
		Camas comodidad = new Camas(4, "Grande", "lujo");
		Hotel editor = new Hotel("Puerto de Veracruz", 4, 2, habitaciones, comodidad);
		
		System.out.println(editor);
		

	}

}

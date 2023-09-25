package com;

public class Principal {

	public static void main(String[] args) {
		
		// Aqui nuevamente vamos a instanciar o crear objetos de 
		//nuestras plantillas (clases)
		
		//Antes de crear a nuestro objeto Laptop, debemos 
		//crear a los objetos ram, disco y cpu, para que formen
		//parte de Laptop
		
		RAM adata = new RAM("ADATA", 8, 2133);
		Almacenamiento ssd = new Almacenamiento("Kingston", "SSD", 480);
		Procesador cpu = new Procesador("Intel", "i5", 2.4);
		
		
		Laptop hp = new Laptop("HP", "440g7", 12000, "Plata", true, adata, ssd, cpu);
		
		//Imprimir valores en pantalla de mi objeto Laptop
		System.out.println(hp);
		
		//Crear un solo objeto de composicion 
		
		//Por ejemploo, un celular 
		//crean una clase celular, por ejemplo con atributos como marca y color 
		//y ademas 3 objetos que formen parte del celular 
		//Pantalla- atributos 
		//Procesador - atributos 
		//camara - atributos 
		
		//ejemplo, carro 
		//Llantas - 
		
		
		Llanta llantaJetta = new Llanta("fireston", "rin17", "pavimento");
		Infoentretenimiento audioJetta = new Infoentretenimiento("Pioner", 9, "pantalla");
		
		
		Carro carro1 = new Carro("rojo", "jetta", "vw", llantaJetta, audioJetta);
		
		System.out.println(carro1);
		System.out.println(llantaJetta);
		
		

	}

}

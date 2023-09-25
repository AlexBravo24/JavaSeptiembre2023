package com;

public class Principal {

	public static void main(String[] args) {
		// Aqui nuevamente vamos a instanciar o a crear objetos de
		//nuestras plantillas (clases)
		
		//Antes de crear a nuestro objeto Laptop, debemos
		//crear a los objetos ram, disco y cpu, para que formen
		//parte de Laptop
		
		RAM adata = new RAM("ADATA",8,2133);
		Almacenamiento ssd = new Almacenamiento("Kingston", "SSD", 480);
		Procesador cpu = new Procesador ("Intel", "i5", 2.4);
		
		
		Laptop hp = new Laptop("HP","440G7",12000,"Plata",true, adata, ssd,cpu);
		
		System.out.println(hp);
		
		
		//Crear un solo objeto de composicion
		//Por ejemplo, un celular
		//Crear una clase celular, por ejemplo con atributos como marca y modelo
		//además 3 objetos que formen parte del celular 
		//Pantalla - Atributos
		//Procesador - Atributos
		//Camara - Atributos

		//Mi ejemplo fue un refrigerador 
		
		Compresor comp1 = new Compresor("LG","C240", 0.5);
		Filtro filt1 = new Filtro("f2", "aquafilt", 0.25);
		Icemaker hielo1 = new Icemaker("LG", "X23", "sensor","corto");
		
		Refrigerador vgd = new Refrigerador("LG", "vanguard2", 22, 3, comp1, filt1, hielo1);
		
		System.out.println(vgd);
		
		
	}

}

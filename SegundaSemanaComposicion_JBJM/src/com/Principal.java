package com;

public class Principal {

	public static void main(String[] args) {
		
		// Aqui nuevamente vamos a instanciar o crear objetos de 
		//nuestras plantillas (clase)
		
		//Antes de crear a nuestro objeto laptop, debemos 
		//crear a los objetos ram, disco y cpu, para que formen
		//parte de laptop
		
		RAM adata = new RAM ("ADATA", 8, 2013);
		Almacenamiento ssd= new Almacenamiento("Kingston", "SSD",480);
		Procesador cpu = new Procesador ("Intel","15", 2.4);
		
		//Laptop hp = new Laptop ("HP","440G7", 12000, "Plata", true, adata, ssd, cpu);
		Laptop hp = new Laptop ("HP","440G7",12000,"Plata", true, adata, ssd, cpu);
		System.out.println(hp);
		
		//Plantas
		Especie Helecho = new Especie("HELECHOS",5000000,100000);
		Rasgos Morfologico= new Rasgos ("Morfologicos",true);
		Reproduccion autogamia =new Reproduccion ("Autogamia","Asexual");
		
		Plantas helecho = new Plantas ("Helecho","Mediano","Blanco", true ,Helecho,autogamia);
		System.out.println(helecho);		
		//Plantas rosa = new ("Rosa","Mediano",true,"Blanco", Helecho,autogamia);
		//System.out.println(rosa);
		
		

	}

}

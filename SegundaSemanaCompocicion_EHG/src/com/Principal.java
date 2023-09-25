package com;

public class Principal {

	public static void main(String[] args) {
		
		//Aqui nuevamente vamos a instanciar o a crear objetos de nuestras plantillas (clases)
		//Antes de crear nuestros objeto laptop debemos crear a los objetos ram, disco y cpu para que se formen
		//parte laptop
		
		
		RAM adata = new RAM("Adata", 8, 2133);
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Procesador cpu = new Procesador("Intel", "i5", 2.4);
		
		
		Laptop hp = new Laptop("hp", "440g7", 12000, "Plata", true, adata, disco, cpu);
		
		System.out.println(hp);
		
		
		
		
		Gerente general = new Gerente("Issac", 40, "general");
		Supervisor superv = new Supervisor("Saul", 2, "Cuidar Funciones");
		Cordinador cordi = new Cordinador ("Checo", "procesos", "produccion51");
		
		Empresa alpura = new Empresa("Alpura", "edoMex", 20, "Lacteos", general,superv, cordi);
		System.out.println(alpura);

	}

}

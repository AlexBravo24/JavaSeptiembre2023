package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RAM adata = new RAM(2133, "ADATA", 8);
Almacenamiento ssd = new Almacenamiento("Kingstone", "SSD", 480);
Procesador cpu = new Procesador("Intel", "i5", 2.4);
		
 Laptop hp = new Laptop("HP", "440g7", 12000, "Plata", adata, ssd, cpu);
 
 System.out.println(hp);

 
 RAM ram = new RAM(2133, "XP", 16);
 Almacenamiento memoria = new Almacenamiento("predeterminado de la marca", "memoria", 240);
 Procesador mcpu = new Procesador("qualcomm sanpdragon", "i5", 2.4);
 
 Celular cell = new Celular("Tactil", "64megapixeles", "Samsung", "Android", 15000, ram, mcpu, memoria);
 
 System.out.println(cell);
	}

}

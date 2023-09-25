package com.main;

import com.laptop.Almacenamiento;
import com.laptop.Laptop;
import com.laptop.Procesador;
import com.laptop.Ram;

public class Main {
	public static void main(String [] Args) {
		Ram da_ram = new Ram("Adata", 8, 2133);
		Almacenamiento da_almAlmacenamiento = new Almacenamiento("kingston", "ssd", 480);
		Procesador da_procesaProcesador = new Procesador("intel", "i5 ", 2.4);
		Laptop asusLaptop = new Laptop("ds","",1,"",true,da_ram,da_almAlmacenamiento,da_procesaProcesador);
		
		System.out.println(asusLaptop);
	}
}

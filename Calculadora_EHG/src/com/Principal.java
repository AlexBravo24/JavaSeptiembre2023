package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica rolex = new Cientifica();
		rolex.setMarca("Casio");
		rolex.setModelo("A12");
		rolex.setColor("Negro");
		System.out.println(rolex);
	
		Cientifica suma = new Cientifica();
		suma.suma();
		
		
		Cientifica resta = new Cientifica();
		resta.resta();
		
		Cientifica multiplicacion  = new Cientifica();
		multiplicacion.multiplicacion();
		
		Cientifica division = new Cientifica();
		division.division();
		
		rolex.tomarTemperatura();

	}

}

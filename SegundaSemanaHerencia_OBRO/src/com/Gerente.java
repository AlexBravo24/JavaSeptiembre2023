package com;

//Como un gerente tambien es una persona puedo heredar esos atributos

public class Gerente extends Persona {

	//Y esta clase hija nueva tiene que volver a definir como se realizara 
	//el metodo caminar, siendo otra manera de polimorfismo
	@Override
	public void caminar() {
		System.out.println("Caminando entre los pobres...");
		
	}
	
	//Puedo realizar polimorfismo en un metodo al brindarle diferente argumento
	//para trabajar
	public void caminar(String mensaje) {
		System.out.println(mensaje);
	}

}

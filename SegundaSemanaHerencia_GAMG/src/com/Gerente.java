package com;

//Como un gerente tambien es una persona
//puedo heredar esos atributos
public class Gerente extends Persona {

	//Y esta clase hija nueva tiene que volver a definir c�mo
	//se realizar� el m�todo caminar
	//siendo otra manera de polimorfismo
	@Override
	public void caminar() {
		System.out.println("Caminando entre los pobres...");
		
	}

	//Puedo realizar polimorfismo en un m�todo
	//al brindarle diferentes argumentos para trabajar
	public void caminar(String mensaje) {
		System.out.println(mensaje);
	}
	
}

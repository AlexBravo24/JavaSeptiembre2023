package com;

//como un gerente tambien es una persona, puedo heredar los atributos de persona
public class Gerentes extends Persona{

	//y esta clase hija nueva tiene que volver a definir como se realizará el metodo caminar 
	//siendo otra manera de polimorfismo
	@Override
	public void caminar() {
		System.out.println("Caminando entre los pobres");
		
	}
	//puedo realizar polimorfismo oen un metodo 
	//al brindarle diferentes argumentos para trabajar
	public void caminar(String mensaje) {
		System.out.println(mensaje);
	}
	
}

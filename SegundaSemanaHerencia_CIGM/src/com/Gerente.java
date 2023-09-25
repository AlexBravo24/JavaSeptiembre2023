package com;

public class Gerente extends Persona {
	public Gerente(String nombre, int edad, String genero, String email, String ciudad) {
		super(nombre, edad, genero, email, ciudad);
		// TODO Auto-generated constructor stub
	}
	public Gerente() {
		// TODO Auto-generated constructor stub
	}
		//Y esta clase hija nueva tiene que volver a definir como se realizara el metodo caminar
		//Siendo otra manera de polimorfismo
		@Override
		public void caminar() {
			System.out.println("Caminando");
			
		}
		//Puedo realizar polimorfismo en un metodo
		//al brindarle diferentes argumentos parav trabajar
		public void caminar(String mensaje) {
			System.out.println(mensaje);
		}
}

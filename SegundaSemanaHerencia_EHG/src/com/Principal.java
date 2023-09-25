package com;

public class Principal {

	public static void main(String[] args) {
		// Probar a isntancia objetos empleado o persona
//		Persona persona1 = new Persona();
//		persona1.setNombre("Andre");
//		persona1.setEdad(25);
//		persona1.setGenero("M");
//		persona1.setEmail("andre@preueba.com");
//		persona1.setCiudad("Durango");
		
//		System.out.println(persona1);
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Roberto");
		empleado1.setCiudad("Puebla");
		empleado1.setEdad(30);
		empleado1.setGenero("Masculino");
		empleado1.setEmail("roberto@prueba.com");
		empleado1.setCargo("Java Developer");
		empleado1.setSalario(30000);
		empleado1.setRfc("ROBE9308219YY");
		System.out.println(empleado1);
		
		//Probando los metodos propios o acciones de una persona
		//System.out.println(persona1.comer());//syso (Estoy comiendo)
//		persona1.comer();//Estoy comiendo
		
//		persona1.dormir();//syso (voy a dormir)
		
		//persona1.contarOvejas(1, 2, 3);
		
		//persona1.calcularGastos();
		
//		persona1.calcularGastos(4000, 2000);
		
		//comprobamos que empleado tambien ya esta heredado
		
		empleado1.dormir();
		
		empleado1.caminar();
		//creando un nuevo gerente
		Gerente gerente1= new Gerente();
		//Probamos el metodo caminar gerente
		gerente1.caminar();
		
		
//		Futbolista fut = new Futbolista();
//		fut.setNombre("Ronaldo");
//		fut.setEdad(40);
//		fut.setGenero("M");
//		fut.setCiudad("Portugal");
//		System.out.println(fut);
//		
//		Jugador juega = new Jugador ();
//		juega.setNombre("Messi");
//		juega.setCiudad("Argentina");
//		juega.setEdad(40);
//		juega.setSalario(10000);
//		juega.setGenero("M");
//		juega.setFichaTecnica("Informacion");
//		juega.setPosicion("Delantero");
//		System.out.println(juega);

	}
	
	
	

}

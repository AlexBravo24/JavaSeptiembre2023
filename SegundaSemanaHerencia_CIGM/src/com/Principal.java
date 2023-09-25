package com;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
		
		
		empleado1.dormir();
		
		empleado1.caminar();
		//creando un nuevo gerente
		Gerente gerente1= new Gerente();
		//Probamos el metodo caminar gerente
		gerente1.caminar();

		
	}

}

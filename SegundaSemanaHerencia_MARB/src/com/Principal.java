package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// Probar a instanciar objetos empleado y persona 
		
//		Persona persona1 = new Persona();
//		persona1.setNombre("Andre");
//		persona1.setEdad(25);
//		persona1.setGenero("Masculino");
//		persona1.setEmail("andre@prueba.com");
//		persona1.setCiudad("Durango");
//		
//		System.out.println(persona1);
		
		//Probar creando un nuevo empleado 
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Roberto");
		empleado1.setCiudad("Puebla");
		empleado1.setEdad(30);
		empleado1.setGenero("Masculino");
		empleado1.setEmail("roberto@prueba.com");
		empleado1.setCargo("Java Deevloper");
		empleado1.setSalario(30000);
		empleado1.setRfc("ROBE9308219YY");
		
//		System.out.println(empleado1);
		
		//Realizar dos clases 
		//Una clase Padre 
		//Una clase hija que herede los atributos 
		//Y aqui en la clase principal 
		//crean un objeto de la clase hija 
		//Y mandan a imprimir esos valores en consola 
		
		
		
		
		Tienda tienda1 = new Tienda();
		tienda1.setVerduras("Tomate");
		tienda1.setFrutas("fresa");
		tienda1.setEnlatados("frijoles");
		tienda1.setLacteos("queso");
		tienda1.setTipo("trigo");
		tienda1.setEmpaque("caja");
		tienda1.setPrecio(45.00);
		
		
		System.out.println(tienda1);
		
		
		//Probano los metodos propios de una Persona 
		
		//System.out.println(persona1.comer()); //syso ("Estoy comiendo..")
		
//		persona1.comer();
		
		//Mi metodo dormir, no tiene un retorno de un valor 
		//pero dentro de su logica indique una accion que es 
		//una impresion en consola de un mensaje que dice "Voy a dormir.."
//		persona1.dormir(); //syso("Voy a dormir..")
		
		
		//Probamos el metodo de contaar ovejas 
		
		//persona1.contarOvejas(1, 2, 3);
		
		//Probar el metodo calcular gastos 
		
//		persona1.calcularGastos(12000, 7000);
		
		//Comprobamos que empleado ya esta heredando
		//los comportamientos de persona 
//		empleado1.dormir();
		
		
		empleado1.dormir();
		
		//Pruebo el metodo caminar () que fue definido por la clase 
		//empleado
		
		empleado1.caminar();
		
		empleado1.calcularGastos(12000, 7000);
		
		
		//Creando nuevo gerente 
		Gerente gerente1 = new Gerente();
		
		//Probamos el metodo caminar del gerente 
		gerente1.caminar("Caminando y supervisando");
		
		gerente1.caminar();
		
		
		//Ejercicio 
		//Van a crear un nuevo proyecto 
		//Se va a llamas Calculadora _XXXX
		//crean un paquete com 
		//crean una clase llamada calculadora 
		//con sus atributos (caracteristicas)
		//ejemplo: marca, color, modelo, etc....
		//Crean metodos constructores, getters, setters, toString
		//Van a crearle 4 metodos abstractos (suma, resta, multiplicacion y division)
		//Crean una clase llamada cientifica
		//Cientifica hereda de calculadora y debe definir como se van a 
		//realizar la operaciones 
		//Una vez definan sus metodos crean un objeto de cientifica en la 
		//clase principal y prueban sus metodos 
		
		
		
		

	}

}

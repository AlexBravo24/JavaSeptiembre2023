package com;

public class Principal {

	public static void main(String[] args) {
		
		//Probar a instanciar objetos empleado y persona
		
//		Persona persona1 = new Persona();
//		persona1.setNombre("André");
//		persona1.setEdad(25);
//		persona1.setGenero("Masculino");
//		persona1.setEmail("andre@prueba.com");
//		persona1.setCiudad("Durango");

//		System.out.println(persona1);
		
		//Probar creando un nuevo empleado
		Empleado empleado1=new Empleado();
		empleado1.setNombre("Roberto");
		empleado1.setCiudad("Puebla,Pue");
		empleado1.setEdad(30);
		empleado1.setEmail("roberto@prueba.com");
		empleado1.setGenero("Masculino");
		empleado1.setCargo("Java Developer");
		empleado1.setSalario(30000);
		empleado1.setRfc("ROBE9308219YY");
		
		System.out.println(empleado1);
		
		
		//Ejercicio
		//Realizar dos clases
		//Una clase padre
		//Una clase hija que herede los atributos
		//Y aqui en la clase principal
		//Crean un objeto de la clase hija
		//y mandan a imprimir esos valores en consola
//		
//		Instrumento instrumento1= new Instrumento("cuerdas", "Fender", "Strat");
//		
//		System.out.println(instrumento1);
//		
//		Guitarra guitarra1 = new Guitarra("cuerdas", "Fender", "Strat", "Signature", "E00023", "verde");
//		
//		System.out.println(guitarra1);
		
		//Probando los métodos propios o acciones de una Persona
		//System.out.println(persona1.comer()); //syso("Estoy comiendo...")
		//persona1.comer(); //"Estoy comiendo..."
		
		//Mi método dormir no tiene un retorno de un valor
		//Pero dentro de su lógica indiqué una acción que es
		//una impresión en consola de un mensaje que dice "Voy a dormir..."
		//persona1.dormir(); //syso("Voy a dormir...");
		
		//PRobando el método de contar ovejas
		//persona1.contarOvejas(100, 101, 102);

		//Probar el método calcular gastos
		
		//persona1.calcularGastos(12000, 7000);
	
		//Comprobamos que empleado tambien ya esta heredando
		//los comportamientos de persona
		empleado1.dormir();
		
		//Pruebo el método caminar() que fue definido por la clase 
		//empleado
		empleado1.caminar();
		
		empleado1.calcularGastos(12000, 7000);
		
		//Creando un nuevo gerente
		Gerente gerente1 = new Gerente();
		
		//Probamos 
		gerente1.caminar("Caminando y supervisando...");
		
		
		//EJERCICIO
		//Van a crear un nuevo proyecto
		//Se va a llamar Calculadora_GAMG
		//Crean su paquete com
		//Crean su clase llamada Calculadora
		//con sus atributos (características)
		//Ejemplo: marca,color, modelo, etc...
		//Crean métodos constructores, getters, setters, toString
		//Van a crearle 4 métodos abstractos (suma, resta,
		//multiplicacion, division)
		//Crean una clase llamada Científica
		//Científica hereda de calculadora y debe definir cómo se van 
		//a realizar las operaciones
		//Una vez  definan sus métodos crean un objeto de Cientifica en
		//clase principal y prueban sus métodos
		
		
	}

}

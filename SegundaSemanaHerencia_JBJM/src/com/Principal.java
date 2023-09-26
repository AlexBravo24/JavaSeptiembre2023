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
		empleado1.setCiudad("Puebla, Pue");
		empleado1.setEdad(30);
		empleado1.setGenero("Masculino");
		empleado1.setEmail("roberto@prueba.com");
		empleado1.setCargo("Java Developer");
		empleado1.setSalario(30000);
		empleado1.setRFC("ROBE9308219YY");
		
		System.out.println(empleado1);
		
		
		//Realizar dos clases
		//Una clase Padre
		//Una clase hija que herede los atributos
		//Y aqui en la clase pricipal crear un objeto de la clase hija
		//y mandar a imprimir esos valores en consola
		
		
		
		//Probando los metodos propios o acciones de una persona
		//System.out.println(persona1.comer()); //syso("Estoy comiendo...");
//		persona1.comer(); //"Estoy comiendo..."
//		
//		//Mi metodo dormir no tiene retorno de un valor pero dentro de su logica
//		//indique una accion que es una imrpresion en consola de un mensjae
//		//que dice "Voy a dormir..."
//		persona1.dormir(); //syso("Voy a dormir...");
//		
//		//Probando el metodo de contar ovejas
//		persona1.contarOvejas(100, 101, 102);
//		
//		//Probando el metodo de calcularGastos
//		persona1.calcularGastos();
//		//Probando el metodo de calcularGastos con polimorfismo
//		persona1.calcularGastos(70000, 52464);

		//Comprobamos que empleado tambien ya esta herednado los comportamientos de persona
		empleado1.dormir();
		
		
		//Pruebo el metodo caminar que fue definido por la clase empleado
		empleado1.caminar();
		
		empleado1.calcularGastos(12660, 3300);
		
		//Creando un nuevo gerente
		Gerente gerente1 = new Gerente();
		
		//Probamos el metodo caminar del gerente
		gerente1.caminar("CAMINANDO EN El PARQUE");
		
		//EJERCICIO
		//Van a crear un nuevo proyecto
		//Se va a llamar Calculadora_OBRO
		//Crean su paquete com
		//Crean una clase llamada Calculadora
		//Con sus atributos (caracteristicas)
		//Ejemplo: marca, color, modelo etc
		//Crean metodos constructores, getters, setters, toString
		//Van a crearle 4 metodos abstracctos (suma, resta, multiplicacion y division)
		//Crean una clase llamada Cientifica
		//Cientifica hereda de calculadora y debe definir como se van a realizar las operaciones
		//Una vez definan sus metodos crean un objeto de Cientifica en la clase princiáñ y prueban sus metodos
		
		
	}
}

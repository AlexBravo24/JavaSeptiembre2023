package com;

public class Principal {

	public static void main(String[] args) {
		
		//Persona persona1 = new Persona("Omar ", 24, "Masculino", "Prueba", "Veracruz");
		
		//System.out.println(persona1);
		
		//probar creando un nuevo empleado 
			
		Empleado empleado1 = new Empleado();
		
		empleado1.setNombre("Luis");
		empleado1.setCiudad("Puebla");
		empleado1.setEdad(29);
		empleado1.setGenero("Masculino");
		empleado1.setEmail("Pruebaempleado");
		empleado1.setCargo("Java developer");
		empleado1.setSalario(30000);
		empleado1.setRfc("RFC");
		System.out.println(empleado1);
		
		//actividad 
		
		Casas casa1 = new Casas();
		casa1.setAcabados("Premium");
		casa1.setEstacionamiento(1);
		casa1.setHabitaciones("grandes");
		casa1.setPisos(3);
		casa1.setVentanas(6);
		casa1.setPrecio(4500000);
		
		
		//imprimimos casa1 con la herencia 
		
		System.out.println(casa1);

		
		
		//probando los metodos propios de una persona 
//		System.out.println(persona1.comer());//aqui llamo a la accion propia del objeto persona "Estoy comiendo"
//		persona1.comer(); //esto es igual a escribir "Estoy comiendo" sin imprimirlo 
//		
		//mi metodo dormir no tiene un retorno de valor 
		//pero dentro ded su logica indique una accion que es una impresion en consola
		//dando un mensaje que es "voy a dormir".
		//persona1.dormir(); //este metodo ya tiene implicito un Syso que diga "voy a dormir"
		
		//probando el metodo contarovejas
		//persona1.contarovejas(1, 2, 3);
		
		//probamos el metodo calculargastos
		
		//persona1.calculargastos(12000, 9000);
		
		
		//probamos que la herencia de empleado pueda hacer los metodos de persona 
		
		empleado1.calculargastos(100, 70);
		
		//pruebo el metodo caminar que fue definido por la clase empleado 
		
		empleado1.caminar();
		
		empleado1.calculargastos(100, 20);
		
		//creando un nuevo gerente 
		Gerentes gerente = new Gerentes();
		gerente.caminar("Caminando y supervisando");
		
		
		//Ejercicio
		//crear una nuevo proyecto, se llamara calculadora_OIDA
		//crear paquete com
		//crear una clase llamada calculadora
		//con sus atributos (caracteristicas)
		//ejemplo; marca, color, modelo, etc.
		//crear metodos constructores, getters y setter 
		//van a crearle 4 metodos abstractos (suma, resta, multiplicacion y division
		
	}

}

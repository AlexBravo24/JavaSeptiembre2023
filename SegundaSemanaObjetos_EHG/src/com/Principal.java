package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo existe una clase principal que contiene al metodo main
	
		
		
		//Aqui puedo crear los objetos de las plantillas o clases que stamos definiendo
		
		
		//Persona = clase o plantilla - personal = objeto o instancia
		Persona Persona1 = new Persona();
		
		//persona1.nombre = "Miguel"; //Es incorrecto hacerlo asi
		
		
		//Creando una persona con el constructor con todo los argumentos
		Persona Persona2 = new Persona("Alberto", 31, "Masculino", "Alberto@prueba.com", "CDMX");
		
		//Crear una persona con el constructor de dos parametros
		Persona Persona3 = new Persona("Alex", 37);
		
		//Asignando el valor de un email a mi persona 3
		Persona3.setEmail("alex@prueba.com");
		
		String nombre = "Jorge Alejandro";
		
		//Darle salida en consola a la variable nombre
		System.out.println(nombre);
		
		//Imprimir en consola los datos de mi objeto persona 3
		//persona3, ya es un objeto, es decir esta conformado por varios tipos de datos
		//[nombre, edad,.....]
		System.out.println(Persona3);
		
		//Puedo mandar a imprimir solo un valor con un metodo get
		System.out.println(Persona3.getNombre()); //syso("Alex");
		
		//Imprimir a persona 2 que tiene todos sus argumentos
		System.out.println(Persona2);
		
		//Imprimir a persona1
		System.out.println(Persona1);
		//Asignando valores a persona1 con los metodos setters
		Persona1.setNombre("Andre");
		Persona1.setGenero("Masculino");
		Persona1.setEdad(25);
        Persona1.setEmail("andre@prueba.com");
        Persona1.setCiudad("Durango");
        
        System.out.println(Persona1);
        
        //Van a modelar 5 objetos los que gusten 
        //Van a crear entonces 5 clases
        //crean sus atributos(minimo 3 por cada uno)
        //Metodos constructores (vacio y con todos los parametros
        //getters y setters
        //to string
        //Y los van a instanciar aqui. uno vacio y uno contodos los argumentos
        // y imprimir en consola
        
        
        //Ejemplo animal
        
        Animal perro = new Animal();
        Animal gato = new Animal("Kytty","Mainecoon" , 2);
        perro.setNombre("Firulais");
        System.out.println(perro);
        System.out.println(gato);
        
        
        Tecnologia celular = new Tecnologia();
        Tecnologia laptop = new Tecnologia("Acer ", "GamerNitro",18000);
        celular.setEquipo("Motorola");
        System.out.println(celular);
        System.out.println(laptop);
        
        Comidas platillo1 = new Comidas();
        Comidas platillo2 = new Comidas("Pozole", "Blanco,Rojo", 10);
        platillo1.setNombre("chilaquiles");
        System.out.println(platillo1);
        System.out.println(platillo2);
        
        
        Estados Estado = new Estados();
        Estados Estado1 = new Estados("Aguascalientes", 1313, 385);
        Estado.setNombre("EdoMex");
        System.out.println(Estado);
        System.out.println(Estado1);
        
        
        
        CuentaBancaria cuentaCheque = new CuentaBancaria();
        CuentaBancaria cuentaAhorro = new CuentaBancaria("elBrayan", "Dolares", 150);
        cuentaCheque.setNombreTitular("Kevin");
        System.out.println(cuentaCheque);
        System.out.println(cuentaAhorro);
        
        
        
	}

}

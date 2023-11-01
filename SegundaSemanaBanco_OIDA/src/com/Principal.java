package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		//Crear nuestro hashmap para almacenar objetos cuenta 
		//para simular una peuqeña tabla de base de datos 
		//hashmap nos va a permitir por su capacidad de almacenar valores
		//en pares (clave, valor) simular registros de una base de datos 
		//funcionando la clave como un id y el objeto con sus atributos 
		
		
	
		
		
		//declaramos nuestro hashmap
		
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();	
		
		
		//una forma de almacenar mis cuentas en el HashMap es creando primero 
		//la cuenta y despues asignandola a una clave 
		
		Cuenta omar = new Cuenta();
		omar.setNumerodecuenta(1001);
		omar.setNombredelcliente("Omar");
		omar.setNip(1234);
		omar.setSaldo(10000.50);
		omar.setSaldominimo(1000);
		omar.setSaldomaximo(20000);
		omar.setTipodecuenta("Debito");
		
		//una vez creada la cuenta, la guardamos en el HashMap 
		cuentas.put(1001, omar);
		//tengo guardado a omar en la clave 1001 que corresponde a su numero de cuenta
		
		//otra forma de crear nuevas cuentas es hacerlo directamente en el HashMap
		
		cuentas.put(1002, new Cuenta(1002, "Celso", 13000, 4321, 500, 50000, "Debito"));
		cuentas.put(1003, new Cuenta(1003, "André", 3000, 4321, 500, 25000, "Debito"));
		cuentas.put(1004, new Cuenta(1004, "Oswaldo", 30000, 4321, 4000, 50000, "Debito"));
		cuentas.put(1005, new Cuenta(1005, "Malenia", 3000, 4321, 500, 15000, "Debito"));
		
		//probar acceder a una cuenta guardada en el HashMap 
		System.out.println(cuentas.get(1005));
		//esta tarea tiene que delegarse 
		//al objeto encargado de resolver esa logica 
		//en este caso el cajero 
		
		//creamos un nuevo cajero 
		
		Cajero cajerocdmx = new Cajero("Polanco cdmx", cuentas);
		
		//ahora quien devuelve el valor de la cuenta es el cajero 
		
		System.out.println(cajerocdmx.buscarCuenta(1004));
		
		//vamos a probar el metodo de retirar
		System.out.println(cajerocdmx.retirar(1004, 8000));
		
		//probar el metodo de retirar excediendo el monto permitido por el cajeor 
		System.out.println(cajerocdmx.retirar(1004, 10000));
		//excediendo el saldo de la cuenta
		System.out.println(cajerocdmx.retirar(1005, 2750));
		
		
		
		//probar a depositar
		System.out.println(cajerocdmx.depositar(1004, 27500));

		System.out.println(cajerocdmx.depositar(1004, 1000));
		
		System.out.println(cajerocdmx.transferir(1004, 1005, 2000));
		
		System.out.println(cajerocdmx.buscarCuenta(1005));
		
		
		//intentar hacer una maquina expendedora
		
		//actividad a realizar 
		
		
	}
	
	}



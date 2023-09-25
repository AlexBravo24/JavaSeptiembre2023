package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// Crear nuestro HashMap para almacenar objetos Cuenta 
		//para simular una peque�a tabla de BD 
		//El HashMap nos va a permitir por su capacidad de almacenar valores 
		//en pares (clave,valor), simular registros de una BD
		//funcionando la clave como in ID, y el objeto con sus atributos 
		
		
		
		//Declaramos nuestro HashMap 
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Una forma de almacenar mis cuentas en el HashMap es 
		//Crear primero la cuenta y despues asignandole a una clave 
		
		Cuenta omar= new Cuenta();
		omar.setNumeroCuenta(1001);
		omar.setNombreCliente("Omar");
		omar.setNip(1234);
		omar.setSaldo(10000.50);
		omar.setSaldoMin(1000);
		omar.setSaldoMax(20000);
		omar.setTipoCuenta("Debito");
		
		//Una vez creada la cuenta, la guardamoes en el HashMap
		//Asigno a mi clave el mismo valor del numero de cuenta del cliente 
		//para que sea mi llave para buscar la cuenta 
		cuentas.put(1001, omar);
			
		//Otra forma de crear nuevas cuentas es crearlas directamente en el HashMap 
		
		cuentas.put(1002, new Cuenta(1002, "Celso", 13000, 4321, 500, 50000, "Debito"));
		cuentas.put(1003, new Cuenta(1003, "Andre", 3000, 4321, 500, 25000, "Debito"));
		cuentas.put(1004, new Cuenta(1004, "Oswaldo", 30000, 4321, 4000, 500000, "Debito"));
		cuentas.put(1005, new Cuenta(1005, "Alberto", 300, 4321, 100, 1500, "Debito"));
		
		//Probar acceder a una cuenta guardada en el HashMap 
		System.out.println(cuentas.get(1005)); //esta tarea tiene que delegarse 
		//al objeto encargado de resolver esa logica
		//en este el cajero 
		
		
		//Creamos un nuevo cajero 
		Cajero cajeroCDMX = new Cajero("Polanco, CDMX", cuentas);
		
		//Ahora quien devuelve el valor de la cuenta es el cajero 
		
		System.out.println(cajeroCDMX.buscarCuenta(1004));
		
		//Probar el metodo de retirar exitoso
		
		System.out.println(cajeroCDMX.retirar(1004, 8000));
		
		//Probar el metodo de retirar excediendo el metodo 
		System.out.println(cajeroCDMX.retirar(1004, 10000));
		
		//Probar el metodo de retirar excediendo saldo de la cuenta  
		System.out.println(cajeroCDMX.retirar(1003, 7000));
	
		//Probar el metodo de retirar intentando dejar por debajo del minimo la cuenta 
		System.out.println(cajeroCDMX.retirar(1004, 9000));
		System.out.println(cajeroCDMX.retirar(1004, 9000));
		System.out.println(cajeroCDMX.retirar(1004, 1000));
		
		//Probar a depositarle a Oswaldo 
		System.out.println(cajeroCDMX.depositar(1004, 1000));
		//Probar un deposito que exceda el maximo de la cuenta 
		System.out.println(cajeroCDMX.depositar(1005, 16000));
		System.out.println(cajeroCDMX.depositar(1005, 15000));
		
		//probar el metodo transferir exitoso 
		System.out.println(cajeroCDMX.transferir(1004,1005, 1000));
		
		
		//Sugerencia: intentar elaborar una maquina expendedora 
		
		//Actividad a realizar:
		//Investigar �que es una expresion Lambda
		
		
		
	} 
}
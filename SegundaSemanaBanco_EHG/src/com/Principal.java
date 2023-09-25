package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		//Crear nuestro HashMap para aalmacenar objetos cuenta 
		//Para simukar una pequeña tabala de BD
		//El HashMap nos va apermitir por su capacidad de almacenar
		//valores en pares simular registros de un BD
		//funcionando la clave como id, y el objeto con sus atributos
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		
		//Una forma de almacenar mis cuentas en el HAsMap es
		//creabdo primero la cuenta y despues asignandola a una clave
		Cuenta omar = new Cuenta();
		omar.setNumCuenta(1001);
		omar.setNombreCliente("Omar");
		omar.setNip(1234);
		omar.setSaldo(10000.50);
		omar.setSaldoMin(1000);
		omar.setSaldoMax(20000);
		omar.setTipoCuenta("Debito");
		
		//Una vez creada la cuenta la guardamos en el HashMap
		//Asigno a mi claeve el mismo valor del numero de cuenta del cliente
		//para que esa sea mi llave para buscar la cuenta
		cuentas.put(1001, omar);
		
		
		//Otra forma de crear nuevas cuentas, es hacerlo directamente
		//En el HashMap
		cuentas.put(1002, new Cuenta(1002, "Celso", 1300, 4321, 500, 50000, "Debito"));
		cuentas.put(1003, new Cuenta(1003, "Andre", 3000, 4321, 500, 250000, "Debito"));
		cuentas.put(1004, new Cuenta(1004, "Oswaldo", 30000, 4321, 4000, 500000, "Debito"));
		cuentas.put(1005, new Cuenta(1005, "Alberto", 300, 4321, 100, 15000, "Debito"));
		
		//Probar acceder a una cuenta guardada en el HashMap
		System.out.println(cuentas.get(1005));//Esta tarea tiene que delegarse 
		//al objeto encargado de resolver esta logica en este caso el cajero
		
		//Creamos un nuevo cajero
		Cajero cajeroCDMX = new Cajero("Polanco, CDMX", cuentas);
		
		//Ahora quien devuelve el valor de la cuenta es el cajero
		System.out.println(cajeroCDMX.buscarCuenta(1004));
		
		//Probar el metodo de retirar
		System.out.println(cajeroCDMX.retirar(1004, 8000));
		
		//Probar el metodo de retirar excediendo el monto permitido por el cajero
		System.out.println(cajeroCDMX.retirar(1002, 10000));
		
		//Probar el metodo de retirar excediendo el saldo de la cuenta
				System.out.println(cajeroCDMX.retirar(1003, 7000));
		//Probar el metodo de reirar intentando por dejajo del minimo a la cuenta
				System.out.println(cajeroCDMX.retirar(1004, 9000));
				System.out.println(cajeroCDMX.retirar(1004, 9000));
				System.out.println(cajeroCDMX.retirar(1004, 1000));
				
		//Probar depositarle a osvaldo
				System.out.println(cajeroCDMX.depositar(1004, 1000));
				
				//Probar un deposito que exceda el limite de cuenta
				
				System.out.println(cajeroCDMX.depositar(1005, 15000));
				
				//Probar metodo transferir exitoso
				System.out.println(cajeroCDMX.transferir(1004, 1005, 1000));
				//Comprobamos si alberto os recibio
				System.out.println(cajeroCDMX.buscarCuenta(1005));
				
				
				
				
	}

}

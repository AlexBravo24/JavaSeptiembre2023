package com.main;

import java.util.HashMap;
import java.util.Map;

import com.banco.Cajero;
import com.banco.Cuenta;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
	 * crear nuetr hashmap para almacanar objetos cuenta
	 * paara simularuna tabla bd
	 */
		Map<Integer,Cuenta> cuenta= new HashMap<>();
		/**
		 * unafoema almacenar mis cuentas en el hasmap es
		 * creando primero la cuenta  
		 */
		Cuenta omar_cuenta =new Cuenta();
		omar_cuenta.setNum_cuenta(100);
		omar_cuenta.setNombre_cuenta("omar");
		omar_cuenta.setNip(1234);
		omar_cuenta.setSaldo_min(1234);
		omar_cuenta.setSaldo_max(4569);
		omar_cuenta.setTipo_cuenta("Sebito");
		
		/**
		 * una vez ceado la cuenta la guasrdamos en el hasmap
		 * asinoel mismo valor al numero de cuenta del cliente
		 */
		cuenta.put(1001, omar_cuenta);
		//otra forma de crear una cuenta es hacerlo directmente 
		//en el hash map
		//por lo menos debe de tener maximo de la cuenta minima
		cuenta.put(1002,new Cuenta(1002,"Arccos",10000,1324,500,50000,"Debito"));
	//num_cuenta, nombre_cuenta,  saldo_cuenta,  nip,  saldo_min, saldo_max, tipo_cuenta
		cuenta.put(1003,new Cuenta(1003,"omar",130,1324,400,50000,"Debito"));
		cuenta.put(1004,new Cuenta(1004,"celso",5000,1324,100,5000,"Debito"));
		cuenta.put(1005,new Cuenta(1005,"emmanuel",8000,1824,500,6000,"Debito"));
		//probar acceder a una cuenta guarda hasMap
		System.out.println(cuenta.get(1002));
		
		Cajero cajer_cdmx =new Cajero("Polanco, cdmx ",cuenta);
		System.out.println(cajer_cdmx.buscarCuenta(1004));
		System.out.println(cajer_cdmx.retirar(1002,5000));
		System.out.println(cajer_cdmx.retirar(1002,4500));
		System.out.println(cajer_cdmx.retirar(1002,500));
		
		///
		System.out.println(cajer_cdmx.depositar(1004, 100));
		//
		System.out.println(cajer_cdmx.transferir(1004, 1005, 1000));
		//sugerencia intentar elaborar una maquina expendedora 
		//Actividad a realizar 
		
	}

}

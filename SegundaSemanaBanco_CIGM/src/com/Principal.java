package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static void main(String[] args) {
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
	
		
		Cuenta omar = new Cuenta();
		omar.setNumCuenta(1001);
		omar.setNombreCliente("OMAR");
		omar.setSaldo(100000.00);
	    omar.setNip(1234);
		omar.setSaldoMin(1000);
		omar.setSaldoMax(200000);
		omar.setTipoCuenta("Debito");
		
		cuentas.put(1001, omar);
		
		// otra forma de crear nuevas cuentas usando el hashmap
		
		cuentas.put(1002, new Cuenta(1002, "CELSO", 40000, 4321, 2000, 30000, "Debito"));
		cuentas.put(1003, new Cuenta(1003, "ARGOS", 10000, 6543, 2000, 30000, "Debito"));
		cuentas.put(1004, new Cuenta(1004, "BELL", 20000, 7665, 2000, 30000, "Debito"));
		cuentas.put(1005, new Cuenta(1005, "ISMA", 30000, 3456, 2000, 30000, "Debito"));
		
		System.out.println (cuentas.get(1005));

		Cajero cajeroCDMX = new Cajero("Polanco, CDMX", cuentas);
		
		System.out.println (cajeroCDMX.buscarCuenta(1004));
		
		System.out.println(cajeroCDMX.retirar(1004, 500));
		
		System.out.println(cajeroCDMX.depositar(1004, 500));
		System.out.println(cajeroCDMX.depositar(1005, 1000));
		System.out.println(cajeroCDMX.depositar(1005, 1500));

		System.out.println(cajeroCDMX.transferir(1004, 1002, 800));

		System.out.println(cajeroCDMX.buscarCuenta(1005));

		
	}
}

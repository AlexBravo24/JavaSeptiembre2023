package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cajero implements I_Metodos{
  
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	private int folio=1;

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
	//Las clases encargadas de la logica, nos interesa mas que resuelvan 
	//las operaciones . por lo cual pueden no nesesitar getters y setters o to string

	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		// creo un objeto cuenta provisionalmente en nulo
		Cuenta cuenta = null;
		//aqui recupero un cuenta, el valor de la misma que esta en el hashmap
		cuenta = cuentas.get(numCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		
		Ticket comprobante = null;
		
		if(buscarCuenta(numCuenta) !=null) {
			
			Cuenta cuenta = buscarCuenta(numCuenta);
			//cuenta.setSaldo(cuenta.getSaldo()-monto);
		
			if(monto>9000) {
				System.out.println("el monto a retirar es mayor a lo permitido por el cajero");
				return comprobante;
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("saldo insuficiente");
				return comprobante;
			}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("el monto a retirar dejaria debajo del minimo a la cuenta");
				return comprobante;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), sucursal, 1);
				return comprobante;
			}
		
		}else {
			System.out.println("no hay cuenta asociada con el cliente");
			return comprobante;
		}
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
	
		Ticket comprobante = null;
		
		if(buscarCuenta (numCuenta) !=null) {
			Cuenta cuenta = buscarCuenta (numCuenta);
			
			
		if(monto>cuenta.getSaldoMax()) {
			System.out.println("");
			return comprobante;
		}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
			System.out.println("");
			return comprobante;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			comprobante = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), sucursal, 1);
			return comprobante;
		}
		}else {
			System.out.println();
			return comprobante;
		}
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		
Ticket comprobante = null;
		
		//Ahora tenemos que localizar 2 cuentas
		if(buscarCuenta(cuentaOrigen) !=null && buscarCuenta(cuentaDestino) !=null) {
			//Traemos ambas cuentas para manipularlas
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			//Validaciones
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}else if(origen.getSaldo()-monto<origen.getSaldoMin()) {
				System.out.println("La transferencia dejaría por debajo del mínimo a la cuenta");
				return comprobante;
			}else if(monto>destino.getSaldoMax()) {
				System.out.println("El monto a transferir excede el saldo máximo de la cuenta destino");
				return comprobante;
			}else if(destino.getSaldo()+monto>destino.getSaldoMax()) {
				System.out.println("El saldo de la cuenta destino excedería el máximo permitido");
				return comprobante;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				comprobante= new Ticket(folio++, new Date(), origen.getNumCuenta(), origen.getSaldo(), sucursal, 1);
				return comprobante;		
			}
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return comprobante;
	}
	}
	
}

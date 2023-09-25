package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cajero implements IMetodos {
	
	//Esta clase va acrear un objeto que se encaragara 
	//de resolver la logica de las operaciones 
	 
	//Atributos
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	//Esta variable es solo auxiliar para incrementar el folio en el ticket por cada operacion
	private int folio=1;
	
	public Cajero() {}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	
	//Las clases encaragadas de la logica nos interesan mas que resuelvan las operaciones
	//Por lo cual pueden no necesitar getters, setters y to String
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//creo un objeto cuenta en nulo
		Cuenta cuenta = null;
		//Aqui recupero en cuenta, el valor de la misma que esta en el hashmap
		cuenta = cuentas.get(numCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		//Si la operacion se realiza el cajero devuelñve un ticket
		//por eso el retorno de este metodo
		//Instanciar ticket vacio
		Ticket comprobante = null;
		//Antes de cambiar el valor de un ticket para devolverlo nesetitamos
		//definir la siguiente logica para realizar la operacion de retiro
		//primero necesigtamos identificar de que cuenta se van a retirar recursos
		if(buscarCuenta( numCuenta) != null) {
			//Instanciamnos un objeto cuenta para poder manipular dicho objeto
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Realizar validaciones para poder realizar el retiro
			//La mayoria de bancos permite retirar solo un monto determinado al dia
			if(monto>9000) {
				System.out.println("El monto a retirar es mayor al permitido por el cajero es de 9000");
				return comprobante;//En cada operacion o validacion hay que retornar un ticket, aunque este en nulo
				//Si el saldo de la cuenta es menor al monto a retirar	
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return comprobante;
				//Si el saldo de la cuenta menos el monto deja por debajo del monimo al a cuenta
			}else if(cuenta.getSaldo()- monto<cuenta.getSaldoMin()) {
				System.out.println("El monto a retirar dejaria por debajo del minimo de la cuenta");
				return comprobante;
				//Si la operacion puede realizarse
			}else {
				//Actualizamos el saldo de la cuenta de acuerdo a lo que tenga menos el metodo
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Creamo sun nuevo ticket para devolver este valor
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), sucursal, 1);
				return comprobante;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return comprobante;
		}
	
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		Ticket comprobante = null;
		
		if(buscarCuenta( numCuenta) != null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Una vez encontramos la vuenta procedemos  a las validaciones
			//poder actualizar su saldo
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("el monto excede el saldo maximo permitido en la cuenta");
				return comprobante;
				//Ahora validamos si el monto mas el saldo excede el salso maximo de la cuenta
			}else if(cuenta.getSaldo()+ monto>cuenta.getSaldoMax()) {
				System.out.println("el deposito excederia el saldo maximo en la cuenta");
				return comprobante;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+ monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), sucursal, 1);
				return comprobante;
				
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return comprobante;
		}
	
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket comprobante = null;
		
		//Ahora tenemos que localizar 2 cuentas
		if(buscarCuenta(cuentaOrigen) !=null && buscarCuenta(cuentaDestino) !=null){
			//Traemos ambas cuentas para manipilarlas
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta (cuentaDestino);
			//Validaciones
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}else if(origen.getSaldo()-monto<origen.getSaldoMin()) {
				System.out.println("La tranferencia dejaria por debajo del minimo de cuenta");
				return comprobante;
			}else if(monto>destino.getSaldoMax()) {
				System.out.println("El monto a transferir excede el saldo maximo de la cuenta del destino");
				return comprobante;
			}else if(destino.getSaldo()+ monto>destino.getSaldoMax()) {
				System.out.println("El saldo de la cuenta destino excederia el maximo permitido");
				return comprobante;	
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), origen.getNumCuenta(), origen.getSaldo(), sucursal, 1);
				return comprobante;
			}
			
		}else {
			System.out.println("Alguno de los clientes no tiene una cuemnta asociada");
			return comprobante;
		}


	}
	
	
	

}

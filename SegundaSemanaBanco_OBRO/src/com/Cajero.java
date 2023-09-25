package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cajero implements IMetodos{
	
	//Esta clase va a crear un objeto que se encargara de resolver la logica de las operaciones
	
	
	//Atributos del cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Esta variable solo es auxiliar para incrementar el folio en el Ticket por cada operacion realizada
	private int folio =1;
	
	public Cajero() {}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
	
	//Las clases encargadas de la logica, nos interesa mas que resuelvan las operaciones 
	//por lo cual pueden no necesitar getters, setters y toString
	
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Creo un objeto cuenta provisionalmente en nulo 
		Cuenta cuenta = null;
				
		//Aqui recupero en cuenta, el valor de la misma que esta en el HashMap
		cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		//Si la operacion se realiza, el cajero devuelve un ticket por eso el retorno de este metodo
		//Instanciamos un ticket vacio
		Ticket comprobante = null;
		
		//Antes de cambiar el valor del ticket para devolverlo, necesitamos definir la siguiente logica
		//Para realizar la operacion de retiro primero necesitamos identificar de que cuenta se van a 
		//retirar recursos
		if(buscarCuenta(numCuenta)!=null) {
			//Instanciamos un objeto cuenta para poder manipular dicho objeto
			Cuenta cuenta = buscarCuenta(numCuenta);
			
			//Realizar validaciones para poder realizar el retiro
			//la mayoria de bancos permite retirar solo un monto determinado en el dia
			if(monto>9000) {
				System.out.println("El monto maximo para retirar es de $9000.00");
				return comprobante; //En cada operacion o validacion hay que retornar un ticket, unque este sea nulo
				//Si el saldo de la cuenta es menor al monto a retirar
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return comprobante;
				
				//Si el saldo de la cuenta menos el monto deja por debajo del minimo a la cuenta
			}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El monto a retirar dejaria por debajo del minimo a la cuenta");
				return comprobante;
				
				//Si la operacion puede realizarse
			}else {
				//Actualizamos el saldo de la cuenta de acuerdo a lo que tenga menos el monto
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Creamos un nuevo ticket para devolver ese valor
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), sucursal, 1200);     
				return comprobante;
			}
			
		}else { //Si la cuenta inicialmente no existe
		System.out.println("No hay una cuenta asociada a ese cliente");
		return comprobante;
	}
	}

	
	
	@Override
	public Ticket depositar(int numCuenta, double monto) {
		Ticket comprobante = null;
		if(buscarCuenta(numCuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			
			//Una vez encontramos la cuenta procedemos a las validaciones para poder
			//actualizar su saldo
			//Validamos si el monto a depositar excede el saldo maximo de la cuenta
			if(monto>cuenta.getSaldoMaximo()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta");
				return comprobante;
			
				//Validamos si el monto mas el saldo exceden el saldoMaximo de la cuenta
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMaximo()) {
				System.out.println("El deposito excederia el saldo maximo en la cuenta");
				return comprobante;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), sucursal, 1200);     
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

		//Ahora tenemos que localizar dos cuentas
		if(buscarCuenta(cuentaOrigen)!=null && buscarCuenta(cuentaDestino) !=null) {
			
			//Traemos ambas cuentas para manipularlas
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			
			//Validaciones
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para la transferencia");
				return comprobante;
				
			}else if(origen.getSaldo()-monto<origen.getSaldoMin()) {
				System.out.println("La transferencia dejaria por debajo del minimo a la cuenta");
				return comprobante;
			
			}else if(monto>destino.getSaldoMaximo()) {
				System.out.println("El monto a transferir excede el saldo maximo de la cuenta destino");
				return comprobante;
			
			}else if(destino.getSaldo()+monto>destino.getSaldoMaximo()) {
				System.out.println("El saldo de la cuenta destino excederia el maximo permitido");
				return comprobante;
				
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), origen.getNumCuenta(), origen.getSaldo(), sucursal, 1200);     
				return comprobante;
				
			}
		}else {
			System.out.println("Alguno de los clientes no tiene cuenta asociada");
			return comprobante;
			
		}
	}
	
	
	
	
	
	
	
	
	

}

package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cajero implements IMetodos{

	//esta clase creara un objeto que se encargara de resolver la logica 
	//de las operaciones
	
	//atributos del cajero 
	private String sucursal;
	private Map <Integer, Cuenta> cuentas;
	
	//esta variable solo es auxiliar para incrementar el folio en cada operacion realizada
	private int folio = 1;
	
	public Cajero() {
		
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	
	//las clases encargadas de la logica que nos interesa mas que resuelvan las operaciones
	//puede no necesitar getters setters y tostring
	
	
	
	@Override
	public Cuenta buscarCuenta(int numerodecuenta) {
		// creo un objeto cuenta provisional en nulo 
		Cuenta cuenta = null;
		
		//aqui recupero en cuenta el valor de la misma que esta en hasshmap
		
		cuenta = cuentas.get(numerodecuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numerodecuenta, double monto) {
		// Si la operacion se realiza, el cajero devuelve un ticket 
		//por eso el retorno de este metodo instanciamos un ticket vacio 
		Ticket comprobante = null;
		
		//antes de cambiar el valor del ticket a devolverlo 
		//necesitamos definir la siguiente logica 
		//para realizar la operacion de retiro, primero necesitamos identificar de que cuenta se van a retirar recursos
		
		if(buscarCuenta(numerodecuenta)!=null) {
			//instanciamos un objeto cuenta para poder manipular dicho objeto 
			
			Cuenta cuenta = buscarCuenta(numerodecuenta);
			
			//realizar validaciones para pdoer realizar el retiro 
			if(monto>9000) {
				System.out.println("el monto a retirar es mayor al permitido por el cajero");
				return comprobante; //en cada operaacion o validacion hay que retornar un ticket aunque este en nulo 
				//si el saldo de la cuenta es menor que el monto a retirar 
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("saldo insuficiente para hacer el retiro ");
				return comprobante;
				//si el saldo de la cuenta menos el monto, deja por debajo del minimo a la cuenta 
			}else if(cuenta.getSaldo()-monto < cuenta.getSaldominimo()) {
				System.out.println("el monto a retirar dejaria a la cuenta por debajo del minimo permitido");
				return comprobante;
				//si la operacion puede realizarse, actualizamos el saldo de la cuenta
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//creamos un nuevo ticker para devolver ese valor 
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumerodecuenta(), cuenta.getSaldo(), sucursal, 1200);
				return comprobante;
			}
			//
			//realizar
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return comprobante;
		}
		
	}

	@Override
	public Ticket depositar(int numerodecuenta, double monto) {
		Ticket comprobante = null;
		if(buscarCuenta(numerodecuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numerodecuenta);
			//una vez encontramos la cuenta procedemos a validar para poder actualizar su saldo 
			if(monto>cuenta.getSaldomaximo()) {
				System.out.println("La cuenta rebasaria el saldo maximo");
				return comprobante;
				
				//ahora validamos si el monto mas el saldo excede el limite 
				
			}else if (cuenta.getSaldo()+monto > cuenta.getSaldomaximo()) {
				System.out.println("el deposito dejaria a la cuenta con un saldo superior al permitido");
				return comprobante;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNumerodecuenta(), cuenta.getSaldo(), sucursal, 1200);
				return comprobante;
					
				
			}
		}else {
			System.out.println("no hay una cuenta asociada a ese cliente");
		}
		return comprobante;
	}

	@Override
	public Ticket transferir(int cuentaorigen, int cuentadestino, double monto) {
		Ticket comprobante = null;
		//ahora tenemos que localizar dos cuenta 
		if(buscarCuenta(cuentaorigen)!=null   &&   buscarCuenta(cuentadestino)!=null) {
			Cuenta origen = buscarCuenta(cuentaorigen);
			Cuenta destino = buscarCuenta(cuentadestino);
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia ");
				return comprobante;
			}else if (origen.getSaldo()-monto<origen.getSaldominimo()) {
				System.out.println("La transferencia dejaria por debajo del minimo a la cuenta ");
				return comprobante;
			}else if (monto>destino.getSaldomaximo()) {
				System.out.println("El monto a transferir excede el saldo maximo de la cuenta destino");
				return comprobante;
			}else if (destino.getSaldo()+monto>destino.getSaldomaximo()) {
				System.out.println("El saldo de la cuenta destino excederia el maximo permitido");
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), origen.getNumerodecuenta(), origen.getSaldo(), sucursal, 1200);
				return comprobante;
			}
		}else {
			System.out.println("Uno de los dos clientes no tiene una cuenta asociada ");
			return comprobante;
		}
		return comprobante;
		
	}
	
	
	
	
}

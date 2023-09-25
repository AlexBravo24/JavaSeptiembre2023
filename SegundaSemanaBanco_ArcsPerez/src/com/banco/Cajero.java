package com.banco;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cajero implements IMetodos {
//se encargara a resolver lalogica de las opreaciones
	private String sucrsal;
	private Map<Integer, Cuenta> cuentas_hashmap;
	/// el folio enel ticket para cada operacion realizada
	private int folio = 1;

	public Cajero() {
		super();
	}

	public Cajero(String sucrsal, Map<Integer, Cuenta> cuentas_hashmap) {
		super();
		this.sucrsal = sucrsal;
		this.cuentas_hashmap = cuentas_hashmap;
	}

	/// las clases encargadas de la logica nos interesa mas que resuelva
	// las operaciones
	@Override
	public Cuenta buscarCuenta(int num_cuenta) {
		/**
		 * TODO Auto-generated method creo un objeto privisionalmente en nulo
		 * 
		 */
		Cuenta cuenta = null;
		cuenta = cuentas_hashmap.get(num_cuenta);

		return cuenta;
	}

	@Override
	public Ticket retirar(int num_cuenta, double monto) {
		// TODO Auto-generated method stub
		// se instacia un ticket null
		Ticket comprobante = null;

		// Ahora tenemos que localizar 2 cuentas
		if (buscarCuenta(num_cuenta) != null) {
			// Traemos un objeto cuenta para poder manipular
			Cuenta cuenta = buscarCuenta(num_cuenta);
			// algunos banco solo permite hacer un retiro al dia

			if (monto > 9000) {
				System.out.println("El monto maximo a retirar $9000");
				return comprobante;
			} else if (cuenta.getSaldo_cuenta() < monto) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return comprobante;
			} else if (cuenta.getSaldo_cuenta() - monto < cuenta.getSaldo_min()) {
				System.out.println("El momnto a retirar dejara por debajo del minimo en la cuenta");
				return comprobante;
			} else {
				// actualizamos el saldo de la cuent en casoi de hacer un retiro
				cuenta.setSaldo_cuenta(cuenta.getSaldo_cuenta() - monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNum_cuenta(), (int) cuenta.getSaldo_cuenta(),
						sucrsal, 1);
				// int folio, Date fecha_hora, int num_cuenta, int saldo, String
				// sucursal_string, int id_cajero) {
				return comprobante;
			}

		} else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return comprobante;
		}
		// return comprobante;
	}

	@Override
	public Ticket depositar(int num_cuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket comprobante_ticket = null;
		if (buscarCuenta(num_cuenta) != null) {
			Cuenta cuenta = buscarCuenta(num_cuenta);
			// una vez encontramos la cuenta procedemos
			// a la validacion para poder actualizar saldo
			// Validamos si ell monto a depositar excede al saldo maximo de la cuenta

			if (monto > cuenta.getSaldo_max()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return comprobante_ticket;
			} else if (cuenta.getSaldo_cuenta() + monto > cuenta.getSaldo_max()) {
				System.out.println("el deposito excede al saldo maximo en la cuenta");
				return comprobante_ticket;
			} else {
				cuenta.setSaldo_cuenta(cuenta.getSaldo_cuenta() + monto);
				comprobante_ticket = new Ticket(folio++, new Date(), cuenta.getNum_cuenta(),
						(int) cuenta.getSaldo_cuenta(), sucrsal, 1);
				return comprobante_ticket;
			}
		} else {
			System.out.println(" no hay una cuenta asosiada a ese cliente ");
			return comprobante_ticket;
		}
	}

	@Override
	public Ticket transferir(int cuenta_origen, int cuenta_destino, double monto) {
		// TODO Auto-generated method stub
		Ticket comprobante_ticket = null;
		if (buscarCuenta(cuenta_origen) != null && buscarCuenta(cuenta_destino) != null) {
			Cuenta orige = buscarCuenta(cuenta_origen);
			Cuenta destino = buscarCuenta(cuenta_destino);
			// validaciones
			if (orige.getSaldo_cuenta() < monto) {
				System.out.println("No hay fondos suficientes para realizar la tranferencia ");
				return comprobante_ticket;
			} else if (orige.getSaldo_cuenta() - monto < orige.getSaldo_min()) {
				System.out.println("LA trnasferencia dejara por de bajo del minimo a la cuenta");
				return comprobante_ticket;
			} else if (monto > destino.getSaldo_cuenta()) {
				System.out.println("El monto a transferencia el saldo maximo de la cuenta maximo");
				return comprobante_ticket;
			} else {
				orige.setSaldo_cuenta(orige.getSaldo_cuenta() - monto);
				destino.setSaldo_cuenta(destino.getSaldo_cuenta() + monto);
				comprobante_ticket = new Ticket(folio++, new Date(), orige.getNum_cuenta(),
						(int) orige.getSaldo_cuenta(), sucrsal, 1);
				// comprobante_ticket = new Ticket(folio++, new Date(),
				// cuenta.getNum_cuenta(),(int) cuenta.getSaldo_cuenta(),sucrsal,1);

				return comprobante_ticket;
			}

		} else {
			System.err.println("Alguno de los clientes no tiene una cuenta asociada");
			return comprobante_ticket;

		}
	}

}

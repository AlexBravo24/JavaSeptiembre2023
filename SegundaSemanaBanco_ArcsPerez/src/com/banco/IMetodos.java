package com.banco;

public interface IMetodos {
	/**
	 * comtrato o repositorio de metodos u operaciones que la clase que se encargue
	 * de la logica que twndra que resolvera e implenetara
	 */
	public Cuenta buscarCuenta(int num_cuenta);

	// cre un metodo para retirar dinero
	// que al exitoo responddera con un ticket
	public Ticket retirar(int num_cuenta, double monto);

	public Ticket depositar(int num_cuenta, double monto);

//creamos un metodo 
	public Ticket transferir(int cuenta_origen, int cuenta_destino, double monto);

}

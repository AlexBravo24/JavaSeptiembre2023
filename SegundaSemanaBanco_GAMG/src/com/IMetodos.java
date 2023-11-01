package com;

public interface IMetodos {
	
	//Contrato o repositorio de método u operaciones
	//que la clase que se encargue de la lógica tendrá
	//que resolver e implementar
	
	//Antes de iniciar operaciones de depósito, retiro, etc
	//Necesitamos identificar la cuenta en la que se 
	//harán estas operaciones
	
	//Creamos un método para buscar una cuenta
	public Cuenta buscarCuenta(int numCuenta);
	
	//Creo un método para retirar dinero y depositar
	//que al ser exitoso responderá con un Ticket, 
	//es decir, devuelve ese valor
	//Para ello identificamos la cuenta y el monto a operar
	public Ticket retirar(int numCuenta, double monto);
	
	public Ticket depositar(int numCuenta, double monto);
	
	//Creamos un método más para transferir
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto);
	
	
}

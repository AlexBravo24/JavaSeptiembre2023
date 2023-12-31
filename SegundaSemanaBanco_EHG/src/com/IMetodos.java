package com;

public interface IMetodos {
	
	//Contrato o repositorio metodos u operaciones que la clase se encargue  de la logica
	//tendra que resolver e implementar
	
	//Antes de iniciar operaciones de deposito retiro etc
	//Necesitamos identificar la cuenta en la que se haran estas operaciones
	
	//Creamos un metodo para buscar una cuenta
	public Cuenta buscarCuenta(int numCuenta);
	
	//Creo un metodo para retirar dinero al ser exitoso respondera con un ticket
	//Es decir devuelve ese valor
	//Para ello identificamos la cuenta y el monto a operar
	public Ticket retirar(int numCuenta, double monto);
	
	public Ticket depositar(int numCuenta, double monto);
	
	//Creamos un metodo mas para transferir
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto);

	

}

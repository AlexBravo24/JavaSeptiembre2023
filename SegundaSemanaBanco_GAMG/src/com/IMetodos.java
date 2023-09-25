package com;

public interface IMetodos {
	
	//Contrato o repositorio de m�todo u operaciones
	//que la clase que se encargue de la l�gica tendr�
	//que resolver e implementar
	
	//Antes de iniciar operaciones de dep�sito, retiro, etc
	//Necesitamos identificar la cuenta en la que se 
	//har�n estas operaciones
	
	//Creamos un m�todo para buscar una cuenta
	public Cuenta buscarCuenta(int numCuenta);
	
	//Creo un m�todo para retirar dinero y depositar
	//que al ser exitoso responder� con un Ticket, 
	//es decir, devuelve ese valor
	//Para ello identificamos la cuenta y el monto a operar
	public Ticket retirar(int numCuenta, double monto);
	
	public Ticket depositar(int numCuenta, double monto);
	
	//Creamos un m�todo m�s para transferir
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto);
	
	
}

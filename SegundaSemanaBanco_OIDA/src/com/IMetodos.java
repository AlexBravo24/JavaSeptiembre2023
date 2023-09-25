package com;

public interface IMetodos {

	//contrato o repositorio de metodos u operaciones que la clase que se encargue de la logica
	//tendrá que resolver o implementar
	
	//antes de iniciar operaciones de deposito o retiro debemos identificar la cuenta en la que se haran estas operaciones 
	
	
	//Creamos un metodo para buscar una cuenta.
	
	public Cuenta buscarCuenta(int numerodecuenta);
	
	//creo un metodo para retirar dinero que  al ser exitoso respondera con un ticket 
	//es decir, devuelve ese valor 
	//para ello identificamos la cuenta y el monto a operar
	public Ticket retirar(int numerodecuenta, double monto);
	
	public Ticket depositar(int numerodecuenta, double monto);
	
	//creamos un metodo mas para transferir
	
	public Ticket transferir(int cuentaorigen, int cuentadestino, double monto);
	
	
	
	
}

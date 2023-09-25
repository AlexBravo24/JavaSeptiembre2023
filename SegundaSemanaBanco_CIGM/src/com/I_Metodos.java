package com;

public interface I_Metodos {
public Cuenta buscarCuenta (int numCuenta); 
	
	
	
	public Ticket retirar(int numCuenta, double monto); 
		
	
	
	public Ticket depositar(int numCuenta, double monto);
	
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto);
	
}

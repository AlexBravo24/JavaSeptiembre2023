package com;

public class CuentaBancaria {
	
	private String NombreTitular;
	private String tipo;
	private int saldo;
	
	public CuentaBancaria () {
		
	}

	public CuentaBancaria(String nombreTitular, String tipo, int saldo) {
		super();
		NombreTitular = nombreTitular;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return NombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		NombreTitular = nombreTitular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria NombreTitular= " + NombreTitular + ", tipo= " + tipo + ", saldo= " + "$"+ saldo + " ";
	}
	
	
	

}

package com;

public class Cuenta {

	//Clase para crear cuentas bancarias 
	
	//atributos de una cuenta de banco 
	private int numerodecuenta;
	private String nombredelcliente;
	private double saldo;
	private int nip;
	private double saldominimo;
	private double saldomaximo;
	private String tipodecuenta;
	
	public Cuenta() {
		
	}

	public Cuenta(int numerodecuenta, String nombredelcliente, double saldo, int nip, double saldominimo,
			double saldomaximo, String tipodecuenta) {
		super();
		this.numerodecuenta = numerodecuenta;
		this.nombredelcliente = nombredelcliente;
		this.saldo = saldo;
		this.nip = nip;
		this.saldominimo = saldominimo;
		this.saldomaximo = saldomaximo;
		this.tipodecuenta = tipodecuenta;
	}

	public int getNumerodecuenta() {
		return numerodecuenta;
	}

	public void setNumerodecuenta(int numerodecuenta) {
		this.numerodecuenta = numerodecuenta;
	}

	public String getNombredelcliente() {
		return nombredelcliente;
	}

	public void setNombredelcliente(String nombredelcliente) {
		this.nombredelcliente = nombredelcliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public double getSaldominimo() {
		return saldominimo;
	}

	public void setSaldominimo(double saldominimo) {
		this.saldominimo = saldominimo;
	}

	public double getSaldomaximo() {
		return saldomaximo;
	}

	public void setSaldomaximo(double saldomaximo) {
		this.saldomaximo = saldomaximo;
	}

	public String getTipodecuenta() {
		return tipodecuenta;
	}

	public void setTipodecuenta(String tipodecuenta) {
		this.tipodecuenta = tipodecuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numerodecuenta=" + numerodecuenta + ", nombredelcliente=" + nombredelcliente + ", saldo="
				+ saldo + ", nip=" + nip + ", saldominimo=" + saldominimo + ", saldomaximo=" + saldomaximo
				+ ", tipodecuenta=" + tipodecuenta + "]";
	}
	
	
	
	
}

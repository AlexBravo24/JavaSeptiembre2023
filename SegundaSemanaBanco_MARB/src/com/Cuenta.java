package com;

public class Cuenta {
	
	//Clase para crear cuentas Bancarias 
	
	//Atributos de una cuenta de banco 
	
	private int numeroCuenta;
	private String nombreCliente;
	private double saldo;
	private int nip;
	private double saldoMin;
	private double saldoMax;
	private String tipoCuenta;
	
	public Cuenta() {}

	public Cuenta(int numeroCuenta, String nombreCliente, double saldo, int nip, double saldoMin, double saldoMax,
			String tipoCuenta) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.saldo = saldo;
		this.nip = nip;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipoCuenta = tipoCuenta;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo
				+ ", nip=" + nip + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + ", tipoCuenta=" + tipoCuenta
				+ "]";
	}
	
	
	
	

}

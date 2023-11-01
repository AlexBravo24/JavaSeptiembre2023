package com.banco;

public class Cuenta {
	//Atributos de una cuenta de banco
	private int num_cuenta;
	private String nombre_cuenta;
	private double saldo_cuenta;
	private int nip;
	private double saldo_min;
	private double saldo_max;
	private String tipo_cuenta;
	public Cuenta() {
	}
	public Cuenta(int num_cuenta, String nombre_cuenta, double saldo_cuenta, int nip, double saldo_min,
			double saldo_max, String tipo_cuenta) {
		super();
		this.num_cuenta = num_cuenta;
		this.nombre_cuenta = nombre_cuenta;
		this.saldo_cuenta = saldo_cuenta;
		this.nip = nip;
		this.saldo_min = saldo_min;
		this.saldo_max = saldo_max;
		this.tipo_cuenta = tipo_cuenta;
	}
	public int getNum_cuenta() {
		return num_cuenta;
	}
	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}
	public String getNombre_cuenta() {
		return nombre_cuenta;
	}
	public void setNombre_cuenta(String nombre_cuenta) {
		this.nombre_cuenta = nombre_cuenta;
	}
	public double getSaldo_cuenta() {
		return saldo_cuenta;
	}
	public void setSaldo_cuenta(double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}
	public int getNip() {
		return nip;
	}
	public void setNip(int nip) {
		this.nip = nip;
	}
	public double getSaldo_min() {
		return saldo_min;
	}
	public void setSaldo_min(double saldo_min) {
		this.saldo_min = saldo_min;
	}
	public double getSaldo_max() {
		return saldo_max;
	}
	public void setSaldo_max(double saldo_max) {
		this.saldo_max = saldo_max;
	}
	public String getTipo_cuenta() {
		return tipo_cuenta;
	}
	public void setTipo_cuenta(String tipo_cuenta) {
		this.tipo_cuenta = tipo_cuenta;
	}
	@Override
	public String toString() {
		return "Cuenta [num_cuenta=" + num_cuenta + ", nombre_cuenta=" + nombre_cuenta + ", saldo_cuenta="
				+ saldo_cuenta + ", nip=" + nip + ", saldo_min=" + saldo_min + ", saldo_max=" + saldo_max
				+ ", tipo_cuenta=" + tipo_cuenta + "]";
	}
	
}

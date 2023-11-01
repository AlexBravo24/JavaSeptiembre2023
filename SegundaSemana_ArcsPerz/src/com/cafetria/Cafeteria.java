package com.cafetria;

public class Cafeteria {
	private int codigo_postal;
	private String nombre_;
	private String direccion_;
	private String estado_;

	public Cafeteria() {

	}

	public Cafeteria(int codigo_postal, String nombre_, String direccion_, String estado_) {
		super();
		this.codigo_postal = codigo_postal;
		this.nombre_ = nombre_;
		this.direccion_ = direccion_;
		this.estado_ = estado_;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getNombre_() {
		return nombre_;
	}

	public void setNombre_(String nombre_) {
		this.nombre_ = nombre_;
	}

	public String getDireccion_() {
		return direccion_;
	}

	public void setDireccion_(String direccion_) {
		this.direccion_ = direccion_;
	}

	public String getEstado_() {
		return estado_;
	}

	public void setEstado_(String estado_) {
		this.estado_ = estado_;
	}

	@Override
	public String toString() {
		return "Cafeteria [codigo postal=" + codigo_postal + ", nombre =" + nombre_ + ", direccion =" + direccion_
				+ ", estado de =" + estado_ + "]";
	}

}

package com.telefono;

public class Telefonos {
	private String nume_;
	private String marcaa_;
	private String compania_;
	private double precio_;

	public Telefonos() {

	}

	public Telefonos(String nume_, String marcaa_, String compania_, double precio_) {
		super();
		this.nume_ = nume_;
		this.marcaa_ = marcaa_;
		this.compania_ = compania_;
		this.precio_ = precio_;
	}

	public String getNume_() {
		return nume_;
	}

	public void setNume_(String nume_) {
		this.nume_ = nume_;
	}

	public String getMarcaa_() {
		return marcaa_;
	}

	public void setMarcaa_(String marcaa_) {
		this.marcaa_ = marcaa_;
	}

	public String getCompania_() {
		return compania_;
	}

	public void setCompania_(String compania_) {
		this.compania_ = compania_;
	}

	public double getPrecio_() {
		return precio_;
	}

	public void setPrecio_(double precio_) {
		this.precio_ = precio_;
	}

	@Override
	public String toString() {
		return "Telefonos [numero =" + nume_ + ", marca =" + marcaa_ + ", compañia =" + compania_ + ", precio =$"
				+ precio_ + "]";
	}

}

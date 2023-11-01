package com.puerta;

public class Puerta {
	private double altura_pint;
	private double ancho_pint;
	private String color_pstring;
	private String matrial_pstring;

	public Puerta(double altura_pint, double ancho_pint, String color_pstring, String matrial_pstring) {
		super();
		this.altura_pint = altura_pint;
		this.ancho_pint = ancho_pint;
		this.color_pstring = color_pstring;
		this.matrial_pstring = matrial_pstring;
	}

	public Puerta() {
		// TODO Auto-generated constructor stub
	}

	public double getAltura_pint() {
		return altura_pint;
	}

	public void setAltura_pint(double altura_pint) {
		this.altura_pint = altura_pint;
	}

	public double getAncho_pint() {
		return ancho_pint;
	}

	public void setAncho_pint(double ancho_pint) {
		this.ancho_pint = ancho_pint;
	}

	public String getColor_pstring() {
		return color_pstring;
	}

	public void setColor_pstring(String color_pstring) {
		this.color_pstring = color_pstring;
	}

	public String getMatrial_pstring() {
		return matrial_pstring;
	}

	public void setMatrial_pstring(String matrial_pstring) {
		this.matrial_pstring = matrial_pstring;
	}

	@Override
	public String toString() {
		return "Puerta [altura =" + altura_pint + ", ancho " + ancho_pint + ", color =" + color_pstring
				+ ", tipo de matrial " + matrial_pstring + "]";
	}
	
}

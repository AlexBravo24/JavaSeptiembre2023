package com;

public class Empresa {
	
	
	private String nombre;
	private String ubicacion;
	private int numEmpresa;
	private String giro;
	
	
	
	private Gerente cargo1;
	private Supervisor cargo2;
	private Cordinador cargo3;
	
	
	public Empresa() {
		
	}



	public Empresa(String nombre, String ubicacion, int numEmpresa, String giro, Gerente cargo1, Supervisor cargo2,
			Cordinador cargo3) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numEmpresa = numEmpresa;
		this.giro = giro;
		this.cargo1 = cargo1;
		this.cargo2 = cargo2;
		this.cargo3 = cargo3;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumEmpresa() {
		return numEmpresa;
	}

	public void setNumEmpresa(int numEmpresa) {
		this.numEmpresa = numEmpresa;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public Gerente getCargo1() {
		return cargo1;
	} 
	
	public void setCargo1(Gerente cargo1) {
		this.cargo1 = cargo1;
		
	}
	public Supervisor getCargo2() {
		return cargo2;
	}

	public void setCargo2(Supervisor cargo2) {
		this.cargo2 = cargo2;
	}

	public Cordinador getCargo3() {
		return cargo3;
	}

	public void setCargo3(Cordinador cargo3) {
		this.cargo3 = cargo3;
	}

	@Override
	public String toString() {
		return "Empresa nombre= " + nombre + ",\nubicacion= " + ubicacion + ", \nnumEmpresa= " + numEmpresa + ", \ngiro= "
				+ giro + ", \ncargo1= " + cargo1 + ", \ncargo2= " + cargo2 + ", \ncargo3= " + cargo3 + " ";
	}

}

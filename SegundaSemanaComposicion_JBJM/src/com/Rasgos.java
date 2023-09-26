package com;

public class Rasgos {
	
	private String caracteristicas;
	private boolean fisiologicas;
	
	public Rasgos () {
		
	}

	public Rasgos(String caracteristicas, boolean fisiologicas) {
		super();
		this.caracteristicas = caracteristicas;
		this.fisiologicas = fisiologicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public boolean isFisiologicas() {
		return fisiologicas;
	}

	public void setFisiologicas(boolean fisiologicas) {
		this.fisiologicas = fisiologicas;
	}
	
	

}

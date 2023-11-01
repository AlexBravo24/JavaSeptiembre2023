package com;

public class Empleado extends Persona {

	//CLASE HIJA ,-HERENCIA
		//Se realiza con la palabra reservada "extends"
		//Al heredar los atributos de persona ya no es necesario agragarlos
		//Sin embargo podemos poner atributos propios de esta clase, si fuera necesario
		
		private String cargo;
		private double salario;
		private String rfc;
		
		

		public Empleado(String nombre, int edad, String genero, String email, String ciudad, String cargo, double salario,
				String rfc) {
			super(nombre, edad, genero, email, ciudad);
			this.cargo = cargo;
			this.salario = salario;
			this.rfc = rfc;
		}

		public Empleado() {
			// TODO Auto-generated constructor stub
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public String getRfc() {
			return rfc;
		}

		public void setRfc(String rfc) {
			this.rfc = rfc;
		}

		@Override
		public String toString() {
			return "Empleado [cargo=" + cargo + ", salario=" + salario + ", rfc=" + rfc + ", toString()=" + super.toString()
					+ "]";
		}
	    //Cuando heredamos de una clase abstracta las clases hijas se encargaran de definir como se realizaran
		//estas acciones sobreescribiendo asi los metodos
		@Override
		public void caminar() {
			System.out.println("Caminmando....");
		
		}
	

	
	
}

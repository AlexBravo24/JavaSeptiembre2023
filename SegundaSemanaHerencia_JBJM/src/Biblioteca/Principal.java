package Biblioteca;



public class Principal {

	public static void main(String[] args) {
		
	Libro libro1 = new Libro();
	libro1.setNombre("Cien a�os de Soledad");
	libro1.setAutor("Gabriel Garc�a M�rquez");
	libro1.setNumEjemplares(5);
	Encuadernaci�n Tapa_Blanda= new Encuadernaci�n("TapaBlanda");
	
	Encuadernaci�n libro3 = new Encuadernaci�n("El se�or de los anillos","J. R. R. Tolkien",45,"Tapa dura");

			
	
	@SuppressWarnings("unused")
	Libro libro2 =new Libro("El se�or de los anillos",4,"Fantasia","Tapa Blanda" );
	
	System.out.println(libro1);
	System.out.println(libro2);
	System.out.println(libro3);
	

	}

}

package Biblioteca;



public class Principal {

	public static void main(String[] args) {
		
	Libro libro1 = new Libro();
	libro1.setNombre("Cien años de Soledad");
	libro1.setAutor("Gabriel García Márquez");
	libro1.setNumEjemplares(5);
	Encuadernación Tapa_Blanda= new Encuadernación("TapaBlanda");
	
	Encuadernación libro3 = new Encuadernación("El señor de los anillos","J. R. R. Tolkien",45,"Tapa dura");

			
	
	@SuppressWarnings("unused")
	Libro libro2 =new Libro("El señor de los anillos",4,"Fantasia","Tapa Blanda" );
	
	System.out.println(libro1);
	System.out.println(libro2);
	System.out.println(libro3);
	

	}

}

package arrays;

import javax.swing.JOptionPane;

public class Arrays1_JBJM {

	public static void main(String[] args) {
		
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde.

		
		
		final int TAMA�O=10;
		 
        int num[]=new int[TAMA�O];
 
        //Invocamos las funciones
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un n�mero");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
   

	}

}

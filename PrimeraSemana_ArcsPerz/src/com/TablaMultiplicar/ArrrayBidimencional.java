package com.TablaMultiplicar;

import java.io.DataOutputStream;
import java.util.Iterator;

public class ArrrayBidimencional {
public void ppub() {
	int [][] matriz = new int[3][3];
	//arreglo bidimencional   // aqui menciona la cantidad de columnas
	 matriz[0][0]= 0;
	 matriz[0][1]= 0;
	 matriz[0][2]= 0;
	 
	 matriz[1][0]= 4;
	 matriz[1][1]= 5;
	 matriz[1][2]= 6;
	 
	 matriz[2][0]= 7;
	 matriz[2][1]= 8;
	 matriz[2][2]= 9;
	 //declarar una matriz con valores asignado
	 int [][] matriz_2 = {{1,2,3},{4,5,6},{7,8,9}};
	 
	 System.err.println(matriz[0][2]);
	 /*para el for bidimencional llamados for anidados
	 *imprimir los valores del array 
	 */
	 for (int i = 0; i < matriz_2.length; i++) {
		for (int j = 0; j < matriz_2.length; j++) {
			System.out.print(matriz_2[i][j]);
		}
		System.out.println("");
	}
}

public void objetoArray() {
	/*la teoria dice que los arreglos nos permite almacenar
	 * Una determinada cantidad de Datos de 
	 * tipo en comun  int,double,char,String
*/	
	Object new_object;
	Object[] arreglo = {1,"Arcos",'e',true};
	/*podemos almacenar mas de un tipo de datos diferentes
	* al crear un arreglo de la clases objecto
	* a un arreglo de objetos (tipos de datos no primitivos)
	*/
}

}

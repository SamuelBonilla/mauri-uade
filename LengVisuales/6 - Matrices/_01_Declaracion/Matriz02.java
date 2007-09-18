/*
 * Created on 18/05/2006
 *
 * Arreglos de arreglos declaraci�n
 */

package _01_Declaracion;

public class Matriz02 {

	public static void main(String[] args) {
	      int mat[][];       			// referencia a un arreglo de 2 dimensiones
	      mat = new int[5][];			// asigna la longitud de la primera dimensi�n

	      for ( int i = 0; i < mat.length; i++ ) {
	      	 mat[i] = new int[(i+1)];	// asigna segunda dimensi�n a cada elemento
	      }      
	      
	      
	      for ( int i = 0; i < mat.length; i++ ) {
	      	 for (int j = 0; j < mat[i].length; j++) { 
	      	 	System.out.print("[" + i + "][" + j + "]  ");
	      	 }
	      	 System.out.println();
	      }
	      System.exit(0);	
	}	
}
/*
 * Created on 18/05/2006
 *
 * Arreglos de arreglos inicializaci�n
 */

package _01_Declaracion;

public class Matriz03 {

	public static void main(String[] args) {
		  int dim;	
	      int mat[][] = new int[4][];

		  // genera aletoriamente la longitud de la 2da dimensi�n	
	      for ( int i = 0; i < mat.length; i++ ) {
	      	 dim = 1 + (int) (Math.random() * 4);
	      	 mat[i] = new int[dim];
	      }      
	      
	      // inicializaci�n de la matriz
	      for ( int i = 0; i < mat.length; i++ ) {
	      	 for (int j = 0; j < mat[i].length; j++) { 
	      	 	mat[i][j] = (i+1)*10 + j;
	      	 }
	      }      
	      
	      // lista la matriz
	      for ( int i = 0; i < mat.length; i++ ) {
	      	 for (int j = 0; j < mat[i].length; j++) { 
	      	   System.out.print(mat[i][j]+"\t");
	      	 }
	      	 System.out.println();
	      }
	      System.exit(0);	
	}
}
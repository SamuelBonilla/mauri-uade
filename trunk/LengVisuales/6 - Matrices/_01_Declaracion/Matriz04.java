/*
 * Created on 18/05/2006
 *
 * Arreglos de arreglos inicialización
 */

package _01_Declaracion;

public class Matriz04 {

	public static void main(String[] args) {
	      int mat[][] = { {28, 12, 4},
  				  		  {51, 2},
  				  		  {91, 34, 11, 60} 
  				  		}; 	
  
	      for ( int i = 0; i < mat.length; i++ ) {
	          for (int j = 0; j < mat[i].length; j++) { 
	              System.out.print(mat[i][j]+"\t");
	          }
	          System.out.println();
	      }

	      System.exit(0);	
	}
}
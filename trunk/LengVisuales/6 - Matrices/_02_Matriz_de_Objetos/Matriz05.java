/*
 * Created on 18/05/2006
 *
 * Matriz de Objetos
 */

package _02_Matriz_de_Objetos;

public class Matriz05 {

	public static void main(String[] args) {
	      Object mat[][] = { {new Integer(28), new Integer(-12), new Long(1067)},
  				  		  	 {new Double(12.4), new Double(0.245)},
  				  		     {"Juan", "Ana", new String("Luis"), new String("Ada")} 
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
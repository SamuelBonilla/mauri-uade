/*
 * Created on 18/05/2006
 *
 * Arreglos inicialización
 */

package _01_Declaracion;

public class Array02 {

	public static void main(String[] args) {
	    
          // declara e inicializa un arreglo de 5 enteros 
	   	  int array[] = {18, 64, 39, 57, 22 };
	   	  
	      for ( int i = 0; i < array.length; i++ ) {
	      	 System.out.print(i + ": " + array[ i ] + "\t") ;
	      }
	      System.exit(0);	
	}
}
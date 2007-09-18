/*
 * Created on 18/05/2006
 *
 * Arreglos declaración
 */

package _01_Declaracion;

public class Array01 {

	public static void main(String[] args) {
	      int array[];            // declara una referencia a un arreglo
	      array = new int[ 10 ];  // crea el arreglo de 10 enteros

	      for ( int i = 0; i < array.length; i++ ) {
	      	 System.out.print(i + ": " + array[ i ] + "\t") ;
	      }
	      System.exit(0);	
	}
}
/*
 * Created on 18/05/2006
 *
 * Arreglos de objetos
 */

package _01_Declaracion;

public class Array03 {

	public static void main(String[] args) {
	    
          // arreglo de objetos String 
	    
	   	  String array[] = {"Juan", "Ana", "Luis" };
	   	  
	      for ( int i = 0; i < array.length; i++ ) {
	      	 System.out.println(array[i].toLowerCase()) ;
	      }
	     
 	      System.exit(0);	
	}
}
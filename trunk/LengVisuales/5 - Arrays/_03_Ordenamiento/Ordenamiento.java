/*
 * Created on 18/05/2006
 *
 * Arreglos ordenamiento
 */

package _03_Ordenamiento;

public class Ordenamiento {

	public static void main(String[] args) {
	      new Ordenamiento();
 	      System.exit(0);	
	}
	
	Ordenamiento() {
	      int array[] = { 22, 43, 3, 18, 78, 84, 32, 48, 91, 50 };
	      String s = "Valores originales del arreglo:";
	      mostrarArreglo(array, s);
	      
	      ordenarArreglo(array);
	      	   
	      s = "\n\nValores ordenados:";
	      mostrarArreglo(array, s);
	}
	
    void mostrarArreglo(int[] array, String s) {
	      System.out.println(s);

	      for ( int i = 0; i < array.length; i++ ) {
	          System.out.print(array[ i ] + "\t") ;
		  }
    }	
    
    void ordenarArreglo(int[] array) {
	      int aux; 
	      for ( int i = 1; i < array.length; i++ ) {
	      	for ( int j = 0; j < array.length - i; j++ ) { 
	        	if (array[ j ] > array[ j+1 ]) {
	        		aux = array[ j ];
	        		array[ j ] = array[ j+1 ];	
	        		array[ j+1 ] = aux;
	        	}
	      	}
	      }	   
    }
 }
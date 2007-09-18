/*
 * Created on 18/05/2006
 *
 * Arreglos pasaje por referencia
 */

package _02_Pasaje;

public class PorReferencia {

    public static void main(String[] args) {
        new PorReferencia();
        System.exit(0);
    }
    
    PorReferencia(){
        double array[] = { 22.43, 3.18, 78.84, 32.48, 91.50 };
        String s = "Valores originales del arreglo:";
        mostrarArreglo(array, s);
        
        modificaArreglo(array);
        
        s = "\n\nValores modificados:";
        mostrarArreglo(array, s);
    }
    
    void mostrarArreglo(double[] array, String s) {
	      System.out.println(s);

	      for ( int i = 0; i < array.length; i++ ) {
	          System.out.print(array[ i ] + "\t") ;
		  }
    }
    
    // multiplica cada elemento del arreglo por 2 
    void modificaArreglo( double[] array2 )
    {
       for ( int i = 0; i < array2.length; i++ )
          array2[ i ] *= 2;
    }
}

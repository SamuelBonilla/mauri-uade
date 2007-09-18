/*
 * Created on 18/05/2006
 *
 * Arreglos pasaje por valor
 */

package _02_Pasaje;

public class PorValor {

    public static void main(String[] args) {
        new PorValor();
        System.exit(0);
    }
    
    PorValor(){
        double array[] = { 22.43, 3.18, 78.84, 32.48, 91.50 };
        String s = "Valores originales del arreglo:";
        mostrarArreglo(array, s);
        
        for ( int i = 0; i < array.length; i++ )
            //modificaArreglo(array[i]);				// pasa por valor
            array[i] = modificaArreglo(array[i]);
            
        s = "\n\nValores modificados:";
        mostrarArreglo(array, s);
    }
    
    void mostrarArreglo(double[] array, String s) {
	      System.out.println(s);

	      for ( int i = 0; i < array.length; i++ ) {
	          System.out.print(array[ i ] + "\t") ;
		  }
    }
    
    // multiplica el valor recibido por 2 
    double modificaArreglo( double val ) {
       val *= 2;
       return val;
    }
}

/*
 * Created on 30/04/2006
 *
 */
package _06_Sentencias_Condicionales;

public class Sentencia_if {

    public static void main(String[] args) {
        int a = 7, b = 8;
        
        System.out.println( "comparar " + a + " con " + b);
        if ( a > b ) {
            System.out.println( a + " > " + b );
        } else if ( a < b ) {
            System.out.println( a + " < " + b );
        } else {
             System.out.println( a + " = " + b );
        }
    }
}

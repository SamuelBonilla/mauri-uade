/*
 * Created on 10/05/2006
 *
 * Clase String
 */
package _02_String;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Este es un StringBuilder de ");		// agrega un string
        sb.append(sb.length());							// agrega un entero
        sb.append(" caracteres de longitud.");
        System.out.println(sb);
        
        sb.delete(28,sb.length());						// elimina de la 1º a la 2º posición
        System.out.println(sb);
 
        sb.insert(28,"  caracteres de longitud.");		// inserta un string en la posición 
        sb.insert(28,sb.length()+2);					// inserta un entero en la posición 
        System.out.println(sb);
    }
}

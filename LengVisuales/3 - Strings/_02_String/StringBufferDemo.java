/*
 * Created on 10/05/2006
 *
 * Clase String
 */
package _02_String;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        
        buf.append("Esta es una cadena de ");		// agrega un string
        buf.append(buf.length());					// agrega un entero
        buf.append(" caracteres de longitud.");
        System.out.println(buf);
        
        buf.delete(22,25);							// elimina de la 1� a la 2� posici�n
        System.out.println(buf);
 
        buf.insert(22,buf.length()+3);				// inserta un entero en la posici�n 
        buf.insert(24,' ');							// inserta un caracter en la posici�n 
        System.out.println(buf);
    }
}

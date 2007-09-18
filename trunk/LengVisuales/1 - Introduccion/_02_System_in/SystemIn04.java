/*
 * Created on 30-abr-2006
 *
 * System.in.read()
 */
package _02_System_in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn04 {

	public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));		
		
        System.out.print("\n\tIngrese un texto: ");
        String s = in.readLine( );
	    
        System.out.print("\n\tTexto ingresado: ");
	    System.out.println(s);
	    
	    System.out.println("\n\tFin SystemIn04");
	    System.exit(0);
	}
}

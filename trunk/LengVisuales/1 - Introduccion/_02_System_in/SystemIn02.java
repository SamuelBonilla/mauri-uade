/*
 * Created on 30-abr-2006
 *
 * System.in.read()
 */
package _02_System_in;

import java.io.IOException;

public class SystemIn02 {

	public static void main(String[] args) throws IOException {
		int b;	
		System.out.println("Ingrese una secuencia de caracteres:");
	    while ( (b = System.in.read()) != '\n') {
	    	System.out.print((char)b);
	    }
	    
	    System.out.println("Fin SystemIn02");
	    System.exit(0);	    
	}
}
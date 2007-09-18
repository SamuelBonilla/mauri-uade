/*
 * Created on 30-abr-2006
 *
 * System.in.read()
 */
package _02_System_in;

import java.io.IOException;

public class SystemIn03 {

	public static void main(String[] args) throws IOException {
		String s = "";
		int b;
		
		System.out.println("Ingrese un texto ?");
	    while ( (b = System.in.read()) != '\n') {
	    	s += (char)b;
	    }
	    
	    System.out.println(s);
	    
	    System.out.println("Fin SystemIn03");
	    System.exit(0);
	}
}

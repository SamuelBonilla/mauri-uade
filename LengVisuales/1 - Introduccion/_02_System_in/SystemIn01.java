/*
 * Created on 30-abr-2006
 *
 * System.in.read()
 */
package _02_System_in;

import java.io.IOException;

public class SystemIn01 {

	public static void main(String[] args) throws IOException {
		System.out.print("ingrese un caracter-->");
	    int b = System.in.read();
	    System.out.println("ingresó-->"+(char)b);
	    
	    System.out.println("Fin SystemIn01");
	    System.exit(0);
	}
}

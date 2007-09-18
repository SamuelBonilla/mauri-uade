/*
 * Created on 30-abr-2006
 *
 * Float.parseFloat(String)
 */
package _04_Conversiones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number02 {

	public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));	
		
		System.out.print("\n\tIngrese un número decimal ? ");

	    float n = Float.parseFloat(in.readLine());
	    System.out.println("\n\tLa mitad de " + n + " es " + n / 2);
	    
	    System.out.println("\n\tFin Number02");
	    System.exit(0);		
	}
}

/*
 * Created on 30-abr-2006
 *
 * Integer.parseInt(String)
 */
package _04_Conversiones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number01 {

	public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));	
		
		System.out.print("\n\tIngrese un entero ? ");

		int n = Integer.parseInt(in.readLine());

	    System.out.println("\n\tEl doble de " + n + " es " + n * 2);
	    
	    System.out.println("\n\tFin Number01");
	    System.exit(0);		
	}
}

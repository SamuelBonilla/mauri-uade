/*
 * Created on 30-abr-2006
 *
 * Conversiones de n�mero a String y de String a n�mero
 */
package _04_Conversiones;

public class Number03 {

	public static void main(String[] args) {
		int i = 10;
		
		// convierte un Number en String
		String s1 = "" + i;
		String s2 = Integer.toString(i);
		String s3 = String.valueOf(i*1.0);
		
		System.out.println("Strings : s1 , s2 , s3 = 10 ");
		System.out.println("Numbers : n1 , n2 , n3 = 10 ");
		
		System.out.println("\ns1 + s2 + s3 : " + s1 + s2 + s3);
		
		
		// convierte un String a un n�mero primitivo
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.valueOf(s2).intValue();
		float n3 = Float.valueOf(s3).floatValue();		
	    
		System.out.println("n1 + n2 + n3 : " + (n1 + n2 + n3));
	    System.out.println("\nFin Number03");
	    System.exit(0);		
	}
}

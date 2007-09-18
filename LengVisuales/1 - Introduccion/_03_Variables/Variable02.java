/*
 * Created on 30-abr-2006
 *
 * variables final;
 */
package _03_Variables;

public class Variable02 {

	public static void main(String[] args) {
		final int VALOR_INICIAL = 10;
		final int VALOR_FIJO;
		
		System.out.println("VALOR_INICIAL = " + VALOR_INICIAL);
		
		VALOR_FIJO = 8;
		System.out.println("VALOR_FIJO = " + VALOR_FIJO);
		
		// VALOR_FIJO = 9;	error (ya fué inicializada)
		System.exit(0);	
 	}
}


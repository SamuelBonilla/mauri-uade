/*
 * Created on 30-abr-2006
 *
 * Tipos primitivos
 */
package _03_Variables;

public class Variable01 {

	public static void main(String[] args) {
		// enteros
        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;

        //reales
        float f = Float.MAX_VALUE;
        double d = Double.MAX_VALUE;

        //otros tipos primitivos
        char c = 'a';
        boolean t = true;

        System.out.println("Valor m�ximo del byte: " + b);
        System.out.println("Valor m�ximo del short: " + s);
        System.out.println("Valor m�ximo del int: " + i);
        System.out.println("Valor m�ximo del long: " + l);
        System.out.println("Valor m�ximo del float: " + f);
        System.out.println("Valor m�ximo del double: " + d);
        System.out.println("Valor del char: " + c );
        System.out.println("Valor del boolano: " + t + " o " + (!t));
        
        System.exit(0);	
 	}
}

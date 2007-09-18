/*
 * Created on 10/05/2006
 *
 * Formatos de números
 */
package _01_Formatos;

import java.text.NumberFormat;

public class NumberFormatDemo {

    public static void main(String[] args) {
        double d = 788214.805;
        String formato = NumberFormat.getNumberInstance().format(d);
        System.out.println("NumberFormat.getNumberInstance().format(d): " + formato);

        double d1 = 3930046.54;
        String moneda = NumberFormat.getCurrencyInstance().format(d1);
        System.out.println("NumberFormat.getCurrencyInstance().format(d1): " + moneda);
        
        float f = 0.25f;
        String porcentaje = NumberFormat.getPercentInstance().format(f);
        System.out.println("NumberFormat.getPercentInstance().format(f): " + porcentaje);

 	    System.exit(0);		
	}
}
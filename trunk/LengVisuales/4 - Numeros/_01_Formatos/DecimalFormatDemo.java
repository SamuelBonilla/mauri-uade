/*
 * Created on 10/05/2006
 *
 * Formatos de números personalizados 
 */
package _01_Formatos;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

    public static void main(String[] args) {
 
        double d2 = 788214.805;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("DecimalFormat(\"#.##\"): " + df.format(d2));
        
        df = new DecimalFormat("00000000.000");
        System.out.println("DecimalFormat(\"00000000.000\"): " + df.format(d2));     
        
        df = new DecimalFormat("$###,###.### ");
        System.out.println("DecimalFormat(\"$###,###.### 0\"): " + df.format(d2));             
	    System.exit(0);		
	}
}
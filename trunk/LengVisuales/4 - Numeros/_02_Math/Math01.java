/*
 * Created on 10/05/2006
 *
 * Clase Math 
 */
package _02_Math;

public class Math01 {

    public static void main(String[] args) {
        double nro = -846.113;

        System.out.println("Math.abs(" + nro + ")   : " + Math.abs(nro));
        System.out.println("Math.ceil(" + nro + ")  : " + Math.ceil(nro));
        System.out.println("Math.floor(" + nro + ") : " + Math.floor(nro));
        System.out.println("Math.rint(" + nro + ")  : " + Math.rint(nro));
        System.out.println("Math.round(" + nro + ") : " + Math.round(nro));
        nro -= 0.5;
        System.out.println("Math.round(" + nro + ") : " + Math.round(nro));
        
 	    System.exit(0);		
	}
}
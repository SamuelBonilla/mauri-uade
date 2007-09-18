/*
 * Created on 10/05/2006
 *
 * Math.random()
 */
package _02_Math;

public class Math05 {

    public static void main(String[] args) {
        int x;
 
        System.out.println("Math.random() : " + Math.random());
        x = (int)(Math.random() * 10);
        System.out.println("(int) (Math.random() * 10) : " + x);
        x = (int)(Math.random() * 10 + 1);
        System.out.println("(int) (Math.random() * 10 + 1) : " + x);
        
 	    System.exit(0);		
	}
}
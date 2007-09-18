/*
 * Created on 30/04/2006
 *
 * +=  op1 += op2  Equivalente a op1 = op1 + op2  
 * -=  op1 -= op2  Equivalente a op1 = op1 - op2  
 * *=  op1 *= op2  Equivalente a op1 = op1 * op2  
 * /=  op1 /= op2  Equivalente a op1 = op1 / op2  
 * %=  op1 %= op2  Equivalente a op1 = op1 % op2  
 *
 */
package _05_Operadores;

public class OperadoresDeAsignacion {

    public static void main(String[] args) {
        int i = 12;
        int j = 8;
        double x = 5.065;
        float y = 0.44f;
        
        System.out.println("valores...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    x = " + x);
        System.out.println("    y = " + y);

        //suma
        System.out.println("suma...");
        System.out.println("    i += j = " + (i += j));
        System.out.println("    x += y = " + (x += y));

        //resta
        System.out.println("resta...");
        System.out.println("    i -= j = " + (i -= j));
        System.out.println("    x -= y = " + (x -= y));

        //multiplicación
        System.out.println("multiplicación...");
        System.out.println("    i *= j = " + (i *= j));
        System.out.println("    x *= y = " + (x *= y));

        //división
        System.out.println("división...");
        System.out.println("    i /= j = " + (i /= j));
        System.out.println("    x /= y = " + (x /= y));

        //resto de la división
        System.out.println("resto de la división...");
        System.out.println("    i %= j = " + (i %= j));
        System.out.println("    x %= y = " + (x %= y));

      }
}

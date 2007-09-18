/*
 * Created on 30-abr-2006
 *
 *  +  (op1 + op2)  suma op1 y op2; o concatena si son strings.  
 *  -  (op1 - op2)  resta op2 de op1.  
 *  *  (op1 * op2)  Multiplica op1 por op2. 
 *  /  (op1 / op2)  Divide op1 por op2.  
 *  %  (op1 % op2)  Resto de la divición de op1 por op2.  
 */
package _05_Operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
	        int i = 12;
	        int j = 8;
	        double x = 57.065;
	        float y = 7.44f;
	        System.out.println("valores...");
	        System.out.println("    i = " + i);
	        System.out.println("    j = " + j);
	        System.out.println("    x = " + x);
	        System.out.println("    y = " + y);

	        //suma
	        System.out.println("suma...");
	        System.out.println("    i + j = " + (i + j));
	        System.out.println("    x + y = " + (x + y));

	        //resta
	        System.out.println("resta...");
	        System.out.println("    i - j = " + (i - j));
	        System.out.println("    x - y = " + (x - y));

	        //multiplicación
	        System.out.println("multiplicación...");
	        System.out.println("    i * j = " + (i * j));
	        System.out.println("    x * y = " + (x * y));

	        //división
	        System.out.println("división...");
	        System.out.println("    i / j = " + (i / j));
	        System.out.println("    x / y = " + (x / y));

	        //resto de la división
	        System.out.println("resto de la división...");
	        System.out.println("    i % j = " + (i % j));
	        System.out.println("    x % y = " + (x % y));

	        //tipos distintos
	        System.out.println("mezcla de tipos...");
	        System.out.println("    j + y = " + (j + y));
	        System.out.println("    i * x = " + (i * x));
	    }
}



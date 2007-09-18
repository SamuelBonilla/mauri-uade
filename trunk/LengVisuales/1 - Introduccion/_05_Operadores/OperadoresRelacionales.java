/*
 * Created on 30-abr-2006
 * 
 * >  	op1 > op2  	Retorna true si op1 es mayor que op2  
 * >=  	op1 >= op2  Retorna true si op1 es mayor o igual gue op2  
 * <  	op1 < op2  	Retorna true si op1 es menor que op2  
 * <=  	op1 <= op2  Retorna true si op1 es menor o igual gue op2  
 * ==  	op1 == op2  Retorna true si op1 y op2 son iguales  
 * !=  	op1 != op2  Retorna true si op1 y op2 son distintos  
 *
 */
package _05_Operadores;

public class OperadoresRelacionales {

	public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Valores...");
        System.out.println("   i = " + i);
        System.out.println("   j = " + j);
        System.out.println("   k = " + k);

        System.out.println("Mayor a...");
        System.out.println("   i > j = " + (i > j)); //false
        System.out.println("   j > i = " + (j > i)); //true
        System.out.println("   k > j = " + (k > j)); //false
 
        System.out.println("Mayor o igual a...");
        System.out.println("   i >= j = " + (i >= j)); //false
        System.out.println("   j >= i = " + (j >= i)); //true
        System.out.println("   k >= j = " + (k >= j)); //true

        System.out.println("Menor a...");
        System.out.println("   i < j = " + (i < j)); //true
        System.out.println("   j < i = " + (j < i)); //false
        System.out.println("   k < j = " + (k < j)); //false

        System.out.println("Menor o igual a...");
        System.out.println("   i <= j = " + (i <= j)); //true
        System.out.println("   j <= i = " + (j <= i)); //false
        System.out.println("   k <= j = " + (k <= j)); //true

        System.out.println("Igual a...");
        System.out.println("   i == j = " + (i == j)); //false
        System.out.println("   k == j = " + (k == j)); //true

        System.out.println("Distinto a...");
        System.out.println("   i != j = " + (i != j)); //true
        System.out.println("   k != j = " + (k != j)); //false
   	}
}

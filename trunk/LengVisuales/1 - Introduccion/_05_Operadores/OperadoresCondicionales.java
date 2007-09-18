/*
 * Created on 30-abr-2006
 * 
 * &&  	op1 && op2 	Retorna true si ambos son verdaderos  
 * ||  	op1 || op2  Retorna true si alguno es verdadero  
 * !  	!op1 	  	Retorna true si op1 es falso  
 * &  	op1 & op2	Idem && para booleanos evaluandose siempre ambos operandos
 * |  	op1 | op2	Idem || para booleanos evaluandose siempre ambos operandos
 * ^  	op1 ^ op2	Retorna true si op1 y op2 son distintos  
 *
 */
package _05_Operadores;

public class OperadoresCondicionales {

	public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("Valores...");
        System.out.println("   a = " + a);
        System.out.println("   b = " + b);

        System.out.println("Condicionales...");
        System.out.println("   a && b = " + (a && b)); 	//false
        System.out.println("   a || b = " + (a || b)); 	//true
        System.out.println("   a & b = " + (a & b));  	//false
        System.out.println("   a | b = " + (a | b));  	//true        
        System.out.println("   a ^ b = " + (a ^ b)); 	//true
        System.out.println("   !a = " + (!a)); 			//false
  

   	}
}

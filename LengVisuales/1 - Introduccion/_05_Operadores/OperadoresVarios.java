/*
 * Created on 30/04/2006
 *
 * ?:  			op1 ? op2 : op3  	Si op1 es true, returna op2; sino, returna op3  
 * []  			op1[n]				Identifica la cantidad de elementos de un arreglo o el elmento del arreglo.  
 * .  			op1.op2				Califica los identificadores miembros de un objeto.
 * (type)  		(tipo) op1			Convierte un valor al tipo especificado.
 * new  		new op1[n]			Para la creación de arreglos o de objetos.
 * instanceof  	op1 instanceof op2  Returna true si op1 es una instancia de op2  

 */
package _05_Operadores;

public class OperadoresVarios {

    public static void main(String[] args) {
        int a = 10;
        
        // operador ? :
        System.out.println("valor inicial de a = " + a);
        System.out.println("operador ( ? : )...");
        System.out.println("(a <= 10 ? a : 0) = " + (a <= 10 ? a : 0));
        System.out.println("(a <  10 ? a : 0) = " + (a < 10 ? a : 0));
        
        // operador (tipo)
        System.out.println("\noperador (tipo)...");
        System.out.println("(int) 6787.32 = " + (int)6787.32);        
        
        // operador new
        System.out.println("\noperador new...");
        System.out.println("new String(\"hola mundo\") = " + new String("hola mundo"));          
        
        // operador instanceof
        System.out.println("\noperador instanceof...");
        System.out.println("\"hola mundo\" instanceof String = " + ("hola mundo" instanceof String)); 
        
        // operador .
        System.out.println("\noperador .");
        System.out.println("String.valueOf(5408) = " + String.valueOf(5408));                  
    }
}

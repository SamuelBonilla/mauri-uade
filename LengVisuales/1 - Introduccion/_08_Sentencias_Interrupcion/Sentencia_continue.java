/*
 * Created on 30/04/2006
 *
 */
package _08_Sentencias_Interrupcion;

public class Sentencia_continue {

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++){
            if ( i == 5) 
                continue;
            System.out.print(i + "\t");
        }
     }
}
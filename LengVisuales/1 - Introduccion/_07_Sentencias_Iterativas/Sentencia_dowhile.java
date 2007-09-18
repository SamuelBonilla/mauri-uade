/*
 * Created on 30/04/2006
 *
 */
package _07_Sentencias_Iterativas;

public class Sentencia_dowhile {

    public static void main(String[] args) {
        int i = 0;
        
        do {
            System.out.print(++i);
            System.out.print("\t");
        } while (i < 8);
    }
}

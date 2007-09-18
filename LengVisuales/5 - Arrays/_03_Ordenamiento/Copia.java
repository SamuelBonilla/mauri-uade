/*
 * Created on 18/05/2006
 *
 * Copia de arreglos
 * 
 * public static void arraycopy(Object source,
 *                  			int srcIndex,
 *                  			Object dest,
 *                  			int destIndex,
 *                  			int length,
 */

package _03_Ordenamiento;

public class Copia {

	public static void main(String[] args) {
	    char[] origen = {'M', 'u', 'n', 'd', 'o', ' ', 'J', 'a', 'v', 'a', '.' };
        char[] destino = new char[4];

        System.arraycopy(origen, 6, destino, 0, 4);
        System.out.println(new String(origen));
        System.out.println("System.arraycopy(origen, 6, destino, 0, 4)");
        System.out.println(new String(destino));

	    System.exit(0);	
	}
}
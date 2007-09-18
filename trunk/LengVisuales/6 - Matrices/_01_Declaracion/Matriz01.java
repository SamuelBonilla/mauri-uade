/*
 * Created on 18/05/2006
 *
 * Arreglos de arreglos declaración
 */

package _01_Declaracion;

public class Matriz01 {

	public static void main(String[] args) {
	      int mat[][];          // referencia a un arreglo de 2 dimensiones
	      mat = new int[4][3];  // asigna la longitud de cada dimensión 

	      for ( int i = 0; i < mat.length; i++ ) {
	      	 for (int j = 0; j < mat[i].length; j++) { 
	      	 	System.out.print(i + "-" + j + " = " + mat[i][j] + "\t\t");
	      	 }
	      	 System.out.println();
	      }
	      System.exit(0);
	}
}
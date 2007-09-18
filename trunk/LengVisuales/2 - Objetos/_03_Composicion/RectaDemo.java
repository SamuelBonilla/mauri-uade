/*
 * Created on 05/05/2006
 *
 */
package _03_Composicion;

import _01_Clases_Definicion.Punto;

public class RectaDemo {

    public static void main(String[] args) {
        Punto a = new Punto(3,5);
        Punto b = new Punto(6,9);
        Recta r = new Recta(a,b);
 
        System.out.println("Coordenadas de r: " + r.toString());
        System.out.println("longitud de r: " + r.longitud());
    }
}

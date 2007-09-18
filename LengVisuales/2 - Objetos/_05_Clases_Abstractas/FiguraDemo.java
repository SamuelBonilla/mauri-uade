/*
 * Created on 05/05/2006
 *
 */
package _05_Clases_Abstractas;

import _01_Clases_Definicion.Punto;

public class FiguraDemo {

    public static void main(String[] args) {
        Punto p = new Punto(3,5);
        float r = 5;
        Figura f1 = new Circulo(p,r);
        
        float a = 6, b = 4, c = 3;
        Figura f2 = new Triangulo(a, b, c);
        
        System.out.println("C�rculo: " + f1.toString());
        System.out.println("Per�metro: " + f1.perimetro());
        System.out.println("Tri�ngulo: " + f2.toString());
        System.out.println("Per�metro: " + f2.perimetro());
    }
}

/*
 * Created on 05/05/2006
 *
 */
package _06_Interfaces;

import _01_Clases_Definicion.Punto;

public class InterfaceDemo {

    public static void main(String[] args) {
        Punto p = new Punto(3,5);
        float r = 5;
        Figura f1 = new Circulo(p,r);
        
        float a = 6, b = 4;
        Figura f2 = new Rectangulo(a, b);
        
        System.out.println(f1.toString());
        System.out.println("area: " + f1.area());
        System.out.println("Perímetro: " + f1.perimetro());
        System.out.println(f2.toString());
        System.out.println("area: " + f2.area());
        System.out.println("Perímetro: " + f2.perimetro());
    }
}

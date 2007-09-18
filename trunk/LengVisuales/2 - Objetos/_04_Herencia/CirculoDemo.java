/*
 * Created on 05/05/2006
 *
 */
package _04_Herencia;

import _01_Clases_Definicion.Punto;

public class CirculoDemo {

    public static void main(String[] args) {
        Punto p = new Punto(3,5);
        float r = 5; 				// radio
        Circulo c = new Circulo(p,r);
  
        System.out.println("Círculo: " + c.toString());
        System.out.println("Perímetro: " + c.perimetro());
        System.out.println("Area: " + c.area());
    }
}

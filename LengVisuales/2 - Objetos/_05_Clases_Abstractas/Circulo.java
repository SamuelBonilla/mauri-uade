/*
 * Created on 05/05/2006
 *
 * Polimorfismo
 */
package _05_Clases_Abstractas;

import _01_Clases_Definicion.Punto;

public class Circulo extends Figura{
    // variables miembro 
    static final String TIPO = "Círculo";
    Punto centro;
    float radio;
    
    // constructores
    public Circulo(int x, int y, float radio){
        centro = new Punto(x,y);
        this.radio = radio;
     }
    
    public Circulo(Punto centro, float radio){
        this.centro = centro;
        this.radio = radio;
     }    
 
    // metodos
    public double perimetro() {
        return Math.PI * 2 * radio;
    }
    
    public String toString() {
        return centro.toString() + " rad: " + String.valueOf(radio);
    }
}
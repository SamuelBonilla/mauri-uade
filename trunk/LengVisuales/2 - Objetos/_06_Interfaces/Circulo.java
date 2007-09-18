/*
 * Created on 05/05/2006
 *
 * Polimorfismo
 */
package _06_Interfaces;

import _01_Clases_Definicion.Punto;

public class Circulo extends Figura{
    // variables miembro 
    private Punto centro;
    private float radio;
    
    // constructores
    public Circulo(int x, int y, float radio){
    	super(I.CIRCULO);
        centro = new Punto(x,y);
        this.radio = radio;
     }
    
    public Circulo(Punto centro, float radio){
    	super(I.CIRCULO);
        this.centro = centro;
        this.radio = radio;
     }    
 
    // metodos
    public double area() {
        return Math.PI * radio * radio;
    }
    
    public double perimetro() {
        return Math.PI * 2 * radio;
    }
    
    public String toString() {
        return tipoFigura + " " + centro.toString() + " rad: " + String.valueOf(radio);
    }
}
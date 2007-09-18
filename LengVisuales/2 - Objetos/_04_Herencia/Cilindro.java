/*
 * Created on 05/05/2006
 *
 * Herencia 
 *(suponiendo, como ejemplo, que un Cilindro pueda ser interpretado como un Círculo, asignándole altura)
 */
package _04_Herencia;

import _01_Clases_Definicion.Punto;

public class Cilindro extends Circulo {
    // variables miembro 
    float altura;

    public Cilindro(int x, int y, float radio, float altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public Cilindro(Punto p, float radio, float altura) {
        super(p, radio);
        this.altura = altura;
    }
    
    // metodos
    
     public double area() {
        return Math.PI * Math.pow(radio,2) * 2 + super.perimetro() * altura;
    }    
    
    public double volumen() {
        return Math.PI * Math.pow(radio,2) * altura;
    } 
    
    public String toString() {
        return super.toString() + " alt: " + String.valueOf(altura);
    }    

}

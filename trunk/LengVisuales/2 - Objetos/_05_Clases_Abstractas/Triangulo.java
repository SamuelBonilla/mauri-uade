/*
 * Created on 05/05/2006
 *
 * Polimorfismo
 */
package _05_Clases_Abstractas;

public class Triangulo extends Figura{
    // variables miembro 
    static final String TIPO = "Tri�ngulo";
    float a, b, c;		// lados del tri�ngulo
    
    // constructores
    public Triangulo(float a, float b, float c){
         this.a = a;
         this.b = b;
         this.c = c;
     }
    
    // metodos
    public double perimetro() {
        return a + b + c;
    }
    
    public String toString() {
        return "a: " + a + " b: " + b + " c: " + c;
    }
}
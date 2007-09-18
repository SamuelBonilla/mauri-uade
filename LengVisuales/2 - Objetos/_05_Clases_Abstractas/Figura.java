/*
 * Created on 05/05/2006
 *
 * Abstracta
 */
package _05_Clases_Abstractas;

public abstract class Figura {

    public abstract double perimetro();
    
    public void tipoFigura(String tipo){
        System.out.println(tipo);
    }
}

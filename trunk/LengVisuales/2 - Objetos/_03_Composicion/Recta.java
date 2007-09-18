/*
 * Created on 05/05/2006
 *
 * Composición
 */
package _03_Composicion;

import _01_Clases_Definicion.Punto;

public class Recta {
    // variables miembro (referencias a Punto) 
    Punto a;
    Punto b;
    
    // constructores
    public Recta(Punto a, Punto b){
        this.a = a;
        this.b = b;
    }
 
    public Recta(int x1, int y1, int x2, int y2){
        this.a = new Punto(x1,y1);
        this.b = new Punto(x2,y2);
    }
    
    // metodos
    public double longitud() {
        return a.distancia(b);
    }
    
    public String toString() {
        return a.toString()+b.toString();
    }
}

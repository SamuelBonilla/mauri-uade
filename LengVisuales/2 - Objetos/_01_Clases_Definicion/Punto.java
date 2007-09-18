/*
 * Created on 05/05/2006
 *
 */
package _01_Clases_Definicion;

public class Punto {
    // variables miembro 
    int x;
    int y;
    
    // constructor
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // metodos
    public double distancia(Punto q){
        return Math.sqrt(Math.pow(this.x - q.x,2) + Math.pow(this.y - q.y,2));
    }
    
    public boolean equals(Object o){
        Punto q = (Punto) o;		// convierte un Object a un tipo Punto
        return (this.x == q.x && this.y == q.y);
    }
    public String toString() {
        return "(" + x +", "+ y +")";
    }
}

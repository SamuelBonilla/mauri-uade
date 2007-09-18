/*
 * Created on 05/05/2006
 *
 * Permite instanciar hasta un tope de objetos del tipo Punto
 */
package _02_Miembros_Estaticos;

public class Punto {
// variables de instancia 
    int x;
    int y;
// variables de clase 
    static final int TOPE = 3;
    static int n;
    
// constructor
    private Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
// métodos de instancia
    public double distancia(Punto q){
        return Math.sqrt(Math.pow(this.x - q.x,2) + Math.pow(this.y - q.y,2));
    }
    
    public boolean equals(Object o){
        Punto q = (Punto) o;		// convierte un Object a un tipo Punto
        return (this.x == q.x && this.y == q.y);
    }
    public String toString() {
        return "(" + x +","+ y +")";
    }
    
// métodos de clase
    public static Punto obtenerPunto(int x, int y){
        return (n++ < TOPE ? new Punto(x,y) : null);
    }
}
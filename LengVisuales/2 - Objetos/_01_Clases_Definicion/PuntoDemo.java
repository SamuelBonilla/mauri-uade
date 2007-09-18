/*
 * Created on 05/05/2006
 *
 */
package _01_Clases_Definicion;

public class PuntoDemo {

    public static void main(String[] args) {
        Punto p;
        p = new Punto(3,5);
        System.out.println("Coordenadas de p: " + p.toString());
        
        Punto q = new Punto(5,3);
        System.out.println("Coordenadas de q: " + q.toString());
        
        System.out.println("p y q iguales ? " + p.equals(q));
        System.out.println("distancia entre p y q : " + p.distancia(q));
        
        Punto u = new Punto(3,5);
        System.out.println("\nCoordenadas de u: " + u.toString());
        
        System.out.println("p y u iguales ? " + p.equals(u));
        System.out.println("distancia entre p y u : " + p.distancia(u));
    }
}

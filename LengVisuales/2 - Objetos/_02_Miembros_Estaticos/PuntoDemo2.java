/*
 * Created on 05/05/2006
 *
 */
package _02_Miembros_Estaticos;

public class PuntoDemo2 {

    public static void main(String[] args) {
        Punto p;
        p = Punto.obtenerPunto(3,5);
        System.out.println("Coordenadas de p: " + p.toString());
        
        Punto q = Punto.obtenerPunto(5,3);
        System.out.println("Coordenadas de q: " + q.toString());
        
        System.out.println("p y q iguales ? " + p.equals(q));
        System.out.println("distancia entre p y q : " + p.distancia(q));
        
        Punto u = Punto.obtenerPunto(3,5);
        System.out.println("\nCoordenadas de u: " + u.toString());
        
        System.out.println("p y u iguales ? " + p.equals(u));
        System.out.println("distancia entre p y u : " + p.distancia(u));
        
        Punto t = Punto.obtenerPunto(5,5);
        if (t == null)
            System.out.println("\nt no fue instanciado");        
        else
            System.out.println("\nCoordenadas de t: " + t.toString());        
    }
}

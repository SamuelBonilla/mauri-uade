package colecciones;
import java.util.*;

public class QueueDemo {
    Queue<Integer> q;
    
    /** Creates a new instance of QueueDemo */
    public QueueDemo() {
        q = new PriorityQueue<Integer>();
        agregar();
        propiedades();
        quitar();
    }
    
    void agregar() {
    	for (int i = 0; i < 10; i++) {
            q.add(i);
    	}
    	System.out.print("add(<E>)... ");
    	mostrar();
    }
    
    void quitar() {
        System.out.print("poll():\t" + q.poll() + " ... ");
        mostrar();
        propiedades();
    }    
    
    void propiedades() {
    	System.out.println("Cantidad de elementos:\t" + q.size());
        System.out.println("Primer elemento:\t" + q.peek());
    }  
    
    void mostrar() {
    	for (Iterator i = q.iterator(); i.hasNext();) {
            System.out.print(i.next()+"->");
    	}
    	System.out.println();
    }    
    
    public static void main (String[] args){
        new QueueDemo();
        System.exit(0);
    }
    
}


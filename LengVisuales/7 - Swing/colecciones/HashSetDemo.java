/*
 * Created on 10/06/2006
 *
 * Colecciones : HashSet implements Set
 *
 */

package colecciones;

import java.util.*;


public class HashSetDemo {
	Set<Integer> hSet;
	
	public HashSetDemo() {
		hSet = new HashSet<Integer>(); 	
		agregar();
		buscar();
		eliminar();
		vaciar();
	}
	
	// add(...)
	void agregar() {
		int elemento;
		for (int i = 0; i < 10; i++) {
			elemento = 100 + (int) (Math.random() * 900);
			hSet.add(elemento);
		}
		hSet.add(new Integer(60));
		System.out.print("add(Object)... ");
		mostrar();
	}
	
	// contains(...)
	void buscar() {
		for (int elemento = 60; elemento < 62; elemento++) {
			if (hSet.contains(elemento))
				System.out.println("contains(Object)... " + elemento + " existe");
			else
				System.out.println("contains(Object)... " + elemento + " no existe");
		}
	}	
	
	// remove(...)
	void eliminar() {
		int elemento = 60;
		if (hSet.remove(elemento))
			System.out.println("remove(Object)... " + elemento + " eliminado");
		mostrar();
	}
	
	// clear() isEmpty()
	void vaciar() {
		hSet.clear();
		System.out.println("clear() ... Set vacío ? " + hSet.isEmpty());
	}	
	
	// Iterator
	void mostrar() {
		for (Iterator i = hSet.iterator(); i.hasNext();) {
			System.out.print(i.next()+"->");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		new HashSetDemo();
		System.exit(0);
	}

}

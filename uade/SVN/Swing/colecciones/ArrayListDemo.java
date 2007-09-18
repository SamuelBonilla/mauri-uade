/*
 * Created on 10/06/2006
 *
 * Colecciones : ArrayList implements List
 *
 * Equivalente a Vector, excepto que no está sincronizada y permite nulos.
 */

package colecciones;

import java.util.*;

public class ArrayListDemo {
	List<Integer> arrayList;
	
	public ArrayListDemo() {
		arrayList = new ArrayList<Integer>(); 	
		agregar();
		insertar();
		buscar();
		eliminar();
		vaciar();
	}
	
	// add(Object)
	void agregar() {
		int elemento;
		for (int i = 0; i < 10; i++) {
			elemento = 100 + (int) (Math.random() * 900);
			arrayList.add(new Integer(elemento));
		}
		System.out.print("add(Object)... ");
		mostrar();
	}
	
	// add(int, Object)
	void insertar() {
		arrayList.add(0, new Integer(28));
		arrayList.add(4, new Integer(60));
		System.out.print("add(int,Object)... ");
		mostrar();
	}
	
	// contains(Object)
	void buscar() {
		for (int elemento = 60; elemento < 62; elemento++) {
			if (arrayList.contains(new Integer(elemento)))
				System.out.println("contains(Object)... " + elemento + " existe");
			else
				System.out.println("contains(Object)... " + elemento + " no existe");
		}
	}	
	
	// remove(Object)
	void eliminar() {
		int elemento = 60;
		if (arrayList.remove(new Integer(elemento)))
			System.out.println("remove(Object)... " + elemento + " eliminado");
		mostrar();
	}
	
	// clear() isEmpty()
	void vaciar() {
		arrayList.clear();
		System.out.println("clear() ... lista vacia ? " + arrayList.isEmpty());
	}	
	
	// size() get(int)
	void mostrar() {
		for (int i = 0; i < arrayList.size()-1; i++) {
			System.out.print(arrayList.get(i)+"->");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		new ArrayListDemo();
		System.exit(0);
	}
}

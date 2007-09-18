/*
 * Created on 10/06/2006
 *
 * Colecciones : HashMap implements Map 
 *
 * Equivalente a HashTable, excepto que no está sincronizada y permite nulos.
 */

package colecciones;

import java.util.*;

public class HashMapDemo {
	Map<String,String> hashMap;
	
	public HashMapDemo() {
		hashMap = new HashMap<String,String>(); 	
		agregar();
		buscar();
		eliminar();
		vaciar();
	}
	
	// put(Object key, Object val)
	void agregar() {
		hashMap.put("aa", "AAAA");
		hashMap.put("hh", "HHHH");
		hashMap.put("vv", "VVVV");
		hashMap.put("ss", "SSSS");
		hashMap.put("ee", "EEEE");
		hashMap.put("oo", "OOOO");
		hashMap.put("bb", "BBBB");
		hashMap.put("pp", "PPPP");
		mostrar();
	}
	
	// containsValue(Object val)	containsKey(Object key)
	void buscar() {
		System.out.print("\ncontainsValue(EEEE): " + hashMap.containsValue("EEEE"));
		System.out.print("\tcontainsKey(pp): " + hashMap.containsKey("pp"));
		System.out.println();
	}	
	
	// remove(Object key)
	void eliminar() {
		System.out.print("\nremove(ee): " + hashMap.remove("ee"));
		System.out.println();
		mostrar();
	}
	
	// clear() isEmpty()
	void vaciar() {
		hashMap.clear();
		System.out.println("clear() ... lista vacia ? " + hashMap.isEmpty());
	}	
	
	// get(Object key) keySet() 
	void mostrar() {
		Set set = hashMap.keySet();
		System.out.print("claves : ");
		for (Iterator i = set.iterator(); i.hasNext();) {
			System.out.print(i.next()+"->");
		}
		
		System.out.print("\nvalores: ");
		for (Iterator i = set.iterator(); i.hasNext();) {
			System.out.print(hashMap.get(i.next())+"->");
		}	
		System.out.println();
	}
	
	public static void main(String[] args){
		new HashMapDemo();
		System.exit(0);
	}
}

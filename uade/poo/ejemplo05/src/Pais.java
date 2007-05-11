/*
 * Created on 22-ago-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author julio
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.util.Vector;

public class Pais {
	
	private Vector provincias;
	private String nombre;
		
	public Pais (String nombre, Vector provincias){
		this.nombre = nombre;
		this.provincias = provincias;
									
	}
	
	/*Muestra el nombre del país*/
	public String toString(){
		
		return "PAIS: "+nombre;
		
	}
	
	

}

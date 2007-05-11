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

public class Provincia {

	private Vector ciudades;
	private String nombre;
	
	public Provincia (String nombre, Vector ciudades){
		
		this.nombre = nombre;
		this.ciudades = ciudades;
		
			
	}
	/* Muestra el nombre de la provincia*/
	public String toString (){
		
		return "PROVINCIA"+": "+nombre;
		
	}
	
}

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
public class Ciudad {
	
	private String nombre;
	
	private int impuesto1;
	private int impuesto2;
	private int impuesto3;
	private int impuesto4;
	private int impuesto5;
		
	private Float gasto;
	
	
	public Ciudad 	(String nombre, int imp1, int imp2, int imp3,
					int imp4, int imp5, Float gasto){
		
		this.nombre = nombre;
		this.impuesto1 = imp1;
		this.impuesto2 = imp2;
		this.impuesto3 = imp3;
		this.impuesto4 = imp4;
		this.impuesto5 = imp5;
		this.gasto = gasto;
		
		
		
	}
	/* Muestra el nombre de la ciudad */
	public String toString(){
		
		return "CIUDAD:"+nombre;
		
	}
	
	

}

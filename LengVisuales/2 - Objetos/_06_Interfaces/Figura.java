/*
 * Created on 05/05/2006
 *
 */
package _06_Interfaces;

public abstract class Figura implements I {
	protected String tipoFigura;
	
	public Figura(String tipo) {
		this.tipoFigura = tipo;
	}
    
    public String getTipoFigura(){
    	return this.tipoFigura;
    }
    
    public void setTipoFigura(String tipo){
    	this.tipoFigura = tipo;
    }
}




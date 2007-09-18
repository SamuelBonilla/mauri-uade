/*
 * Created on 05/05/2006
 *
 * Polimorfismo
 */
package _06_Interfaces;

public class Rectangulo extends Figura{
	private float largo;
	private float ancho;
	
	public Rectangulo(float largo, float ancho) {
		super("Rectángulo");
		setLargo(largo);
		setAncho(ancho);
	}
	
	public Rectangulo setLargo(float largo) {
		this.largo = (largo > 0 ? largo : 0);
		return this;
	}
	
	public Rectangulo setAncho(float ancho) {
		this.ancho = (ancho > 0 ? ancho : 0);
		return this;
	}	
	
	public float getLargo() { return largo; }
	
	public float getAncho() { return ancho; }
	
	public double perimetro() { 
		return Math.floor((largo + ancho) * 2 * 100 + .5) /100; 
	}
	
	public double area() { 
		return Math.floor(largo * ancho * 100 + .5) /100;
    }
	
	public String toString() { 
		return tipoFigura + " largo " + largo + " ancho " + ancho;
    }
}
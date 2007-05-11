
public abstract class Producto {
	private String nombre;
	private float precio;
	private int disponibilidad;
	private String empresa;
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	public void setPrecio(float p) {
		this.precio = p;
	}
	public float getPrecio() {
		return this.precio;
	}
	public int getDisponibilidad() {
		return this.disponibilidad;
	}
	public void setDisponibilidad(int dispo) { 
		this.disponibilidad=dispo;
	}
	public boolean reservar(int cant) {
		this.disponibilidad=this.disponibilidad-cant;
		if (this.disponibilidad >= 0) return true;
		else {
			this.disponibilidad=this.disponibilidad + cant;
			return false;
			}
		}
	public void setEmpresa(String e) {
		this.empresa= e;
	}
	public String getEmpresa() {
		return this.empresa;
	}
	public void setNombre(String n){
		this.nombre=n;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	}

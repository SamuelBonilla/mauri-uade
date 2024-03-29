public abstract class Producto {
	protected String nombre;
	protected float precio;
	protected int disponibilidad;
	protected String empresa;
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void setPrecio(float p); 
	public abstract float getPrecio() ;
	public abstract int getDisponibilidad(); 
	public abstract void setDisponibilidad(int dispo);
	public abstract boolean reservar(int cant);
	
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

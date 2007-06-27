public class Vuelo extends Producto {
	String origen;
	String destino;
	String empresa;
	String fechaSalida;	
	String fechaLlegada;			
	String tipoTransporte;
	
	public Vuelo(String origen, String destino, String empresa, String fechaSalida,
			String fechaLlegada, String tipo, float precio, int dispo) {
		super();
		this.setNombre("Vuelo: "+origen+" "+destino);
		this.origen=origen;
		this.destino=destino;
		this.empresa=empresa;
		this.fechaSalida=fechaSalida;
		this.fechaLlegada=fechaLlegada;
		this.tipoTransporte=tipo;
		this.setDisponibilidad(dispo);
		this.setPrecio(precio);
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
	
	public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
	public String getEmpresa() {
		return empresa;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}
	public String getTipo() {
		return this.tipoTransporte;
	}

}

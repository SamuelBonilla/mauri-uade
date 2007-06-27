import java.util.Vector;

public class Alojamiento extends Producto {
	String ciudad;
	String direccion;
	String tipoAlojamiento;
	public Alojamiento(String nombre, int disponibilidad, String ciudad,
			String direccion, String tipo, float precio) {
		super();
		this.setNombre("Alojamiento: "+ nombre);
		this.ciudad=ciudad;
		this.direccion=direccion;
		this.tipoAlojamiento=tipo;
		this.setDisponibilidad(disponibilidad);
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
	
	public String getCiudad() {
		return this.ciudad;
	}
	public String getDireccion() {
		return this.direccion;
	}
	
}

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
	
	public String getCiudad() {
		return this.ciudad;
	}
	public String getDireccion() {
		return this.direccion;
	}
	
}

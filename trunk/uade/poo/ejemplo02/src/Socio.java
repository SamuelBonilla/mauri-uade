
public class Socio {
	private int nro;
	private static int nrosocio;
	private String nombre;
	private String domicilio;
	private String telefono;
	private int dni;
	
	public Socio(String nombre, String dom, String tel, int dni) {
		this.nombre=nombre;
		this.domicilio=dom;
		this.telefono=tel;
		this.dni=dni;	
		this.nro= this.nuevoNroSocio();
		
	}

	private int nuevoNroSocio() {
		return this.nrosocio++;
	}
	
}

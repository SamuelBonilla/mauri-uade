public class Cliente {
	private String nombre;
	private String apellido;
	private Cliente cliente;
	
	public Cliente(String n, String a) {
		super();
		this.nombre= n;
		this.apellido= a;
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
}


public class Item {
	private Usuario usuario;
	private Producto producto;
	private boolean pago;
	public Item(Producto p, Usuario u) {
		this.producto=p;
		this.usuario=u;
		this.pago=false;
		// TODO Auto-generated constructor stub
	}

	public float getTotal() {
		return this.producto.getPrecio();
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	public Producto getProducto() {
		return this.producto;
	}
	public void mostrar(){
		System.out.println("\t"+this.producto.getNombre()+"\t"+this.producto.getPrecio());
	}
	public void pagar() {
		this.pago=true;
	}
	public boolean getPago() {
		return this.pago;
	}
	
}

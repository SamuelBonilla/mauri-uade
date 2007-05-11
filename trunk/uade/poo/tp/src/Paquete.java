import java.util.Vector;

public class Paquete {
	private Vector productos;
	public Paquete() {
		super();
		this.productos= new Vector();
		// TODO Auto-generated constructor stub
	}
	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public float getPrecio() {
		float total=0;
		for (int i=0; i<this.productos.size(); i++) {
			Producto p = (Producto) this.productos.elementAt(i);
			total = total + p.getPrecio();
		}
		return total;		
	}
	
	public Vector getProductos() {
		return this.productos;
	}
	
}


public class CuentaCorriente extends Cuenta {
	private float descubierto;
	
	public CuentaCorriente(Cliente c, float m) {
		super(c,m);
		this.descubierto=0;
		
		// TODO Auto-generated constructor stub
	}
	
	public boolean extraer(float m) {
		if (m > this.getSaldo()+this.descubierto) {
			return false;
		}	
		else {
			this.saldo = this.saldo-m;
			return true;
		}
	}
		
	public void setDescubierto(float monto) {
		this.descubierto= monto;
	}
}

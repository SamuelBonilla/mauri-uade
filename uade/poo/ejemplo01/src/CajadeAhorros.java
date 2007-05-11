
public class CajadeAhorros extends Cuenta {

	public CajadeAhorros(Cliente c, float saldo) {
		super(c, saldo);
		// TODO Auto-generated constructor stub
	}

	public boolean extraer(float m) {
		if (m > this.getSaldo()) {
			return false;
		}	
		else {
			this.saldo = this.saldo-m;
			return true;
		}
	}
		// TODO Auto-generated method stub

}



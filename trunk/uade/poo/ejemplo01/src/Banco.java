import java.util.Vector;


public class Banco {
	private Vector cuentas;
	private Vector clientes;
	public Banco() {
		this.cuentas = new Vector();
		this.clientes = new Vector();
		
		// TODO Auto-generated constructor stub
	}

	public void crearCuentaCorriente(Cliente c) {
		float inicial = 0;
		CuentaCorriente cuenta = new CuentaCorriente(c,inicial);
		this.cuentas.add(cuenta);		
	}

	public boolean depositar(int nrocuenta , float monto) {
		Cuenta cta = this.buscarCuenta(nrocuenta);
		if (cta == null) {
			return false;
		}
		else {
			cta.depositar(monto);
			return true;
		}
	}
	
	public boolean extraer(int nro, float m) {
		Cuenta cta = this.buscarCuenta(nro);
		boolean exito = cta.extraer(m);
		return exito;
	}
	public Cuenta buscarCuenta(int nro) {
		for (int i =0 ; i< this.cuentas.size(); i++) {
			Cuenta cta = (Cuenta) this.cuentas.elementAt(i);
			if (cta.getNro() == nro) {
				return cta;
			}
		}
		return null;
	}
	
	public Vector listarCuentas(Cliente c) {
		Vector vAux = new Vector();
		for (int i =0 ; i< this.cuentas.size(); i++) {
			Cuenta cta = (Cuenta) this.cuentas.elementAt(i);
			if (cta.getCliente().equals(c)) {
				vAux.add(cta);
			}
		}
		return vAux;
	}
	
	public void informarSaldo (int nrocta) {
		Cuenta cta = this.buscarCuenta(nrocta);
		System.out.println("El saldo de su cta "+ nrocta +"es: ");
		System.out.println(cta.getSaldo());		
	}

}

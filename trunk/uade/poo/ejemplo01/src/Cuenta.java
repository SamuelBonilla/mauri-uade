abstract public class Cuenta {
	protected Cliente cliente;
	protected float saldo;
	protected int numero;
	private static int numeroCuenta;
	public Cuenta(Cliente c, float saldo) {
		super();
		this.cliente= c;
		this.saldo=saldo;
		this.numero = this.proximaCta();
		// TODO Auto-generated constructor stub
	}
	
	public int proximaCta() {
		return this.numeroCuenta++;
	}

	public void setSaldo(float s) {
		this.saldo=s;
	}
	public void depositar(float m) {
		this.saldo = this.saldo + m;
	}
	abstract boolean extraer(float m);
	
	public float getSaldo(){
		return this.saldo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public int getNro() {
		return this.numero;
	}
}

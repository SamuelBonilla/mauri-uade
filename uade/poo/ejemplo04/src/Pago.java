

public class Pago
{
	private int NroPago;
	private String TipoPago;
	private int Total;
	private Cliente Cliente;
	
	public Pago(int NroPago, String TipoPago, int Total, Cliente Cliente)
	{
		this.NroPago=NroPago;
		this.TipoPago=TipoPago;
		this.Total=Total;
		this.Cliente=Cliente;
	}
	
	public int GetNroPago()
	{
		return this.NroPago;
	}
	
	public String GetTipoPago()
	{
		return this.TipoPago;
	}
	
	public int GetTotal()
	{
		return this.Total;
	}
	
	public Cliente GetCliente()
	{
		return this.Cliente;
	}
}

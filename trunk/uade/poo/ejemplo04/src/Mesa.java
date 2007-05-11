

public class Mesa
{
	private int NroMesa;
	private String Estado;       // libre, ocupado
	
	private Servicio Servicio;
	private Cliente Cliente;
	private Mozo Mozo;
	private String Ubicacion;    // fumador, no fumador
	
	public Mesa(int NroMesa, String Estado)
	{
		this.NroMesa=NroMesa;
		this.Estado=Estado;
		Servicio = new Servicio();
	}
	
	public void SetEstado(String Estado)
	{
		this.Estado=Estado;
	}
	
	public void SetCliente(Cliente Cliente)
	{
		this.Cliente=Cliente;
	}

	public void SetMozo(Mozo Mozo)
	{
		this.Mozo=Mozo;
	}
	
	public void SetUbicacion(String Ubicacion)
	{
		this.Ubicacion=Ubicacion;
	}
	
	public int GetNroMesa()
	{
		return this.NroMesa;
	}
	
	public String GetEstado()
	{
		return this.Estado;
	}
	
	public Cliente GetCliente()
	{
		return this.Cliente;
	}
	
	public Mozo GetMozo()
	{
		return this.Mozo;
	}
	
	public String GetUbicacion()
	{
		return this.Ubicacion;
	}
	
	public int CalcularTotal()
	{
		return this.Servicio.CalcularTotal();
	}
	
	public void ResetServicio()
	{
		this.Servicio.ResetServicio();
	}
	
	public void AgregarPlato(Plato Plato)
	{
		this.Servicio.AgregarPlato(Plato);
	}
	
	public void AgregarBebida(Bebida Bebida)
	{
		this.Servicio.AgregarBebida(Bebida);
	}
	
	public void MostrarServicio()
	{
		System.out.println("Mesa " + this.GetNroMesa());
		System.out.print("Servicios: ");
		this.Servicio.MostrarServicio();
		System.out.println("\n");
	}
}

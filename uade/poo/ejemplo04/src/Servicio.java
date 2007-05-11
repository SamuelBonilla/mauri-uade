
import java.util.Vector;

public class Servicio
{
	private Vector Platos;
	private Vector Bebidas;

	public Servicio()
	{
		Platos = new Vector();
		Bebidas = new Vector();
	}
	
	public void AgregarPlato(Plato Plato)
	{
		this.Platos.add(Plato);
	}
	
	public void AgregarBebida(Bebida Bebida)
	{
		this.Bebidas.add(Bebida);
	}
	
	public int CalcularTotal()
	{
		int Total=0;
		Plato Plato;
		Bebida Bebida;
		
		for(int i=0;i<Platos.size();i++)
		{
			Plato = (Plato) Platos.get(i);
			
			Total+=Plato.GetPrecio();
		}
		
		for(int i=0;i<Bebidas.size();i++)
		{
			Bebida = (Bebida) Bebidas.get(i);
			
			Total+=Bebida.GetPrecio();
		}
		
		return Total;
	}
	
	public void ResetServicio()
	{
		this.Bebidas.removeAllElements();
		this.Platos.removeAllElements();
	}
	
	public void MostrarServicio()
	{
		Plato Plato;
		Bebida Bebida;
		
		for(int i=0;i<Platos.size();i++)
		{
			Plato = (Plato) Platos.get(i);
			
			System.out.print(Plato.GetDescripcion() + " ");
		}
		
		for(int i=0;i<Bebidas.size();i++)
		{
			Bebida = (Bebida) Bebidas.get(i);
			
			System.out.print(Bebida.GetDescripcion() + " ");
		}
	}
}

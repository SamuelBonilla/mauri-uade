

import java.util.Vector;
import java.util.*;

public class Restaurante
{
	private static Restaurante UnicoRestaurante=null;

	private static int CantidadTotalDeMesas=20;
	
	private static Vector Mozos=null;
	private static Vector Clientes=null;
  	private static Vector Platos=null;
  	private static Vector Bebidas=null;
  	private static Vector Mesas=null;
  	private static Vector Reservas=null;
  	private static Vector Pagos=null;
	
  	private Restaurante()
  	{
  		if(Mozos==null)
  		{
  			Mozos = new Vector();
  		}
  		
  		if(Clientes==null)
  		{
  			Clientes = new Vector();
  		}
  		
  		if(Platos==null)
  		{
  			Platos = new Vector();
  		}
  		
  		if(Bebidas==null)
  		{
  			Bebidas = new Vector();
  		}
  		
  		if(Mesas==null)
  		{
  			Mesas = new Vector();
  			GenerarMesas(CantidadTotalDeMesas);
  		}
  		
  		if(Reservas==null)
  		{
  			Reservas = new Vector();
  		}
  		
  		if(Pagos==null)
  		{
  			Pagos = new Vector();
  		}
  	}

  	public static Restaurante CrearRestaurante()
  	{
  		if(UnicoRestaurante==null)
  		{
  			UnicoRestaurante = new Restaurante();
  		}

  		return UnicoRestaurante;
  	}
  	
  	public void IngresarMozo(Mozo Mozo)
  	{
  		Mozos.add(Mozo);
  	}
  	
  	public void ListarMozos()
  	{
  		Mozo Mozo;
  		
  		for(int i=0; i<Mozos.size(); i++)
  		{
  			Mozo= (Mozo) Mozos.get(i);
  			System.out.println(i + " " + Mozo.GetNombre() + " " + Mozo.GetApellido());
  		}
  		System.out.println();
  	}
  	
  	public void IngresarCliente(Cliente Cliente)
  	{
  		Clientes.add(Cliente);
  	}

  	public void ListarClientes()
  	{
  		Cliente Cliente;
  		
  		for(int i=0; i<Clientes.size(); i++)
  		{
  			Cliente= (Cliente) Clientes.get(i);
  			System.out.println(i + " " + Cliente.GetNombre() + " " + Cliente.GetApellido());
  		}
  		System.out.println();
  	}
  	
  	public void IngresarPlato(Plato Plato)
  	{
  		Platos.add(Plato);
  	}

  	public void ListarPlatos()
  	{
  		Plato Plato;
  		
  		for(int i=0; i<Platos.size(); i++)
  		{
  			Plato = (Plato) Platos.get(i);
  			System.out.println(i + " " + Plato.GetDescripcion() + " $" + Plato.GetPrecio());
  		}
  		System.out.println();
  	}
  	
  	public void IngresarBebida(Bebida Bebida)
  	{
  		Bebidas.add(Bebida);
  	}
  	
  	public void ListarBebidas()
  	{
  		Bebida Bebida;
  		
  		for(int i=0; i<Bebidas.size(); i++)
  		{
  			Bebida = (Bebida) Bebidas.get(i);
  			System.out.println(i + " " + Bebida.GetDescripcion() + " $" + Bebida.GetPrecio());
  		}
  		System.out.println();
  	}
  	
  	public int GetCantidadClientes()
  	{
  		return Clientes.size();
  	}
  	
  	public Cliente GetCliente(int PosicionCliente)
  	{
  		return (Cliente) Clientes.get(PosicionCliente);
  	}
  	
  	public int ConsultarNroReserva(int NroReserva)
  	{
  		Reserva Reserva;
  		
  		for(int i=0;i<Reservas.size();i++)
  		{
  			Reserva = (Reserva) Reservas.get(i);
  			
  			if(Reserva.GetNroReserva()==NroReserva)
  			{
  				return 1;
  			}
  		}
  		
  		return 0;
  	}
  	
  	public int ConsultarReservaMesa(Date HorarioReservacion, int NroMesa)
  	{
  		Reserva Reserva;
  		Vector MesasReservadas;
  		Mesa Mesa;
  		
  		for(int i=0;i<Reservas.size();i++)
  		{
  			Reserva = (Reserva) Reservas.get(i);
  			
  			if(Reserva.GetHorarioReservacion()==HorarioReservacion)
  			{
  				MesasReservadas=Reserva.GetMesasReservadas();
  				
  				for(int j=0;i<MesasReservadas.size();i++)
  				{
  					Mesa = (Mesa) MesasReservadas.get(j);
  					
  					if(Mesa.GetNroMesa()==NroMesa)
  					{
  						return 1;
  					}
  				}
  			}
  		}
  		
  		return 0;
  	}
  	
  	public void HacerReserva(Reserva Reserva)
  	{
  		Reservas.add(Reserva);
  	}
  	
  	public void ListarReservas()
  	{
  		Reserva Reserva;
  		
  		for(int i=0;i<Reservas.size();i++)
  		{
  			Reserva = (Reserva) Reservas.get(i);
  			System.out.println(Reserva.GetNroReserva() + " " + Reserva.GetCliente().GetNombre() + " " + Reserva.GetCliente().GetApellido() + " " + Reserva.GetHorarioReservacion().toString());
  			System.out.print("Mesas Reservadas: ");
  			Reserva.MostrarMesasReservadas();
  			System.out.println("\n");
  		}
  	}
  	
  	public int GetCantidadReservas()
  	{
  		return Reservas.size();
  	}
  	
  	public void CancelarReserva(int NroReserva)
  	{
  		int PosicionReserva=-1;
  		Reserva Reserva;

  		for(int i=0;i<Reservas.size();i++)
  		{
  			Reserva = (Reserva) Reservas.get(i);
  			
  			if(Reserva.GetNroReserva()==NroReserva)
  			{
  				PosicionReserva=i;
  			}
  		}
  		
  		if(PosicionReserva!=-1)
  		{
  			Reservas.remove(PosicionReserva);
  		}
  	}
  	
  	private void GenerarMesas(int CantidadMesas)
  	{
  		Mesa Mesa;
  		String Estado="libre";
  		int i;
  		
  		for(i=0;i<CantidadMesas;i++)
  		{
  			Mesa = new Mesa(i, Estado);
  			
  			if(i<(CantidadMesas/2))
  			{
  				Mesa.SetUbicacion("no fumador");
  			}
  			else
  			{
  				Mesa.SetUbicacion("fumador");
  			}
  			
  			Mesas.add(Mesa);
  		}
  	}
  	
  	public int GetCantidadMozos()
  	{
  		return Mozos.size();
  	}
  	
  	public int GetCantidadTotalDeMesas()
  	{
  		return CantidadTotalDeMesas;
  	}
  	
  	public int ConsultarEstadoMesa(int NroMesa)
  	{
  		int i=0;
  		Mesa Mesa;
  		
  		for(i=0;i<Mesas.size();i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);

  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  	  			if(Mesa.GetEstado()=="libre")
  	  			{
  	  				return 0;  // libre
  	  			}
  	  			else
  	  			{
  	  				return 1;  // ocupado
  	  			}
  			}
  		}
  		
  		return 1;
  	}
  	
  	public Mozo GetMozo(int PosicionMozo)
  	{
  		return (Mozo) Mozos.get(PosicionMozo);
  	}
  	
  	public Reserva GetReserva(int NroReserva)
  	{
  		int PosicionReserva=-1;
  		Reserva Reserva;
  		
  		for(int i=0;i<Reservas.size();i++)
  		{
  			Reserva = (Reserva) Reservas.get(i);
  			
  			if(Reserva.GetNroReserva()==NroReserva)
  			{
  				PosicionReserva=i;
  			}
  		}
  		
		return (Reserva) Reservas.get(PosicionReserva);
  	}
  	
  	public void CargarServicio(int NroMesa, Cliente Cliente, Mozo Mozo)
  	{
  		int i;
  		Mesa Mesa;
  		int PosicionMesa=-1;
  		
  		for(i=0;i<Mesas.size();i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  				PosicionMesa=i;
  			}
  		}
  		
  		if(PosicionMesa!=-1)
  		{
  			Mesa = (Mesa) Mesas.get(PosicionMesa);
  			Mesa.SetEstado("ocupado");
  			Mesa.SetCliente(Cliente);
  			Mesa.SetMozo(Mozo);
  		
  			Mesas.remove(PosicionMesa);
  			Mesas.add(Mesa);
  		}
  	}
  	
  	public int GetCantidadServicios()
  	{
  		int cantidad=0;
  		Mesa Mesa;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetEstado()=="ocupado")
  			{
  				cantidad++;
  			}
  		}
  		
  		return cantidad;
  	}
  	
  	public void ListarMesasAbiertas()
  	{
  		Mesa Mesa;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetEstado()=="ocupado")
  			{
  				System.out.println("Mesa " + Mesa.GetNroMesa());
  			}
  		}
  		System.out.println("");
  	}
  	
  	public int CalcularTotal(int NroMesa)
  	{
  		int Total=0;
  		Mesa Mesa;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  				Total=Mesa.CalcularTotal();
  			}
  		}
  		
  		return Total;
  	}
  	
  	public Cliente GetClienteDesdeMesa(int NroMesa)
  	{
  		Mesa Mesa;
  		Cliente Cliente=null;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  				Cliente=Mesa.GetCliente();
  			}
  		}

  		return Cliente;
  	}
  	
  	public void CerrarMesa(int NroMesa)
  	{
  		Mesa Mesa;
  		int PosicionMesa=-1;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  				PosicionMesa=i;
  			}
  		}

  		if(PosicionMesa!=-1)
  		{
  			Mesa = (Mesa) Mesas.get(PosicionMesa);
  			
  			Mesa.SetEstado("libre");
  			Mesa.ResetServicio();
  				
  			Mesas.remove(PosicionMesa);
  			Mesas.add(Mesa);
  		}
  	}
  	
  	public void GenerarPago(String TipoPago, int Total, Cliente Cliente)
  	{
  		Pago Pago;
  		int NroPago;
  		
  		NroPago=Pagos.size();
  		Pago = new Pago(NroPago, TipoPago, Total, Cliente);
  		Pagos.add(Pago);
  	}
  	
  	public void MostrarUltimoPago()
  	{
  		int i;
  		Pago Pago;
  		Cliente Cliente;
  		
  		i=Pagos.size();
  		if(i!=0)
  		{
  			Pago = (Pago) Pagos.get(i-1);
  			Cliente=Pago.GetCliente();
  			System.out.println("NroPago: " + Pago.GetNroPago() + " Tipo de Pago: " + Pago.GetTipoPago());
  			System.out.println("Total: " + Pago.GetTotal() + " Cliente: " + Cliente.GetNombre() + " " + Cliente.GetApellido());
  			System.out.println("");
  		}
  	}
  	
  	public int GetCantidadPlatos()
  	{
  		return Platos.size();
  	}
  	
  	public void AgregarPlatoAMesa(int PosicionPlato, int NroMesa)
  	{
  		Plato Plato;
  		int PosicionMesa=-1;
  		Mesa Mesa;
  		
  		Plato = (Plato) Platos.get(PosicionPlato);
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  				PosicionMesa=i;
  			}
  		}
  		
  		if(PosicionMesa!=-1)
  		{
  			Mesa = (Mesa) Mesas.get(PosicionMesa);
  			
  			Mesa.AgregarPlato(Plato);
  			Mesas.remove(PosicionMesa);
  			Mesas.add(Mesa);
  		}
  	}
  	
  	public int GetCantidadBebidas()
  	{
  		return Bebidas.size();
  	}

  	public void AgregarBebidaAMesa(int PosicionBebida, int NroMesa)
  	{
  		Bebida Bebida;
  		int PosicionMesa=-1;
  		Mesa Mesa;
  		
  		Bebida = (Bebida) Bebidas.get(PosicionBebida);
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetNroMesa()==NroMesa)
  			{
  				PosicionMesa=i;
  			}
  		}
  		
  		if(PosicionMesa!=-1)
  		{
  			Mesa = (Mesa) Mesas.get(PosicionMesa);
  			
  			Mesa.AgregarBebida(Bebida);
  			Mesas.remove(PosicionMesa);
  			Mesas.add(Mesa);
  		}
  	}
  	
  	public void ListarEstadoDeMesas()
  	{
  		Mesa Mesa;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			System.out.println("Mesa " + Mesa.GetNroMesa() + " Estado: " + Mesa.GetEstado());
  		}
  		System.out.println("");
  	}
  	
  	public void ListarServicios()
  	{
  		Mesa Mesa;
  		
  		for(int i=0;i<CantidadTotalDeMesas;i++)
  		{
  			Mesa = (Mesa) Mesas.get(i);
  			
  			if(Mesa.GetEstado()=="ocupado")
  			{
  				Mesa.MostrarServicio();
  			}
  		}
  	}
}

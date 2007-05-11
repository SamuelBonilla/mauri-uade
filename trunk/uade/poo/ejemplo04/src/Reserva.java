
import java.util.*;

public class Reserva
{
	private int NroReserva;
	private Cliente Cliente;
	private Vector MesasReservadas;
	private Date HorarioReservacion;

	public Reserva(int NroReserva, Cliente Cliente, Vector MesasReservadas, Date HorarioReservacion)
	{
		this.NroReserva=NroReserva;
		this.Cliente=Cliente;
		this.MesasReservadas=MesasReservadas;
		this.HorarioReservacion=HorarioReservacion;
	}

	public int GetNroReserva()
	{
		return NroReserva;
	}
	
	public Cliente GetCliente()
	{
		return this.Cliente;
	}
	
	public Vector GetMesasReservadas()
	{
		return this.MesasReservadas;
	}
	
	public Date GetHorarioReservacion()
	{
		return this.HorarioReservacion;
	}
	
	public void MostrarMesasReservadas()
	{
		Mesa Mesa;
		
		for(int i=0;i<this.MesasReservadas.size();i++)
		{
			Mesa = (Mesa) this.MesasReservadas.get(i);
			
			System.out.print(Mesa.GetNroMesa()+ " ");
		}
	}
}

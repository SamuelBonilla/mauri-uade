

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Vector;
import java.util.*;
import java.text.*;

public class RestauranteMain
{
	private static Restaurante UnicoRestaurante=null;
	
	public static void main(String[] args) throws Exception
  	{
		UnicoRestaurante = Restaurante.CrearRestaurante();
		menu();
  	}
  	
	public static void menu() throws Exception
  	{
  		int opcion;
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		do
  		{
  			System.out.println("Menu Principal de Restaurante\n");
  			System.out.println("0 Salir");

  			System.out.println("1 Ingresar nuevo Mozo");
  			System.out.println("2 Listar Mozos");
  			
  			System.out.println("3 Ingresar nuevo Cliente");
  			System.out.println("4 Listar Clientes");
  			
  			System.out.println("5 Ingresar nuevo Plato");
  			System.out.println("6 Listar Platos");
  			
  			System.out.println("7 Ingresar nueva Bebida");
  			System.out.println("8 Listar Bebidas");

  			System.out.println("9 Hacer Reserva");
  			System.out.println("10 Listar Reservas");
  			System.out.println("11 Cancelar Reserva");
  			
  			System.out.println("12 Cargar Servicio");
  			System.out.println("13 Listar Servicios en curso");
  			System.out.println("14 Cerrar Servicio y cobrar");
  			
  			System.out.println("15 Agregar Plato a Mesa");
  			System.out.println("16 Agregar Bebida a Mesa");
  			
  			System.out.println("17 Listar Estado de las Mesas\n");
  			
  			System.out.print("Ingrese la opcion deseada: ");
  			opcion = Integer.parseInt(keyboardInput.readLine());
  			LimpiarPantalla();
    	
  			switch(opcion)
  			{
  			case 1:	{
    					IngresarMozo();
    					break;
    				}
    		
    		case 2: {
    					ListarMozos();
    					break;
    				}
    		
    		case 3: {
    					IngresarCliente();
    					break;
    				}
    		
    		case 4: {
    					ListarClientes();
    					break;
    				}
    		
    		case 5: {
    					IngresarPlato();
    					break;
    				}
    		
    		case 6: {
    					ListarPlatos();
    					break;
    				}
    		
    		case 7: {
    					IngresarBebida();
    					break;
    				}
    		
    		case 8: {
    					ListarBebidas();
    					break;
    				}
    		
    		case 9: {
    					HacerReserva();
    					break;
    				}
    		
    		case 10: {
    					ListarReservas();
    					break;
    				 }
    		
    		case 11: {
    					CancelarReserva();
    					break;
    				 }
    		
    		case 12: {
    					CargarServicio();
    					break;
    				 }
    		
    		case 13: {
    					ListarServicios();
    					break;
    		  		 }
    		
    		case 14: {
    					CerrarServicioYCobrar();
    					break;
    		         }
    		
    		case 15: {
    					AgregarPlatoAMesa();
    					break;
    		 		 }
    		
    		case 16: {
    					AgregarBebidaAMesa();
    					break;
    				 }
    		
    		case 17: {
    					ListarEstadoDeMesas();
    					break;
    				 }
  			}
  		}
  		while(opcion!=0);
  		
  		System.exit(0);
  	}
  	
  	public static void IngresarMozo() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		String Nombre;
  		String Apellido;
  		String Direccion;
  		int Numero;
  		int Telefono;
  		Mozo Mozo;
  		
  		System.out.println("\nIngresando nuevo Mozo:\n");
  		
  		System.out.print("Ingrese Nombre: ");
  		Nombre=keyboardInput.readLine();

  		System.out.print("Ingrese Apellido: ");
  		Apellido=keyboardInput.readLine();
  		
  		System.out.print("Ingrese Direccion: ");
  		Direccion=keyboardInput.readLine();

  		System.out.print("Ingrese Numero: ");
  		Numero=Integer.parseInt(keyboardInput.readLine());
  		
  		System.out.print("Ingrese Telefono: ");
  		Telefono=Integer.parseInt(keyboardInput.readLine());
  		
  		Mozo=new Mozo(Nombre, Apellido, Direccion, Numero, Telefono);
  		UnicoRestaurante.IngresarMozo(Mozo);
  		System.out.println("\nMozo agregado\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void ListarMozos() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nMozos:\n");
  		UnicoRestaurante.ListarMozos();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void IngresarCliente() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		String Nombre;
  		String Apellido;
  		String Direccion;
  		int Numero;
  		int Telefono;
  		Cliente Cliente;
   		
  		System.out.println("\nIngresando nuevo Cliente:\n");
  		
  		System.out.print("Ingrese Nombre: ");
  		Nombre=keyboardInput.readLine();
  		
  		System.out.print("Ingrese Apellido: ");
  		Apellido=keyboardInput.readLine();
  		
  		System.out.print("Ingrese Direccion: ");
  		Direccion=keyboardInput.readLine();
  		
  		System.out.print("Ingrese Numero: ");
  		Numero=Integer.parseInt(keyboardInput.readLine());

  		System.out.print("Ingrese Telefono: ");
  		Telefono=Integer.parseInt(keyboardInput.readLine());
  		
  		Cliente = new Cliente(Nombre, Apellido, Direccion, Numero, Telefono);
  		UnicoRestaurante.IngresarCliente(Cliente);
  		System.out.println("\nCliente agregado\nPresione una tecla");
  		keyboardInput.readLine();
  	}

  	public static void ListarClientes() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nClientes:\n");
  		UnicoRestaurante.ListarClientes();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}

  	public static void IngresarPlato() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		String Descripcion;
  		int Precio;
  		String Tipo;
  		Plato Plato;
  		
  		System.out.println("\nIngresando nuevo Plato:\n");
  		
  		System.out.print("Ingrese Descripcion: ");
  		Descripcion=keyboardInput.readLine();

  		System.out.print("Ingrese Precio: ");
  		Precio=Integer.parseInt(keyboardInput.readLine());
  		
  		System.out.print("Ingrese Tipo de Plato: ");
  		Tipo=keyboardInput.readLine();
  		
  		Plato = new Plato(Descripcion, Precio, Tipo);
  		UnicoRestaurante.IngresarPlato(Plato);
  		System.out.println("\nPlato agregado\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void ListarPlatos() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nPlatos:\n");
  		UnicoRestaurante.ListarPlatos();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void IngresarBebida() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		String Descripcion;
  		int Precio;
  		String Tipo;
  		Bebida Bebida;
  		
  		System.out.println("\nIngresando nueva Bebida:\n");
  		
  		System.out.print("Ingrese Descripcion: ");
  		Descripcion=keyboardInput.readLine();

  		System.out.print("Ingrese Precio: ");
  		Precio=Integer.parseInt(keyboardInput.readLine());
  		
  		System.out.print("Ingrese Tipo de Bebida: ");
  		Tipo=keyboardInput.readLine();
  		
  		Bebida = new Bebida(Descripcion, Precio, Tipo);
  		UnicoRestaurante.IngresarBebida(Bebida);
  		System.out.println("\nBebida agregada\nPresione una tecla");
  		keyboardInput.readLine();
   	}
  	
  	public static void ListarBebidas() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nBebidas:\n");
  		UnicoRestaurante.ListarBebidas();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void HacerReserva() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		int NroReserva;
  		int PosicionCliente;
  		Cliente Cliente;
  		Date HorarioReservacion;
  		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy hh");
  		String opcion;
  		int error;
  		Mesa Mesa;
  		Vector MesasReservadas;
  		int NroMesa;
  		Reserva Reserva;
  		
  		if(UnicoRestaurante.GetCantidadClientes()==0)
  		{
  			System.out.println("\nAntes de hacer una Reserva ingrese algun Cliente\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nIngresando nueva Reserva:\n");
  		
  		System.out.print("Ingrese Nro de Reserva: ");
  		NroReserva=Integer.parseInt(keyboardInput.readLine());
  		if(UnicoRestaurante.ConsultarNroReserva(NroReserva)==1)
  		{
  	  		System.out.println("\nLa Reserva ya existe\nPresione una tecla");
  	  		keyboardInput.readLine();
  	  		return;
  	  	}
  		
  		System.out.println("\nClientes: ");
  		UnicoRestaurante.ListarClientes();
  		System.out.print("Ingrese numero de Cliente que hace la Reserva: ");
  		PosicionCliente=Integer.parseInt(keyboardInput.readLine());
  		if((PosicionCliente>=0)&&(PosicionCliente<(UnicoRestaurante.GetCantidadClientes())))
  		{
  			Cliente=UnicoRestaurante.GetCliente(PosicionCliente);
  		}
  		else
  		{
  			System.out.println("\nEl Cliente no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.print("Ingrese Horario de Reservacion (dd-MM-yy hh): ");
  		HorarioReservacion=formato.parse(keyboardInput.readLine());
  		
  		MesasReservadas = new Vector();
  		opcion="s";
  		while(opcion=="s")
  		{
  	 		error=0;
  	  		System.out.print("\nIngrese Nro de Mesa a Reservar: ");
  	  		NroMesa=Integer.parseInt(keyboardInput.readLine());
  	  		if((NroMesa<0)||(NroMesa>=UnicoRestaurante.GetCantidadTotalDeMesas()))
  	  		{
  	  			System.out.println("La Mesa no existe\n");
  	  			error=1;
  	  		}
  	  		if(UnicoRestaurante.ConsultarReservaMesa(HorarioReservacion, NroMesa)==1)
  	  		{
  	  			System.out.println("La Mesa ya esta Reservada\n");
  	  			error=1;
  	  		}

  	  		if(error==0)
  	  		{
  	  			Mesa = new Mesa(NroMesa, "");
  	  			MesasReservadas.add(Mesa);
  	  		}
  	  		
  	  		System.out.print("Desea Reservar otra mesa? (s/n): ");
  	  		opcion=keyboardInput.readLine();
  		}
 
  		if(MesasReservadas.size()>0)
  		{
  	  		Reserva = new Reserva(NroReserva, Cliente, MesasReservadas, HorarioReservacion);
  	  		UnicoRestaurante.HacerReserva(Reserva);
  	  		System.out.println("\nReserva hecha\nPresione una tecla");
  	  		keyboardInput.readLine();
  		}
  		else
  		{
  	  		System.out.println("\nReserva no hecha\nPresione una tecla");
  	  		keyboardInput.readLine();
  	  		return;
  		}
  	}
  	
  	public static void ListarReservas() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nReservas:\n");
  		UnicoRestaurante.ListarReservas();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void CancelarReserva() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		int NroReserva;
  		
  		if(UnicoRestaurante.GetCantidadReservas()==0)
  		{
  			System.out.println("\nAntes de Cancelar una Reserva ingrese una\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nCancelar Reserva:\n");
  		UnicoRestaurante.ListarReservas();
  		System.out.print("Ingrese numero de Reserva a Cancelar: ");
  		NroReserva=Integer.parseInt(keyboardInput.readLine());
  		if(UnicoRestaurante.ConsultarNroReserva(NroReserva)==0)
  		{
  			System.out.println("\nLa Reserva no existe\nPresione cualquier tecla");
  			keyboardInput.readLine();
  			return;
  		}

  		UnicoRestaurante.CancelarReserva(NroReserva);
  		System.out.println("\nReserva Cancelada\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void CargarServicio() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		int NroReserva;
  		int PosicionMozo;
  		Reserva Reserva;
  		Mozo Mozo;
  		Cliente Cliente;
  		Vector MesasReservadas;
  		Mesa Mesa;
  		int error;
  		int NroMesa;
  		
  		if(UnicoRestaurante.GetCantidadClientes()==0)
  		{
  			System.out.println("\nAntes de cargar un Servicio ingrese algun Cliente\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}

  		if(UnicoRestaurante.GetCantidadMozos()==0)
  		{
  			System.out.println("\nAntes de cargar un Servicio ingrese algun Mozo\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		if(UnicoRestaurante.GetCantidadReservas()==0)
  		{
  			System.out.println("\nAntes de cargar un Servicio ingrese alguna Reserva\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nCargando Servicio desde Reserva:\n");
  		UnicoRestaurante.ListarReservas();
  		System.out.print("Ingrese Nro de Reserva a Cargar como Servicio: ");
  		NroReserva=Integer.parseInt(keyboardInput.readLine());
  		if(UnicoRestaurante.ConsultarNroReserva(NroReserva)==0)
  		{
  			System.out.println("\nLa Reserva no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nMozos: ");
  		UnicoRestaurante.ListarMozos();
  		System.out.print("Ingrese Mozo que atendera el Servicio: ");
  		PosicionMozo=Integer.parseInt(keyboardInput.readLine());
  		if((PosicionMozo<0)&&(PosicionMozo>=(UnicoRestaurante.GetCantidadMozos())))
  		{
  			System.out.println("\nEl Mozo no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		Mozo = UnicoRestaurante.GetMozo(PosicionMozo);
  		
  		Reserva = UnicoRestaurante.GetReserva(NroReserva);
  		Cliente=Reserva.GetCliente();
  		MesasReservadas = Reserva.GetMesasReservadas();
  		
  		error=0;
  		for(int i=0;i<MesasReservadas.size();i++)
  		{
  			Mesa = (Mesa) MesasReservadas.get(i);
  			NroMesa=Mesa.GetNroMesa();
  			
  			if(UnicoRestaurante.ConsultarEstadoMesa(NroMesa)==1)
  			{
  				error=1;
  			}
  		}
  		if(error==1)
  		{
  			System.out.println("\nNo se puede cargar el Servicio, Mesa(s) ocupada(s)\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		for(int i=0;i<MesasReservadas.size();i++)
  		{
  			Mesa = (Mesa) MesasReservadas.get(i);
  			NroMesa=Mesa.GetNroMesa();
  			
  			UnicoRestaurante.CargarServicio(NroMesa, Cliente, Mozo);
  		}
  		
  		UnicoRestaurante.CancelarReserva(NroReserva);
  		System.out.println("\nServicio Cargado\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void ListarServicios() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nServicios:\n");
  		UnicoRestaurante.ListarServicios();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void CerrarServicioYCobrar() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		int NroMesa;
  		int Total;
  		String TipoPago;
  		Cliente Cliente;
  		
  		if(UnicoRestaurante.GetCantidadServicios()==0)
  		{
  			System.out.println("\nAntes de Cerrar un Servicio abra uno\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nCerrar Servicio y Cobrar:\n");
  		UnicoRestaurante.ListarMesasAbiertas();
  		System.out.print("Ingrese Mesa a Cerrar: ");
  		NroMesa=Integer.parseInt(keyboardInput.readLine());
  		if((NroMesa<0)||(NroMesa>=(UnicoRestaurante.GetCantidadTotalDeMesas())))
  		{
  			System.out.println("\nLa Mesa no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		if(UnicoRestaurante.ConsultarEstadoMesa(NroMesa)==0)
  		{
  			System.out.println("\nLa Mesa no fue abierta\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.print("Ingrese Tipo de Pago: ");
  		TipoPago=keyboardInput.readLine();

  		Total=UnicoRestaurante.CalcularTotal(NroMesa);
  		Cliente=UnicoRestaurante.GetClienteDesdeMesa(NroMesa);
  		UnicoRestaurante.CerrarMesa(NroMesa);
  		UnicoRestaurante.GenerarPago(TipoPago, Total, Cliente);

  		UnicoRestaurante.MostrarUltimoPago();
  		System.out.println("\nServicio Cerrado y Pago generado\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void AgregarPlatoAMesa() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		int PosicionPlato;
  		int NroMesa;
  		
  		if(UnicoRestaurante.GetCantidadPlatos()==0)
  		{
  			System.out.println("\nAntes de Agregar un Plato a una Mesa, ingrese un Plato\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nAgregar Plato a Mesa:\n");
  		UnicoRestaurante.ListarPlatos();
  		System.out.print("Ingrese Plato a cargar: ");
  		PosicionPlato=Integer.parseInt(keyboardInput.readLine());
  		if((PosicionPlato<0)||(PosicionPlato>=UnicoRestaurante.GetCantidadPlatos()))
  		{
  			System.out.println("\nEl Plato no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nMesas: ");
  		UnicoRestaurante.ListarMesasAbiertas();
  		System.out.print("Ingrese Mesa a cargarle el Plato: ");
  		NroMesa=Integer.parseInt(keyboardInput.readLine());
  		if((NroMesa<0)||(NroMesa>=UnicoRestaurante.GetCantidadTotalDeMesas()))
  		{
  			System.out.println("\nLa Mesa no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		if(UnicoRestaurante.ConsultarEstadoMesa(NroMesa)==0)
  		{
  			System.out.println("\nLa Mesa no fue abierta\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		UnicoRestaurante.AgregarPlatoAMesa(PosicionPlato, NroMesa);
  		System.out.println("\nPlato Agregado\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void AgregarBebidaAMesa() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		int PosicionBebida;
  		int NroMesa;
  		
  		if(UnicoRestaurante.GetCantidadBebidas()==0)
  		{
  			System.out.println("\nAntes de Agregar una Bebida a una Mesa, ingrese una Bebida\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nAgregar Bebida a Mesa:\n");
  		UnicoRestaurante.ListarBebidas();
  		System.out.print("Ingrese Bebida a cargar: ");
  		PosicionBebida=Integer.parseInt(keyboardInput.readLine());
  		if((PosicionBebida<0)||(PosicionBebida>=UnicoRestaurante.GetCantidadBebidas()))
  		{
  			System.out.println("\nLa Bebida no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		System.out.println("\nMesas: ");
  		UnicoRestaurante.ListarMesasAbiertas();
  		System.out.print("Ingrese Mesa a cargarle la Bebida: ");
  		NroMesa=Integer.parseInt(keyboardInput.readLine());
  		if((NroMesa<0)||(NroMesa>=UnicoRestaurante.GetCantidadTotalDeMesas()))
  		{
  			System.out.println("\nLa Mesa no existe\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		if(UnicoRestaurante.ConsultarEstadoMesa(NroMesa)==0)
  		{
  			System.out.println("\nLa Mesa no fue abierta\nPresione una tecla");
  			keyboardInput.readLine();
  			return;
  		}
  		
  		UnicoRestaurante.AgregarBebidaAMesa(PosicionBebida, NroMesa);
  		System.out.println("\nBebida Agregada\nPresione una tecla");
  		keyboardInput.readLine();
  	}
  	
  	public static void ListarEstadoDeMesas() throws Exception
  	{
  		BufferedReader keyboardInput;
  		keyboardInput= new BufferedReader(new InputStreamReader(System.in));
  		
  		System.out.println("\nEstado de Mesas:\n");
  		UnicoRestaurante.ListarEstadoDeMesas();
  		System.out.println("Presione una tecla");
  		keyboardInput.readLine();
  	}
  
  	public static void LimpiarPantalla()
  	{
  		for(int i=0; i<26; i++)
  		{
  			System.out.println("");
  		}
  	}
}

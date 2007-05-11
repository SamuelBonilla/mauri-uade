import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MainAgencia 
{
	private Agencia agencia;
	private Sistema sistema;
	private Usuario usuarioActual;
	
	public MainAgencia() {
		super();
		agencia = new Agencia();
		sistema = new Sistema();
		usuarioActual = new Usuario("","","");
	}

	public static void main(java.lang.String[] args)	{
	MainAgencia main = new MainAgencia();
	main.mostrarLogin();
	}
	
	public void mostrarLogin()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		//Imprimo menu Login
		System.out.println("AGENCIA DE VIAJES");
		System.out.println("-------------------------------------------------------");
		System.out.println("En caso de ser un usuario no registrado ingrese NUEVO");
		System.out.print("Usuario: ");
		
		try
		{
			String usuario  = (String) reader.readLine();
			if (usuario.equalsIgnoreCase("NUEVO"))
				registrarUsuario();
			else
			{
				System.out.print("Password: ");
				String password = (String) reader.readLine();
			
				int usuarioOk = agencia.validarLogin(usuario,password);
				if (usuarioOk == 0) {
					Usuario u = this.agencia.getUsuario(usuario);
					this.sistema.setUsuarioActual(u);
					this.setUsuarioActual(u);					
					mostrarMenu();
				}
				else
					System.out.println("Error en el login. Por favor, intentelo nuevamente");
		  			mostrarLogin();
			}
		}
		catch (Exception e)
		{
		}

		
	}
	
	public void registrarUsuario()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 	
		//Imprimo menu Login
		System.out.println("Ingreso de nuevos usuarios");
		System.out.println("-------------------------------------------------------");
		System.out.print("Usuario:");
		try
		{
			String usuario  = (String) reader.readLine();
			System.out.print("Password: ");
			String password = (String) reader.readLine();
			System.out.print("DNI: ");
			String dni = (String) reader.readLine();
			this.agencia.registrarUsuario(usuario, password,dni);
			Usuario u = this.agencia.getUsuario(usuario);
			this.setUsuarioActual(u);
			this.sistema.setUsuarioActual(u);
			mostrarMenu();
		}
		catch (Exception e)
		{
		}

		
	}

	public void setUsuarioActual(Usuario u) {
		this.usuarioActual=u;
	}
		
	public void mostrarMenu() 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 	
		//Imprimo menu de opciones
		System.out.println("MENU DE OPCIONES");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.- Reservar vuelo");
		System.out.println("2.- Reservar alojamiento");
		System.out.println("3.- Reservar paquete");
		System.out.println("4.- Confirmar reserva");
		System.out.println("5.- Listar reservas realizadas");
		System.out.println("6.- Listar compras realizadas");
		System.out.println("7.- Salir");
		System.out.println("-------------------------------------------------------");
		System.out.print("Opcion:");
		try
		{
			char s = (char)reader.read();
			
		  	switch (s)
		  	{
			  	case '1' : this.reservarVuelo();
			  	case '2' : this.reservarAlojamiento();
			  	case '3' : this.reservarPaquete();
			  	case '4' : this.confirmarReserva();
			  	case '5' : this.listarReservas();
			  	case '6' : this.listarCompras();
			  	case '7' : this.salir();
		  	}
		}
		catch (Exception e)
		{
			this.mostrarMenu();
		}

	}

	public void salir() 
	{
		System.exit(0);
	}
	
	public void reservarVuelo()
	{
		Vector vuelos= this.agencia.getTransporte();
		Item compra = this.sistema.comprarPasaje(vuelos);
		this.agencia.agregarCompra(compra);	
		this.mostrarMenu();
	}
	
	public void reservarAlojamiento() 
	{		
		Vector aloj = this.agencia.getAlojamiento();
		Item compra = this.sistema.reservarAlojamiento(aloj);
		this.agencia.agregarCompra(compra);
		this.mostrarMenu();
	}
	
	public void reservarPaquete() 
	{	
		Vector paquetes = this.agencia.getPaquetes();
		Paquete paquete = this.sistema.reservarPaquete(paquetes);
		if (paquete != null) {
			Vector productos = paquete.getProductos();
			for (int i=0 ; i< productos.size(); i++) {
				Producto p = (Producto) productos.elementAt(i);		
				Item compra = new Item(p,this.usuarioActual);
				this.agencia.agregarCompra(compra);
				}
			}
		else {
			System.out.println("No selecciono ningun paquete");
		}
	this.mostrarMenu();
	}
	
	public void confirmarReserva() 
	{
		Vector compras= this.agencia.getCompras();
		this.sistema.pagarReservas(this.usuarioActual, compras);
		this.mostrarMenu();		
	}
	
	
	public void listarReservas()
	{
		Vector compras= this.agencia.getCompras();
		this.sistema.imprimirReservas(this.usuarioActual, compras);
		this.mostrarMenu();
	}


	public void listarCompras ()
	{
		Vector compras= this.agencia.getCompras();
		this.sistema.imprimirCompras(this.usuarioActual, compras);
		this.mostrarMenu();
	}

}

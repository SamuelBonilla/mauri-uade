import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.io.IOException;
public class Agencia 
{
	private Vector vec_alojamiento;
	private Vector vec_transporte;
	private Vector vec_usuarios;
	private Vector vec_paquetes;
	private Vector compras;
	

	public Agencia ()
	{
		vec_alojamiento = new Vector();
		vec_transporte = new Vector();
		vec_usuarios = new Vector();
		vec_paquetes = new Vector();
		compras = new Vector();
		this.cargaInicial();
	}
	public Vector getCompras() {
		return this.compras;
	}
	@SuppressWarnings("deprecation")
	
	public void cargarPaquetes() {
		try	{
			FileInputStream fileIn = new FileInputStream("../TP-POO/datos/paquetes.txt");
			DataInputStream data = new DataInputStream(fileIn);
			String linea;
			
			linea = data.readLine();
			while (!linea.equalsIgnoreCase("FIN"))
			{				  
				  // cargo el Vuelo
				  Paquete p = new Paquete();
				  String origen = data.readLine();
				  String destino = data.readLine();
				  String empresa = data.readLine();
				  String fechaPartida = data.readLine();
				  String fechaLlegada = data.readLine();
				  String tipo= data.readLine();
				  String strPrecio = data.readLine();
				  float precio = Float.parseFloat(strPrecio);
				  String strDispo = data.readLine();
				  int dispo = Integer.parseInt(strDispo);		  
				  Vuelo v = new Vuelo(origen,destino,empresa,fechaPartida,fechaLlegada,tipo,precio,dispo);
				  //agrego el transporte al paquete
				  p.agregarProducto(v);
				  
				  linea = data.readLine();
				  // cargo el alojamiento
				  String nombre = data.readLine();
				  String ciudad = data.readLine();
				  String direccion = data.readLine();
				  String tipoa = data.readLine();
				  String strprecio = data.readLine();
				  float precioa = Float.parseFloat(strprecio);
				  String strdispo = data.readLine();
				  int dispoa = Integer.parseInt(strdispo);			  
				  Alojamiento a = new Alojamiento(nombre,dispoa,ciudad,direccion,tipoa,precioa);
				  // agrego alojamiento al paquete
				  p.agregarProducto(a);
				  linea = data.readLine();				  
				  this.agregarPaquete(p);
			  }
		  }
		catch (IndexOutOfBoundsException e){
				System.out.print("La opcion elegida no es valida");
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
				e.printStackTrace();
			} 
	}
	
	@SuppressWarnings("deprecation")
	public void cargarVuelos() {
		try
		  {
			  FileInputStream fileIn = new FileInputStream("../TP-POO/datos/vuelos.txt");
			  DataInputStream data = new DataInputStream(fileIn);
			  String linea;
			  
			  linea = data.readLine();
			  while (!linea.equalsIgnoreCase("FIN"))
			  {				  
				  String origen = data.readLine();
				  String destino = data.readLine();
				  String empresa = data.readLine();
				  String fechaPartida = data.readLine();
				  String fechaLlegada = data.readLine();
				  String tipo= data.readLine();
				  String strPrecio = data.readLine();
				  float precio = Float.parseFloat(strPrecio);
				  String strDispo = data.readLine();
				  int dispo = Integer.parseInt(strDispo);		  
				  Vuelo a = new Vuelo(origen,destino,empresa,fechaPartida,fechaLlegada,tipo,precio,dispo); 
				  vec_transporte.add(a);	
				  linea = data.readLine();
			  }
		  }
		catch (IndexOutOfBoundsException e){
				System.out.print("La opcion elegida no es valida");
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
				e.printStackTrace();
			} 
	}
	@SuppressWarnings("deprecation")
	public void cargarAlojamiento() {
	try
	  {
		  FileInputStream fileIn = new FileInputStream("../TP-POO/datos/aloj.txt");
		  DataInputStream data = new DataInputStream(fileIn);
		  String linea;
		  
		  linea = data.readLine();
		  //Cargo Transportes
		  while (!linea.equalsIgnoreCase("FIN"))
		  {				  
			  String nombre = data.readLine();
			  String ciudad = data.readLine();
			  String direccion = data.readLine();
			  String tipo = data.readLine();
			  String strprecio = data.readLine();
			  float precio = Float.parseFloat(strprecio);
			  String strdispo = data.readLine();
			  int dispo = Integer.parseInt(strdispo);			  
			  Alojamiento a = new Alojamiento(nombre,dispo,ciudad,direccion,tipo,precio);
			  vec_alojamiento.add(a);	
			  linea = data.readLine();
		  }
	  }
	catch (IndexOutOfBoundsException e){
		System.out.print("La opcion elegida no es valida");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} 
}
	
	@SuppressWarnings("deprecation")		
	public void cargarUsuarios() {
		try
		  {
			  FileInputStream fileIn = new FileInputStream("../TP-POO/datos/usuarios.txt");
			  DataInputStream data = new DataInputStream(fileIn);
			  String linea;
			  
			  linea = data.readLine();
			  while (!linea.equalsIgnoreCase("FIN"))
			  {				  
				  String nombre = data.readLine();
				  String password = data.readLine();				  
				  String dni = data.readLine();
				  
				  Usuario a = new Usuario(nombre,password,dni);
				  vec_usuarios.add(a);	
				  linea = data.readLine();
			  }
		  }
		catch (IndexOutOfBoundsException e){
			System.out.print("La opcion elegida no es valida");
		} 
		catch (FileNotFoundException e) {
			System.out.print("Archivo No Encontrado");
		} 
		catch (IOException e) {
			System.out.print("Archivo No Encontrado");
		}
	}

	
	public void cargaInicial () {
		this.cargarUsuarios();
		this.cargarAlojamiento();
		this.cargarVuelos();
		this.cargarPaquetes();
	}

	
	public int validarLogin (String usu,String pass)
	{
		boolean existe = false;
		int i= 0;
		while (!existe && i < vec_usuarios.size())
		{
			Usuario u = (Usuario) vec_usuarios.elementAt(i);
			if (u.getUsername().equalsIgnoreCase(usu)&& u.getPassword().equalsIgnoreCase(pass))
			{
				existe = true;
			}
			i++;			
		}
		if (existe)
			return 0;
		else
			return 1;
	}
	
	public void registrarUsuario(String u,String p,String dni)
	{
		Usuario usuario = new Usuario (u,p,dni);
		vec_usuarios.add(usuario);
	}
	
	public Vector getTransporte() {
		return this.vec_transporte;
	}
	
	public Vector getAlojamiento() {
		return this.vec_alojamiento;
	}
	public Vector getUsuarios() {
		return this.vec_usuarios;
	}
	public Vector getPaquetes() {
		return this.vec_paquetes;
	}

	public Usuario getUsuario(String username) { 
		for (int i=0; i < this.vec_usuarios.size(); i++) {
			Usuario u = (Usuario) this.vec_usuarios.elementAt(i);
			if (username.equalsIgnoreCase(u.getUsername())){  
				return u;
			}					
		}
		return null;
	}
	
	public void agregarPaquete(Paquete p) {
		this.vec_paquetes.add(p);
	}
	
	public void agregarCompra(Item compra) {
		this.compras.add(compra);
	}
	public Paquete buscarPaquete(int indice) {
		return (Paquete)this.vec_paquetes.elementAt(indice);
	}
}

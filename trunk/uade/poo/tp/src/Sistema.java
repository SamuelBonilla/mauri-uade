import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

public class Sistema {
	Vector usuarios;
	Vector alojamientos;
	Vector vuelos;
	Vector vAux;
	Usuario usuarioActual;
	static Sistema s;

	private Sistema(){
		super();
		usuarios = new Vector();
		alojamientos = new Vector();
		vuelos = new Vector();
		vAux = new Vector();
		usuarioActual=null;
		s = this;
	}

	public static Sistema crearSistema(){
	if (s==null)
		s = new Sistema();
	return s;
	}
	
	public Vector getAlojamientos() {
		return alojamientos;
	}
	public void setAlojamientos(Vector alojamientos) {
		this.alojamientos = alojamientos;
	}
	public Vector getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Vector usuarios) {
		this.usuarios = usuarios;
	}
	public Vector getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vector vuelos) {
		this.vuelos = vuelos;
	}
	public void setUsuarioActual(Usuario u) {
		this.usuarioActual=u;
	}
	public Usuario getUsuarioActual() {
		return this.usuarioActual;
	}
	
	
	public Item comprarPasaje(Vector vuelos) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese el origen: ");
			String strOrigen = (String) reader.readLine(); 
			System.out.println("Ingrese Destino: ");		
			String strDestino = (String) reader.readLine();
			
			// muestro los vuelos q cohinciden en origen/destino
			vAux.clear();
			for (int i=0; i < vuelos.size(); i++){
				Vuelo oVuelo = (Vuelo)vuelos.elementAt(i);
				if ((oVuelo.getDestino().equalsIgnoreCase(strDestino))&&
					(oVuelo.getOrigen().equalsIgnoreCase(strOrigen))) {
						vAux.add(oVuelo);
					}
				}
			
				if (vAux.size() !=0){
					System.out.println("Los resultados con Origen: "+strOrigen+" y Destino: "+strDestino);
					System.out.println("\tEmpresa\tPrecio");
					
					int nroRegsitro = 1;
					for (Iterator i = vAux.iterator(); i.hasNext();){
						Vuelo transporte = (Vuelo)i.next();
						System.out.println(nroRegsitro +".\t"+ transporte.getEmpresa()+"\t"+transporte.getPrecio());
						nroRegsitro++;
					}
				
					System.out.println("Ingrese el numero de regsitro a comprar (0 para cancelar)");
					String opcion = (String) reader.readLine();		
					if (opcion.equals("0")){
						return null;
					}
					else
					{
						int indice = Integer.parseInt(opcion);
						Vuelo resgistroElegido = (Vuelo)vAux.elementAt(indice-1);
						Producto pasaje = (Producto) resgistroElegido;
						Item compra = new Item(pasaje,this.getUsuarioActual());
						boolean ok = pasaje.reservar(1);
					
						if (ok=true) {
							return compra;
							}
						else {
							return null;
						}								
					}
				}
				else{
					System.out.println("No fueron encontrados registros con esas caracteristicas");
					return null;
				}
				} 
			catch (IndexOutOfBoundsException e){
				System.out.println("La opcion elegida no es valida");
				return null;
			}
			catch (NumberFormatException e){
				System.out.println("Error en la opcion elegida");
				return null;
			}
			catch (IOException e) {
				System.out.println("Hubo un error en el ingreso de los datos");
				return null;
			}
		}



public Item reservarAlojamiento(Vector aloj) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.println("Ingrese Ciudad Destino: ");
		String strCiudad = (String) reader.readLine(); 
		
		vAux.clear();
		// muestro los hospedajes q cohinciden en destino
		for (int i=0; i < aloj.size(); i++){
			Alojamiento oAloj = (Alojamiento)aloj.elementAt(i);
			if ((oAloj.getCiudad().equalsIgnoreCase(strCiudad))) {
					vAux.add(oAloj);
				}
			}
			if (vAux.size() !=0){
				System.out.println("Los resultados con Destino: "+strCiudad);
				System.out.println("\tEmpresa                   \t\tPrecio");
				
				int nroRegsitro = 1;
				for (int i = 0; i<vAux.size();i++){	
					Alojamiento a = (Alojamiento) vAux.elementAt(i);
					String n = a.getNombre();
					float p = a.getPrecio();
					System.out.println(nroRegsitro +".\t"+n+"                   \t"+p);
					nroRegsitro++;
				}
				
				System.out.println("\nIngrese el numero de regsitro a comprar (0 para cancelar)");
				String opcion = (String) reader.readLine();		
				if (opcion.equals("0")){
					return null;
				}
				else
				{
					int indice = Integer.parseInt(opcion);
					Alojamiento resgistroElegido = (Alojamiento) vAux.elementAt(indice-1);
					Producto hotel = (Producto) resgistroElegido;
					Item compra = new Item(hotel,this.getUsuarioActual());
					boolean ok = hotel.reservar(1);
				
					if (ok=true) {
						return compra;
						}
					else {
						return null;
					}								
				}
			}
			else{
				System.out.println("No fueron encontrados registros con esas caracteristicas");
				return null;
			}
			} 
		catch (IndexOutOfBoundsException e){
			System.out.println("La opcion elegida no es valida");
			return null;
		}
		catch (NumberFormatException e){
			System.out.println("Error en la opcion elegida");
			return null;
		}
		catch (IOException e) {
			System.out.println("Hubo un error en el ingreso de los datos");
			return null;
		}
	}


	public Paquete reservarPaquete(Vector p) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese el origen: ");
			String strOrigen = (String) reader.readLine(); 
			System.out.println("Ingrese Destino: ");		
			String strDestino = (String) reader.readLine();			

			vAux.clear();
			
			// muestro los paq q cohinciden en origen/destino
			// y los cargo a vAux
			for (int i=0; i < p.size(); i++){
				Paquete paq = (Paquete)p.elementAt(i);
				Vector productos = paq.getProductos();
				for (int j=0; j< productos.size(); j++) {
					Producto prod = (Producto) paq.getProductos().elementAt(j);
					// creo un vuelo en nulo para poder identificar la la clase vuelo
					Vuelo aux = new Vuelo("","","","","","",0,0);
					if (prod.getClass().equals(aux.getClass())) {
						Vuelo oVuelo = (Vuelo) prod;
						if ((oVuelo.getDestino().equalsIgnoreCase(strDestino))&&
							(oVuelo.getOrigen().equalsIgnoreCase(strOrigen))) {
								vAux.add(paq);
							}
						}
					}
				}
	
			if (vAux.size()!=0) {
				System.out.println("Los resultados de Paq. con Origen: "+strOrigen+" y Destino: "+strDestino);
				System.out.println("\tEmpresa\tPrecio");				
				
				// recorro los paquetes de vAux y Muestro las opciones
				for (int i=0; i<vAux.size();i++) {
					Paquete paquete = (Paquete)vAux.elementAt(i);					
					System.out.println("Paquete Nro "+ (i+1));
					Vector productos = (Vector)paquete.getProductos();
					for (int j=0; j< productos.size(); j++ ) {
						Producto prod = (Producto)productos.elementAt(j);
						String emp = prod.getNombre();
						float precio = prod.getPrecio();
						System.out.println((i+1)+"."+(j+1)+" \t"+emp+"\t"+precio);
						}
				}
				
				System.out.println("Ingrese el numero de paquete a comprar (0 para cancelar)");
				String opcion = (String) reader.readLine();
				
				if (opcion.equals("0")){
					return null;
					}
				else {
					//elijo el paquete y lo devuelvo
					int indice = Integer.parseInt(opcion);
					Paquete seleccionado = (Paquete) vAux.elementAt(indice-1);
					return seleccionado;
				}
			}
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("La opcion elegida no es valida");
			return null;
		}
		catch (NumberFormatException e){
			System.out.println("Error en la opcion elegida");
			return null;
		}
		catch (IOException e) {
			System.out.println("Hubo un error en el ingreso de los datos");
			return null;
		}
	return null;
	}
		
		
	public void imprimirReservas(Usuario u, Vector compras) {
	float total=0; 
	for (int i=0; i<compras.size(); i++) {
		Item c = (Item) compras.elementAt(i);
		boolean pagado = c.getPago(); 
		if (c.getUsuario().equals(u)&& (!pagado)) {
			total=total + c.getProducto().getPrecio();
			c.mostrar();				
		}
	}
	System.out.println("\nEl total de Compras es: "+ total);
}


	public void pagarReservas(Usuario u, Vector compras) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			float total=0;
			vAux.clear();
			for (int i=0; i<compras.size(); i++) {
				Item c = (Item) compras.elementAt(i);
				boolean pagado = c.getPago(); 
				if (c.getUsuario().equals(u) && (!pagado)) {
					vAux.add(c);
					total=total + c.getProducto().getPrecio();
					System.out.print(i+1 + ". ");
					c.mostrar();				
				}
			}
			System.out.println("\nEl total de Compras es: "+ total);
			System.out.println("\nIngrese el codigo a pagar: ");
			String opcion = (String) reader.readLine();
			if (opcion.equals("0")){
				return;
			}
			else
			{
				int indice = Integer.parseInt(opcion);
				Item itm = (Item) vAux.elementAt(indice-1);
				itm.pagar();
			}
		}
		catch (IOException e) {
			System.out.println("Hubo un error en el ingreso de los datos");
			return;
		}
	}

	public void imprimirCompras(Usuario u, Vector compras) {
		float total=0; 
		for (int i=0; i<compras.size(); i++) {
			Item c = (Item) compras.elementAt(i);
			boolean pagado = c.getPago(); 
			if (c.getUsuario().equals(u) && (pagado)) {
				total=total + c.getProducto().getPrecio();
				c.mostrar();				
			}
		}
		System.out.println("\nEl total de Compras es: "+ total);
	}
	
	public Item comprarProductos(Producto p) {
			Item compra = new Item(p ,this.getUsuarioActual());
			boolean ok = p.reservar(1);
			if (ok=true) {
				return compra;
				}
			else {
				return null;
			}		
	}
}


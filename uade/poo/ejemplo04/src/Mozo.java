

public final class Mozo extends Persona
{
	public Mozo(String Nombre, String Apellido, String Direccion, int Numero, int Telefono)
	{
		this.Nombre=Nombre;
		this.Apellido=Apellido;

		this.Direccion=Direccion;
		this.Numero=Numero;
		this.Telefono=Telefono;
	}
	
	public String GetNombre()
	{
		return this.Nombre;
	}
	
	public String GetApellido()
	{
		return this.Apellido;
	}
}

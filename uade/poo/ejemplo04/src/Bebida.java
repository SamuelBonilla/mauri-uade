
public class Bebida
{
	private String Descripcion;
	private int Precio;
	private String Tipo;
	
	public Bebida(String Descripcion, int Precio, String Tipo)
	{
		this.Descripcion=Descripcion;
		this.Precio=Precio;
		this.Tipo=Tipo;
	}
	
	public String GetDescripcion()
	{
		return this.Descripcion;
	}
	
	public int GetPrecio()
	{
		return this.Precio;
	}
	
	public String GetTipo()
	{
		return this.Tipo;
	}
}

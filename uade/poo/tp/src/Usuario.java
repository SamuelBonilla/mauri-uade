public class Usuario {
	String username;
	String password;
	String dni;
	
	public Usuario(String usuario,String password,String dni )
	{
		super();
		this.username = usuario;
		this.password = password;
		this.dni = dni;		
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setDni(String d) {
		this.dni=d;
	}
	public String getDni() {
		return this.dni;
	}
}

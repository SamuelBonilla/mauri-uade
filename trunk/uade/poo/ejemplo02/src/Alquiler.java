import java.util.*;

public class Alquiler {
	private Video video;
	private Socio socio;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	public Alquiler(Video v, Socio s, Date f1, Date f2) {
		this.video=v;
		this.socio=s;
		this.fechaPrestamo=f1;
		this.fechaDevolucion=f2;
	
	}

}

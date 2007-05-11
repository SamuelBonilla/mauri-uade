
public class Video {
	private int nro;
	private static int nroVideo;
	private String titulo;
	private String director;
	private String rubro;
	
	public Video(String tit, String dir, String rub) {
		this.nro= this.nuevoNumero();
		this.titulo= tit;
		this.director= dir;
		this.rubro= rub;
	}

	private int nuevoNumero() {
		return this.nroVideo++;
	}
}

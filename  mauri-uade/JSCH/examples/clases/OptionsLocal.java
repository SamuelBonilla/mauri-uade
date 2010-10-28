package clases;

public class OptionsLocal extends Options {
	private int lPort = 0;
	private String rHost = null;
	private int rPort = 0;
	
	public OptionsLocal() {
		super();
		setType("Local");
	}

	public OptionsLocal(int lPort, String rHost, int rPort) {
		super();
		setType("Local");
		this.lPort = lPort;
		this.rHost = rHost;
		this.rPort = rPort;
	}

	public int getlPort() {
		return lPort;
	}

	public String getrHost() {
		return rHost;
	}

	public int getrPort() {
		return rPort;
	}
	
	

}

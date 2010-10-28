package clases;

public class OptionsRemote extends Options {
	private int rPort = 0;
	private String lHost = null;
	private int lPort = 0;
	
	public OptionsRemote() {
		super();
		setType("Remote");
	}

	public OptionsRemote(int rPort, String lHost, int lPort) {
		super();
		setType("Remote");
		this.rPort = rPort;
		this.lHost = lHost;
		this.lPort = lPort;
	}

	public int getrPort() {
		return rPort;
	}

	public String getlHost() {
		return lHost;
	}

	public int getlPort() {
		return lPort;
	}
	
	
}

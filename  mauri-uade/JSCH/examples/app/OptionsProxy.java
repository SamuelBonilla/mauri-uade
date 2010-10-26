package app;

public class OptionsProxy extends Options {
	private String proxyHost = null;
	private int proxyPort = 0;
	
	public OptionsProxy() {
		super();
		setType("Proxy");
	}
	
	public OptionsProxy(String proxyHost, int proxyPort) {
		super();
		setType("Proxy");
		this.proxyHost = proxyHost;
		this.proxyPort = proxyPort;
	}
	
	public String getProxyHost() {
		return this.proxyHost; 
	}
	
	public int getProxyPort() {
		return this.proxyPort;
	}

}

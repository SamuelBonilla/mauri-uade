package basic;

import com.jcraft.jsch.*;

public class Tunnel {
	public static void main(String[] args)
	{
		Tunnel t=new Tunnel();
		try	
		{
			t.go();
		} 
		catch (Exception ex)
		{
            ex.printStackTrace();
		}
	}
	
	public void go() throws Exception
	{
		String host="200.123.179.93";
		String user="root";
		String password="1024ghost";
		int port=443;

		int tunnelLocalPort=50;
		String tunnelRemoteHost="192.168.0.12";
		int tunnelRemotePort=3389;

		JSch jsch=new JSch();

		java.util.Properties config=new java.util.Properties();
		// No pregunta al adicionar un nuevo host al known_hosts.txt
		config.put("StrictHostKeyChecking", "no");
		jsch.setConfig(config);
		jsch.setKnownHosts("data/Known_Hosts.txt");
		
		Session session=jsch.getSession(user, host, port);
		session.setPassword(password);
		localUserInfo lui=new localUserInfo();
		session.setUserInfo(lui);
		
		session.connect();
		session.setPortForwardingL(tunnelLocalPort,tunnelRemoteHost,tunnelRemotePort);
		System.out.println("Connected");

	}

	class localUserInfo implements UserInfo
	{
		String passwd;
		public String getPassword(){ return passwd; }
		public boolean promptYesNo(String str){return true;}
		public String getPassphrase(){ return null; }
		public boolean promptPassphrase(String message){return true; }
		public boolean promptPassword(String message){return true;}
		public void showMessage(String message){}
	}     

} 
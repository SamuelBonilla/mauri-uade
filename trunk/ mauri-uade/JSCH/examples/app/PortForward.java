package app;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

import xml.ReadParamXMLFile;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.ProxyHTTP;
import com.jcraft.jsch.Session;

public class PortForward 
{

	public static void main(String[] arg)
	{
		ReadParamXMLFile xml = new ReadParamXMLFile();
		Vector param = new Vector();
		param = xml.readParam();
		conectar( param );
  	}

	private static void conectar(Vector param)  
	{
		try
		{
			java.util.Properties config=new java.util.Properties();
			// No pregunta al adicionar un nuevo host al known_hosts.txt
			config.put("StrictHostKeyChecking", "no");
			JSch.setConfig(config);
			JSch jsch=new JSch();
			jsch.setKnownHosts("data/Known_Hosts.txt");
		  
			String host="200.123.179.93";
			String user="root";
		
			Session session=jsch.getSession(user, host, 443);
			
			session.setPassword("1024ghost");
			
			for (Iterator iterator = param.iterator(); iterator.hasNext();) {
				Options object = (Options) iterator.next();
			
				if (object.getType().equals("Proxy")) {
					OptionsProxy opProxy = (OptionsProxy)object;
					if (opProxy.getProxyHost().equalsIgnoreCase("0.0.0.0")==false) {
						ProxyHTTP pxy = new ProxyHTTP(opProxy.getProxyHost(), opProxy.getProxyPort());
						pxy.setUserPasswd("ww101\\z002ushn", "Ghost1024");
						System.out.println("> Proxy: " + opProxy.getProxyHost() + ":" + opProxy.getProxyPort());
						session.setProxy(pxy);
					}
					session.connect();
				} else if ( object.getType().equals("Local") ) {
					OptionsLocal opLocal = (OptionsLocal)object;
					session.setPortForwardingL( "127.0.0.1", opLocal.getlPort(), opLocal.getrHost(), opLocal.getrPort());
					System.out.println("> Local: " + opLocal.getlPort() + ":" + opLocal.getrHost() + ":" + opLocal.getrPort() );
					
				} else if ( object.getType().equals("Remote") ) {
					OptionsRemote opRemote = (OptionsRemote)object;
					session.setPortForwardingR("127.0.0.1", opRemote.getrPort(), opRemote.getlHost(), opRemote.getlPort());
//					session.setPortForwardingR("200.123.179.93", opRemote.getrPort(), opRemote.getlHost(), opRemote.getlPort());
					System.out.println("> Remote: " + opRemote.getrPort() + ":" + opRemote.getlHost() + ":" + opRemote.getlPort());
					
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

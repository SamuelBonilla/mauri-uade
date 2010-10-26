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

	private static Properties cargarParametros() 
	{
		try
		{
			Properties p = new Properties();
		    p.load(new FileInputStream("data/param.ini"));
		   
		    System.out.println("==== Parametros ===");
		    p.list(System.out);
		    System.out.println("===================");
		    
		    
		    return  p;
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return null;
    }

	private static void conectar(Vector param)  
	{
		try
		{
			JSch jsch=new JSch();
			jsch.setKnownHosts("data/Known_Hosts.txt");
		  
			String host="200.123.179.93";
			String user="root";
		
			Session session=jsch.getSession(user, host, 443);
			
			session.setPassword("1024ghost");
			session.connect();
			
			for (Iterator iterator = param.iterator(); iterator.hasNext();) {
				Options object = (Options) iterator.next();
			
				if (object.getType().equals("Proxy")) {
					System.out.println("> Proxy");
					OptionsProxy opProxy = (OptionsProxy)object;
					ProxyHTTP pxy = new ProxyHTTP(opProxy.getProxyHost(), opProxy.getProxyPort());
					pxy.setUserPasswd("ww101\\z002ushn", "Ghost1024");
				    session.setProxy(pxy);
				} else if ( object.getType().equals("Local") ) {
					System.out.println("> Local");
					OptionsLocal opLocal = (OptionsLocal)object;
					session.setPortForwardingL( opLocal.getlPort(), opLocal.getrHost(), opLocal.getrPort());
				} else if ( object.getType().equals("Remote") ) {
					System.out.println("> Remote");
					OptionsRemote opRemote = (OptionsRemote)object;
					session.setPortForwardingR(opRemote.getrPort(), opRemote.getlHost(), opRemote.getlPort());
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

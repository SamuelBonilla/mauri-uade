package app;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

import xml.ReadParamXMLFile;

import clases.Options;
import clases.OptionsLocal;
import clases.OptionsProxy;
import clases.OptionsRemote;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.ProxyHTTP;
import com.jcraft.jsch.Session;

public class PortForward 
{

	public static void main(String[] arg)
	{
		if ( arg.length != 0) 
		{
			conectar(arg);
		}
		else 
		{
			ReadParamXMLFile xml = new ReadParamXMLFile();
			Vector param = new Vector();
			param = xml.readParam();
			conectar( param );	
		}
		
  	}

	private static void conectar(Vector param)  
	{
		try
		{
			java.util.Properties config=new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			
			JSch jsch=new JSch();
			
			jsch.setKnownHosts("data/Known_Hosts.txt");
			jsch.setConfig(config);
			
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

	private static void conectar(String [] arg) {
		int i = 0;
		String args = null;
		try
		{
			java.util.Properties config=new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			
			JSch jsch=new JSch();
			
			jsch.setKnownHosts("data/Known_Hosts.txt");
			jsch.setConfig(config);
			
			String host="200.123.179.93";
			String user="root";
		
			Session session=jsch.getSession(user, host, 443);
			session.setPassword("1024ghost");

			// Seteo Proxy
			for (int j = 0; j < arg.length; j++) {
				if ( arg[j].equals("-P")) {
					Vector proxy = parseAddress(arg[j+1]);
					OptionsProxy opProxy = new OptionsProxy((String)proxy.get(0),(Integer)proxy.get(1) );
					ProxyHTTP pxy = new ProxyHTTP(opProxy.getProxyHost(), opProxy.getProxyPort());
					pxy.setUserPasswd("ww101\\z002ushn", "Ghost1024");
					session.setProxy(pxy);
					System.out.println("> " + opProxy.getProxyHost()+ ":" + opProxy.getProxyPort());
				}
			}
			
			session.connect();
			
			// Analizo Parámetros
			while (i < arg.length && arg[i].startsWith("-")) {
	            String object = arg[i++];

	            if (object.equals("-L")) 
				{
					Vector local = parseLongAddress(arg[i++]);
					OptionsLocal opLocal = new OptionsLocal( (Integer)local.get(0),(String)local.get(1),(Integer)local.get(2));
					session.setPortForwardingL( "127.0.0.1", opLocal.getlPort(), opLocal.getrHost(), opLocal.getrPort());
					System.out.println("> Local "+ opLocal.getlPort() + ":" + opLocal.getrHost() + ":" + opLocal.getrPort());
				}
				else if (object.equals("-R")) 
				{
					Vector remote = parseLongAddress(arg[i++]);
					OptionsRemote opRemote = new OptionsRemote( (Integer)remote.get(0),(String)remote.get(1),(Integer)remote.get(2));
					session.setPortForwardingR( "127.0.0.1", opRemote.getrPort(), opRemote.getlHost(), opRemote.getlPort());
					System.out.println("> Remote "+ opRemote.getrPort() + ":" + opRemote.getlHost() + ":" + opRemote.getlPort());
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private static Vector parseAddress(String addr) {
		int port = 0;
		String host = null;

		try 
		{
			port=Integer.parseInt(addr.substring(addr.lastIndexOf(':') + 1));
			host=addr.substring(0, addr.lastIndexOf(':'));
//			System.out.println("> parse " + host + ":" + port);
			Vector s = new Vector();
			s.add(host);
			s.add(port);
			return s ;
		} 
		catch (Exception ex) 
		{
			System.out.println("Error en el proxy.");
			System.exit(1);
		}
		return null;
	}
	
	private static Vector parseLongAddress(String addr) {
		int port0, port1 = 0;
		String host = null;
		
		try
		{
			port1=Integer.parseInt(addr.substring(addr.lastIndexOf(':') + 1));
			host=addr.substring(addr.indexOf(':')+1, addr.lastIndexOf(':'));
			port0=Integer.parseInt(addr.substring(0,addr.indexOf(':')));
		
			Vector s = new Vector();
			s.add(port0);
			s.add(host);
			s.add(port1);
			return s ;
		} 
		catch (Exception ex) 
		{
			System.out.println("Error en el parámetro ");
			System.exit(1);
			return null;
		}
	}
	
	
}

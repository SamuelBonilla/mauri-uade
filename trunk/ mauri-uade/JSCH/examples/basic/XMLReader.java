package basic;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader 
{
	public static void main(String argv[]) 
	{
		try 
		{
			File file = new File("data/param.xml");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
	        
			doc.getDocumentElement().normalize ();
	        System.out.println ("Root element of the doc is " + 
	                 doc.getDocumentElement().getNodeName());

	        NodeList proxy = doc.getElementsByTagName("proxy");
        	for(int s=0; s<proxy.getLength() ; s++)
	        	{
        			Node nodoProxyHost = proxy.item(s).getFirstChild();
        			System.out.println(nodoProxyHost.getNodeValue().toString());
        			if (nodoProxyHost.getNodeType() == Node.ELEMENT_NODE) {
        				Node proxy_host = nodoProxyHost.getFirstChild();
        				String valor = proxy_host.getFirstChild().getNodeValue();
        				
        				System.out.println("proxy_host " + valor);
        				Element proxy_port = (Element)nodoProxyHost.getChildNodes().item(s+1);
        				System.out.println("proxy_port "+ proxy_port);
        			}
	        	}			
		/*
		
		try 
		{
			File file = new File("data/param.xml");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			
			NodeList proxy = doc.getElementsByTagName("proxy");
			System.out.println("Proxy INFO");

			for (int s = 0; s < proxy.getLength(); s++) {
				Node item = proxy.item(s);
				
				if (item.getNodeType() == Node.ELEMENT_NODE) {
					Element nodoProxy = (Element) item;
					NodeList nodoProxyHost = nodoProxy.getElementsByTagName("proxy_host");
					Element proxy_host = (Element) nodoProxyHost.item(0);
					System.out.println("Proxy Host : " + proxy_host.getChildNodes().item(0).getNodeValue().toString());
					
					NodeList nodoProxy_port = nodoProxy.getElementsByTagName("proxy_port");
					Element proxy_port = (Element) nodoProxy_port.item(0);
					
					System.out.println("Proxy Port : " + proxy_port.getChildNodes().item(0).getNodeValue().toString());
				}
			}

			NodeList remote = doc.getElementsByTagName("remote");
			System.out.println("REMOTE");

			for (int s = 0; s < remote.getLength(); s++) {
				Node item = remote.item(s);

				if (item.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element nodoRemote = (Element) item;
					
					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("rport");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					System.out.println("Rport : "  + ((Node) fstNm.item(0)).getNodeValue());
						
					NodeList scnNmElmntLst = fstElmnt.getElementsByTagName("lhost");
					Element lstNmElmnt = (Element) scnNmElmntLst.item(0);
					NodeList sectNm = lstNmElmnt.getChildNodes();
					System.out.println("Lhost : " + ((Node) sectNm.item(0)).getNodeValue());
						
					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lport");
					Element thrNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList thrNm = thrNmElmnt.getChildNodes();
					System.out.println("Lhost : " + ((Node) thrNm.item(0)).getNodeValue());
						
				}
			}
				
			NodeList local = doc.getElementsByTagName("local");
			System.out.println("LOCAL");
			for (int s = 0; s < remote.getLength(); s++) 
			{
				Node item = remote.item(s);
				if (item.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element fstElmnt = (Element) item;
					
					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("lport");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					System.out.println("Lport : "  + ((Node) fstNm.item(0)).getNodeValue());
					
					NodeList scnNmElmntLst = fstElmnt.getElementsByTagName("rhost");
					Element lstNmElmnt = (Element) scnNmElmntLst.item(0);
					NodeList sectNm = lstNmElmnt.getChildNodes();
					System.out.println("Rhost : " + ((Node) sectNm.item(0)).getNodeValue());
						
					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("rport");
					Element thrNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList thrNm = thrNmElmnt.getChildNodes();
					System.out.println("Rhost : " + ((Node) thrNm.item(0)).getNodeValue());
					
				}
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
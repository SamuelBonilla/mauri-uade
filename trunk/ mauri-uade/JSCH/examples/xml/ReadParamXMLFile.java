package xml;

import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import app.Options;
import app.OptionsLocal;
import app.OptionsProxy;
import app.OptionsRemote;

public class ReadParamXMLFile{

public void test() 
{
	Vector test = new Vector(); 
	test = readParam();
	for (Iterator iterator = test.iterator(); iterator.hasNext();) {
		Options object = (Options) iterator.next();
		System.out.println("> " + object.getType());
	}
}

public Vector readParam() {
	Vector opciones = new Vector();
	
	try 
	{
	   DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	   DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	   Document doc = docBuilder.parse (new File("data/param.xml")); 
	   // normalize text representation
	   doc.getDocumentElement ().normalize ();
	   //System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName()); 
	   
	   // estoy en <proxy>
	   NodeList optionsProxy = doc.getElementsByTagName("proxy");
	   
	   int optionProxy = optionsProxy.getLength();
	   
	   for(int s=0; s<optionsProxy.getLength() ; s++)
	   {
		   Node firstProxyNode = optionsProxy.item(s);
		   if(firstProxyNode.getNodeType() == Node.ELEMENT_NODE)
		   {
			   //estoy en <proxy_host>
			   Element firstProxyElement = (Element)firstProxyNode; 
			   //——-
			   NodeList firstProxyList = firstProxyElement.getElementsByTagName("proxy_host");
			   Element firstProxyHostElement = (Element)firstProxyList.item(0); 
			   NodeList nodoProxyHost = firstProxyHostElement.getChildNodes();
			   String proxy_host = ((Node)nodoProxyHost.item(0)).getNodeValue().trim();
			   
			   //——-
			   NodeList secondProxyList = firstProxyElement.getElementsByTagName("proxy_port");
			   Element secondProxyPortElement = (Element)secondProxyList.item(0);
			   NodeList nodoProxyPort = secondProxyPortElement.getChildNodes();
			   String proxy_port = ((Node)nodoProxyPort.item(0)).getNodeValue().trim();
			   
			   Options op = new OptionsProxy(proxy_host,Integer.parseInt(proxy_port));
			   opciones.add(op);
			   
			  
		   }//end of if clause

		   // estoy en <proxy>
		   NodeList optionsLocal = doc.getElementsByTagName("local");
		   int optionLocal = optionsLocal.getLength();
		   
		   for(s=0; s<optionsLocal.getLength() ; s++)
		   {
			   Node firstLocalNode = optionsLocal.item(s);
			   if(firstLocalNode.getNodeType() == Node.ELEMENT_NODE)
			   {
				   //estoy en <rport>
				   Element firstLocalElement = (Element)firstLocalNode; 
				   //——-
				   NodeList firstLocalList = firstLocalElement.getElementsByTagName("lport");
				   Element firstLocalLportElement = (Element)firstLocalList.item(0); 
				   NodeList nodoLocalLport = firstLocalLportElement.getChildNodes();
				   String lport = ((Node)nodoLocalLport.item(0)).getNodeValue().trim();
				   
				   
				   NodeList secondLocalList = firstLocalElement.getElementsByTagName("rhost");
				   Element secondLocalRhostElement = (Element)secondLocalList.item(0); 
				   NodeList nodoLocalRhost= secondLocalRhostElement.getChildNodes();
				   String rhost = ((Node)nodoLocalRhost.item(0)).getNodeValue().trim();

				   
				   NodeList thirdLocalList = firstLocalElement.getElementsByTagName("rport");
				   Element thirdLocalRportElement = (Element)thirdLocalList.item(0); 
				   NodeList nodoLocalRport = thirdLocalRportElement.getChildNodes();
				   String rport = ((Node)nodoLocalRport.item(0)).getNodeValue().trim();
				   
				   Options op = new OptionsLocal(Integer.parseInt(lport),
						   rhost, Integer.parseInt(rport));
				   opciones.add(op);
			   }
		   }

		   NodeList optionsRemote = doc.getElementsByTagName("remote");
		   int optionRemote = optionsRemote.getLength();
		   
		   for(s=0; s<optionsRemote.getLength() ; s++)
		   {
			   Node firstLocalNode = optionsRemote.item(s);
			   if(firstLocalNode.getNodeType() == Node.ELEMENT_NODE)
			   {
				   //estoy en <rport>
				   Element firstRemoteElement = (Element)firstLocalNode; 
				   //——-
				   NodeList firstRemoteList = firstRemoteElement.getElementsByTagName("rport");
				   Element firstRemoteRportElement = (Element)firstRemoteList.item(0); 
				   NodeList nodoRemoteRport = firstRemoteRportElement.getChildNodes();
				   String rport = ((Node)nodoRemoteRport.item(0)).getNodeValue().trim();
				   
				   NodeList secondRemoteList = firstRemoteElement.getElementsByTagName("lhost");
				   Element secondRemoteLhostElement = (Element)secondRemoteList.item(0); 
				   NodeList nodoRemoteLhost = secondRemoteLhostElement.getChildNodes();
				   String lhost = ((Node)nodoRemoteLhost.item(0)).getNodeValue().trim(); 
				   
				   NodeList thirdRemoteList = firstRemoteElement.getElementsByTagName("lport");
				   Element thirdRemoteLportElement = (Element)thirdRemoteList.item(0); 
				   NodeList nodoRemoteLport = thirdRemoteLportElement.getChildNodes();
				   String lport = ((Node)nodoRemoteLport.item(0)).getNodeValue().trim();
				   
				   Options op = new OptionsRemote(Integer.parseInt(rport),lhost,Integer.parseInt(lport));
				   opciones.add(op);
				
			   }
		   }
	   }//end of for loop with s var

	   
   }catch (SAXParseException err) 
   {
	   System.out.println ("** Parsing error" + ", line " + err.getLineNumber () + ", uri " + err.getSystemId ());
	   System.out.println(" " + err.getMessage ()); 
   }
   catch (SAXException e) 
   {
	   Exception x = e.getException ();
	   ((x == null) ? e : x).printStackTrace (); 
   }catch (Throwable t) 
   {
	   t.printStackTrace ();
   }
   //	System.exit (0);
	return opciones;

}//end of main

}
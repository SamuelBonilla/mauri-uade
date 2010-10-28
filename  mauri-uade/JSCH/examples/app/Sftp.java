package app;

import com.jcraft.jsch.*;

import java.io.*;

public class Sftp {
   public static void main(String[] args) {

       String username = "root";
       String host = "200.123.179.93";
       String pass = "1024ghost";

       JSch jsch = null;
       Session session = null;
       Channel channel = null;
       ChannelSftp c = null;
       try 
       {
    	   java.util.Properties config=new java.util.Properties();
    	   config.put("StrictHostKeyChecking", "no");
    	   JSch.setConfig(config);
    	   
           jsch = new JSch();
           session = jsch.getSession(username, host, 22);
           session.setPassword(pass);
           jsch.setKnownHosts("data/Known_Hosts.txt");
           
           session.connect();

           channel = session.openChannel("sftp");
           channel.connect();
           c = (ChannelSftp) channel;
       } 
       catch (Exception e) 
       { 	
    	   e.printStackTrace();	
       }

       try {
           System.out.print("Starting File Upload:");
           String fsrc = "PortForward", fdest = "/tmp/PortForward.jar";
           c.put(fsrc, fdest);
           System.out.println( " done. ");
           
           fsrc = "data/param.xml"; 
           fdest = "/tmp/data/param.xml";
           c.put(fsrc, fdest);
           
           fsrc = "data/Known_Hosts.txt"; 
           fdest = "/tmp/data/Known_Hosts.txt";
           c.put(fsrc, fdest);
           
           
           System.out.print("Starting File Download:");
           c.get(fdest, "data/testfile.bin");
           System.out.println( " done. ");
       } catch (Exception e) {	e.printStackTrace();	}
       
       c.disconnect();
       session.disconnect();

   }
}
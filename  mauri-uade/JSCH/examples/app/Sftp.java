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
           System.out.println("Starting File Upload:");
           String fsrc = "data/Known_Hosts.txt", fdest = "/tmp/Known_Hosts.txt";
           c.put(fsrc, fdest);
           System.out.println("Starting File Download:");
           c.get(fdest, "data/testfile.bin");
       } catch (Exception e) {	e.printStackTrace();	}
       
       c.disconnect();
       session.disconnect();

   }
}
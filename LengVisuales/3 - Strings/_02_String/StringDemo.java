/*
 * Created on 10/05/2006
 *
 * Clase String
 */
package _02_String;

public class StringDemo {

    public static void main(String[] args) {
        StringDemo demo = new StringDemo();
        demo.constructores();
        demo.subcadenas();
        demo.comparaciones();
        demo.manipulacion();
    }
    
    void constructores(){
        String s = "abc";					// asignando un literal
        String s1 = new String("def");		// constructor con literal como argumento
        
        char[] achar = {'g','h','i'};		// constructor con arreglo de chars como argumento
        String s2 = new String(achar);
        
        byte[] abyte = {106,107,108};		// constructor con arreglo de bytes como argumento
        String s3 = new String(abyte);
        
        System.out.println("constructores: " + s+ s1 + s2 + s3);
        System.out.println();
    }
    
    void subcadenas() {
        String s = "esta es una cadena de caracteres";
        
        int n = 0;
        for (int i=0; i < s.length(); i++)	// obtiene la longitud del string
            if (s.charAt(i)=='e') { n++; }	// obtiene el char de la posisición
         
        System.out.println("s: " + s);
        System.out.println("en s hay " + n + " letras e");
        
        String sub = s.substring(12,18);	// obtiene el substring entre ambas posiciones
        System.out.println("s.substring(12,17): " + sub);
        
        n = s.indexOf('a');
        System.out.println("s.indexOf('a')          //1º posición de a: " + n);
        System.out.println("s.indexOf('a',n+1)      //2º posición de a: " + s.indexOf('a',n+1));
        n = s.lastIndexOf('a');
        System.out.println("s.lastIndexOf('a')      //última posición de a: " + n);
        System.out.println("s.lastIndexOf('a',n-1) 	//ante-última posición de a: " + s.lastIndexOf('a',n-1));
        n = s.indexOf("na");
        System.out.println("s.indexOf(\"na\")         //1º posición de na: " + n);
        System.out.println("s.indexOf(\"na\",n+1)     //2º posición de na: " + s.indexOf("na",n+1));
        
        System.out.println();
        String r = s.replace('a','A');				  	// reemplaza caracteres
        System.out.println("s.replace('a','A') : " + r);
        r = s.replaceAll("na","NA");					// reeemplaza strings
        System.out.println("s.replaceAll(\"na\",\"NA\") : " + r);
    }
    
    void comparaciones() {
        String s = "esta es otra cadena de caracteres";
        System.out.println("\ns: " + s);
        System.out.println("s.endsWith(\"caracteres\"): " + s.endsWith("caracteres"));
        System.out.println("s.startsWith(\"esta\"): " + s.startsWith("esta"));		// substring
        System.out.println("s.startsWith(\"otra\",8): " + s.startsWith("otra",8));	// substring y posición
        
        String s1 = "cadena", s2 = "CADENA";
        System.out.println("\ns1: " + s1 + "\ts2: " + s2);
        int n = s1.compareTo(s2);
        System.out.println("s1.compareTo(s2): " + n);
        n = s2.compareTo(s1);
        System.out.println("s2.compareTo(s1): " + n);
        n = s1.compareToIgnoreCase(s2);
        System.out.println("s1.compareToIgnoreCase(s2): " + n);  
        
        System.out.println();
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));
        
        int i = 0;
		while (!s.regionMatches(i, s1, 0, s1.length()))
			i++;
		System.out.println("regionMatches: " + s.substring(i, i+s1.length()));
     }

    void manipulacion(){
    	String s = "esta es una cadena de caracteres";
    	String[] a = s.split(" ");
    	
    	System.out.println("\ns.split(String)");
    	for (int i=0; i<a.length; i++)
    	    System.out.println(a[i]);
    	
        System.out.println();
        System.out.println("s.toUpperCase() : " + s.toUpperCase()); 
        
        String s1 = "  cadena  ";
        System.out.println("\ns1: " + s1);
        System.out.println("s1.trim().length() : " + s1.trim().length());         
    }
}

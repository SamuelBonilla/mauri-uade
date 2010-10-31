package console_parameter;

public class ReadParam {

	public static void main(String[] args) {
	    try
	    {
	    	if(args.length==0)
	    	{
				System.err.println("Algun parametro:");
				System.exit(1);
	    	}

	    	String p1=args[0];
	    	String p2=System.getProperty("B");
	    	String p3=System.getProperty("C");
	    	String p4=System.getProperty("D");
	      	
	    	System.out.println("P1: "+ p1);
	       	System.out.println("P2: "+ p2);
	       	System.out.println("P3: "+ p3);
	       	System.out.println("P4: "+ p4);
	    } catch (Exception e) {
	    	System.out.println("Algo Fallo:");
	    }
	}

}

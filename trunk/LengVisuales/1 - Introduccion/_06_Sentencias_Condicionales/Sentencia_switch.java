/*
 * Created on 30/04/2006
 *
 */
package _06_Sentencias_Condicionales;

public class Sentencia_switch {

    public static void main(String[] args) {
        int mes = 2;
        int año = 2006;

        switch ( mes ) {
        	case 1:
        	case 3:
        	case 5:
        	case 7:
        	case 8:
        	case 10:
        	case 12:
        	    System.out.println( "el mes " + mes + " tiene 31 días");
        	    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println( "el mes " + mes + " tiene 30 días");
                break;
            case 2:
                if ( ((año % 4 == 0) && !(año % 100 == 0))
                     || (año % 400 == 0) )
                    System.out.println( "el mes " + mes + " tiene 29 días");
                else
                    System.out.println( "el mes " + mes + " tiene 28 días");
                break;
            default:
                System.out.println( "el mes " + mes + " no existe");
            	break;
         }
    }
}

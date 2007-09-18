/*
 * Created on 30/04/2006
 *
 */
package _06_Sentencias_Condicionales;

public class Sentencia_switch {

    public static void main(String[] args) {
        int mes = 2;
        int a�o = 2006;

        switch ( mes ) {
        	case 1:
        	case 3:
        	case 5:
        	case 7:
        	case 8:
        	case 10:
        	case 12:
        	    System.out.println( "el mes " + mes + " tiene 31 d�as");
        	    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println( "el mes " + mes + " tiene 30 d�as");
                break;
            case 2:
                if ( ((a�o % 4 == 0) && !(a�o % 100 == 0))
                     || (a�o % 400 == 0) )
                    System.out.println( "el mes " + mes + " tiene 29 d�as");
                else
                    System.out.println( "el mes " + mes + " tiene 28 d�as");
                break;
            default:
                System.out.println( "el mes " + mes + " no existe");
            	break;
         }
    }
}

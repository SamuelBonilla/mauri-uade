/*
 * public abstract WindowAdapter implements WindowListener,
 *                 WindowFocusListener, WindowStateListener 
 * {
 * 	  public void windowActivated( WindowEvent evt ){
 *       // invocado al activarse la ventana
 *    }
 * 	  public void windowClosed( WindowEvent evt ){
 * 		 // invocado al cerrarse la ventana
 *    }
 * 	  public void windowClosing( WindowEvent evt ){
 * 		 // invocado al iniciarse el cierre de la ventana
 *    }
 *    public void windowDeactivated( WindowEvent evt ){
 *       // invocado al desactivarse la ventana
 *    }
 *    public void windowDeiconofied( WindowEvent evt ){
 * 		 // invocado al desiconizarse la ventana
 *    }
 *    public void windowGainedFocus( WindowEvent evt ){
 *       // invocado al tomar foco la ventana 
 *    } *  
 *  
 *    public void windowIconofied( WindowEvent evt ){
 *       // invocado al iconizarse la ventana
 *    }
 *    public void windowLostFocus( WindowEvent evt ){
 *       // invocado al perder foco la ventana 
 *    } * 
 *    public void windowOpened( WindowEvent evt ){
 *       // invocado al abrirse la ventana
 *    }
 *    public void windowStateChangeg( WindowEvent evt ){
 *       // invocado al cambiar el estado de la ventana 
 *    } * 
 * }
 */

package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowAdapterDemo extends JFrame 
{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WindowAdapterDemo() {
        super("WindowAdapterDemo");
// obtiene el tamaño de la pantalla (escritorio)
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
// centra la ventana 
        setBounds(screenSize.width/4, screenSize.height/4, 
        		  screenSize.width/2, screenSize.height/2);
// asigna el manejador de eventos al JFrame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }); 
    }
    
    public static void main(String args[]) {
        new WindowAdapterDemo().setVisible( true );
    }
}

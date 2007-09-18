/*
 * public class EventObject implements Serializable
 * {
 * 	  protected Object source;
 * 
 *    EventObject( Object source) { this.source = source; }	
 * 
 * 	  public Object getSource() { return source; }
 * 
 *    public String toString() { ... ; }	
 * }
 * 
 * public abstract class AWTEvent extends EventObject
 * {
 * 	  ...	
 * }
 * 
 * public class ActionEvent extends AWTEvent
 * {
 * 	  ...	
 * 	  public String getActionCommand(){
 * 		 // retorna el comando string del componente 
 *       // asociado al evento
 * 	  }
 * }
 * 
 * public interface ActionListener extends EventListener 
 * {
 * 	  public void actionPerformed( ActionEvent evt );
 * }
 */

package event;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo1 extends JFrame 
                             implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnAceptar, btnCancelar;
	JLabel lblEstado;
	
    public ActionEventDemo1() {
        componentes();
        propiedades();
    }
    
    void componentes(){
    	String leyenda = "Demo de eventos de acción";
        Container c = this.getContentPane();    // obtiene el ContentPane
        
        // agrega un panel en el centro del JFrame
        JPanel pnlCentro = new JPanel();
        pnlCentro.setLayout( new FlowLayout());
        c.add( pnlCentro, BorderLayout.CENTER );
        
        // agrega botones al panel
        btnAceptar = new JButton ("Aceptar");
        pnlCentro.add( btnAceptar );        
        btnCancelar = new JButton ("Cancelar");
        pnlCentro.add( btnCancelar ); 
        
        // agrega un label en la zona inferior del JFrame
        lblEstado = new JLabel (leyenda);
        lblEstado.setHorizontalAlignment(JLabel.CENTER);
        c.add( lblEstado, BorderLayout.SOUTH );
        
        // asignación de eventos
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }
    
    void propiedades() {
        setTitle("ActionEventDemo");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setLocation(200, 100);
        pack();        
    }
    
    public void actionPerformed(ActionEvent evt) {
    	lblEstado.setText( "botón " + evt.getActionCommand() );
    }
    
    public static void main(String args[]) {
        new ActionEventDemo1().setVisible( true );
    }
}

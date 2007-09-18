/*
 * public interface ActionListener extends EventListener 
 * {
 * 	  public void actionPerformed( ActionEvent evt );
 * }
 * 
 */

package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo2 extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton[] radioArray = new JRadioButton[4];		// arreglo de JRadioButton
	JLabel lblEstado;
	
    public ActionEventDemo2() {
        componentes();
        propiedades();
    }
    
    void componentes(){
    	String leyenda = "Manejador de eventos en una inner class";
        Container c = this.getContentPane();    	
        
        // agrega un panel en el centro del JFrame
        JPanel pnlCentro = new JPanel();
        pnlCentro.setLayout( new FlowLayout());
        c.add( pnlCentro, BorderLayout.CENTER );
        
        // crea una inner class manejadora de eventos
        RadioHandler rHandler = new RadioHandler();
        
        // crea y define botones radio
		String[] colores = {"rojo", "azul", "verde", "amarillo"};
		ButtonGroup grupoColor = new ButtonGroup(); 		// grupo p/los botones radio
        for (int i = 0; i < radioArray.length; i++) {
        	radioArray[i] = new JRadioButton(colores[i]);	// crea un JRadioButton
        	grupoColor.add( radioArray[i] );				// agrega el botón al grupo
        	pnlCentro.add( radioArray[i] );					// agrega el botón al panel
        	// asigna manejador de eventos al botón:
        	radioArray[i].addActionListener(rHandler);
        }
		
		
        // agrega un label en la zona inferior del JFrame
        lblEstado = new JLabel(leyenda);
        lblEstado.setOpaque(true);
        c.add( lblEstado, BorderLayout.SOUTH );
    }
    
    void propiedades() {
        setTitle("ActionEventDemo2");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setLocation(200, 100);
        pack();        
    }
    
    // inner class para manejar eventos
    class RadioHandler implements ActionListener {
    	public void actionPerformed( ActionEvent evt ) {
    		if ( evt.getSource() == radioArray[0] )
    			lblEstado.setBackground(Color.RED);
    		else if ( evt.getSource() == radioArray[1] )
    			lblEstado.setBackground(Color.CYAN);
    		else if ( evt.getSource() == radioArray[2] )
    			lblEstado.setBackground(Color.GREEN);
    		else if ( evt.getSource() == radioArray[3] )
    			lblEstado.setBackground(Color.YELLOW);    		
    	}
    }
    
    public static void main(String args[]) {
        new ActionEventDemo2().setVisible( true );
    }
}

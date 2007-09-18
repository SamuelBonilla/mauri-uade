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

public class ActionEventDemo3 extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JCheckBox[] chkArray = new JCheckBox[4];		// arreglo de JCheckBox
	JLabel lblEstado;
	
    public ActionEventDemo3() {
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
        CheckHandler handler = new CheckHandler();
        
        // crea y define botones radio
		String[] opciones = {"Opción A", "Opción B", "Opción C", "Opción D"};
        for (int i = 0; i < chkArray.length; i++) {
        	chkArray[i] = new JCheckBox(opciones[i]);	// crea un JRadioButton
        	pnlCentro.add( chkArray[i] );				// agrega el botón al panel
        	chkArray[i].addActionListener(handler);		// asigna manejador de eventos
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
    class CheckHandler implements ActionListener {
    	public void actionPerformed( ActionEvent evt ) {
			lblEstado.setText("");
			for(int i = 0; i < chkArray.length; i++) {
				if (chkArray[i].isSelected()) {
					lblEstado.setText(lblEstado.getText() 
							  + " " + chkArray[i].getText());
				}
			}
    	}
    }
    
    public static void main(String args[]) {
        new ActionEventDemo3().setVisible( true );
    }
}

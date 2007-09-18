/*
 * public class ItemEvent extends AWTEvent
 * {
 *    public static final int DESELECTED = 0;
 * 	  public static final int SELECTED = 1;	
 *   
 * 	  ...	
 * 
 * 	  public Object getItem() {
 * 		 // retorna el item asociado al evento
 * 	  }
 * 
 * 	  public Object getStateChanged() {
 * 		 // retorna el tipo de estado del item asociado alevento
 *       // SELECTED o DESELECTED
 * 	  }
 * }
 * 
 * public interface ItemListener extends EventListener 
 * {
 * 	  public void itemStateChanged( ItemEvent evt );
 * }
 * 
 */

package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventDemo extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JComboBox cbo;
	JLabel lblEstado;
	
    public ItemEventDemo() {
        componentes();
        propiedades();
        inicializaCombo();
    }
    
    void componentes(){
        Container c = this.getContentPane();    	
        
        // agrega un panel en el centro del JFrame
        JPanel pnlCentro = new JPanel();
        pnlCentro.setBorder(BorderFactory.createEmptyBorder(5,2,5,2));
        c.add( pnlCentro, BorderLayout.CENTER );
        
        // agrega una combo al panel
        pnlCentro.add( new JLabel("Combo: "));		// agrega un nuevo JLabel
        cbo = new JComboBox();						// crea una JComboBox
        cbo.setPreferredSize(new Dimension(160,20));// tamaño predefinido
        pnlCentro.add(cbo);							// agrega la combo

        // agrega un label en la zona inferior del JFrame
        lblEstado = new JLabel();
        lblEstado.setPreferredSize(new Dimension(160,20));
        lblEstado.setHorizontalAlignment(JLabel.CENTER);
        lblEstado.setOpaque(true);
        c.add( lblEstado, BorderLayout.SOUTH );
        
        // asigna un manejador de eventos a la JComboBox
        cbo.addItemListener( new ItemListener(){
        	public void itemStateChanged(ItemEvent evt){
    			if( evt.getStateChange() == ItemEvent.SELECTED ) {
    				lblEstado.setText((String) evt.getItem());
    				switch (cbo.getSelectedIndex()){
    					case 0: lblEstado.setBackground(Color.red); break;
    					case 1: lblEstado.setBackground(Color.cyan); break;
    					case 2: lblEstado.setBackground(Color.yellow); 
    				}
    			} 
            }
        });
    }
    
    void propiedades() {
        setTitle("ItemEventDemo");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setLocation(200, 100);
        pack();        
    }
    
    void inicializaCombo() {
    	cbo.addItem("rojo");
    	cbo.addItem("azul");
    	cbo.addItem("amarillo");
    }
    
    public static void main(String args[]) {
        new ItemEventDemo().setVisible( true );
    }
}
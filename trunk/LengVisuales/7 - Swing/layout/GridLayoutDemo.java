/*
 * Created on 29-may-2005
 *
 */
package layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridLayoutDemo() {
        componentes();
        propiedades();
    }
    
    void componentes(){
        Container c = this.getContentPane();        // obtiene el ContentPane
        c.setLayout( new GridLayout(3,2,0,5) );     // define un GridLayout de
                                                    // 3 filas x 2 columnas        
        
        JLabel[] lbls = new JLabel[3];              // arreglo de 3 JLabels
        JTextField[] txfs = new JTextField[3];      // arreglo de 3 JTextFields
        
        for (int i = 0; i < lbls.length; i++) {
            lbls[i] = new JLabel (" Etiqueta " + i + " :");  
          
            txfs[i] = new JTextField (10);          
            
            c.add( lbls[i] );     // incorpora los componentes en un GridLayout
            c.add( txfs[i] );     // llenando la grilla por fila.  
        }
    }
    
    void propiedades() {
        setTitle("GridLayout");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setLocation(200, 100);
        pack();        
    }
    
    public static void main(String args[]) {
        new GridLayoutDemo().setVisible(true);
    }
}
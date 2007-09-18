
package layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlowLayoutDemo() {
        componentes();
        propiedades();
    }
    
    void componentes(){
        JLabel lbl1 = new JLabel (" primer JLabel ");  
        lbl1.setBackground(Color.red);         
        lbl1.setOpaque(true);                  
        
        JLabel lbl2 = new JLabel (" segundo JLabel ");
        lbl2.setBackground(Color.cyan);
        lbl2.setOpaque(true);  
        
        JLabel lbl3 = new JLabel (" tercer JLabel ");
        lbl3.setBackground(Color.yellow);
        lbl3.setOpaque(true);  
        
        Container c = this.getContentPane();    // obtiene el ContentPane
        c.setLayout( new FlowLayout() );        // le asigna un FlowLayout
        
        c.add( lbl1 );     // incorpora los componentes en un FlowLayout
        c.add( lbl2 );     // uno a continuación del otro en linea horizontal
        c.add( lbl3 );   
    }
    
    void propiedades() {
        setTitle("FlowLayout");
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);   
        setLocation(200, 100);
        // ajusta el tamaño de la ventana a las dimensiones de los componentes
        pack();        
    }
    
    public static void main(String args[]) {
        new FlowLayoutDemo().setVisible(true);
    }
}


package layout;

import javax.swing.*;
import java.awt.*;

public class NullLayoutDemo extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullLayoutDemo() {
        componentes();
        propiedades();
    }
    
    void componentes(){
        Container c = this.getContentPane();
        c.setLayout(null);

        JLabel lbl = new JLabel("Posición 10, 10");
        lbl.setLocation(10, 10);
        lbl.setSize(100, 20);
        c.add(lbl );
        
        JComboBox cbo = new JComboBox();
        cbo.setBounds(110, 10, 150, 20);
        c.add(cbo);
        
        JLabel[] lbls = new JLabel[3];              
        JTextField[] txfs = new JTextField[3];      
        for (int i = 0; i < lbls.length; i++) {
            lbls[i] = new JLabel ("Posición 10, " + (20 * i + 30) );  
            lbls[i].setLocation(10, 20 * i + 30);
            lbls[i].setSize(100, 20);
            c.add( lbls[i] );
            
            txfs[i] = new JTextField();
            txfs[i].setBounds(110, 20 * i + 30, 150, 20);
            c.add( txfs[i] );     
        }
    }
    
    void propiedades() {
        setTitle("Null Layout");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setBounds(200, 100, 300, 150);   
    }
    
    public static void main(String args[]) {
        new NullLayoutDemo().setVisible(true);
    }
}
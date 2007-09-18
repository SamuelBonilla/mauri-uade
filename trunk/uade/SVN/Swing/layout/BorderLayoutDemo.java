package layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BorderLayoutDemo() {
        componentes();
        propiedades();
    }
    
    void componentes(){
        JLabel norte = new JLabel (" Norte ");  // instancia un objeto JLabel
        norte.setBackground(Color.red);         // asigna un color de fondo
        norte.setOpaque(true);                  // por default son transparentes
        
        JLabel sur = new JLabel (" Sur ");
        sur.setBackground(Color.blue);
        sur.setOpaque(true);  
        
        JLabel centro = new JLabel (" Centro ");
        centro.setBackground(Color.white);
        centro.setOpaque(true);          
        
        JLabel oeste = new JLabel (" Oeste ");
        oeste.setBackground(Color.yellow);
        oeste.setOpaque(true);  
        
        JLabel este = new JLabel (" Este ");
        este.setBackground(Color.green);
        este.setOpaque(true);  
        
        Container c = this.getContentPane();    // obtiene el ContentPane
        
        c.add( norte, BorderLayout.NORTH );     // incorpora los componentes
        c.add( centro, BorderLayout.CENTER );   // al ContentPane del JFrame
        c.add( sur, BorderLayout.SOUTH );       // asignándole una ubicación
        c.add( oeste, BorderLayout.WEST );      // en un BorderLayout 
        c.add( este, BorderLayout.EAST );
    }
    
    void propiedades() {
        // título de la ventana
        setTitle("BorderLayout");
        
        // comportamiento asociado a la acción close de la ventana
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);   
        
        // ubica la ventana respecto al escritorio.
        setLocation(400, 300);
        // asigna un tamaño a la ventana 
        setSize(300, 200);        
    }
    
    public static void main(String args[]) {
        // instancia y muestra un JFrame
        new BorderLayoutDemo().setVisible(true);
    }
}

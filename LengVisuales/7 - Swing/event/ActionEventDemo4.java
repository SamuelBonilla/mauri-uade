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

public class ActionEventDemo4 extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField jtf;
	JPasswordField jpf;
	JLabel lblEstado;
	
    public ActionEventDemo4() {
        componentes();
        propiedades();
    }
    
    void componentes(){
    	String leyenda = "Manejador de eventos en distintas inner class";
        Container c = this.getContentPane();    	
        
        // agrega un panel en el centro del JFrame
        JPanel pnlCentro = new JPanel();
        pnlCentro.setBorder(BorderFactory.createEmptyBorder(5,2,5,2));
        pnlCentro.setLayout( new GridLayout(2,2,3,3));
        c.add( pnlCentro, BorderLayout.CENTER );
        
        // agrega componentes a la grilla
        pnlCentro.add( new JLabel("Texto:"));		// agrega un nuevo JLabel
        jtf = new JTextField(10);					// crea una JTextField
        pnlCentro.add(jtf);							// agrega la JTextField
        pnlCentro.add( new JLabel("Contraseña:"));	// agrega un nuevo JLabel
        jpf = new JPasswordField(10);				// crea una JPasswordField
        pnlCentro.add(jpf);							// agrega la JPasswordField
		
        // agrega un label en la zona inferior del JFrame
        lblEstado = new JLabel(leyenda);
        lblEstado.setBorder(BorderFactory.createEtchedBorder());
        lblEstado.setHorizontalAlignment(JLabel.CENTER);
        c.add( lblEstado, BorderLayout.SOUTH );
        
        // asigna un manejador de eventos a la JTextField
        jtf.addActionListener( new ActionListener(){
        	public void actionPerformed(ActionEvent evt){
        		lblEstado.setText("texto: " + jtf.getText());
        	}
        });
        
        // asigna un manejador de eventos a la JPasswordField
        jpf.addActionListener( new ActionListener(){
        	public void actionPerformed(ActionEvent evt){
        		lblEstado.setText("contraseña: " +
        						 new String(jpf.getPassword()));
        	// el método getPassword() retorna un arreglo de char[]
        	// convertido a String con el constructor String(char[])
        	}
        });        
    }
    
    void propiedades() {
        setTitle("ActionEventDemo4");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setLocation(200, 100);
        pack();        
    }
    
    public static void main(String args[]) {
        new ActionEventDemo4().setVisible( true );
    }
}
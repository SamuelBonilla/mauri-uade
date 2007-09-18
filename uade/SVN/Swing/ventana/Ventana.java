package ventana;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;



public class Ventana extends JFrame { 
	
	void componentes(){
		Container c = this.getContentPane();        // obtiene el ContentPane
		
        JLabel norte = new JLabel (" Etiqueta Ubicada en el Sector Norte");  // instancia un objeto JLabel
        norte.setOpaque(false);                  // por default son transparentes
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(norte);
        
        c.add(panel1 , BorderLayout.NORTH);

        JButton btnAceptar = new JButton("ACEPTAR");
        JButton btnCancelar = new JButton("CANCELAR");
        JButton btnFinalizar = new JButton("FINALIZAR");
        JPanel panel2 = new JPanel(); 
        panel2.setLayout(new FlowLayout());
        panel2.add(btnAceptar);
        panel2.add(btnCancelar);
        panel2.add(btnFinalizar);
        
        c.add(panel2,BorderLayout.SOUTH);
               
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        
        JTextArea txtA = new JTextArea(6,16);
        panel3.add(txtA);
        
        c.add(panel3 , BorderLayout.WEST);
        
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(3,20,0,15));
             
        JLabel[] lbls = new JLabel[3];              // arreglo de 3 JLabels
        JTextField[] txfs = new JTextField[3];      // arreglo de 3 JTextFields
              
        for (int i = 0; i < lbls.length; i++) {
            lbls[i] = new JLabel ("Etiqueta " +i );  
            lbls[i].setLocation(10, 20 * i + 30);
            lbls[i].setSize(100, 20);
            txfs[i] = new JTextField(10);
            txfs[i].setBounds(110, 20 * i + 30 , 150, 20);           
            
            panel4.add( lbls[i] );
            panel4.add(txfs[i]);
        	}
        c.add(panel4, BorderLayout.EAST);
        
    }
    
    void propiedades() {
        // título de la ventana
        setTitle("Ejercicio SWING");
        
        // comportamiento asociado a la acción close de la ventana
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);   
        
        // ubica la ventana respecto al escritorio.
        setLocation(400, 300);
        // asigna un tamaño a la ventana 
       // setSize(300, 200);
        pack();
    }
    
 }


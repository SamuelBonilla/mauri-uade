/*
 * public class KeyEvent extends InputEvent 
 * {
 * 	  ...	
 * 	  public char getKeyChar() {
 * 		// retorna el char correspondiente a la tecla
 * 		// asociada al evento
 *    }
 * 	  public int getKeyCode() {
 * 		// retorna el int correspondiente a la tecla
 * 		// asociada al evento
 *    }
 * 	  public static String getKeyText(int keyCode) {
 * 		// retorna el String correspondente al código
 * 		// asociado al parámetro (Ej.: "HOME", "F1", "A")
 *    } 
 * 	  public void setKeyChar(char keyChar) {
 * 		// asigna un valor char como resultado del evento
 *    } 
 * 	  public void setKeyCode(int keyCode) {
 * 		// asigna un valor entero correspondiente a una tecla
 *      // como resultado del evento
 *    } * 
 * }
 * 
 * public interface KeyListener extends EventListener 
 * {
 * 	  public void keyTyped( KeyEvent evt );
 * 	  public void keyPressed( KeyEvent evt );
 * 	  public void keyReleased( KeyEvent evt );
 * }
 * 
 * public abstract KeyAdapter implements KeyListener 
 * {
 * 	  public void keyTyped( KeyEvent evt ){}
 * 	  public void keyPressed( KeyEvent evt ){}
 * 	  public void keyReleased( KeyEvent evt ){}
 * }
 */

package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextArea jtaIn, jtaOut;
	
    public KeyEventDemo() {
        componentes();
        propiedades();
    }
    
    void componentes(){
    	String texto = "Para copiar texto al area inferior debe "
    		         + "seleccionar un párrafo con el mouse y "
					 + "presionar F3.";
    	
//		Define una JTextArea para input    	
		jtaIn = new JTextArea(texto);
		jtaIn.setLineWrap(true);		// continúa el texto en la otra linea
		jtaIn.setWrapStyleWord(true);	// corta por palabra completa
		jtaIn.setFont(new Font("Serif", Font.BOLD, 18));
		
//		Define un JScrollPane para la JTextArea creada
		JScrollPane jspIn = new JScrollPane(jtaIn);
		jspIn.setPreferredSize(new Dimension(250,100));
		jspIn.setVerticalScrollBarPolicy(
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
//		Define una JTextArea para output
		jtaOut = new JTextArea(5,20);
		jtaOut.setEditable(false);
		jtaOut.setLineWrap(true);
		jtaOut.setWrapStyleWord(true);		
		JScrollPane jspOut = new JScrollPane(jtaOut);
		
//		Incorpora las JTextAreas al JFrame					
		getContentPane().add(jspIn, BorderLayout.CENTER);
		getContentPane().add(jspOut, BorderLayout.SOUTH);
		
//		Asigna un manejador de eventos a la JTextArea de input		
		AreaHandler ahnd = new AreaHandler();
		jtaIn.addKeyListener(ahnd);
    }
    
    void propiedades() {
        setTitle("KeyEventDemo");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);   
        setLocation(200, 100);
        pack();        
    }
    
	class AreaHandler extends KeyAdapter {
		public void keyPressed( KeyEvent e ) {
			if (e.getKeyCode() == KeyEvent.VK_F3) {
				jtaOut.append(jtaIn.getSelectedText() + "\n");
			}
		}
	}
	
    public static void main(String args[]) {
        new KeyEventDemo().setVisible( true );
    }
}
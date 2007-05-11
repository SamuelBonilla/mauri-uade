/*
 * Created on 22-ago-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author julio
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.awt.*;
import javax.swing.*;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio5TP1 extends JFrame implements ActionListener{
	
	private Container c;
	
	private JButton jbsalir;
	private JButton jbCGastanMas;
	private JButton jbCConDeficit;
	
	private JLabel jlIngresarOpción;
	
	private JTextArea jtSalida;
		
	private JScrollPane scroll;
	
	private JPanel jpanelNorte;
	private JPanel jpanelOeste;
	private JPanel jpanelEste;
	private JPanel jpanelSur;
	
	
	
	public Ejercicio5TP1 (){

		configurar();
		jbsalir.addActionListener(this);
		jbCConDeficit.addActionListener(this);
		jbCGastanMas.addActionListener(this);
	}
	
	private void configurar(){
		
		c = getContentPane ();
		/* INICIALIZAR BOTONES*/ 
		jbCGastanMas = new JButton ("Ciudades que Gastan Más");
		jbCConDeficit = new JButton ("Ciudades con deficit");
		jbsalir = new JButton ("SALIR");
		
		/*INICIALIZAR LABEL*/
		
		jlIngresarOpción = new JLabel ("Por favor, seleccione una opción:");
		jlIngresarOpción.setFont(new Font ("Book Antigua", Font.BOLD, 14));
		
		/*INICIALIZAR TEXT AREA*/
		
		jtSalida = new JTextArea (20,20);
		jtSalida.setBackground(Color.LIGHT_GRAY);
		jtSalida.setEditable(false);
		scroll = new JScrollPane (jtSalida);
		scroll.setVisible(true);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	
		/*INICIALIZAR PANELES*/
		
		jpanelNorte = new JPanel();
		jpanelEste = new JPanel();
		jpanelOeste = new JPanel();
		jpanelSur = new JPanel();
			
		
		/*ARMAR VENTANA*/
		jpanelOeste.setLayout(new GridLayout (2,1));
		jpanelNorte.setLayout(new GridLayout (2,1));
		
		
		jpanelOeste.add (jbCConDeficit);
		jpanelOeste.add (jbCGastanMas);
		
		jpanelNorte.add(jlIngresarOpción);
				
		jpanelEste.add(scroll);
				
		c.add(jpanelNorte, BorderLayout.NORTH);
		c.add(jbsalir, BorderLayout.SOUTH);
		c.add(jpanelOeste, BorderLayout.WEST);
		c.add(jpanelEste, BorderLayout.EAST);
		
			
		
	}
	public void actionPerformed (ActionEvent e){
		
		if (e.getSource()== jbsalir)
		{
			this.dispose();
		}
		
		if (e.getSource() == jbCConDeficit) 
		{
		
			
					/* LLAMAR AL MÉTODO QUE CORRESPONDA*/
			
									
			/*
			 * A continuación se muestra la forma de recorrer el vector de
			 * ciudades, completar con el nombre del vector utilizado
			 
	 
				for (int i = 0; i< nombre_vector.size(); i++){
				
					jtSalida.append (((Ciudad)/nombre_vector/.elementAt(i)).toString()+"\n");
				
				}
			
			
			*			
			*/
						
		}
		if (e.getSource() == jbCGastanMas){
			
					/*LLAMAR AL MÉTODO QUE CORRESPONDA*/
			
								
			/*
			 * A continuación se muestra la forma de recorrer el vector de
			 * provincias, completar con el nombre del vector utilizado
			 
			 
					for (int i = 0; i< nombre_vector.size(); i++){
						
						jtSalida.append (((Ciudad)/nombre_vector/.elementAt(i)).toString()+"\n");
						
					}
								
			*			
			*/
			
			}
		}
	
	public static void main (String args[]){
		
		Ejercicio5TP1 ventanaInicio = new Ejercicio5TP1 ();
		ventanaInicio.setTitle("Ejercicio Nº5 TP1");
		ventanaInicio.setSize (450,200);
		ventanaInicio.setVisible(true);
		ventanaInicio.setLocation(300,250);
		
		/* SE CONSIDERA UN SOLO PAÍS*/
			/*CARGA DE OBJETOS*/		
		
		Vector provincias = new Vector();
		Vector ciudadesP1 = new Vector();
		Vector ciudadesP2 = new Vector();
		Vector ciudadesP3 = new Vector();
		
		//CIUDADES//
		Ciudad ba = new Ciudad ("Ciudad de Buenos Aires",40,30,20,10,5,new Float (210.5));
		Ciudad mp = new Ciudad ("Mar del Plata",20,10,10,30,10,new Float (80));
		Ciudad cp = new Ciudad ("Carlos Paz",10,10,5,10,5,new Float (80));
		Ciudad cc = new Ciudad ("Cordoba Capital",20,20,10,10,20,new Float (90));
		
		//AGREGA CIUDADES AL VECTOR DE CADA PROVINCIA
		ciudadesP1.add(ba);
		ciudadesP1.add(mp);
		ciudadesP2.add(cp);
		ciudadesP2.add(cc);
		
		//PROVINCIAS//
		Provincia bsas = new Provincia ("Buenos Aires",ciudadesP1);
		Provincia cord = new Provincia ("Cordoba", ciudadesP2);
		
		//AGREGA PROVINCIAS AL VECTOR DE PROVINCIAS
		provincias.add(bsas);
		provincias.add(cord);
		
		//PAIS//
		Pais p = new Pais ("Argentina", provincias);
		
		
		
	}
	

}
	

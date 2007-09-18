package menu;

import javax.swing.*;
import java.awt.event.*;

public class MenuDemo {
	private JFrame frm;
	private JMenuItem mnSalir;
	private JMenuItem[] subItem = new JMenuItem[4];
	private JMenuItem mnMetal, mnMotif, mnWindows;
    private static final String METAL = 
            "javax.swing.plaf.metal.MetalLookAndFeel";
    private static final String MOTIF = 
            "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    
    private static final String WINDOWS =
    	"com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		
	private MenuDemo() {
		frm = new JFrame("Menu Demo");
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frm.dispose();
				System.exit(0);
			}
		});
		configurarMenu();
		
		frm.setSize(350,200);
		frm.setLocation(150,100);
		frm.setVisible(true);		
	}
	
	private void configurarMenu() {
		JMenuBar mnBar = new JMenuBar();
		frm.setJMenuBar(mnBar);

		JMenu mnArchivo = new JMenu("Archivo");
		mnBar.add(mnArchivo);

		JMenu subMenu = new JMenu("Sub Menú");
				
		mnSalir = new JMenuItem("Salir");
		mnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mnArchivo.add(subMenu);
		mnArchivo.add(new JSeparator());
		mnArchivo.add(mnSalir);
		
		for (int i = 0; i < subItem.length; i++) {
			subItem[i] = new JMenuItem("Opción" + (i+1));
			subItem[i].setEnabled(false);
			subMenu.add(subItem[i]);
		}
		
		JMenu mnVentana = new JMenu("Ventana");
		mnBar.add(mnVentana);
		
		mnMetal = new JMenuItem("Metal");
		mnMetal.setActionCommand(METAL);
		
		mnMotif = new JMenuItem("Motif");
		mnMotif.setActionCommand(MOTIF);
		
		mnWindows = new JMenuItem("Windows");
		mnWindows.setActionCommand(WINDOWS);
		
		LFHandler lfHnd = new LFHandler();
		mnMetal.addActionListener(lfHnd);
		mnMotif.addActionListener(lfHnd);
		mnWindows.addActionListener(lfHnd);
		
		mnVentana.add(mnMetal);
		mnVentana.add(mnMotif);
		mnVentana.add(mnWindows);
				
	}
	
	private class LFHandler implements ActionListener {
  		public void actionPerformed(ActionEvent e) {
            String lnf = e.getActionCommand();
            try {
                UIManager.setLookAndFeel(lnf);
                SwingUtilities.updateComponentTreeUI(frm);
            } 
            catch (Exception exc) {
                System.err.println("No levanto el LookAndFeel: " + lnf);
            }
        }
	}

	public static void main(String[] args) {
		new MenuDemo();
	}	
}


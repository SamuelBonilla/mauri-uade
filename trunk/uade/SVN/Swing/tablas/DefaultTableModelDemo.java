package tablas;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DefaultTableModelDemo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tabla;
	
	private DefaultTableModelDemo() {
        super("DefaultTableModelDemo");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/4, screenSize.height/3, 
             		  screenSize.width/2, screenSize.height/3);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }); 	
		configurar();
	}
	
	
	private void configurar() {
		String[] header = {"Articulo", "Cantidad", "Costo", "Pagado" };
		Object[][] data = { 
			{"Folio", new Integer(1000), new Float(.55f), new Boolean(false)},
			{"Sobre", new Integer(10000), new Float(.05f), new Boolean(false)},
			{"Resaltador", new Integer(150), new Float(1.10f), new Boolean(true)},
			{"Carpeta", new Integer(900), new Float(2.89f), new Boolean(true)}
		  };
		
		DefaultTableModel model = new DefaultTableModel(data, header) {
			/**
			 * 
			 */						
			private static final long serialVersionUID = 1L;
			Class[] types =  { String.class, Integer.class, 
					           Double.class, Boolean.class };
            @SuppressWarnings("unchecked")
			public Class getColumnClass(int col) {
                return types [col];
            }
            public boolean isCellEditable(int row, int col) {
            	return true;
            }
		};
			
		tabla = new JTable();
		tabla.setModel(model);
		
		getContentPane().add(tabla.getTableHeader(), BorderLayout.NORTH);
		getContentPane().add(new JScrollPane(tabla), BorderLayout.CENTER);
	}

	public static void main(String args[]) {
		new DefaultTableModelDemo().setVisible(true);
	}
}
package listas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList list;
    private DefaultListModel listModel;
    private JTextField text;
    private JButton btnAgregar, btnQuitar;
    
    private ListDemo() {
        super("DemoList");

		// crea la listModel y agrega items
        listModel = new DefaultListModel();
        listModel.addElement("Elemento A");
        listModel.addElement("Elemento B");
        listModel.addElement("Elemento C");
        listModel.addElement("Elemento D");
        
        //Crea la lista y la coloca en un scrollpane
        list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(new ListSelection());

        JScrollPane listScrollPane = new JScrollPane(list);

		//crea la caja de texto
        String s = listModel.getElementAt(
                     list.getSelectedIndex()).toString();
		text = new JTextField(s,10);
		AgregarActionListener action = new AgregarActionListener();
        text.addActionListener(action);
        
		//crea los botones
	    btnAgregar = new JButton("agregar");
        btnAgregar.addActionListener(action);        
	    btnQuitar = new JButton("quitar");
        btnQuitar.addActionListener(new QuitarActionListener());        
        
		// ubica componentes en el contentpane
        Container c = getContentPane();
        c.add(listScrollPane, BorderLayout.CENTER);
        
        JPanel pnls = new JPanel();
        pnls.add(text);
		pnls.add(btnAgregar);        
		pnls.add(btnQuitar);		
        c.add(pnls, BorderLayout.SOUTH);
    }
    
    // evento selección de items
    class ListSelection implements ListSelectionListener {    
	    public void valueChanged(ListSelectionEvent e) {
	        if (e.getValueIsAdjusting() == false) {
	            if (list.getSelectedIndex() == -1) {
	                btnQuitar.setEnabled(false);
	                text.setText("");
	            } else {
	                btnQuitar.setEnabled(true);
	                String s = list.getSelectedValue().toString();
	                text.setText(s);
	            }
	        }    	
	    }
    }
    
    // evento acción agregar
    class AgregarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //texto sin datos
            if (text.getText().equals("")) {
                Toolkit.getDefaultToolkit().beep();
                return;
            }

            int index = list.getSelectedIndex();
            int size = listModel.getSize();

            //Inserta un elemento en la posición siguiente 
            //a la actual y selecciona el elemento agregado.
            if (index == -1 || (index+1 == size)) {
                listModel.addElement(text.getText());
                list.setSelectedIndex(size);
            } else {
                listModel.insertElementAt(text.getText(), index+1);
                list.setSelectedIndex(index+1);
            }
        }
    } 
    
    // evento acción quitar    
    class QuitarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int index = list.getSelectedIndex();
            listModel.remove(index);

            int size = listModel.getSize();

            if (size == 0) {
                btnQuitar.setEnabled(false);
            } else {
                if (index == listModel.getSize())
                	list.setSelectedIndex(index - 1);
                else {
                	list.setSelectedIndex(index);
                }	
            }
        }
    }       
    
    public static void main(String s[]) {
        JFrame frame = new ListDemo();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setLocation(250,100);
        frame.setVisible(true);
    }
} 
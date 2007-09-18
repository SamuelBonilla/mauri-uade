package dialogos;


import javax.swing.*;

public class ConfirmDialog2 {
    
    public ConfirmDialog2() {
        Object[] arreglo = { new JLabel("Nombre:"),
                             new JTextField(),
                             new JLabel("Apellido:"),
                             new JTextField() 
                           };
        int i = JOptionPane.showConfirmDialog(null, 
                        arreglo,                        // objeto
                        "Ingresar datos",               // título
                        JOptionPane.OK_CANCEL_OPTION,   // tipo de díalogo
                        JOptionPane.QUESTION_MESSAGE    // tipo de mensaje
                        );
        if ( i==0 ) {
        	JTextArea jta = new JTextArea(5,20);
        	jta.setEditable(false);
        	jta.append("Nombre:\t");
        	jta.append(((JTextField)arreglo[1]).getText());
        	jta.append("\nApellido:\t");
        	jta.append(((JTextField)arreglo[3]).getText());
            JOptionPane.showMessageDialog(null, 
                        new JScrollPane(jta),           // area de texto scrollable
                        "Valores ingresados",
                        JOptionPane.INFORMATION_MESSAGE
                        );
        }
    }
    
    public static void main(String[] args) {
        new ConfirmDialog2();
        System.exit(0);
    }
    
}

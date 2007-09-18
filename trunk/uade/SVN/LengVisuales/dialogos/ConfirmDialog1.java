package dialogos;

import javax.swing.*;

public class ConfirmDialog1 {
    
    public ConfirmDialog1() {
        int i = JOptionPane.showConfirmDialog(null, 
                        "Contin�a:",                // mensaje
                        "ConfirmDialog",            // t�tulo
                        JOptionPane.YES_NO_OPTION,  // tipo de d�alogo
                        JOptionPane.PLAIN_MESSAGE   // tipo de mensaje
                        );
        if ( i==0 )
            JOptionPane.showMessageDialog(null, "Respondi� si");
        else
            JOptionPane.showMessageDialog(null, "No respondi�");
    }
    
    public static void main(String[] args) {
        new ConfirmDialog1();
        System.exit(0);
    }
    
}

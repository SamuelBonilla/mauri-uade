package dialogos;

import javax.swing.*;

public class ConfirmDialog1 {
    
    public ConfirmDialog1() {
        int i = JOptionPane.showConfirmDialog(null, 
                        "Continúa:",                // mensaje
                        "ConfirmDialog",            // título
                        JOptionPane.YES_NO_OPTION,  // tipo de díalogo
                        JOptionPane.PLAIN_MESSAGE   // tipo de mensaje
                        );
        if ( i==0 )
            JOptionPane.showMessageDialog(null, "Respondió si");
        else
            JOptionPane.showMessageDialog(null, "No respondió");
    }
    
    public static void main(String[] args) {
        new ConfirmDialog1();
        System.exit(0);
    }
    
}

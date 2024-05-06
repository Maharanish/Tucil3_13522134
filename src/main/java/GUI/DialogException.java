package GUI;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogException extends JDialog {
    public DialogException(String message) {
        JLabel label = new JLabel(message);
        add(label);
        
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

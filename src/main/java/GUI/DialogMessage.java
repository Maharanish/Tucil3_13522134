package GUI;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogMessage extends JDialog {
    public DialogMessage(String message) {
        JLabel label = new JLabel(message);
        add(label);
        
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

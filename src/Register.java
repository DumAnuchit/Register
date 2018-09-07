import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField textUser;
    private JTextField textPassword;
    private JTextField textRePassword;
    private JButton registerButton;
    private JPanel mainPanel;

    public Register() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUser.getText()
                        + " " + new String(textPassword.getText() + " "
                        + " " + new String(textRePassword.getText())));
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}

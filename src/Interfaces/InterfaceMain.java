package Interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMain extends JDialog {
    private JTextField tfUser;
    private JPasswordField tfPassword;
    private JButton bConect;
    private JLabel title;
    private JLabel lUser;
    private JLabel lPassword;
    private JLabel iconHome;
    private JPanel loginPanel;

    public InterfaceMain(JFrame parent) {
        setContentPane(loginPanel);
        setModal(true);
        getRootPane().setDefaultButton(bConect);
        setTitle("DB - Alquileres Xalapa");
        setSize(400, 225);
        setLocationRelativeTo(parent);
        setVisible(true);

        bConect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void loginUser() {
        String user = tfUser.getText();
        String password = String.valueOf(tfPassword.getPassword());
    }
}

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

        bConect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });

        setVisible(true);
    }

    public void loginUser() {
        String user = tfUser.getText();
        String password = String.valueOf(tfPassword.getPassword());

        if(user.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese su usuario y contraseña",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if(user != "root" || user != "Cliente" || user != "Tecnico"){
            JOptionPane.showMessageDialog(this,
                    "El usuario ingresado no existe",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if(){

        }
    }
}

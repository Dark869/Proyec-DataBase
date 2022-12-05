package Interfaces;

import Connetions.ConecctionDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMain extends JDialog {
    public JTextField tfUser;
    public JPasswordField tfPassword;
    private JButton bConect;
    private JLabel title;
    private JLabel lUser;
    private JLabel lPassword;
    private JLabel iconHome;
    private JPanel loginPanel;

    public InterfaceMain(JFrame parent) {
        setContentPane(loginPanel);
        setModal(true);
        setTitle("DB - Alquileres Xalapa");
        setSize(400, 225);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        ConecctionDB cdb = new ConecctionDB();

        bConect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                loginUser();
            }
        });

    }

    public InterfaceMain() {

    }
    public void loginUser() {
        String user = tfUser.getText();
        String password = String.valueOf(tfPassword.getPassword());

        if(user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese su usuario y contraseña",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else{
            ConecctionDB.connect(user, password);
        }
    }
    public void DontConection(){
        JOptionPane.showMessageDialog(this,
                "No se puedo conectar a la base de datos,\n" +
                        "verifique los datos ingresados",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    public void ConnectionSuccessful(){
        JOptionPane.showMessageDialog(this,
                "Se inicio sesion en la base de datos\n" +
                "con exito",
                "Conexion exitosa",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

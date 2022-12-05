package Interfaces;

import javax.swing.*;

public class MainMenu extends JDialog {
    private JButton bRegisData;
    private JButton bQueryData;
    private JButton bQuick;
    private JPanel mainMenu;

    public MainMenu(JFrame parent){
        setContentPane(mainMenu);
        setModal(true);
        setTitle("DB - Alquileres Xalapa");
        setSize(400, 225);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }
    public MainMenu(){

    }
}

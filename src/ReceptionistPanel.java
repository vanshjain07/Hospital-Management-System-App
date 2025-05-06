import javax.swing.*;

public class ReceptionistPanel extends JFrame {
    public ReceptionistPanel() {
        setTitle("Receptionist Panel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Welcome Receptionist!");
        add(label);

        // TODO: Add functionalities for managing appointments and patient records
    }
}

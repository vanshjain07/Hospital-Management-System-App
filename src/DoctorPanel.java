import javax.swing.*;

public class DoctorPanel extends JFrame {
    public DoctorPanel() {
        setTitle("Doctor Panel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Welcome Doctor!");
        add(label);

        // TODO: Add functionalities for viewing appointments and patient lists
    }
}

/**
 *Version 1 of a login screen. Merely a starting place;
 * v1.0 - created 3/5/17
 * Luke Buthman
 */

import javax.swing.*;
import java.awt.*;

public class ClientCoachScreen extends JPanel {

    private JLabel logo;
    private JButton ClientButton;
    private JButton CoachButton;

    public ClientCoachScreen() {

        initGUI();
        constructLayout();

        ClientButton.addActionListener(e -> { });

        CoachButton.addActionListener(e -> { });
    }

    private void initGUI() {

        logo = new JLabel("StrongFood");
        ClientButton = new JButton("I'm here to get fit");
        CoachButton = new JButton("I'm here to coach");

    }

    private void constructLayout() {

        JPanel topPane = new JPanel();
        JPanel middlePane = new JPanel();

        topPane.setLayout(new FlowLayout());
        topPane.add(logo);

        middlePane.setLayout(new FlowLayout());
        middlePane.add(ClientButton);
        middlePane.add(CoachButton);

        setLayout(new BorderLayout());
        add(topPane, "North");
        add(middlePane, "Center");
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("StrongFood App");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.add(new ClientCoachScreen());
        frame.setVisible(true);
    }
}

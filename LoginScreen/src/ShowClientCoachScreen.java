/**
 *Version 1 of a login screen. Merely a starting place;
 * v1.0 - created 3/5/17
 * Luke Buthman
 */

import javafx.scene.layout.BorderPane;

import javax.swing.*;
import java.awt.*;

public class ShowClientCoachScreen extends JFrame {
    public ShowClientCoachScreen() {

        JPanel panel = new JPanel();

        BorderLayout layout = new BorderLayout(5, 5);
        panel.setLayout(layout);

        Font fontHeader = new Font("SansSerif", Font.BOLD, 18);
        Font fontButtons = new Font("SansSerif", Font.PLAIN, 14);

        JTextArea header = new JTextArea("Welcome! Hit the button that describes you.");
        header.setFont(fontHeader);
        panel.add(header, BorderLayout.NORTH);

        JButton jbtClient = new JButton("I'm here to get fit!");
        jbtClient.setFont(fontButtons);
        jbtClient.setBackground(Color.BLUE);
        jbtClient.setForeground(Color.GREEN);

        JButton jbtCoach = new JButton("I'm here to coach");
        jbtClient.setFont(fontButtons);

        panel.add(jbtClient, BorderLayout.WEST);
        panel.add(jbtCoach, BorderLayout.EAST);

        add(panel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {

        ShowClientCoachScreen frame = new ShowClientCoachScreen();

        frame.setTitle("StrongFood");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

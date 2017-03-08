/**
 *Version 1 of a login screen. Merely a starting place;
 * v1.0 - created 3/5/17
 * Luke Buthman
 */

import com.sun.deploy.util.SessionState;

import javax.swing.*;
import java.awt.*;

public class ClientCoachScreen extends JFrame {

    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel jlbHeader;
    private JLabel jlbStatus;
    private JLabel jlbMessage;

    public ClientCoachScreen() {
        prepareGUI();
    }

    public static void main(String args[]) {

        ClientCoachScreen screen = new ClientCoachScreen();
        screen.showGroupLayout();
    }

    private void prepareGUI() {

        mainFrame = new JFrame("StrongFood");
        mainFrame.setSize(1000, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        jlbHeader = new JLabel("", JLabel.CENTER);
        jlbStatus = new JLabel("", JLabel.CENTER);
        jlbStatus.setSize(350, 100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(jlbHeader);
        mainFrame.add(controlPanel);
        mainFrame.add(jlbStatus);
        mainFrame.setVisible(true);

    }

    private void showGroupLayout() {

        //set fonts for header and buttons
        Font fontHeader = new Font("SansSerif", Font.BOLD, 18);
        Font fontButtons = new Font("SansSerif", Font.BOLD, 14);

        //text for the program header
        jlbHeader.setText("Welcome! Hit the button that describes you.");
        jlbHeader.setFont(fontHeader);

        //main mainPanel to house group layout
        JPanel panel = new JPanel();
        panel.setSize(600, 400);

        //create group layout
        GroupLayout layout = new GroupLayout(panel);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);


        //client login button
        JButton jbtClient = new JButton("I'm here to get fit!");
        jbtClient.setFont(fontButtons);
        /*jbtClient.setBackground(Color.BLACK);
        jbtClient.setForeground(Color.WHITE);
        jbtClient.setOpaque(true);
        jbtClient.setBorderPainted(false);
        jbtClient.setPreferredSize(new Dimension(40, 40));
        jbtClient.setMaximumSize(new Dimension(40, 40));*/

        //coach login button
        JButton jbtCoach = new JButton("I'm here to coach");
        jbtCoach.setFont(fontButtons);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(jlbHeader)
                            .addGap(20, 20, 40)
                            .addComponent(jbtClient)
                            .addGap(5, 5, 20)
                            .addComponent(jbtCoach))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(jlbHeader)
                        .addGap(20, 20, 40)
                        .addComponent(jbtClient)
                        .addGap(5, 5, 20)
                        .addComponent(jbtCoach)
        );

        panel.setLayout(layout);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

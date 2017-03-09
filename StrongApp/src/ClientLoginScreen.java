import javax.swing.*;
import java.awt.*;

/**
 * Redirect screen for client login
 * Created by lbuthman on 3/6/17.
 */
public class ClientLoginScreen extends JPanel {

    private JLabel jlbFirst, jlbLast, jlbBirthdate, jlbEmail, jlbPassword, jlbMessage, jlbUsername;
    private JTextField jtfFirst, jtfLast, jtfBirthdate, jtfEmail, jtfUserName;
    private JPasswordField jtfPassword;
    private JButton jbtnSignUp, jbtnLogin, jbtnReset;

    public ClientLoginScreen() {

        initGUI();
        constructLayout();

        jbtnSignUp.addActionListener(e -> { });

        jbtnLogin.addActionListener(e -> { });

        jbtnReset.addActionListener(e -> { });
    }

    private void initGUI() {

        jlbMessage = new JLabel("StrongFood Login", JLabel.CENTER);
        jlbFirst = new JLabel("First Name: ");
        jlbLast = new JLabel("Last Name: ");
        jlbEmail = new JLabel("Email Address: ");
        jlbBirthdate = new JLabel("Birthdate: ");
        jlbPassword = new JLabel("Password: ");
        jlbUsername = new JLabel("Username: ");

        jtfFirst = new JTextField(6);
        jtfFirst.setPreferredSize(new Dimension(1, 1));
        jtfFirst.setMaximumSize(new Dimension(1, 1));
        jtfLast = new JTextField(6);
        jtfBirthdate = new JTextField(6);
        jtfEmail = new JTextField(6);
        jtfUserName = new JTextField(6);

        jtfPassword = new JPasswordField(6);

        jbtnLogin = new JButton("Log Me In!");
        jbtnReset = new JButton("Forgot Password");
        jbtnSignUp = new JButton("Sign Me Up!");

    }

    private void constructLayout() {


        Box leftBox = Box.createVerticalBox();

        JPanel leftPanel = new JPanel();
        GridLayout gridLeft = new GridLayout(7, 2, 5, 5);
        leftPanel.setLayout(gridLeft);
        leftPanel.add(jlbFirst);
        leftPanel.add(jtfFirst);
        leftPanel.add(jlbLast);
        leftPanel.add(jtfLast);
        leftPanel.add(jlbBirthdate);
        leftPanel.add(jtfBirthdate);
        leftPanel.add(jlbEmail);
        leftPanel.add(jtfEmail);
        leftPanel.add(jlbUsername);
        leftPanel.add(jtfUserName);
        leftPanel.add(jlbPassword);
        leftPanel.add(jtfPassword);
        leftPanel.add(jbtnSignUp);

        leftBox.add(Box.createVerticalStrut(20));
        leftBox.setSize(200, 400);
        leftBox.add(leftPanel);

        Box rightBox = Box.createVerticalBox();
        rightBox.add(jlbUsername);
        rightBox.add(jtfUserName);
        rightBox.add(jlbPassword);
        rightBox.add(jtfPassword);
        rightBox.add(jbtnLogin);
        rightBox.add(jbtnReset);

        rightBox.setSize(200, 400);

        Box centerBox = Box.createVerticalBox();
        centerBox.setSize(200, 400);


        setLayout(new BorderLayout());
        add(jlbMessage, "North");
        add(leftBox, "West");
        add(rightBox, "East");
        add(centerBox, "Center");

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("StrongFood App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.add(new ClientLoginScreen());
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * Redirect screen for client login
 * Created by lbuthman on 3/6/17.
 */
public class ClientLoginScreen extends JPanel {

    private JLabel lbFirst, lbLast, lbBirthdate, lbEmail, lbPWLogin, lbPWSignUp, lbMessage, lbUsernameSignup, lbUsernameLogin;
    private JTextField tfFirst, tfLast, tfBirthdate, tfEmail, tfUsernameSignup, tfUsernameLogin;
    private JPasswordField tfPWLogin, tfPWSignUp;
    private JButton btnSignUp, btnLogin, btnReset;

    public ClientLoginScreen() {

        initGUI();
        constructLayout();

        btnSignUp.addActionListener(e -> { });

        btnLogin.addActionListener(e -> { });

        btnReset.addActionListener(e -> { });
    }

    private void initGUI() {

        lbMessage = new JLabel("StrongFood Login", JLabel.CENTER);
        lbFirst = new JLabel("First Name: ");
        lbLast = new JLabel("Last Name: ");
        lbEmail = new JLabel("Email Address: ");
        lbBirthdate = new JLabel("Birthdate: ");
        lbPWLogin = new JLabel("Password: ");
        lbPWSignUp = new JLabel("Password: ");
        lbUsernameSignup = new JLabel("Username: ");
        lbUsernameLogin = new JLabel("Username: ");

        tfFirst = new JTextField();
        tfLast = new JTextField();
        tfBirthdate = new JTextField();
        tfEmail = new JTextField();
        tfUsernameSignup = new JTextField();
        tfUsernameLogin = new JTextField();

        tfPWLogin = new JPasswordField();
        tfPWSignUp = new JPasswordField();

        btnLogin = new JButton("Log Me In!");
        btnReset = new JButton("Forgot Password");
        btnSignUp = new JButton("Sign Me Up!");

    }

    private void constructLayout() {


        Box leftBox = Box.createVerticalBox();

        JPanel leftPanel = new JPanel();
        GridLayout gridLeft = new GridLayout(7, 2, 5, 5);
        leftPanel.setMaximumSize(new Dimension(250, 220));
        leftPanel.setLayout(gridLeft);
        leftPanel.add(lbFirst);
        leftPanel.add(tfFirst);
        leftPanel.add(lbLast);
        leftPanel.add(tfLast);
        leftPanel.add(lbBirthdate);
        leftPanel.add(tfBirthdate);
        leftPanel.add(lbEmail);
        leftPanel.add(tfEmail);
        leftPanel.add(lbUsernameSignup);
        leftPanel.add(tfUsernameSignup);

        leftPanel.add(lbPWSignUp);
        leftPanel.add(tfPWSignUp);
        leftPanel.add(btnSignUp);

        leftBox.add(Box.createVerticalStrut(20));
        leftBox.setSize(200, 200);
        leftBox.add(leftPanel);

        Box rightBox = Box.createVerticalBox();

        JPanel rightPanel = new JPanel();
        GridLayout rightGrid = new GridLayout(3, 2, 5, 5);
        rightPanel.setMaximumSize(new Dimension(275, 95));
        rightPanel.setLayout(rightGrid);
        rightPanel.add(lbUsernameLogin);
        rightPanel.add(tfUsernameLogin);
        rightPanel.add(lbPWLogin);
        rightPanel.add(tfPWLogin);
        rightPanel.add(btnLogin);
        rightPanel.add(btnReset);

        rightBox.add(Box.createVerticalStrut(40));
        rightBox.add(rightPanel);


        setLayout(new BorderLayout());
        add(lbMessage, "North");
        add(leftBox, "West");
        add(rightBox, "East");

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("StrongFood App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.add(new ClientLoginScreen());
        frame.setSize(600, 300);
        frame.setVisible(true);
    }
}

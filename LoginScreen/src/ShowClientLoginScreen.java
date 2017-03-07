import javax.swing.*;
import java.awt.*;

/**
 * Redirect screen for client login
 * Created by lbuthman on 3/6/17.
 */
public class ShowClientLoginScreen extends JFrame {
    public ShowClientLoginScreen() {

        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(2, 2, 5, 5);
        panel.setLayout(grid);

        Label lbUsername = new Label("username: ");
        JTextField tfUserName = new JTextField(8);

        Label lbPassword = new Label("password: ");
        JTextField tfPassword = new JTextField(8);

        panel.add(lbUsername);
        panel.add(tfUserName);
        panel.add(lbPassword);
        panel.add(tfPassword);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {

        ShowClientLoginScreen frame = new ShowClientLoginScreen();

        frame.setTitle("StrongFood");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

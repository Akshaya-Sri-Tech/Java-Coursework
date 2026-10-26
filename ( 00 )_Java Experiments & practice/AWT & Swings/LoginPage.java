import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginPage extends Frame {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;
    private Label statusLabel; // Replaces the popup dialog

    public LoginPage() {
        setTitle("Login Page");
        setSize(280, 200);
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username:");
        usernameField = new TextField(15);
        
        Label passwordLabel = new Label("Password:");
        passwordField = new TextField(15);
        passwordField.setEchoChar('*'); // Masks password characters
        
        loginButton = new Button("Login");
        statusLabel = new Label(""); // Initial empty status message

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(statusLabel);

        // Action listener for login click
        loginButton.addActionListener(this::handleLogin);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void handleLogin(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        // Authentication logic
        if (username.equals("admin") && password.equals("password")) {
            statusLabel.setForeground(new Color(0, 150, 0)); // Dark Green
            statusLabel.setText("Login successful!");
        } else {
            statusLabel.setForeground(Color.RED);
            statusLabel.setText("Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
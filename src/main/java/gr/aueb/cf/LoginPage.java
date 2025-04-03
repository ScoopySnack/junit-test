package gr.aueb.cf;

import javax.swing.*;
import java.awt.*;


public class LoginPage {


    public static void main( String[] args ){
        // Create Frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(3, 2, 15, 15));

        // Create UI Components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        // Add components to frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // Button Click Event
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            // Simple authentication (Replace with real validation)
            if (username.equals("admin") && password.equals("1234")) {
                messageLabel.setText("Login Successful!");
                messageLabel.setForeground(Color.GREEN);
            } else {
                messageLabel.setText("Invalid Credentials!");
                messageLabel.setForeground(Color.RED);
            }
        });

        // Show Frame
        frame.setVisible(true);
    }

}

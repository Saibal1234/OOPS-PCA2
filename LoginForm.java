import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    // Components
    JLabel nameLabel, passLabel;
    JTextField nameField;
    JPasswordField passField;
    JButton submitButton;

    // Constructor
    LoginForm() {
        // Frame setup
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Create components
        nameLabel = new JLabel("Name:");
        passLabel = new JLabel("Password:");
        nameField = new JTextField();
        passField = new JPasswordField();
        submitButton = new JButton("Submit");

        // Add ActionListener to the button
        submitButton.addActionListener(this);

        // Add components to frame
        add(nameLabel);
        add(nameField);
        add(passLabel);
        add(passField);
        add(new JLabel("")); // empty label for spacing
        add(submitButton);

        // Make the frame visible
        setVisible(true);
    }

    // Event handling for button click
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String password = new String(passField.getPassword());

        if (!name.isEmpty() && !password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Welcome, " + name + "!");

            // ✅ Print to terminal
            System.out.println("Form submitted successfully!");
            System.out.println("Name entered: " + name);
            System.out.println("Password entered: " + password);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both name and password.", "Error", JOptionPane.ERROR_MESSAGE);

            // ✅ Print error to terminal
            System.out.println("Form submission failed — name or password missing.");
        }
    }

    // Main method
    public static void main(String[] args) {
        new LoginForm();
    }
}

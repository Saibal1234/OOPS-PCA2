import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Text fields for input and output
    JTextField t1, t2, t3;
    // Buttons for addition and subtraction
    JButton b1, b2;

    // Constructor
    SimpleCalculator() {
        // Create the frame
        setTitle("Simple Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel l1 = new JLabel("Enter first number:");
        t1 = new JTextField(10);

        JLabel l2 = new JLabel("Enter second number:");
        t2 = new JTextField(10);

        JLabel l3 = new JLabel("Result:");
        t3 = new JTextField(10);
        t3.setEditable(false); // result should not be edited manually

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");

        // Add ActionListeners to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Add components to frame
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);

        // Make frame visible
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == b1) {
                result = num1 + num2;
            } else if (e.getSource() == b2) {
                result = num1 - num2;
            }

            t3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
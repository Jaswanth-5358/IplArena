package mybeans;

import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialBean extends JPanel implements Serializable {
    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public FactorialBean() {
        setLayout(new GridLayout(3, 1));

        // Input field
        inputField = new JTextField(10);
        add(new JLabel("Enter a Number:"));
        add(inputField);

        // Calculate button
        calculateButton = new JButton("Calculate Factorial");
        add(calculateButton);

        // Result label
        resultLabel = new JLabel("Factorial: ");
        add(resultLabel);

        // Event Listener
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
    }

    // Method to calculate factorial
    private void calculateFactorial() {
        try {
            int num = Integer.parseInt(inputField.getText());
            if (num < 0) {
                resultLabel.setText("Factorial: Invalid (Negative Number)");
                return;
            }
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            resultLabel.setText("Factorial: " + factorial);
        } catch (NumberFormatException e) {
            resultLabel.setText("Factorial: Invalid Input");
        }
    }

    // Getter for result
    public String getResult() {
        return resultLabel.getText();
    }
}

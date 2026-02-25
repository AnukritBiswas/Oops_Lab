package Day_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyCalc implements ActionListener {
    // Component declarations
    JFrame frame;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;
    JLabel l1, l2, l3;

    MyCalc() {
        frame = new JFrame("My Calc");

        // Initializing Labels
        l1 = new JLabel("Enter the First Number:");
        l2 = new JLabel("Enter the Second Number:");
        l3 = new JLabel("result:");

        // Initializing TextFields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false); // Result field should not be editable

        // Initializing Buttons
        b1 = new JButton("Add");
        b2 = new JButton("subtract");
        b3 = new JButton("multiply");
        b4 = new JButton("reset");

        // Setting layout and bounds to match the image structure
        frame.setLayout(null);

        l1.setBounds(50, 50, 150, 20);
        t1.setBounds(210, 50, 50, 20);
        b1.setBounds(280, 50, 80, 25);

        l2.setBounds(50, 80, 150, 20);
        t2.setBounds(210, 80, 50, 20);
        b2.setBounds(370, 50, 100, 25);

        l3.setBounds(50, 110, 150, 20);
        t3.setBounds(210, 110, 100, 25);
        b3.setBounds(480, 50, 100, 25);

        b4.setBounds(390, 85, 80, 25);

        // Adding components to frame
        frame.add(l1); frame.add(t1); frame.add(b1);
        frame.add(l2); frame.add(t2); frame.add(b2);
        frame.add(l3); frame.add(t3); frame.add(b3);
        frame.add(b4);

        // Adding ActionListeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        frame.setSize(650, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == b1) {
                res = n1 + n2;
            } else if (e.getSource() == b2) {
                res = n1 - n2;
            } else if (e.getSource() == b3) {
                res = n1 * n2;
            }

            if (e.getSource() == b4) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            } else {
                t3.setText(String.valueOf(res));
            }
        } catch (NumberFormatException ex) {
            if (e.getSource() == b4) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            } else {
                t3.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}

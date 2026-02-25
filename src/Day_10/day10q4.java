package Day_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RGBPicker extends JFrame {
    private JComboBox<Integer> redCombo, blueCombo, greenCombo;
    private JButton showButton;
    private JPanel mainPanel;

    public RGBPicker() {
        setTitle("My Frame");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(84, 178, 122)); // Initial green color from image

        // Create range 0-255 for combo boxes
        Integer[] values = new Integer[256];
        for (int i = 0; i <= 255; i++) {
            values[i] = i;
        }

        // Red Components
        JLabel lblRed = new JLabel("Red");
        lblRed.setForeground(Color.RED);
        lblRed.setBounds(110, 25, 30, 25);
        redCombo = new JComboBox<>(values);
        redCombo.setSelectedItem(83); // Match image
        redCombo.setBounds(140, 25, 60, 25);

        // Blue Components
        JLabel lblBlue = new JLabel("Blue");
        lblBlue.setForeground(Color.BLUE);
        lblBlue.setBounds(210, 25, 35, 25);
        blueCombo = new JComboBox<>(values);
        blueCombo.setSelectedItem(184); // Match image
        blueCombo.setBounds(245, 25, 60, 25);

        // Green Components
        JLabel lblGreen = new JLabel("Green");
        lblGreen.setForeground(Color.GREEN);
        lblGreen.setBounds(315, 25, 45, 25);
        greenCombo = new JComboBox<>(values);
        greenCombo.setSelectedItem(115); // Match image
        greenCombo.setBounds(360, 25, 60, 25);

        // Show-Output Button
        showButton = new JButton("Show-Output");
        showButton.setBounds(440, 25, 120, 25);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = (int) redCombo.getSelectedItem();
                int g = (int) greenCombo.getSelectedItem();
                int b = (int) blueCombo.getSelectedItem();

                // Change panel background based on RGB selection
                mainPanel.setBackground(new Color(r, g, b));
            }
        });

        // Add everything to the panel
        mainPanel.add(lblRed); mainPanel.add(redCombo);
        mainPanel.add(lblBlue); mainPanel.add(blueCombo);
        mainPanel.add(lblGreen); mainPanel.add(greenCombo);
        mainPanel.add(showButton);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RGBPicker();
    }
}

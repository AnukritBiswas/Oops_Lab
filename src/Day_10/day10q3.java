package Day_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorChanger extends JFrame {
    private JList<String> colorList;
    private JButton clickButton;
    private JPanel mainPanel;

    public ColorChanger() {
        setTitle("My frame");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel whose color will change
        mainPanel = new JPanel();
        mainPanel.setLayout(null); // Using null layout to match image positioning

        // Color names for the List Box
        String[] colors = {"white", "orange", "red", "blue"};
        colorList = new JList<>(colors);
        colorList.setBounds(180, 20, 50, 80);

        // Button to trigger the change
        clickButton = new JButton("Click");
        clickButton.setBounds(240, 45, 80, 30);

        // Add action listener to the button
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();

                if (selectedColor != null) {
                    switch (selectedColor) {
                        case "white": mainPanel.setBackground(Color.WHITE); break;
                        case "orange": mainPanel.setBackground(Color.ORANGE); break;
                        case "red": mainPanel.setBackground(Color.RED); break;
                        case "blue": mainPanel.setBackground(Color.BLUE); break;
                    }
                }
            }
        });

        // Add components to panel
        mainPanel.add(colorList);
        mainPanel.add(clickButton);

        // Add panel to frame
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}

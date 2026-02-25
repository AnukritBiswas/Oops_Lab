package Day_10;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

class RegistrationForm extends JFrame {

    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // ----- Image at the top -----
        JLabel imageLabel = createImageLabel();
        add(imageLabel, BorderLayout.NORTH);

        // ----- Form panel with GridBagLayout -----
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Row 0: Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Name:"), gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        formPanel.add(nameField, gbc);
        gbc.fill = GridBagConstraints.NONE;  // reset
        gbc.weightx = 0.0;

        // Row 1: Address
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Address:"), gbc);

        JTextArea addressArea = new JTextArea(4, 20);
        addressArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        formPanel.add(scrollPane, gbc);
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;

        // Row 2: Gender (Radio buttons)
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Gender:"), gbc);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(genderPanel, gbc);

        // Row 3: Hobbies (Checkboxes)
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Hobbies:"), gbc);

        JPanel hobbiesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox music = new JCheckBox("Music");
        JCheckBox sports = new JCheckBox("Sports");
        hobbiesPanel.add(reading);
        hobbiesPanel.add(music);
        hobbiesPanel.add(sports);
        gbc.gridx = 1;
        formPanel.add(hobbiesPanel, gbc);

        // Row 4: Register Button (centered, spanning both columns)
        JButton registerButton = new JButton("Register");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(15, 5, 5, 5);
        formPanel.add(registerButton, gbc);

        // Add form panel to center
        add(formPanel, BorderLayout.CENTER);

        // Optional: add a simple action to the button
        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Registration submitted (demo)");
        });

        pack();
        setLocationRelativeTo(null); // center on screen
        setVisible(true);
    }

    /**
     * Creates a JLabel with a generated image (200x100 blue rectangle with white text).
     * This avoids external file dependencies.
     */
    private JLabel createImageLabel() {
        int width = 200;
        int height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        // Draw background
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, width, height);

        // Draw text
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        FontMetrics fm = g2d.getFontMetrics();
        String text = "Registration";
        int x = (width - fm.stringWidth(text)) / 2;
        int y = (height - fm.getHeight()) / 2 + fm.getAscent();
        g2d.drawString(text, x, y);

        g2d.dispose();

        return new JLabel(new ImageIcon(image), SwingConstants.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MorseCodeTranslatorGUI extends JFrame {
    public MorseCodeTranslatorGUI() {

        // Add title to window bar
        super("Morse Code Translator");

        // Sets frame to 540x760 pixels
        setSize(new Dimension(540, 760));

        // Prevents GUI to be able to resized
        setResizable(false);

        // To help us to organise the components of our GUI
        setLayout(null);

        // Close program on X button
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Setting background color
        getContentPane().setBackground(Color.decode("#264653"));

        // Make window stay on center of the screen
        setLocationRelativeTo(null);

        addGuiComponents();
    }

    public void addGuiComponents() {
        // Title label
        JLabel titleLabel = new JLabel("Morse Code Translator");

        // Add Font
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));
    }
}

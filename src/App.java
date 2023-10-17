import javax.swing.SwingUtilities;

public class App {
    public static void main(String args[]) {

        // Make GUI updated in a thread-safe method
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MorseCodeTranslatorGUI().setVisible(true);
            }
        });
    }
}

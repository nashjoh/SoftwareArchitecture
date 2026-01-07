package main;

import javax.swing.SwingUtilities;
import view.MainFrame;

public class Main {

    public static void main(String[] args) {

        // Ensure Swing runs on the Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}

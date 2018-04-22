package cz.czechitas.java.demoapp;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::showWindow);
    }

    public static void showWindow() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println("Unable to set System look and feel for Swing");
        }
        JFrame window = new JFrame("Czechitas Java");
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("It works!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Font originalFont = label.getFont();
        int size = originalFont.getSize();
        label.setFont(originalFont.deriveFont(size * 3.0F));
        window.add(label);
        window.setSize(400, 300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}

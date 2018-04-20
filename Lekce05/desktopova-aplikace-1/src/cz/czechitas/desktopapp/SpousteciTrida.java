package cz.czechitas.desktopapp;

import javax.swing.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        HlavniOkno okno;
        okno = new HlavniOkno();
        //okno.run();
        SwingUtilities.invokeLater(okno::run);
    }
}

package cz.czechitas.desktopapp;

import javax.swing.*;

public class HlavniOkno {

    public void run () {
        JFrame okno;
        okno = new JFrame();
        okno.setVisible(true);

        okno.setSize(400, 300);
        //okno.setLocation(600, 600);
        okno.setLocationRelativeTo(null);

        //vypni program pri zavreni okna
        okno.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}

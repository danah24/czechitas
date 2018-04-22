package cz.czechitas.desktopapp;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labVstup1;
    JTextField txtHodnota1;
    JLabel labVstup2;
    JTextField txtHodnota2;
    JButton btnPrepocitat;
    JLabel labVystup1;
    JTextField txtVysledek1;
    JLabel labVystup2;
    JTextField txtVysledek2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labVstup1 = new JLabel();
        txtHodnota1 = new JTextField();
        labVstup2 = new JLabel();
        txtHodnota2 = new JTextField();
        btnPrepocitat = new JButton();
        labVystup1 = new JLabel();
        txtVysledek1 = new JTextField();
        labVystup2 = new JLabel();
        txtVysledek2 = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("desktopova_aplikace_4");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[30,grow,fill]" +
            "[fill]" +
            "[240,fill]" +
            "[30,grow,fill]",
            // rows
            "[grow]" +
            "[20,fill]" +
            "[20,fill]" +
            "[20,fill]" +
            "[25,fill]" +
            "[20,fill]" +
            "[20,fill]" +
            "[20,fill]" +
            "[grow]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labVstup1 ----
        labVstup1.setText("Vstup 1:");
        contentPane.add(labVstup1, "cell 1 1");
        contentPane.add(txtHodnota1, "cell 2 1");

        //---- labVstup2 ----
        labVstup2.setText("Vstup 2:");
        contentPane.add(labVstup2, "cell 1 2");
        contentPane.add(txtHodnota2, "cell 2 2");

        //---- btnPrepocitat ----
        btnPrepocitat.setText("P\u0159epo\u010d\u00edtat");
        contentPane.add(btnPrepocitat, "cell 2 4,alignx center,growx 0");

        //---- labVystup1 ----
        labVystup1.setText("V\u00fdsledek 1:");
        contentPane.add(labVystup1, "cell 1 6");
        contentPane.add(txtVysledek1, "cell 2 6");

        //---- labVystup2 ----
        labVystup2.setText("V\u00fdsledek 2:");
        contentPane.add(labVystup2, "cell 1 7");
        contentPane.add(txtVysledek2, "cell 2 7");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

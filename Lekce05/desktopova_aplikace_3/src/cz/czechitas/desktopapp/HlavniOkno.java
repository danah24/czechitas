package cz.czechitas.desktopapp;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labJmeno;
    JTextField edtJmeno;
    JButton btnPozdrav;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labJmeno = new JLabel();
        edtJmeno = new JTextField();
        btnPozdrav = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("desktopova_aplikace_3");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow,fill]" +
            "[128,grow,fill]" +
            "[grow,fill]",
            // rows
            "[grow]" +
            "[fill]" +
            "[grow]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labJmeno ----
        labJmeno.setText("Zadej jmeno:");
        contentPane.add(labJmeno, "cell 0 1");

        //---- edtJmeno ----
        edtJmeno.setMinimumSize(new Dimension(300, 31));
        contentPane.add(edtJmeno, "cell 1 1");

        //---- btnPozdrav ----
        btnPozdrav.setText("Pozdrav");
        contentPane.add(btnPozdrav, "cell 2 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

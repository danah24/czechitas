package cz.czechitas.desktopapp;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labHadat2;
    JTextField txtHadanka2;
    JButton btnHadat2;
    JLabel labTypy2;
    JFormattedTextField fTxtPismena;
    JLabel labSlovo2;
    JFormattedTextField fTxtSlovo;
    JLabel labZivot2;
    JFormattedTextField fTxtZivoty;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labHadat2 = new JLabel();
        txtHadanka2 = new JTextField();
        btnHadat2 = new JButton();
        labTypy2 = new JLabel();
        fTxtPismena = new JFormattedTextField();
        labSlovo2 = new JLabel();
        fTxtSlovo = new JFormattedTextField();
        labZivot2 = new JLabel();
        fTxtZivoty = new JFormattedTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("desktopova_aplikace_5");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow]" +
            "[right]" +
            "[200:n,fill]" +
            "[80,center]" +
            "[grow,fill]",
            // rows
            "[grow]" +
            "[20,fill]" +
            "[20]" +
            "[]" +
            "[]" +
            "[]" +
            "[grow]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labHadat2 ----
        labHadat2.setText("H\u00e1dejte p\u00edsmeno:");
        contentPane.add(labHadat2, "cell 1 1");
        contentPane.add(txtHadanka2, "cell 2 1,wmin 200");

        //---- btnHadat2 ----
        btnHadat2.setText("H\u00e1dat");
        contentPane.add(btnHadat2, "cell 3 1");

        //---- labTypy2 ----
        labTypy2.setText("Doposud h\u00e1dan\u00e1 p\u00edsmena:");
        contentPane.add(labTypy2, "cell 1 3");

        //---- fTxtPismena ----
        fTxtPismena.setBorder(null);
        fTxtPismena.setSelectionColor(Color.black);
        fTxtPismena.setOpaque(false);
        fTxtPismena.setSelectedTextColor(new Color(255, 51, 51));
        fTxtPismena.setText("A B C G J R");
        fTxtPismena.setFont(new Font("Segoe UI", Font.BOLD, 18));
        contentPane.add(fTxtPismena, "cell 2 3,align left baseline,grow 0 0");

        //---- labSlovo2 ----
        labSlovo2.setText("Uh\u00e1dnut\u00e9 slovo:");
        contentPane.add(labSlovo2, "cell 1 4");

        //---- fTxtSlovo ----
        fTxtSlovo.setBorder(null);
        fTxtSlovo.setSelectionColor(Color.black);
        fTxtSlovo.setOpaque(false);
        fTxtSlovo.setSelectedTextColor(new Color(255, 51, 51));
        fTxtSlovo.setText("ABRA*A*ABRA");
        fTxtSlovo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        contentPane.add(fTxtSlovo, "cell 2 4,align left baseline,grow 0 0");

        //---- labZivot2 ----
        labZivot2.setText("Po\u010det \u017eivot\u016f:");
        contentPane.add(labZivot2, "cell 1 5");

        //---- fTxtZivoty ----
        fTxtZivoty.setBorder(null);
        fTxtZivoty.setSelectionColor(Color.black);
        fTxtZivoty.setOpaque(false);
        fTxtZivoty.setSelectedTextColor(new Color(255, 51, 51));
        fTxtZivoty.setText("5");
        fTxtZivoty.setFont(new Font("Segoe UI", Font.BOLD, 18));
        contentPane.add(fTxtZivoty, "cell 2 5,align left baseline,grow 0 0");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

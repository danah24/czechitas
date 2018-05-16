package cz.czechitas.farma;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel label1;
    JLabel label3;
    JLabel label2;
    JTextField txtPocetKraliku;
    JLabel label4;
    JTextField txtPocetHus;
    JButton prepocti;
    JLabel label5;
    JLabel lblPocetHlav;
    JLabel label6;
    JLabel lblPocetNohou;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void prepoctiActionPerformed(ActionEvent e) {
        // Premenna "honza" obsahujuca objekt triedy Pomocnik
        Pomocnik honza = new Pomocnik();
        // Premenna "david" obsahujuca iny objekt triedy Pomocnik
        Pomocnik david = new Pomocnik();
        // "honza" aj "david" su samostatne objekty, ale obidva umi
        // tranformovat String <-> int, pretoze su to Pomocnici

        // Vytvorime novy objekt typu (triedy) Farma a priradime ho do premennej
        // "farma" typu Farma
        Farma farma = new Farma();

        // Ziskame vstupne hodnoty z textovych poli (edit)
        // Hosnoty su typu String, pretoze ich uzivatel zadava ako text
        String pocetKralikuStr = txtPocetKraliku.getText();
        String pocetHusStr = txtPocetHus.getText();

        // Povieme farme novy pocet kraliku a hus
        // Pouzijeme pomocnika na konverziu String -> int
        // V Idei mozes prejst na definiciu metody pomocou Ctrl+Klik
        farma.prepocitaj(honza.zmenStringNaInt(pocetKralikuStr),
                david.zmenStringNaInt(pocetHusStr));

        // Farma ma nove hodnoty, mozeme sa dotazat na pocet hlav a nohou,
        // znova udelame konverziu, ted int -> String,
        // a vysledok nastavime do textoveho popisku (label)
        lblPocetHlav.setText(honza.zmenIntNaString(farma.getPocetHlav()));
        lblPocetNohou.setText(david.zmenIntNaString(farma.getPocetNohou()));

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        txtPocetKraliku = new JTextField();
        label4 = new JLabel();
        txtPocetHus = new JTextField();
        prepocti = new JButton();
        label5 = new JLabel();
        lblPocetHlav = new JLabel();
        label6 = new JLabel();
        lblPocetNohou = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("farma");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow,fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[grow,fill]",
            // rows
            "[grow,fill]" +
            "[]" +
            "[]" +
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

        //---- label1 ----
        label1.setText("Kralici");
        contentPane.add(label1, "cell 1 1 2 1");

        //---- label3 ----
        label3.setText("Husy");
        contentPane.add(label3, "cell 4 1 2 1");

        //---- label2 ----
        label2.setText("Pocet");
        contentPane.add(label2, "cell 1 2");

        //---- txtPocetKraliku ----
        txtPocetKraliku.setColumns(5);
        contentPane.add(txtPocetKraliku, "cell 2 2");

        //---- label4 ----
        label4.setText("Pocet");
        contentPane.add(label4, "cell 4 2");

        //---- txtPocetHus ----
        txtPocetHus.setColumns(5);
        contentPane.add(txtPocetHus, "cell 5 2");

        //---- prepocti ----
        prepocti.setText("Prepocti");
        prepocti.addActionListener(e -> prepoctiActionPerformed(e));
        contentPane.add(prepocti, "cell 1 3 5 1");

        //---- label5 ----
        label5.setText("Pocet hlav");
        contentPane.add(label5, "cell 1 4 2 1");

        //---- lblPocetHlav ----
        lblPocetHlav.setText("?");
        contentPane.add(lblPocetHlav, "cell 4 4");

        //---- label6 ----
        label6.setText("Pocet nohou");
        contentPane.add(label6, "cell 1 5 2 1");

        //---- lblPocetNohou ----
        lblPocetNohou.setText("?");
        contentPane.add(lblPocetNohou, "cell 4 5");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

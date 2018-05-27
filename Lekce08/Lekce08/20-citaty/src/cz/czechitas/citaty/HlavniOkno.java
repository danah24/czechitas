package cz.czechitas.citaty;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import com.sun.xml.internal.bind.v2.*;
import cz.czechitas.citaty.zdroje.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JMenuBar menuHlavni;
    JMenu menuSoubor;
    JMenuItem menuOtevritSoubor;
    JMenuItem menuUlozitSoubor;
    JMenu menuZobrazit;
    JCheckBoxMenuItem menuPouzeOblibene;
    JButton btnNahodnyCitat;
    JButton btnAutoruvCitat;
    JButton btnOblibenyCitat;
    JCheckBox chckOblibeny;
    JLabel labAutorTitle;
    JLabel labAutor;
    JLabel labCitatTitle;
    JScrollPane scrollPane1;
    JTextArea txtCitat;
    JLabel labPocetCitatuCelkemTitle;
    JLabel labPocetCitatuCelkem;
    JLabel labPocetAutoruTitle;
    JLabel labPocetAutoru;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    Citat aktualniCitat;
    ZdrojCitatu zdrojCitatu;
    CitacniSluzba citacniSluzba;

    public HlavniOkno() {
        initComponents();
//        zdrojCitatu = new StatickyZdrojCitatu();
//        citacniSluzba = new CitacniSluzba(zdrojCitatu);
        nastavCistacniSluzbu(new StatickyZdrojCitatu());

//        aktualniCitat = new Citat("Nahodny student", "Moje jatra!");

//        int pocetCitatu = zdrojCitatu.getCitaty().size();
        zjistiPocetCitatu();
//        int pocetCitatu = citacniSluzba.getPocetCitatu();
//        labPocetCitatuCelkem.setText(String.valueOf(pocetCitatu));
        zjistiPocetAutoru();
    }

    private void stisknutoNahodnyCitat(ActionEvent e) {
        aktualniCitat = citacniSluzba.getNahodnyCitat();
        vytiskniCitat();
    }

    private void stisknutoNahodnyOdAutora(ActionEvent e) {
        String autor = aktualniCitat.getAutor();
        aktualniCitat = citacniSluzba.getNahodnyCitatAutora(autor);
        vytiskniCitat();
    }

    private void stisknutoOblibenyCitat(ActionEvent e) {
        aktualniCitat = citacniSluzba.getNahodnyOblibenyCitat();
        vytiskniCitat();
    }

    private void vytiskniCitat() {
        labAutor.setText(aktualniCitat.getAutor());
        txtCitat.setText(aktualniCitat.getText());
    }

    private void menuOtevritSoubor(ActionEvent e) {
        JFileChooser vyberovyDialog = new JFileChooser();                                             
        int vysledek = vyberovyDialog.showOpenDialog(this);
        if (vysledek == JFileChooser.APPROVE_OPTION) {
            File soubor = vyberovyDialog.getSelectedFile();
            nastavCistacniSluzbu(new SouborovyZdrojCitatu(soubor));
            zjistiPocetCitatu();
            zjistiPocetAutoru();
        }
    }

    private void nastavCistacniSluzbu(ZdrojCitatu zdroj) {
        zdrojCitatu = zdroj;
        citacniSluzba = new CitacniSluzba(zdroj);
    }

    private void zjistiPocetCitatu() {
        int pocetCitatu = citacniSluzba.getPocetCitatu();
        labPocetCitatuCelkem.setText(String.valueOf(pocetCitatu));
    }
//        Citat mujCitat = new Citat("Nahodny student", "Moje jatra!")
//        mujCitat.getAutor();

    private void zjistiPocetAutoru() {
        int pocetAutoru = citacniSluzba.getPocetAutoru();
        labPocetAutoru.setText(String.valueOf(pocetAutoru));
    }

    private void chckOblibenySet(ActionEvent e) {
        aktualniCitat.setOblibene(chckOblibeny.isSelected());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        menuHlavni = new JMenuBar();
        menuSoubor = new JMenu();
        menuOtevritSoubor = new JMenuItem();
        menuUlozitSoubor = new JMenuItem();
        menuZobrazit = new JMenu();
        menuPouzeOblibene = new JCheckBoxMenuItem();
        btnNahodnyCitat = new JButton();
        btnAutoruvCitat = new JButton();
        btnOblibenyCitat = new JButton();
        chckOblibeny = new JCheckBox();
        labAutorTitle = new JLabel();
        labAutor = new JLabel();
        labCitatTitle = new JLabel();
        scrollPane1 = new JScrollPane();
        txtCitat = new JTextArea();
        labPocetCitatuCelkemTitle = new JLabel();
        labPocetCitatuCelkem = new JLabel();
        labPocetAutoruTitle = new JLabel();
        labPocetAutoru = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prohl\u00ed\u017ee\u010d cit\u00e1t\u016f");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[left]" +
            "[fill]" +
            "[fill]" +
            "[grow,fill]",
            // rows
            "[fill]" +
            "[]" +
            "[]" +
            "[grow]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //======== menuHlavni ========
        {

            //======== menuSoubor ========
            {
                menuSoubor.setText("Soubor");

                //---- menuOtevritSoubor ----
                menuOtevritSoubor.setText("Otev\u0159\u00edt");
                menuOtevritSoubor.addActionListener(e -> menuOtevritSoubor(e));
                menuSoubor.add(menuOtevritSoubor);

                //---- menuUlozitSoubor ----
                menuUlozitSoubor.setText("Ulo\u017eit");
                menuSoubor.add(menuUlozitSoubor);
            }
            menuHlavni.add(menuSoubor);

            //======== menuZobrazit ========
            {
                menuZobrazit.setText("Zobrazit");

                //---- menuPouzeOblibene ----
                menuPouzeOblibene.setText("Pouze Obl\u00edben\u00e9");
                menuZobrazit.add(menuPouzeOblibene);
            }
            menuHlavni.add(menuZobrazit);
        }
        setJMenuBar(menuHlavni);

        //---- btnNahodnyCitat ----
        btnNahodnyCitat.setText("N\u00e1hodn\u00fd cit\u00e1t");
        btnNahodnyCitat.addActionListener(e -> stisknutoNahodnyCitat(e));
        contentPane.add(btnNahodnyCitat, "cell 0 0 2 1");

        //---- btnAutoruvCitat ----
        btnAutoruvCitat.setText("N\u00e1hodn\u00fd od autora");
        btnAutoruvCitat.addActionListener(e -> stisknutoNahodnyOdAutora(e));
        contentPane.add(btnAutoruvCitat, "cell 2 0 2 1");

        //---- btnOblibenyCitat ----
        btnOblibenyCitat.setText("N\u00e1hodn\u00fd obl\u00edben\u00fd cit\u00e1t");
        btnOblibenyCitat.setMaximumSize(new Dimension(193, 41));
        btnOblibenyCitat.addActionListener(e -> stisknutoOblibenyCitat(e));
        contentPane.add(btnOblibenyCitat, "cell 4 0");

        //---- chckOblibeny ----
        chckOblibeny.setText("Obl\u00edben\u00fd");
        chckOblibeny.addActionListener(e -> chckOblibenySet(e));
        contentPane.add(chckOblibeny, "cell 4 0");

        //---- labAutorTitle ----
        labAutorTitle.setText("Autor");
        contentPane.add(labAutorTitle, "cell 0 1,alignx center,growx 0");
        contentPane.add(labAutor, "cell 2 1 3 1,alignx left,growx 0");

        //---- labCitatTitle ----
        labCitatTitle.setText("Citat");
        contentPane.add(labCitatTitle, "cell 0 2,alignx center,growx 0");

        //======== scrollPane1 ========
        {

            //---- txtCitat ----
            txtCitat.setLineWrap(true);
            txtCitat.setColumns(60);
            txtCitat.setRows(20);
            txtCitat.setEditable(false);
            txtCitat.setFont(new Font("Monospaced", Font.PLAIN, 20));
            scrollPane1.setViewportView(txtCitat);
        }
        contentPane.add(scrollPane1, "cell 1 2 4 2,grow");

        //---- labPocetCitatuCelkemTitle ----
        labPocetCitatuCelkemTitle.setText("Cit\u00e1t\u016f celkem:");
        contentPane.add(labPocetCitatuCelkemTitle, "cell 0 5");

        //---- labPocetCitatuCelkem ----
        labPocetCitatuCelkem.setText("0");
        contentPane.add(labPocetCitatuCelkem, "cell 1 5,alignx left,growx 0");

        //---- labPocetAutoruTitle ----
        labPocetAutoruTitle.setText("| Celkem Autor\u016f:");
        contentPane.add(labPocetAutoruTitle, "cell 2 5");

        //---- labPocetAutoru ----
        labPocetAutoru.setText("0");
        contentPane.add(labPocetAutoru, "cell 3 5");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

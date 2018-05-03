package cz.czechitas.desktopapp;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labTeplotaC;
    JTextField editTeplotaC;
    JButton btnPrevedF;
    JButton btnPrevedC;
    JLabel labTeplotaF;
    JTextField editTeplotaF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStiskuBtnPrevedC(ActionEvent e) {
        String textTeplotaF = editTeplotaF.getText();

        if (!jeCislo(textTeplotaF)) {
            return; // skonci pokud textTeplotaF neni cislo
        }

        double teplotaF = prevedTextNaCislo(textTeplotaF);

        double teplotaC = (teplotaF - 32) /  1.8;
        String textTeplotaC = prevedCisloNaText(teplotaC); // zmena oproti hodine

        editTeplotaC.setText(textTeplotaC);

        btnPrevedF.setEnabled(true); // zapneme druhe tlacitko (prislusny textbox nyni obsahuje vysledek)
    }

    private void priStiskuBtnPrevedF(ActionEvent e) {
        String textTeplotaC = editTeplotaC.getText();

        if (!jeCislo(textTeplotaC)) {
            return; // skonci pokud textTeplotaC neni cislo
        }

        double teplotaC = prevedTextNaCislo(textTeplotaC);

        double teplotaF = 1.8 * teplotaC + 32;
        String textTeplotaF = prevedCisloNaText(teplotaF); // zmena oproti hodine

        editTeplotaF.setText(textTeplotaF);

        btnPrevedC.setEnabled(true); // zapneme druhe tlacitko (prislusny textbox nyni obsahuje vysledek)
    }

    private void priZmacknutiKlavesyEditTeplotaF(KeyEvent e) {
        btnPrevedC.setEnabled(true); // zapsali jsme do editTeplotaF, aktivuj tlactko pro prevod do C

        boolean jeEnter = e.getExtendedKeyCode() == KeyEvent.VK_ENTER;
        if (jeEnter) {
            priStiskuBtnPrevedC(null);   // null protoze ve skutecnosti nedoslo ke stisku tlacitka
        }
    }

    private void priZmacknutiKlavesyEditTeplotaC(KeyEvent e) {
        btnPrevedF.setEnabled(true); // zapsali jsme do editTeplotaF, aktivuj tlactko pro prevod do F

        boolean jeEnter = e.getExtendedKeyCode() == KeyEvent.VK_ENTER;
        if (jeEnter) {
            priStiskuBtnPrevedF(null);  // null protoze ve skutecnosti nedoslo ke stisku tlacitka
        }
    }

    // Prevod cislo <-> text ukazany na hodine ma radu problemu (zavislost na jazykovem nastaveni systemu)
    // Nasledujici 3 metody muzete zkopirovat a pouzit ve svych dalsich programech.
    // Neni jim nutno rozumet, presto alespon strucne popisuji co delaji

    // Spolehlivejsi prevod textu na cislo
    // Ocekava zadavani cisla ve formatu nastavenem operacnim systemem
    // Pro cestinu desetina carka, pro anglictinu tecka
    private double prevedTextNaCislo(String text) {
        NumberFormat formatovac = NumberFormat.getInstance();
        ParsePosition pozice = new ParsePosition(0);
        Number cislo = formatovac.parse(text, pozice);

        // pokud nebylo nacteno cislo NEBO se text nedocetl do konce (napriklad pro "11a2")
        if ( (cislo == null) || (pozice.getIndex() != text.length()) ) {
            return Double.NaN;  // Specialni hodnota, ktera NENI cislo (napriklad vysledek  0.0 / 0.0)
        }

        return cislo.doubleValue();
    }

    // Spolehlivejsi prevod textu na cislo
    // Vystupem je cislo ve formatu nastavenem operacnim systemem
    // Pro cestinu desetina carka, pro anglictinu tecka
    private String prevedCisloNaText(double cislo) {
        NumberFormat formatovac = NumberFormat.getInstance();
        formatovac.setMaximumFractionDigits(2);
        String text = formatovac.format(cislo);
        return text;
    }

    // Metoda zjisti jestli text je cislo (tak ze jej zkusi prevest)
    private boolean jeCislo(String text) {
        double cislo = prevedTextNaCislo(text);
        return !Double.isNaN(cislo);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labTeplotaC = new JLabel();
        editTeplotaC = new JTextField();
        btnPrevedF = new JButton();
        btnPrevedC = new JButton();
        labTeplotaF = new JLabel();
        editTeplotaF = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("konvertor_teploty");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[grow,fill]" +
            "[grow,fill]" +
            "[grow,fill]" +
            "[fill]",
            // rows
            "[grow,fill]" +
            "[]" +
            "[grow]" +
            "[]" +
            "[grow]" +
            "[]" +
            "[grow]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labTeplotaC ----
        labTeplotaC.setText("Teplota C");
        contentPane.add(labTeplotaC, "cell 1 1");

        //---- editTeplotaC ----
        editTeplotaC.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                priZmacknutiKlavesyEditTeplotaC(e);
            }
        });
        contentPane.add(editTeplotaC, "cell 2 1 3 1");

        //---- btnPrevedF ----
        btnPrevedF.setText("F");
        btnPrevedF.setEnabled(false);
        btnPrevedF.addActionListener(e -> priStiskuBtnPrevedF(e));
        contentPane.add(btnPrevedF, "cell 2 3");

        //---- btnPrevedC ----
        btnPrevedC.setText("C");
        btnPrevedC.setEnabled(false);
        btnPrevedC.addActionListener(e -> priStiskuBtnPrevedC(e));
        contentPane.add(btnPrevedC, "cell 4 3");

        //---- labTeplotaF ----
        labTeplotaF.setText("Teplota F");
        contentPane.add(labTeplotaF, "cell 1 5");

        //---- editTeplotaF ----
        editTeplotaF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                priZmacknutiKlavesyEditTeplotaF(e);
            }
        });
        contentPane.add(editTeplotaF, "cell 2 5 3 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

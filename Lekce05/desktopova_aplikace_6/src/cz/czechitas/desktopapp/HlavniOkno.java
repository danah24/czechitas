package cz.czechitas.desktopapp;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labTeplotaC;
    JTextField txtTeplotaC;
    JLabel editTeplotaF;
    JButton btnPrevedF;
    JButton btnPrevedC;
    JLabel labTeplotaF;
    JTextField txtTeplotaF;
    JLabel editTeplotaC;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStiskubtnPrevedFprevedC(ActionEvent e) {
        String textTeplotaC = txtTeplotaC.getText();
        double teplotaC = Double.parseDouble(textTeplotaC);
//        Double teplotaC = Double.parseDouble(editTeplotaC.getText());

        double teplotaF = 1.8 * teplotaC + 32;

        String textTeplotaF;
        textTeplotaF = String.format ("%2f", teplotaF);
        // textTeplotaF = String.valueOf(teplotaC);
        // textTeplotaF = teplotaF.toString();
        editTeplotaF.setText(textTeplotaF);
    }

    private void priStiskubtnPrevedCprevedF(ActionEvent e) {
        String textTeplotaF = txtTeplotaF.getText();
        double teplotaF = Double.parseDouble(textTeplotaF);
//        Double teplotaF = Double.parseDouble(editTeplotaF.getText());

        double teplotaC = (teplotaF - 32) / 1.8;

        String textTeplotaC;
        textTeplotaC = String.format ("%2f", teplotaC);
        // textTeplotaC = String.valueOf(teplotaC);
        //  textTeplotaC = teplotaF.toString();
        editTeplotaC.setText(textTeplotaC);
           }

           private void priZmacknutiKlavesyeditTeplotaF(KeyEvent e) {
               btnPrevedF.setEnabled(true);
               boolean jeEnter = e.getExtendedKeyCode() == KeyEvent.VK_ENTER;
            // System.out.println("editTeplotaF" + jeEnter);
               if (jeEnter) {
                   priStiskubtnPrevedFprevedC(null);
               }
           }

           private void priZmacknutiKlavesyeditTeplotaC(KeyEvent e) {
               btnPrevedC.setEnabled(true);
           }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labTeplotaC = new JLabel();
        txtTeplotaC = new JTextField();
        editTeplotaF = new JLabel();
        btnPrevedF = new JButton();
        btnPrevedC = new JButton();
        labTeplotaF = new JLabel();
        txtTeplotaF = new JTextField();
        editTeplotaC = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("desktopova_aplikace_6");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow,fill]" +
            "[fill]" +
            "[227,fill]" +
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

        //---- labTeplotaC ----
        labTeplotaC.setText("Teplota \u00b0C");
        contentPane.add(labTeplotaC, "cell 1 1");

        //---- txtTeplotaC ----
        txtTeplotaC.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                priZmacknutiKlavesyeditTeplotaF(e);
            }
        });
        contentPane.add(txtTeplotaC, "cell 2 1");
        contentPane.add(editTeplotaF, "cell 3 1");

        //---- btnPrevedF ----
        btnPrevedF.setText("\u00b0F");
        btnPrevedF.setEnabled(false);
        btnPrevedF.addActionListener(e -> priStiskubtnPrevedFprevedC(e));
        contentPane.add(btnPrevedF, "cell 2 3");

        //---- btnPrevedC ----
        btnPrevedC.setText("\u00b0C");
        btnPrevedC.setEnabled(false);
        btnPrevedC.addActionListener(e -> priStiskubtnPrevedCprevedF(e));
        contentPane.add(btnPrevedC, "cell 2 3");

        //---- labTeplotaF ----
        labTeplotaF.setText("Teplota \u00b0F");
        contentPane.add(labTeplotaF, "cell 1 5");

        //---- txtTeplotaF ----
        txtTeplotaF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                priZmacknutiKlavesyeditTeplotaC(e);
            }
        });
        contentPane.add(txtTeplotaF, "cell 2 5");
        contentPane.add(editTeplotaC, "cell 3 5");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

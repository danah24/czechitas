package cz.czechitas.desktopapp;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JTextField txtResult;
    JButton btnMC;
    JButton btnMR;
    JButton btnMRplus;
    JButton btnMS;
    JButton btnPercent;
    JButton btnRoot;
    JButton btnExpn;
    JButton btnInverse;
    JButton btnCE;
    JButton btnC;
    JButton btnDEL;
    JButton btnDiv;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnMultiple;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btnMinus;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btnPlus;
    JButton btnNeg;
    JButton btn0;
    JButton btnDecimal;
    JButton btnEquals;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        txtResult = new JTextField();
        btnMC = new JButton();
        btnMR = new JButton();
        btnMRplus = new JButton();
        btnMS = new JButton();
        btnPercent = new JButton();
        btnRoot = new JButton();
        btnExpn = new JButton();
        btnInverse = new JButton();
        btnCE = new JButton();
        btnC = new JButton();
        btnDEL = new JButton();
        btnDiv = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnMultiple = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btnMinus = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btnPlus = new JButton();
        btnNeg = new JButton();
        btn0 = new JButton();
        btnDecimal = new JButton();
        btnEquals = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("kalkulacka");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow,fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[grow,fill]",
            // rows
            "[grow,fill]" +
            "[]" +
            "[20]" +
            "[]" +
            "[]" +
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

        //---- txtResult ----
        txtResult.setPreferredSize(new Dimension(18, 35));
        contentPane.add(txtResult, "cell 1 1 4 1");

        //---- btnMC ----
        btnMC.setText("MC");
        contentPane.add(btnMC, "cell 1 3");

        //---- btnMR ----
        btnMR.setText("MR");
        contentPane.add(btnMR, "cell 2 3");

        //---- btnMRplus ----
        btnMRplus.setText("M+");
        contentPane.add(btnMRplus, "cell 3 3");

        //---- btnMS ----
        btnMS.setText("MS");
        contentPane.add(btnMS, "cell 4 3");

        //---- btnPercent ----
        btnPercent.setText("%");
        contentPane.add(btnPercent, "cell 1 4");

        //---- btnRoot ----
        btnRoot.setText("\u221a");
        contentPane.add(btnRoot, "cell 2 4");

        //---- btnExpn ----
        btnExpn.setText("x2");
        contentPane.add(btnExpn, "cell 3 4");

        //---- btnInverse ----
        btnInverse.setText("1/x");
        contentPane.add(btnInverse, "cell 4 4");

        //---- btnCE ----
        btnCE.setText("CE");
        contentPane.add(btnCE, "cell 1 5");

        //---- btnC ----
        btnC.setText("C");
        contentPane.add(btnC, "cell 2 5");

        //---- btnDEL ----
        btnDEL.setText("DEL");
        contentPane.add(btnDEL, "cell 3 5");

        //---- btnDiv ----
        btnDiv.setText("/");
        contentPane.add(btnDiv, "cell 4 5");

        //---- btn7 ----
        btn7.setText("7");
        contentPane.add(btn7, "cell 1 6");

        //---- btn8 ----
        btn8.setText("8");
        contentPane.add(btn8, "cell 2 6");

        //---- btn9 ----
        btn9.setText("9");
        contentPane.add(btn9, "cell 3 6");

        //---- btnMultiple ----
        btnMultiple.setText("*");
        contentPane.add(btnMultiple, "cell 4 6");

        //---- btn4 ----
        btn4.setText("4");
        contentPane.add(btn4, "cell 1 7");

        //---- btn5 ----
        btn5.setText("5");
        contentPane.add(btn5, "cell 2 7");

        //---- btn6 ----
        btn6.setText("6");
        contentPane.add(btn6, "cell 3 7");

        //---- btnMinus ----
        btnMinus.setText("-");
        contentPane.add(btnMinus, "cell 4 7");

        //---- btn1 ----
        btn1.setText("1");
        contentPane.add(btn1, "cell 1 8");

        //---- btn2 ----
        btn2.setText("2");
        contentPane.add(btn2, "cell 2 8");

        //---- btn3 ----
        btn3.setText("3");
        contentPane.add(btn3, "cell 3 8");

        //---- btnPlus ----
        btnPlus.setText("+");
        contentPane.add(btnPlus, "cell 4 8");

        //---- btnNeg ----
        btnNeg.setText("+-");
        contentPane.add(btnNeg, "cell 1 9");

        //---- btn0 ----
        btn0.setText("0");
        contentPane.add(btn0, "cell 2 9");

        //---- btnDecimal ----
        btnDecimal.setText(",");
        contentPane.add(btnDecimal, "cell 3 9");

        //---- btnEquals ----
        btnEquals.setText("=");
        contentPane.add(btnEquals, "cell 4 9");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

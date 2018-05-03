package cz.czechitas.desktopapp;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import javax.xml.soap.*;
import javax.xml.stream.util.*;
import com.sun.org.apache.bcel.internal.generic.*;
import net.miginfocom.swing.*;

import static javax.swing.JOptionPane.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labNadpis;
    JLabel labKralici;
    JLabel labHusy;
    JLabel labPocetKralici;
    JTextField txtNmrKralici;
    JLabel labPocetHusy;
    JTextField txtNmrHusy;
    JLabel labValidKralici;
    JLabel labValidHusy;
    JButton btnVypocti;
    JLabel labPodnadpis;
    JLabel labText;
    JLabel editMrkev;
    JLabel editZrni;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void txtNmrKraliciKeyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_BACK_SPACE))) {
            getToolkit().beep();
            e.consume();
            labValidKralici.setText("Znak musí být číslo!");
        }
    }

    private void txtNmrHusyKeyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_BACK_SPACE))) {
            getToolkit().beep();
            e.consume();
            labValidHusy.setText("Znak musí být číslo!");
        }
    }

    private void btnVypoctiPocet(ActionEvent e) {
        String textKralici;
        String textHusy;
        String totalMrkev;
        String totalZrni;
        String totalRadkyMrkev;
        String totalRadkyZrni;

        textKralici = txtNmrKralici.getText();
        jeCeleCislo(textKralici);
        double cislotextKralici = Double.parseDouble(textKralici);

        textHusy = txtNmrHusy.getText();
        jeCeleCislo(textHusy);
        double cislotextHusy = Double.parseDouble(textHusy);

        double cisloMrkev = cislotextKralici * 91.5;
        double cisloZrni = cislotextHusy * 45.75;

        double pocetRadkuMrkev = cisloMrkev / 5;
        double pocetRadkuZrni = cisloZrni / 2;

        totalMrkev = String.format("%.4g%n", cisloMrkev);
        totalRadkyMrkev = String.format("%.4g%n", pocetRadkuMrkev);
        editMrkev.setText(totalMrkev + " mrkve, tedy " + totalRadkyMrkev + " řádků.");

        totalZrni = String.format("%.4g%n", cisloZrni);
        totalRadkyZrni = String.format("%.4g%n", pocetRadkuZrni);
        editZrni.setText(totalZrni + " zrní, tedy " + totalRadkyZrni + " řádků.");
    }

    public boolean jeCeleCislo(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labNadpis = new JLabel();
        labKralici = new JLabel();
        labHusy = new JLabel();
        labPocetKralici = new JLabel();
        txtNmrKralici = new JTextField();
        labPocetHusy = new JLabel();
        txtNmrHusy = new JTextField();
        labValidKralici = new JLabel();
        labValidHusy = new JLabel();
        btnVypocti = new JButton();
        labPodnadpis = new JLabel();
        labText = new JLabel();
        editMrkev = new JLabel();
        editZrni = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Farmar 2.0");
        setMinimumSize(new Dimension(180, 370));
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[grow,fill]" +
            "[100:n,fill]" +
            "[fill]" +
            "[fill]" +
            "[100:n,fill]" +
            "[fill]" +
            "[grow,fill]",
            // rows
            "[grow]" +
            "[fill]" +
            "[]" +
            "[]" +
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

        //---- labNadpis ----
        labNadpis.setText("Evidence kr\u00e1l\u00edk\u016f a hus");
        labNadpis.setFont(new Font("Garamond", Font.BOLD | Font.ITALIC, 26));
        labNadpis.setOpaque(true);
        labNadpis.setForeground(new Color(0, 51, 255));
        contentPane.add(labNadpis, "cell 1 1 5 1");

        //---- labKralici ----
        labKralici.setText("Kr\u00e1l\u00edci");
        labKralici.setFont(new Font("MS PGothic", Font.BOLD, 20));
        contentPane.add(labKralici, "cell 1 2");

        //---- labHusy ----
        labHusy.setText("Husy");
        labHusy.setFont(new Font("MS PGothic", Font.BOLD, 20));
        contentPane.add(labHusy, "cell 4 2");

        //---- labPocetKralici ----
        labPocetKralici.setText("Po\u010det");
        labPocetKralici.setFont(new Font("MS Gothic", Font.PLAIN, 15));
        contentPane.add(labPocetKralici, "cell 1 3");

        //---- txtNmrKralici ----
        txtNmrKralici.setMinimumSize(new Dimension(30, 31));
        txtNmrKralici.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtNmrKraliciKeyTyped(e);
            }
        });
        contentPane.add(txtNmrKralici, "cell 2 3,alignx right,growx 0,wmin 40");

        //---- labPocetHusy ----
        labPocetHusy.setText("Po\u010det");
        labPocetHusy.setFont(new Font("MS Gothic", Font.PLAIN, 15));
        contentPane.add(labPocetHusy, "cell 4 3");

        //---- txtNmrHusy ----
        txtNmrHusy.setMinimumSize(new Dimension(30, 31));
        txtNmrHusy.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtNmrHusyKeyTyped(e);
            }
        });
        contentPane.add(txtNmrHusy, "cell 5 3,alignx right,growx 0,wmin 40");

        //---- labValidKralici ----
        labValidKralici.setForeground(new Color(255, 51, 51));
        contentPane.add(labValidKralici, "cell 1 4");

        //---- labValidHusy ----
        labValidHusy.setForeground(new Color(255, 51, 51));
        contentPane.add(labValidHusy, "cell 4 4");

        //---- btnVypocti ----
        btnVypocti.setText("Vypo\u010dti");
        btnVypocti.setFont(new Font("Garamond", Font.BOLD, 18));
        btnVypocti.setForeground(Color.black);
        btnVypocti.setBackground(new Color(204, 204, 255));
        btnVypocti.addActionListener(e -> btnVypoctiPocet(e));
        contentPane.add(btnVypocti, "cell 1 5 5 1");

        //---- labPodnadpis ----
        labPodnadpis.setText("Pot\u0159eba krmiva");
        labPodnadpis.setFont(new Font("MS Gothic", Font.BOLD, 15));
        contentPane.add(labPodnadpis, "cell 1 7 3 1");

        //---- labText ----
        labText.setText("P\u0159ed zimou se mus\u00ed vyp\u011bstovat:");
        labText.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contentPane.add(labText, "cell 1 8 2 1");

        //---- editMrkev ----
        editMrkev.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        editMrkev.setForeground(new Color(255, 51, 51));
        contentPane.add(editMrkev, "cell 1 9 2 1");

        //---- editZrni ----
        editZrni.setForeground(new Color(51, 0, 255));
        editZrni.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contentPane.add(editZrni, "cell 1 10 2 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

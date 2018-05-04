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
    JLabel labSamiceKralici;
    JTextField txtNmrKraliciSamice;
    JLabel labSamiceHusy;
    JTextField txtNmrHusySamice;
    JLabel labSamciKralici;
    JTextField txtNmrKraliciSamci;
    JLabel labSamciHusy;
    JTextField txtNmrHusySamci;
    JLabel labValidKralici;
    JLabel labValidHusy;
    JButton btnVypocti;
    JLabel labPodnadpisChov;
    JLabel editPocetKraliku;
    JLabel editPocetHus;
    JLabel labPodnadpisKrmivo;
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
        String textKraliciSamice;
        String textKraliciSamci;
        String textHusySamice;
        String textHusySamci;
        String textKralici;
        String textHusy;
        String totalMrkev;
        String totalZrni;
        String totalRadkyMrkev;
        String totalRadkyZrni;
        Integer cislotextKralici;
        Integer cislotextHusy;

        textKraliciSamice = txtNmrKraliciSamice.getText();
        jeCeleCislo(textKraliciSamice);
        int cislotextKraliciSamice = Integer.parseInt(textKraliciSamice);

        textKraliciSamci = txtNmrKraliciSamice.getText();
        jeCeleCislo(textKraliciSamci);
        int cislotextKraliciSamci = Integer.parseInt(textKraliciSamci);

        textHusySamice = txtNmrHusySamice.getText();
        jeCeleCislo(textHusySamice);
        int cislotextHusySamice = Integer.parseInt(textHusySamice);

        textHusySamci = txtNmrHusySamci.getText();
        jeCeleCislo(textHusySamci);
        int cislotextHusySamci = Integer.parseInt(textHusySamci);

        if (cislotextKraliciSamci !=0 && cislotextKraliciSamice !=0) {
            cislotextKralici = cislotextKraliciSamci + cislotextKraliciSamice + (cislotextKraliciSamice * 40);
        }else {
            cislotextKralici = cislotextKraliciSamci + cislotextKraliciSamice;
        }

        textKralici = String.valueOf(cislotextKralici);
        editPocetKraliku.setText(textKralici + " ks králíků");

        if (cislotextHusySamci !=0 && cislotextHusySamice !=0) {
            cislotextHusy = cislotextHusySamci + cislotextHusySamice + (cislotextHusySamice * 15);
        }else {
            cislotextHusy = cislotextHusySamci + cislotextHusySamice;
        }

        textHusy = String.valueOf(cislotextHusy);
        editPocetHus.setText(textHusy + " ks hus");

        double cisloMrkev = cislotextKralici * 91.5;
        double cisloZrni = cislotextHusy * 45.75;

        double pocetRadkuMrkev = cisloMrkev / 5;
        double pocetRadkuZrni = cisloZrni / 2;

        totalMrkev = String.format("%.4g%n", cisloMrkev);
        totalRadkyMrkev = String.format("%.4g%n", pocetRadkuMrkev);
        editMrkev.setText(totalMrkev + " kg mrkve, tedy " + totalRadkyMrkev + " řádků.");

        totalZrni = String.format("%.4g%n", cisloZrni);
        totalRadkyZrni = String.format("%.4g%n", pocetRadkuZrni);
        editZrni.setText(totalZrni + " kg zrní, tedy " + totalRadkyZrni + " řádků.");
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
        labSamiceKralici = new JLabel();
        txtNmrKraliciSamice = new JTextField();
        labSamiceHusy = new JLabel();
        txtNmrHusySamice = new JTextField();
        labSamciKralici = new JLabel();
        txtNmrKraliciSamci = new JTextField();
        labSamciHusy = new JLabel();
        txtNmrHusySamci = new JTextField();
        labValidKralici = new JLabel();
        labValidHusy = new JLabel();
        btnVypocti = new JButton();
        labPodnadpisChov = new JLabel();
        editPocetKraliku = new JLabel();
        editPocetHus = new JLabel();
        labPodnadpisKrmivo = new JLabel();
        labText = new JLabel();
        editMrkev = new JLabel();
        editZrni = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Farmar 2.5");
        setMinimumSize(new Dimension(300, 450));
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

        //---- labSamiceKralici ----
        labSamiceKralici.setText("Po\u010det samic");
        labSamiceKralici.setFont(new Font("MS Gothic", Font.PLAIN, 15));
        contentPane.add(labSamiceKralici, "cell 1 3");

        //---- txtNmrKraliciSamice ----
        txtNmrKraliciSamice.setMinimumSize(new Dimension(30, 31));
        txtNmrKraliciSamice.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtNmrKraliciKeyTyped(e);
            }
        });
        contentPane.add(txtNmrKraliciSamice, "cell 2 3,alignx right,growx 0,wmin 40");

        //---- labSamiceHusy ----
        labSamiceHusy.setText("Po\u010det samic");
        labSamiceHusy.setFont(new Font("MS Gothic", Font.PLAIN, 15));
        contentPane.add(labSamiceHusy, "cell 4 3");

        //---- txtNmrHusySamice ----
        txtNmrHusySamice.setMinimumSize(new Dimension(30, 31));
        txtNmrHusySamice.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtNmrHusyKeyTyped(e);
            }
        });
        contentPane.add(txtNmrHusySamice, "cell 5 3,alignx right,growx 0,wmin 40");

        //---- labSamciKralici ----
        labSamciKralici.setText("Po\u010det samc\u016f");
        labSamciKralici.setFont(new Font("MS Gothic", Font.PLAIN, 15));
        contentPane.add(labSamciKralici, "cell 1 4");

        //---- txtNmrKraliciSamci ----
        txtNmrKraliciSamci.setMinimumSize(new Dimension(30, 31));
        txtNmrKraliciSamci.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtNmrKraliciKeyTyped(e);
            }
        });
        contentPane.add(txtNmrKraliciSamci, "cell 2 4,alignx right,growx 0,wmin 40");

        //---- labSamciHusy ----
        labSamciHusy.setText("Po\u010det samc\u016f");
        labSamciHusy.setFont(new Font("MS Gothic", Font.PLAIN, 15));
        contentPane.add(labSamciHusy, "cell 4 4");

        //---- txtNmrHusySamci ----
        txtNmrHusySamci.setMinimumSize(new Dimension(30, 31));
        txtNmrHusySamci.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtNmrHusyKeyTyped(e);
            }
        });
        contentPane.add(txtNmrHusySamci, "cell 5 4,alignx right,growx 0,wmin 40");

        //---- labValidKralici ----
        labValidKralici.setForeground(new Color(255, 51, 51));
        contentPane.add(labValidKralici, "cell 1 5");

        //---- labValidHusy ----
        labValidHusy.setForeground(new Color(255, 51, 51));
        contentPane.add(labValidHusy, "cell 4 5");

        //---- btnVypocti ----
        btnVypocti.setText("Vypo\u010dti");
        btnVypocti.setFont(new Font("Garamond", Font.BOLD, 18));
        btnVypocti.setForeground(Color.black);
        btnVypocti.setBackground(new Color(204, 204, 255));
        btnVypocti.addActionListener(e -> btnVypoctiPocet(e));
        contentPane.add(btnVypocti, "cell 1 6 5 1");

        //---- labPodnadpisChov ----
        labPodnadpisChov.setText("Velikost chovu p\u0159ed zimou:");
        labPodnadpisChov.setFont(new Font("MS Gothic", Font.BOLD, 15));
        contentPane.add(labPodnadpisChov, "cell 1 8 3 1");

        //---- editPocetKraliku ----
        editPocetKraliku.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contentPane.add(editPocetKraliku, "cell 1 9");

        //---- editPocetHus ----
        editPocetHus.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contentPane.add(editPocetHus, "cell 4 9");

        //---- labPodnadpisKrmivo ----
        labPodnadpisKrmivo.setText("Pot\u0159eba krmiva");
        labPodnadpisKrmivo.setFont(new Font("MS Gothic", Font.BOLD, 15));
        contentPane.add(labPodnadpisKrmivo, "cell 1 11 3 1");

        //---- labText ----
        labText.setText("P\u0159ed zimou se mus\u00ed vyp\u011bstovat:");
        labText.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contentPane.add(labText, "cell 1 12 2 1");

        //---- editMrkev ----
        editMrkev.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        editMrkev.setForeground(new Color(255, 51, 51));
        contentPane.add(editMrkev, "cell 1 13");

        //---- editZrni ----
        editZrni.setForeground(new Color(51, 0, 255));
        editZrni.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contentPane.add(editZrni, "cell 1 14");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

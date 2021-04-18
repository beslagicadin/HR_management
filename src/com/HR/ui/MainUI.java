package com.HR.ui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainUI implements ActionListener {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JTable tableRadnici;
    private JTextField textFieldID;
    private JTextField textFieldIme;
    private JTextField textFieldPrezime;
    private JComboBox comboBoxResor;
    private JButton brisiButtonR;
    private JButton ocistiUnosButtonR;
    private JButton unesiButtonR;
    private JButton izmjeniButtonR;
    private JTextField textFieldPlata;
    private JTextField textFieldTel;
    private JTextField textFieldEmail;
    private JTable tableDokumenti;
    private JTable tableResori;
    private JButton unesiButtonD;
    private JButton izmjeniButtonD;
    private JButton ocistiUnosButtonD;
    private JTextField textFieldIDdoc;
    private JTextField textFieldNazivdoc;
    private JTextField textFieldPutanja;
    private JComboBox comboBoxTip;
    private JComboBox comboBoxVlasnik;
    private JButton brisiButtonD;


    String[] colRa = {"ID", "Ime", "Prezime", "Telefon", "Email", "Resor", "Plata"};
    Object[] colD = {"ID", "Naziv", "Putanja", "Tip dokumenta", "Vlasnik"};
    Object[] colRe= {"Naziv"};

    DefaultTableModel modelRa, modelD, modelRe;
    
    public MainUI() {
        createTable();
        unesiButtonR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Object[] redRadnici = new Object[7];
                if(textFieldID.getText()!="" && textFieldIme.getText()!="" && textFieldTel.getText()!="" && textFieldPrezime.getText()!="" && textFieldEmail.getText()!="" && textFieldPlata.getText()!="" && comboBoxResor.getSelectedItem()!="-") {
                    redRadnici[0] = textFieldID.getText();
                    redRadnici[1] = textFieldIme.getText();
                    redRadnici[2] = textFieldPrezime.getText();
                    redRadnici[3] = textFieldTel.getText();
                    redRadnici[4] = textFieldEmail.getText();
                    redRadnici[5] = comboBoxResor.getSelectedItem();
                    redRadnici[6] = textFieldPlata.getText();

                    modelRa.addRow(redRadnici);
                    JOptionPane.showMessageDialog(null, "Unos je uspješan.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Unos nije uspješan.");

                }
            }
        });
        unesiButtonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] redDoc = new Object[5];
                if (textFieldIDdoc.getText() != "" && textFieldNazivdoc.getText() != "" && textFieldPutanja.getText() != "" && comboBoxTip.getSelectedItem() != "-" && comboBoxVlasnik.getSelectedItem() != "-") {
                    redDoc[0] = textFieldIDdoc.getText();
                    redDoc[1] = textFieldNazivdoc.getText();
                    redDoc[2] = textFieldPutanja.getText();
                    redDoc[3] = comboBoxTip.getSelectedItem();
                    redDoc[4] = comboBoxVlasnik.getSelectedItem();

                    modelD.addRow(redDoc);
                    JOptionPane.showMessageDialog(null, "Unos je uspješan.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Unos nije uspješan!");
                }
            }
        });

        brisiButtonR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tableRadnici.getSelectedRow()>=0) {
                    modelRa.removeRow(tableRadnici.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Odabrani unos je obrisan!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Brisanje neuspješno. Nije odabran nijedan unos!");
                }
            }
        });
        brisiButtonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tableDokumenti.getSelectedRow()>=0) {
                    modelD.removeRow(tableDokumenti.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Odabrani unos je obrisan!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Brisanje neuspješno. Nije odabran nijedan unos!");
                }
            }
        });
        tableRadnici.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int i = tableRadnici.getSelectedRow();
                textFieldID.setText(modelRa.getValueAt(i, 0).toString());
                textFieldIme.setText(modelRa.getValueAt(i, 1).toString());
                textFieldPrezime.setText(modelRa.getValueAt(i, 2).toString());
                textFieldTel.setText(modelRa.getValueAt(i, 3).toString());
                textFieldEmail.setText(modelRa.getValueAt(i, 4).toString());
                comboBoxResor.setSelectedItem(modelRa.getValueAt(i, 5).toString());
                textFieldPlata.setText(modelRa.getValueAt(i, 6).toString());
            }
        });
        tableDokumenti.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int i = tableDokumenti.getSelectedRow();
                textFieldIDdoc.setText(modelD.getValueAt(i, 0).toString());
                textFieldNazivdoc.setText(modelD.getValueAt(i, 1).toString());
                textFieldPutanja.setText(modelD.getValueAt(i, 2).toString());
                comboBoxTip.setSelectedItem(modelD.getValueAt(i, 3).toString());
                comboBoxVlasnik.setSelectedItem(modelD.getValueAt(i, 4).toString());
            }
        });
        izmjeniButtonR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i=tableRadnici.getSelectedRow();
                if(tableRadnici.getSelectedRow()>=0 && textFieldID.getText()!="" && textFieldIme.getText()!="" && textFieldTel.getText()!="" && textFieldPrezime.getText()!="" && textFieldEmail.getText()!="" && textFieldPlata.getText()!="" && comboBoxResor.getSelectedItem()!="-"){
                modelRa.setValueAt(textFieldID.getText(),i,0);
                modelRa.setValueAt(textFieldIme.getText(),i,1);
                modelRa.setValueAt(textFieldPrezime.getText(),i,2);
                modelRa.setValueAt(textFieldTel.getText(),i,3);
                modelRa.setValueAt(textFieldEmail.getText(),i,4);
                modelRa.setValueAt(comboBoxResor.getSelectedItem(),i,5);
                modelRa.setValueAt(textFieldPlata.getText(),i,6);

                JOptionPane.showMessageDialog(null, "Izmjena upisana!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Izmjena nije upisana!");
                }
            }
        });
        izmjeniButtonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i=tableDokumenti.getSelectedRow();
                if(tableDokumenti.getSelectedRow()>=0 && textFieldIDdoc.getText() != "" && textFieldNazivdoc.getText() != "" && textFieldPutanja.getText() != "" && comboBoxTip.getSelectedItem() != "-" && comboBoxVlasnik.getSelectedItem() != "-"){
                    modelD.setValueAt(textFieldIDdoc.getText(),i,0);
                    modelD.setValueAt(textFieldNazivdoc.getText(),i,1);
                    modelD.setValueAt(textFieldPutanja.getText(),i,2);
                    modelD.setValueAt(comboBoxTip.getSelectedItem(),i,3);
                    modelD.setValueAt(comboBoxVlasnik.getSelectedItem(),i,4);

                    JOptionPane.showMessageDialog(null, "Izmjena upisana!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Izmjena nije upisana!");
                }
            }
        });
        ocistiUnosButtonR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldID.setText("");
                textFieldIme.setText("");
                textFieldPrezime.setText("");
                textFieldTel.setText("");
                textFieldEmail.setText("");
                comboBoxResor.setSelectedItem("-");
                textFieldPlata.setText("");
            }
        });
        ocistiUnosButtonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldIDdoc.setText("");
                textFieldNazivdoc.setText("");
                textFieldPutanja.setText("");
                comboBoxTip.setSelectedItem("-");
                comboBoxVlasnik.setSelectedItem("-");
            }
        });
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }

    public void createTable(){

        Object[][] radnici = {
                {101, "Ime1", "Prezime1", "Telefon1", "Email1", "Uprava", 5000},
                {102, "Ime2", "Prezime2", "Telefon2", "Email2", "Nabavka", 4500},
                {103, "Ime3", "Prezime3", "Telefon3", "Email3", "Proizvodnja", 1800}};

        Object[][] dokumenti = {
                {201, "CV Ime1 Prezime1", "D:/HR/Documents/CV001.pdf", "Curiculum Vitae", "Ime1 Prezime1"},
                {202, "Diploma Ime2 Prezime2", "D:/HR/Documents/DP001.pdf", "Diploma", "Ime2 Prezime2"},
                {203, "Motivaciono pismo Ime3 Prezime3", "D:/HR/Documents/MP001.pdf", "Motivaciono pismo", "Ime3 Prezime3"},
                {204, "Ugovor br.001", "D:/HR/Documents/UG001.pdf", "Ugovor", "Kompanija"}};

        Object[][] resori = {
                {"Proizvodnja"},
                {"Nabavka"},
                {"Marketing"},
                {"Finansije"},
                {"Uprava"}};

        modelRa = new DefaultTableModel(radnici,colRa);
        modelRe = new DefaultTableModel(resori,colRe);
        modelD = new DefaultTableModel(dokumenti,colD);

        tableRadnici.setModel(modelRa);
        tableDokumenti.setModel(modelD);
        tableResori.setModel(modelRe);

        textFieldID.setText("");
        textFieldIme.setText("");
        textFieldPrezime.setText("");
        textFieldTel.setText("");
        textFieldEmail.setText("");
        comboBoxResor.setSelectedItem("-");
        textFieldPlata.setText("");
        textFieldIDdoc.setText("");
        textFieldNazivdoc.setText("");
        textFieldPutanja.setText("");
        comboBoxTip.setSelectedItem("-");
        comboBoxVlasnik.setSelectedItem("-");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

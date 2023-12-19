/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controler.*;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import persist.*;
import model.*;
import static util.Util.*;

/**
 *
 * @author usuari
 */
public class VistaAfegirYModificar extends javax.swing.JDialog {

    private BmCtl bmctl;

    /**
     * Creates new form VistaAfegirYModificar
     */
    public VistaAfegirYModificar(java.awt.Frame parent, boolean modal, BmCtl bmctl) {
        super(parent, modal);
        this.bmctl = bmctl;
        initComponents();
    }

    public VistaAfegirYModificar(java.awt.Frame parent, boolean modal, BmCtl bmctl, String codi) {
        super(parent, modal);
        this.bmctl = bmctl;
        initComponents();
        codiText.setEnabled(false);

    }

    private boolean validaCodi() {
        boolean valida = false;
        String text = this.codiText.getText();
        if (bmctl.validarBuit(text)) {
            codiErrorLab.setText("Camp obligatori");
        } else {
            if (isInt(text)) {
                int codi = Integer.parseInt(text);
                if (codi < 0) {
                    codiErrorLab.setText("No pot ser negatiu");
                } else {
                    try {

                        if (bmctl.getVaixell(codi) != null) {
                            codiErrorLab.setText("Codi repetit");

                        } else {
                            codiErrorLab.setText("");
                            valida = true;
                        }
                    } catch (Exception e) {
                        System.out.println(e.toString());
                        e.printStackTrace();
                    }
                }
            } else {
                codiErrorLab.setText("Valor númeric");
            }

        }
        return valida;
    }

    private boolean validaNom() {
        boolean valida = false;
        String text = this.nomText.getText();
        if (bmctl.validarBuit(text)) {
            nomErrorLab.setText("Camp obligatori");
        } else {
            nomErrorLab.setText("");
            valida = true;
        }
        return valida;
    }

    private boolean validaRating() {
        boolean valida = false;
        String text = this.ratingText.getText();

        try {
            if (bmctl.validarBuit(text)) {
                ratingErrorLab.setText("Camp obligatori");
            } else {
                if (isDouble(text)) {
                    double num = Double.parseDouble(text);
                    if (num < 0) {
                        ratingErrorLab.setText("No pot ser negatiu");
                    } else {
                        ratingErrorLab.setText("");
                        valida = true;
                    }
                } else {
                    ratingErrorLab.setText("Valor númeric");
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return valida;
    }

    private boolean validaClub() {
        boolean valida = false;
        String text = this.clubText.getText();
        if (bmctl.validarBuit(text)) {
            clubErrorLab.setText("Camp obligatori");
        } else {
            if (text.trim().length() < 3) {
                clubErrorLab.setText("Minim 3 lletres");
            } else {
                clubErrorLab.setText("");
                valida = true;
            }
        }
        return valida;
    }

    private boolean validaTemps() {
        boolean valida = false;
        String text = this.tempsText.getText();
        try {
            if (bmctl.validarBuit(text)) {
                tempsErrorLab.setText("Camp obligatori");
            } else {
                if (isDouble(text)) {
                    double num = Double.parseDouble(text);
                    if (num < 0) {
                        tempsErrorLab.setText("No pot ser negatiu");
                    } else {
                        tempsErrorLab.setText("");
                        valida = true;
                    }
                } else {
                    tempsErrorLab.setText("Valor númeric");
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return valida;
    }

    private String donamTipus() {
        String text = null;
        if (regataRB.isSelected()) {
            text = "Regata";
        } else if (creuerRB.isSelected()) {
            text = "Creuer";
        } else if (creuerRegataRB.isSelected()) {
            text = "Creuer-Regata";
        }
        return text;
    }

    public void desabilitarCodi() {
        codiText.setEditable(false);
    }

    public void setCategoriaCombo(DefaultComboBoxModel dcb) {
        categoriaCB.setModel(dcb);
    }

    public void setCamps(String codi) {
        int cod = Integer.parseInt(codi);
        Vaixell vai = bmctl.getVaixell(cod);
        codiText.setText(String.valueOf(vai.getCodi()));
        nomText.setText(vai.getNom());
        ratingText.setText(String.valueOf(vai.getRating()));
        clubText.setText(vai.getClub());
        tempsText.setText(String.valueOf(vai.getTemps()));
        categoriaCB.setSelectedItem(vai.getCategoria().getNom());
        seniorCB.setSelected(vai.isSenior());
        if (vai.getTipus().equals("Regata")) {
            regataRB.setSelected(true);
        } else if (vai.getTipus().equals("Creuer")) {
            creuerRB.setSelected(true);
        } else {
            creuerRegataRB.setSelected(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipusBGroup = new javax.swing.ButtonGroup();
        codiLab = new javax.swing.JLabel();
        codiText = new javax.swing.JTextField();
        nomLab = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        categoriaLab = new javax.swing.JLabel();
        ratingLab = new javax.swing.JLabel();
        ratingText = new javax.swing.JTextField();
        clubLab = new javax.swing.JLabel();
        clubText = new javax.swing.JTextField();
        tipusLab = new javax.swing.JLabel();
        regataRB = new javax.swing.JRadioButton();
        creuerRB = new javax.swing.JRadioButton();
        creuerRegataRB = new javax.swing.JRadioButton();
        seniorCB = new javax.swing.JCheckBox();
        seniorLab = new javax.swing.JLabel();
        tempsLab = new javax.swing.JLabel();
        tempsText = new javax.swing.JTextField();
        codiErrorLab = new javax.swing.JLabel();
        nomErrorLab = new javax.swing.JLabel();
        ratingErrorLab = new javax.swing.JLabel();
        clubErrorLab = new javax.swing.JLabel();
        tempsErrorLab = new javax.swing.JLabel();
        categoriaErrorLab = new javax.swing.JLabel();
        tipusErrorLab = new javax.swing.JLabel();
        categoriaCB = new javax.swing.JComboBox<>();
        AcceptarBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        codiLab.setText("Codi");

        codiText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codiTextFocusLost(evt);
            }
        });
        codiText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codiTextKeyTyped(evt);
            }
        });

        nomLab.setText("Nom");

        nomText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomTextFocusLost(evt);
            }
        });
        nomText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomTextKeyTyped(evt);
            }
        });

        categoriaLab.setText("Categoria");

        ratingLab.setText("Rating");

        ratingText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ratingTextFocusLost(evt);
            }
        });
        ratingText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ratingTextKeyTyped(evt);
            }
        });

        clubLab.setText("Club");

        clubText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clubTextFocusLost(evt);
            }
        });
        clubText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clubTextKeyTyped(evt);
            }
        });

        tipusLab.setText("Tipus de Vaixell");

        tipusBGroup.add(regataRB);
        regataRB.setText("Regata");
        regataRB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regataRBFocusLost(evt);
            }
        });
        regataRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regataRBActionPerformed(evt);
            }
        });

        tipusBGroup.add(creuerRB);
        creuerRB.setText("Creuer");
        creuerRB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                creuerRBFocusLost(evt);
            }
        });
        creuerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creuerRBActionPerformed(evt);
            }
        });

        tipusBGroup.add(creuerRegataRB);
        creuerRegataRB.setText("Creuer-Regata");
        creuerRegataRB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                creuerRegataRBFocusLost(evt);
            }
        });
        creuerRegataRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creuerRegataRBActionPerformed(evt);
            }
        });

        seniorCB.setText("Senior");

        seniorLab.setText("Senior");

        tempsLab.setText("Temps");

        tempsText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tempsTextFocusLost(evt);
            }
        });
        tempsText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tempsTextKeyTyped(evt);
            }
        });

        codiErrorLab.setText("_");

        nomErrorLab.setText("_");

        ratingErrorLab.setText("_");

        clubErrorLab.setText("_");

        tempsErrorLab.setText("_");

        categoriaErrorLab.setText("_");

        tipusErrorLab.setText("_");

        categoriaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoriaCB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                categoriaCBFocusLost(evt);
            }
        });
        categoriaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCBActionPerformed(evt);
            }
        });

        AcceptarBut.setText("Acceptar");
        AcceptarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptarButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaLab)
                            .addComponent(categoriaErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipusLab)
                            .addComponent(regataRB)
                            .addComponent(creuerRB)
                            .addComponent(creuerRegataRB)
                            .addComponent(tipusErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seniorLab)
                                    .addComponent(seniorCB))
                                .addGap(23, 78, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(AcceptarBut)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codiLab)
                                    .addGap(37, 37, 37)
                                    .addComponent(codiText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(ratingLab)
                                                .addGap(25, 25, 25))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nomLab)
                                                .addGap(36, 36, 36)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(clubLab)
                                            .addGap(37, 37, 37)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nomText, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(ratingText)
                                        .addComponent(clubText, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempsLab)
                                .addGap(21, 21, 21)
                                .addComponent(tempsText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codiErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratingErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clubErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempsErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codiLab)
                    .addComponent(codiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiErrorLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLab)
                    .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomErrorLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingLab)
                    .addComponent(ratingErrorLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clubText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubLab)
                    .addComponent(clubErrorLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempsLab)
                    .addComponent(tempsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempsErrorLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(categoriaLab)
                                .addGap(6, 6, 6)
                                .addComponent(categoriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoriaErrorLab))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipusLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regataRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creuerRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creuerRegataRB)
                                .addGap(12, 12, 12)
                                .addComponent(tipusErrorLab)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seniorLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seniorCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AcceptarBut)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codiTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codiTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && codiText.getText().length() > 25) {
            evt.consume();
        }
    }//GEN-LAST:event_codiTextKeyTyped

    private void nomTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (nomText.getText().length() > 25) {
            evt.consume();
        }
    }//GEN-LAST:event_nomTextKeyTyped

    private void ratingTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratingTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((!((c >= '0' && c <= '9') || (c == '.' || c == ',')) && ratingText.getText().length() > 25)) {
            evt.consume();
        }
    }//GEN-LAST:event_ratingTextKeyTyped

    private void clubTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clubTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (clubText.getText().length() > 25) {
            evt.consume();
        }
    }//GEN-LAST:event_clubTextKeyTyped

    private void tempsTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempsTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((!((c >= '0' && c <= '9') || (c == '.' || c == ',')) && ratingText.getText().length() > 25)) {
            evt.consume();
        }
    }//GEN-LAST:event_tempsTextKeyTyped

    private void codiTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codiTextFocusLost
        // TODO add your handling code here:
        if (codiText.isEnabled()) {
            validaCodi();
        }

    }//GEN-LAST:event_codiTextFocusLost

    private void nomTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomTextFocusLost
        // TODO add your handling code here:
        validaNom();
    }//GEN-LAST:event_nomTextFocusLost

    private void ratingTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ratingTextFocusLost
        // TODO add your handling code here:
        validaRating();
    }//GEN-LAST:event_ratingTextFocusLost

    private void clubTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clubTextFocusLost
        // TODO add your handling code here:
        validaClub();
    }//GEN-LAST:event_clubTextFocusLost

    private void tempsTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempsTextFocusLost
        // TODO add your handling code here:
        validaTemps();
    }//GEN-LAST:event_tempsTextFocusLost

    private void categoriaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCBActionPerformed
        // TODO add your handling code here:
        if (categoriaCB.getSelectedIndex() == 0) {
            categoriaErrorLab.setText("Camp Obligatori");
        } else {
            categoriaErrorLab.setText("");
        }
    }//GEN-LAST:event_categoriaCBActionPerformed

    private void regataRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regataRBActionPerformed
        // TODO add your handling code here:
        if (donamTipus() == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }
    }//GEN-LAST:event_regataRBActionPerformed

    private void creuerRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creuerRBActionPerformed
        // TODO add your handling code here:
        if (donamTipus() == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }
    }//GEN-LAST:event_creuerRBActionPerformed

    private void creuerRegataRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creuerRegataRBActionPerformed
        // TODO add your handling code here:
        if (donamTipus() == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }
    }//GEN-LAST:event_creuerRegataRBActionPerformed

    private void AcceptarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptarButActionPerformed
        // TODO add your handling code here:

        boolean vC;
        if (codiText.isEnabled()) {
            vC = validaCodi();
        } else {
            vC = true;
        }

        boolean vN = validaNom();
        boolean vR = validaRating();
        boolean vCl = validaClub();
        boolean vT = validaTemps();
        String dT = donamTipus();

        if (dT == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }

        if (categoriaCB.getSelectedIndex() == 0) {
            categoriaErrorLab.setText("Camp Obligatori");
        } else {
            categoriaErrorLab.setText("");
        }

        if (vC && vN && vR && vCl && vT && dT != null && categoriaCB.getSelectedIndex() != 0) {

            VaixellDAO vDao = new VaixellDAO();
            CategoriaDAO cDao = new CategoriaDAO();
            Vaixell vai = new Vaixell();
            Categoria cate = null;
            int codi = Integer.parseInt(this.codiText.getText());
            String nom = this.nomText.getText();
            double rating = Double.parseDouble(this.ratingText.getText());
            String club = this.clubText.getText();
            double temps = Double.parseDouble(this.tempsText.getText());
            int cat = categoriaCB.getSelectedIndex();

            vai.setCodi(codi);
            vai.setNom(nom);
            vai.setRating(rating);
            vai.setClub(club);
            vai.setTemps(temps);
            vai.setTipus(dT);
            if (seniorCB.isSelected()) {
                vai.setSenior(true);
            } else {
                vai.setSenior(false);
            }
            cate = cDao.getCategoria(cat);
            vai.setCategoria(cate);
            try {
                if (codiText.isEnabled()) {
                    bmctl.afegirVaixell(vai);
                } else {
                    bmctl.modificarVaixell(vai);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            codiText.setText("");
            nomText.setText("");
            ratingText.setText("");
            clubText.setText("");
            tempsText.setText("");
            tipusBGroup.clearSelection();
            categoriaCB.setSelectedIndex(0);
            seniorCB.setSelected(false);

        }

    }//GEN-LAST:event_AcceptarButActionPerformed

    private void categoriaCBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_categoriaCBFocusLost
        // TODO add your handling code here:
        if (categoriaCB.getSelectedIndex() == 0) {
            categoriaErrorLab.setText("Camp Obligatori");
        } else {
            categoriaErrorLab.setText("");
        }
    }//GEN-LAST:event_categoriaCBFocusLost

    private void regataRBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regataRBFocusLost
        // TODO add your handling code here:
        if (donamTipus() == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }
    }//GEN-LAST:event_regataRBFocusLost

    private void creuerRBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creuerRBFocusLost
        // TODO add your handling code here:
        if (donamTipus() == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }
    }//GEN-LAST:event_creuerRBFocusLost

    private void creuerRegataRBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creuerRegataRBFocusLost
        // TODO add your handling code here:
        if (donamTipus() == null) {
            tipusErrorLab.setText("Camp Obligatori");
        } else {
            tipusErrorLab.setText("");
        }
    }//GEN-LAST:event_creuerRegataRBFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAfegirYModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAfegirYModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAfegirYModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAfegirYModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaAfegirYModificar dialog = new VistaAfegirYModificar(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptarBut;
    private javax.swing.JComboBox<String> categoriaCB;
    private javax.swing.JLabel categoriaErrorLab;
    private javax.swing.JLabel categoriaLab;
    private javax.swing.JLabel clubErrorLab;
    private javax.swing.JLabel clubLab;
    private javax.swing.JTextField clubText;
    private javax.swing.JLabel codiErrorLab;
    private javax.swing.JLabel codiLab;
    private javax.swing.JTextField codiText;
    private javax.swing.JRadioButton creuerRB;
    private javax.swing.JRadioButton creuerRegataRB;
    private javax.swing.JLabel nomErrorLab;
    private javax.swing.JLabel nomLab;
    private javax.swing.JTextField nomText;
    private javax.swing.JLabel ratingErrorLab;
    private javax.swing.JLabel ratingLab;
    private javax.swing.JTextField ratingText;
    private javax.swing.JRadioButton regataRB;
    private javax.swing.JCheckBox seniorCB;
    private javax.swing.JLabel seniorLab;
    private javax.swing.JLabel tempsErrorLab;
    private javax.swing.JLabel tempsLab;
    private javax.swing.JTextField tempsText;
    private javax.swing.ButtonGroup tipusBGroup;
    private javax.swing.JLabel tipusErrorLab;
    private javax.swing.JLabel tipusLab;
    // End of variables declaration//GEN-END:variables
}

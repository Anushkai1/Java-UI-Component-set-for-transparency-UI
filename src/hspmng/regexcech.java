
package hspmng;

import Swing.hBtn;
import java.awt.Color;
import javax.swing.JScrollBar;
import Elements.ScrollBarCustome;
import Assest.skin;

public class regexcech extends javax.swing.JFrame {

    public regexcech() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        wMover. initMoving(this);
        Swing.TxFld1[] xy = {txFld13,txFld11};

       subBtn2.setTxtList(xy);
       txFld13.setSb1(subBtn2);
       txFld11.setSb1(subBtn2);
       combobox1.setSb1(subBtn2);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wCloseBtn = new Elements.WCloseBtn();
        wMover = new Elements.WMover();
        SettingBtn = new Swing.iBtn();
        MinimizeBtn = new Swing.iBtn();
        hBDash = new Swing.hBtn();
        Hbpers = new Swing.hBtn();
        hBAdmit = new Swing.hBtn();
        hBDisc = new Swing.hBtn();
        hBbirth = new Swing.hBtn();
        hBDeath = new Swing.hBtn();
        hBSur = new Swing.hBtn();
        hBDoc = new Swing.hBtn();
        hBWard = new Swing.hBtn();
        subBtn2 = new Swing.subBtn();
        txFld13 = new Swing.TxFld1();
        txFld11 = new Swing.TxFld1();
        combobox1 = new Swing.Combobox();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wCloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wCloseBtnMousePressed(evt);
            }
        });
        getContentPane().add(wCloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 1, -1, -1));

        wMover.setFocusable(false);
        wMover.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(wMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, -1));

        SettingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting.png"))); // NOI18N
        SettingBtn.setEnabled(false);
        getContentPane().add(SettingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 1, -1, -1));

        MinimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize.png"))); // NOI18N
        MinimizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MinimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 1, -1, -1));

        hBDash.setText("DASHBOARD ");
        hBDash.setRolloverEnabled(false);
        hBDash.setVerifyInputWhenFocusTarget(false);
        hBDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hBDashActionPerformed(evt);
            }
        });
        getContentPane().add(hBDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 1, -1, -1));

        Hbpers.setText("PERSON");
        Hbpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HbpersActionPerformed(evt);
            }
        });
        getContentPane().add(Hbpers, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 1, -1, -1));

        hBAdmit.setText("ADMIT");
        getContentPane().add(hBAdmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 1, -1, -1));

        hBDisc.setText("DISCHARGE ");
        getContentPane().add(hBDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 1, -1, -1));

        hBbirth.setText("BIRTH");
        getContentPane().add(hBbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 1, -1, -1));

        hBDeath.setText("DEATH");
        getContentPane().add(hBDeath, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 1, -1, -1));

        hBSur.setText("SURGERY");
        getContentPane().add(hBSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 1, -1, -1));

        hBDoc.setText("DOC");
        getContentPane().add(hBDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 1, -1, -1));

        hBWard.setText("WARD");
        getContentPane().add(hBWard, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 1, -1, -1));

        subBtn2.setText("subBtn2");
        getContentPane().add(subBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txFld13.setText("txFld13");
        txFld13.setMaxLength(9);
        txFld13.setRequired(java.lang.Boolean.TRUE);
        txFld13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFld13ActionPerformed(evt);
            }
        });
        txFld13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txFld13KeyReleased(evt);
            }
        });
        getContentPane().add(txFld13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        txFld13.getAccessibleContext().setAccessibleName("aaaaaaa");

        txFld11.setText("txFld11");
        txFld11.setMaxLength(9);
        txFld11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txFld11KeyReleased(evt);
            }
        });
        getContentPane().add(txFld11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "A", "A", "A", "B", "Q", "W", "E", "R", "T", "Y", "U", "I" }));
        combobox1.setSelectedIndex(-1);
        getContentPane().add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        bg_label.setText("jLabel1");
        bg_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 145, 196)));
        getContentPane().add(bg_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void MinimizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeBtnActionPerformed
        setState(regexcech.ICONIFIED);
    }//GEN-LAST:event_MinimizeBtnActionPerformed

    private void hBDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBDashActionPerformed
         header_btn_sel(0);
    }//GEN-LAST:event_hBDashActionPerformed

    private void HbpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbpersActionPerformed
        header_btn_sel(1);
    }//GEN-LAST:event_HbpersActionPerformed

    private void txFld13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txFld13KeyReleased
        Assest.Regex.rxPhone(evt);
    }//GEN-LAST:event_txFld13KeyReleased

    private void txFld13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFld13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFld13ActionPerformed

    private void txFld11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txFld11KeyReleased
        Assest.Regex.rxPhone(evt);
    }//GEN-LAST:event_txFld11KeyReleased
     private  void header_btn_sel(int x){
            hBtn[] hbl = {hBDash, Hbpers, hBAdmit, hBDisc, hBbirth, hBDeath, hBSur, hBDoc,hBWard, }; //

            Color bg = hbl[0].getBg();
            Color fg = hbl[0].getFg();
            
           for(int b = 0; b < 9; b++){
                if(x!=b){
                hbl[b].setBackground(bg);
                hbl[b].setForeground(fg);
                hbl[b].setOver(false);
                }
            }
        }



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.hBtn Hbpers;
    private Swing.iBtn MinimizeBtn;
    private Swing.iBtn SettingBtn;
    private javax.swing.JLabel bg_label;
    private Swing.Combobox combobox1;
    private Swing.hBtn hBAdmit;
    private Swing.hBtn hBDash;
    private Swing.hBtn hBDeath;
    private Swing.hBtn hBDisc;
    private Swing.hBtn hBDoc;
    private Swing.hBtn hBSur;
    private Swing.hBtn hBWard;
    private Swing.hBtn hBbirth;
    private Swing.subBtn subBtn2;
    private Swing.TxFld1 txFld11;
    private Swing.TxFld1 txFld13;
    private Elements.WCloseBtn wCloseBtn;
    private Elements.WMover wMover;
    // End of variables declaration//GEN-END:variables
}

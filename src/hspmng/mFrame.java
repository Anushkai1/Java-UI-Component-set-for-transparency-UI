
package hspmng;

import Swing.hBtn;
import java.awt.Color;
import javax.swing.JScrollBar;
import Elements.ScrollBarCustome;
import Assest.skin;

public class mFrame extends javax.swing.JFrame {

    public mFrame() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        wMover. initMoving(this);

        jScrollPane3.setVerticalScrollBar(new ScrollBarCustome());
        ScrollBarCustome sp = new ScrollBarCustome();
        sp.setOrientation(JScrollBar.VERTICAL);
        jScrollPane3.setHorizontalScrollBar(sp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn4_1 = new Swing.Btn4_();
        btn3_1 = new Swing.Btn3_();
        btn1_1 = new Swing.Btn1_();
        btn2_2 = new Swing.Btn2_();
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
        txFCont1_1 = new Swing.TxFCont1_();
        txFCont1_3 = new Swing.TxFCont1_();
        txFCont1_5 = new Swing.TxFCont1_();
        txFCont1_2 = new Swing.TxFCont1_();
        txFCont1_4 = new Swing.TxFCont1_();
        txFCont1_6 = new Swing.TxFCont1_();
        combobox1 = new Swing.Combobox();
        combobox2 = new Swing.Combobox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txArea2 = new Swing.txArea();
        txFContwith1 = new Swing.TxFContwith();
        txFContwith2 = new Swing.TxFContwith();
        fmTitle1 = new Swing.fmTitle();
        txFld11 = new Swing.TxFld1();
        fmBg1 = new Swing.fmBg();
        bg_label = new javax.swing.JLabel();
        btn4_2 = new Swing.Btn4_();
        btn4_3 = new Swing.Btn4_();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn4_1.setText("DESDFSFA");
        getContentPane().add(btn4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, -1, -1));

        btn3_1.setText("DASHBOARD");
        getContentPane().add(btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, -1, -1));

        btn1_1.setText("LOGIN");
        getContentPane().add(btn1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, -1, -1));

        btn2_2.setText("FSSGDFG DGDFG");
        btn2_2.setDoubleBuffered(true);
        getContentPane().add(btn2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, -1, -1));

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
        getContentPane().add(txFCont1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(txFCont1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(txFCont1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        getContentPane().add(txFCont1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));
        getContentPane().add(txFCont1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));
        getContentPane().add(txFCont1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PHP", "HTML", "JS", "Java" }));
        combobox1.setMinimumSize(new java.awt.Dimension(90, 0));
        getContentPane().add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 180, 40));

        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Dash" }));
        combobox2.setSelectedIndex(-1);
        getContentPane().add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, -1, -1));

        jScrollPane3.setBackground(skin.trc1);
        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

        txArea2.setColumns(20);
        txArea2.setRows(5);
        txArea2.setText("The workaround sets the color for the focus on all the common controls that it's not supposed to occur to transparent. I went and tested extensively with Windows Forms in Visual Studio. Toolbar buttons and ToggleButtons should never have the dotted border even when focused. Toolbars are supposed to be setFocusable(false); by default as they are in Windows. Every other control should have the dotted border as in Swing, but only when being focus cycled.\n");
        jScrollPane3.setViewportView(txArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 530, -1));
        getContentPane().add(txFContwith1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, 80));
        getContentPane().add(txFContwith2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 190));

        fmTitle1.setText("   REGISTER PERSON");
        getContentPane().add(fmTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txFld11.setText("txFld11");
        txFld11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFld11ActionPerformed(evt);
            }
        });
        getContentPane().add(txFld11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, -1, -1));
        getContentPane().add(fmBg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        bg_label.setText("jLabel1");
        bg_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 145, 196)));
        getContentPane().add(bg_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        btn4_2.setText("btn4_2");
        getContentPane().add(btn4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        btn4_3.setText("btn4_3");
        getContentPane().add(btn4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void MinimizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeBtnActionPerformed
        setState(mFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeBtnActionPerformed

    private void hBDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBDashActionPerformed
         header_btn_sel(0);
    }//GEN-LAST:event_hBDashActionPerformed

    private void HbpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbpersActionPerformed
        header_btn_sel(1);
    }//GEN-LAST:event_HbpersActionPerformed

    private void txFld11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFld11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFld11ActionPerformed
    



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.hBtn Hbpers;
    private Swing.iBtn MinimizeBtn;
    private Swing.iBtn SettingBtn;
    private javax.swing.JLabel bg_label;
    private Swing.Btn1_ btn1_1;
    private Swing.Btn2_ btn2_2;
    private Swing.Btn3_ btn3_1;
    private Swing.Btn4_ btn4_1;
    private Swing.Btn4_ btn4_2;
    private Swing.Btn4_ btn4_3;
    private Swing.Combobox combobox1;
    private Swing.Combobox combobox2;
    private Swing.fmBg fmBg1;
    private Swing.fmTitle fmTitle1;
    private Swing.hBtn hBAdmit;
    private Swing.hBtn hBDash;
    private Swing.hBtn hBDeath;
    private Swing.hBtn hBDisc;
    private Swing.hBtn hBDoc;
    private Swing.hBtn hBSur;
    private Swing.hBtn hBWard;
    private Swing.hBtn hBbirth;
    private javax.swing.JScrollPane jScrollPane3;
    private Swing.txArea txArea2;
    private Swing.TxFCont1_ txFCont1_1;
    private Swing.TxFCont1_ txFCont1_2;
    private Swing.TxFCont1_ txFCont1_3;
    private Swing.TxFCont1_ txFCont1_4;
    private Swing.TxFCont1_ txFCont1_5;
    private Swing.TxFCont1_ txFCont1_6;
    private Swing.TxFContwith txFContwith1;
    private Swing.TxFContwith txFContwith2;
    private Swing.TxFld1 txFld11;
    private Elements.WCloseBtn wCloseBtn;
    private Elements.WMover wMover;
    // End of variables declaration//GEN-END:variables
}


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



  
    }// </editor-fold>//GEN-END:initComponents


    



    
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

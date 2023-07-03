
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

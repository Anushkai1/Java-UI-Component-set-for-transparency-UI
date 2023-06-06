
package hspmng;

import Swing.hBtn;
import java.awt.Color;
import javax.swing.JScrollBar;
import Elements.ScrollBarCustome;
import Assest.skin;

public class mFrame1 extends javax.swing.JFrame {

    public mFrame1() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        wMover. initMoving(this);

       //jScrollPane1.setVerticalScrollBar(new ScrollBarCustome());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        newJPanel2 = new hspmng.NewJPanel();
        bg_label = new javax.swing.JLabel();

        
    }// </editor-fold>//GEN-END:initComponents






    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.hBtn Hbpers;
    private Swing.iBtn MinimizeBtn;
    private Swing.iBtn SettingBtn;
    private javax.swing.JLabel bg_label;
    private Swing.hBtn hBAdmit;
    private Swing.hBtn hBDash;
    private Swing.hBtn hBDeath;
    private Swing.hBtn hBDisc;
    private Swing.hBtn hBDoc;
    private Swing.hBtn hBSur;
    private Swing.hBtn hBWard;
    private Swing.hBtn hBbirth;
    private javax.swing.JScrollPane jScrollPane1;
    private hspmng.NewJPanel newJPanel2;
    private Elements.WCloseBtn wCloseBtn;
    private Elements.WMover wMover;
    // End of variables declaration//GEN-END:variables
}

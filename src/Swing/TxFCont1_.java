
package Swing;

import Assest.skin;
import java.awt.event.KeyEvent;
import Assest.Regex;
public class TxFCont1_ extends javax.swing.JPanel {

    public TxFCont1_() {
        initComponents();
        setOpaque(false);
        jLabel1.setFont(skin.ttf(13,1));
        jLabel1.setForeground(skin.wc3);
        setBackground(skin.wc8);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txFld12 = new Swing.TxFld1();

        setPreferredSize(new java.awt.Dimension(530, 70));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FIRST NAME");
        jLabel1.setPreferredSize(new java.awt.Dimension(65, 15));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 370, -1));

        txFld12.setText("txFld12");
        txFld12.setMaxLength(9);
        txFld12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txFld12KeyReleased(evt);
            }
        });
        add(txFld12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txFld12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txFld12KeyReleased
            Regex.rxPhone(evt);
    }//GEN-LAST:event_txFld12KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Swing.TxFld1 txFld12;
    // End of variables declaration//GEN-END:variables
}

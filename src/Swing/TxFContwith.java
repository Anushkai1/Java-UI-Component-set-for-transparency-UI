
package Swing;

import Assest.skin;

public class TxFContwith extends javax.swing.JPanel {

    public TxFContwith() {
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

        setPreferredSize(new java.awt.Dimension(530, 70));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FIRST NAME");
        jLabel1.setPreferredSize(new java.awt.Dimension(65, 15));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 370, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

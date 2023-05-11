
package Elements;

public class WCloseBtn extends javax.swing.JPanel {

    public WCloseBtn() {
        initComponents();
        setOpaque(false);     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iBtn2 = new Swing.iBtn();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(53, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        iBtn2.setMargin(new java.awt.Insets(5, 5, 5, 5));
        iBtn2.setPreferredSize(new java.awt.Dimension(53, 30));
        iBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iBtn2MouseClicked(evt);
            }
        });
        add(iBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void iBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iBtn2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_iBtn2MouseClicked


}

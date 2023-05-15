
package Elements;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class WMover extends javax.swing.JPanel {

    public WMover() {
        initComponents();
        setOpaque(false);
        
        setRequestFocusEnabled(false);
    }

    private int xMouse;
    private int yMouse;

    public void initMoving(JFrame fram) {
        iBtn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                 xMouse = me.getX();
                 yMouse = me.getY();
            }

        });
        iBtn3.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() -  xMouse, me.getYOnScreen() -  yMouse);
            }
        });
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iBtn3 = new Swing.iBtn();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/window_mover.png"))); // NOI18N
        iBtn3.setFocusPainted(false);
        iBtn3.setPreferredSize(new java.awt.Dimension(53, 30));
        add(iBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.iBtn iBtn3;
    // End of variables declaration//GEN-END:variables
}

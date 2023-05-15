
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

        
    }// </editor-fold>//GEN-END:initComponents



}

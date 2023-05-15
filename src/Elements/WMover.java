
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

    }   
    


}

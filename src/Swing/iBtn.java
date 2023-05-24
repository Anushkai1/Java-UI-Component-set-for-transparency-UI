
package Swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import Assest.skin;
import java.awt.Dimension;

public class iBtn extends JButton{


    public boolean isOver() {
        return over;
    }
    public void setOver(boolean over) {
        this.over = over;
    }
    public Color getBg() {
        return bg;
    }
    public void setBg(Color bg) {
        setBackground(bg);
    }
    public Color getFg() {
        return fg;
    }
    public void setFg(Color fg) {
        setForeground(fg);
    }
    public Color getHover_bg() {
        return hover_bg;
    }


    private boolean over;
    private Color bg;
    private Color fg;
    private Color hover_bg;
    private Color active_bg;
    private Color hover_fg;
    private Color active_fg;
    


    

}


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

public class hBtn extends JButton{


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
    public void setHover_bg(Color hover_bg) {
        this.hover_bg = hover_bg;
    }
    public Color getActive_bg() {
        return active_bg;
    }
    public void setActive_bg(Color active_bg) {
        this.active_bg = active_bg;
    }
    public Color getHover_fg() {
        return hover_fg;
    }
    public void setHover_fg(Color hover_fg) {
        this.hover_fg = hover_fg;
    }
    public Color getActive_fg() {
        return active_fg;
    }
    public void setActive_fg(Color active_fg) {
        this.active_fg = active_fg;
    }
    public Color getborder() {
        return border;
    }
    public void setborder(Color border) {
        this.active_fg = border;
    }
    public hBtn() {
       this.setFont(skin.ttf(13, 1));
       
        fg =  skin.wc3;
       setFg(fg);
       active_fg =skin.wc1;
       hover_fg = skin.wc2;
       bg = skin.wc8;//blc6
       setBg(bg);
        hover_bg = skin.wc6;
        active_bg = skin.wc5;
        
        setPreferredSize(new Dimension(110, 30));
        setMargin(new java.awt.Insets(2, 4, 2, 4));
        setContentAreaFilled(false);
        setBorderPainted(false);
        setRequestFocusEnabled(false);

        
    }

    private boolean over;
    private Color bg;
    private Color fg;
    private Color hover_bg;
    private Color active_bg;
    private Color hover_fg;
    private Color active_fg;
    private Color border;
    

}

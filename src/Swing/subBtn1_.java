
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

public class subBtn1_ extends JButton{

    public TxFld1[] getTxtList() {
        return txtList;
    }
    public void setTxtList(TxFld1[] txtList) {
        this.txtList = txtList;
    }
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

    public subBtn1_() {
       this.setFont(skin.ttf(16, 1));
       
        fg = hover_fg = skin.wc2;
       setFg(fg);
        active_fg =  skin.wc1;
        
        bg = skin.bc7;
        setBg(bg);
        hover_bg = skin.bc5;
        active_bg = skin.bc4;
        setPreferredSize(new Dimension(130, 35));
        setMargin(new java.awt.Insets(2, 4, 2, 4));
        setContentAreaFilled(false);
                setBorderPainted(false);
        setRequestFocusEnabled(false);


    private boolean over;
    private Color bg;
    private Color fg;
    private Color hover_bg;
    private Color active_bg;
    private Color hover_fg;
    private Color active_fg;
    private TxFld1[] txtList;


}

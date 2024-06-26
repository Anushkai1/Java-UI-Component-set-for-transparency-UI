
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
        //mouse evet
        
        addMouseListener(new MouseAdapter(){
           
             
            @Override
            public void  mouseClicked(MouseEvent e){
                setBackground(active_bg);
                setForeground(active_fg);
                over = true;
            }                  
            @Override
            public void mouseEntered(MouseEvent e){
                if(!over) {
                    setBackground(hover_bg);
                    setForeground(hover_fg);
                }
            }
            @Override
            public void mouseExited(MouseEvent e){
                if(!over) {
                setBackground(bg);
                setForeground(fg);
                }
            }
        
        });
        
    }

    private boolean over;
    private Color bg;
    private Color fg;
    private Color hover_bg;
    private Color active_bg;
    private Color hover_fg;
    private Color active_fg;
    private Color border;
    

    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        
         g2.setColor(getBg());
        if(getBackground()==getActive_bg()){
            g2.setColor(Assest.skin.bc1);
        }
        
        g2.fillRoundRect(getWidth() / 2 - 25,27, 50, 3, 0, 0);
                
        super.paintComponent(grphcs);
    }
}

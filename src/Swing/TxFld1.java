/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;
import Assest.skin;
import javax.swing.JTextField;
import Swing.Btn1_;
import Swing.Btn2_;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import  Assest.Regex;

public class TxFld1 extends JTextField{

    /**
     * @return the oldVal
     */
    public String getOldVal() {
        return oldVal;
    }

    /**
     * @param oldVal the oldVal to set
     */
    public void setOldVal(String oldVal) {
        this.oldVal = oldVal;
    }

    public Boolean getRequired() {
        return Required;
    }
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public Color getLn() {
        return ln;
    }
    public void setLn(Color ln) {
        this.ln = ln;
    }
    public Color getBg() {
        return bg;
    }
    public void setBg(Color bg) {
        this.bg = bg;
    }
    public Color getHoverC() {
        return hoverC;
    }
    public void setHoverC(Color hoverC) {
        this.hoverC = hoverC;
    }
    public Color getActiveC() {
        return activeC;
    }
    public void setActiveC(Color activeC) {
        this.activeC = activeC;
    }
    public Color getErrorC() {
        return errorC;
    }
    public void setErrorC(Color errorC) {
        this.errorC = errorC;
    }
    public Boolean getVldInput() {
        return vldInput;
    }
    public void setVldInput(Boolean vldInput) {
        this.vldInput = vldInput;
    }
    public subBtn getSb1() {
        return sb1;
    }
    public void setSb1(subBtn sb1) {
        this.sb1 = sb1;
    }
    public subBtn getSb2() {
        return sb2;
    }
    public void setSb2(subBtn sb2) {
        this.sb2 = sb2;
    }
    
    public TxFld1(){
        setOpaque(false);
            setFont(skin.ttf((20),2));
            setPreferredSize(new Dimension(400, 35));
            setMargin(new Insets(0,15,0,5));
            
            setForeground(skin.wc2);
            setBorder(BorderFactory.createEmptyBorder(0,5,0,5));
            bg = skin.trc1;
            ln = skin.trc1;
            hoverC = skin.wc5;
            activeC = skin.wc4;
            errorC = skin.rc5;
            emptyC = skin.wc42;
            setBackground(bg);
            vldInput = false;
            
        addFocusListener(new FocusAdapter(){
            @Override
            public void focusGained(FocusEvent e){
                if(isFocusable()){
                    if(getText()!=""){setLn(activeC);}
                    else if(!getVldInput()){setLn(errorC);}
                    //setLn(activeC); 
                    repaint();
                }
            }
            
            @Override
            public void focusLost(FocusEvent e){
                if(getVldInput()){
                    if(getText()!=""){setLn(emptyC);}
                    else{setLn(bg);}
                    repaint();
                }               
            }        
        });
    
        addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                TxFld1 textFld = (TxFld1) e.getSource();
                String st = textFld.getText();
                if((getMaxLength()>0) && (st.length() > getMaxLength() - 1)){
                    e.consume();
                }
            }
        });
        
    }

    private Boolean vldInput;
    private Boolean Required = false;
    private subBtn  sb1;
    private subBtn  sb2;
    private Color hoverC;
    public Color activeC;
    public Color errorC;
    public Color emptyC;
    private Color ln;
    public Color bg;
    private int maxLength;
    private String oldVal = "";

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2= (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRect(0,0, getWidth(),getHeight()-10);
        g2.setColor(getLn());
       g2.fillRect(0, getHeight() - 2, getWidth(), 1);
        super.paintComponent(g);
    }
    
    

    
}

package Swing;

import Assest.skin;
import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;


import Elements.ScrollBarCustome;
import java.awt.Dimension;

public class Combobox<E> extends JComboBox<E> {

    public String getLabeText() {
        return labeText;
    }
    public void setLabeText(String labeText) {
        this.labeText = labeText;
    }
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
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
    
    private String labeText = "SELECT";
    private Color lineColor = skin.wc3;
    private boolean mouseOver;
    private Boolean vldInput = false;
    private subBtn  sb1;
    private subBtn  sb2;

    public Combobox() {
        setForeground(skin.wc2);
        setFont(skin.ttf(15,1));
        setMaximumRowCount(5);
        //UIManager.put("ComboBox.background", new ColorUIResource(skin.wc1));
        UIManager.put("ComboBox.selectionBackground", new ColorUIResource(skin.bc3));
        UIManager.put("ComboBox.selectionForeground", new ColorUIResource(skin.wc2));
        setBackground(skin.trc1);
        setPreferredSize(new Dimension(150,35));
        setBorder(new EmptyBorder(5, 3, 5, 3));
        setUI(new ComboUI(this));
        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean bln1) {
                Component com = super.getListCellRendererComponent(jlist, o, i, bln, bln1);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                com.setBackground(skin.blc3);
                com.setForeground(skin.wc3);
                if (bln) {
                    com.setBackground(skin.bc7);//mouseover Item Bg
                    com.setForeground(skin.wc1);
                }
                return com;
            }
        });
    }

    private class ComboUI extends BasicComboBoxUI {

        private boolean animateHinText = true;
        private float location;
        private boolean show;
        private Combobox combo;


}

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

        public ComboUI(Combobox combo) {
            this.combo = combo;
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                    mouseOver = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    mouseOver = false;
                    repaint();
                }
            });/*
            
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent fe) {
                    showing(false);
                }

                @Override
                public void focusLost(FocusEvent fe) {
                    showing(true);
                }
            });
            
            addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    
                        if (getSelectedIndex() == -1) {
                            showing(false);
                        } else {
                            showing(true);
                        }
                    
                }
            });
         */   
            addPopupMenuListener(new PopupMenuListener() {
                @Override
                public void popupMenuWillBecomeVisible(PopupMenuEvent pme) {
                    arrowButton.setBackground(skin.wc3); 
                    
                }
                @Override
                public void popupMenuWillBecomeInvisible(PopupMenuEvent pme) {
                    arrowButton.setBackground(skin.bc4);System.out.println(getSelectedIndex());
                    if(sb1!=null){sb1.isReady();}
                    if(sb2!=null){sb2.isReady();}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                }
                @Override
                public void popupMenuCanceled(PopupMenuEvent pme) {
                    arrowButton.setBackground(skin.bc3);
                    
                }
            });
        }

        @Override
        public void paintCurrentValueBackground(Graphics grphcs, Rectangle rctngl, boolean bln) {
            bln = false;

        }
        @Override
        protected JButton createArrowButton() {
            return new ArrowButton();
        }

        @Override
        protected ComboPopup createPopup() {
            BasicComboPopup pop = new BasicComboPopup(comboBox) {
                @Override
                protected JScrollPane createScroller() {
                    list.setFixedCellHeight(34);
                    JScrollPane scroll = new JScrollPane(list);
                    scroll.setBackground(skin.bc10);
                    ScrollBarCustome sb = new ScrollBarCustome();
                    sb.setUnitIncrement(34);
                    sb.setForeground(skin.bc4);
                    scroll.setVerticalScrollBar(sb);
                    return scroll;
                }
            };
            pop.setBorder(new LineBorder(skin.wc3, 1));// opend bg 
            return pop;
        }

        @Override
        public void paint(Graphics grphcs, JComponent jc) {
            super.paint(grphcs, jc);
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            int width = getWidth();
            int height = getHeight();
            if (mouseOver) {
                g2.setColor(lineColor);
            } else {
                g2.setColor(skin.wc4);//underline
            }
            g2.fillRect(2, height - 1, width - 4, 1);
            if(getSelectedIndex() == -1){createHintText(g2);}
            createLineStyle(g2);
            g2.dispose();
        }

        private void createHintText(Graphics2D g2) {
            Insets in = getInsets();
            g2.setColor(skin.wc3);
            FontMetrics ft = g2.getFontMetrics();
            Rectangle2D r2 = ft.getStringBounds(combo.getLabeText(), g2);
            double height = getHeight() - in.top - in.bottom;
            double textY = (height - r2.getHeight()) / 2;
            double size;
            if (animateHinText) {
                if (show) {
                    size = 18 * (1 - location);
                } else {
                    size = 18 * location;
                }
            } else {
                size = 18;
            }
            g2.drawString(combo.getLabeText(), in.right, (int) (in.top + textY + ft.getAscent() - size));
        }

        private void createLineStyle(Graphics2D g2) {
            if (isFocusOwner()) {
                double width = getWidth() - 4;
                int height = getHeight();
                g2.setColor(lineColor);
                double size;
                if (show) {
                    size = width * (1 - location);
                } else {
                    size = width * location;
                }
                double x = (width - size) / 2;
                g2.fillRect((int) (x + 2), height - 2, (int) size, 2);
            }
        }

        private void showing(boolean action) {
            if(action){
                labeText = "";
            }
        }

        private class ArrowButton extends JButton {

            public ArrowButton() {
                setContentAreaFilled(false);
                setBorder(new EmptyBorder(0, 5,0, 5));
                setBackground(skin.bc4);
            }

            @Override
            public void paint(Graphics grphcs) {
                super.paint(grphcs);
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int width = getWidth();
                int height = getHeight();
                int size = 10;
                int x = (width - size) / 2;
                int y = (height - size) / 2 + 1;
                int px[] = {x, x + size, x + size / 2};
                int py[] = {y, y, y + size};
                g2.setColor(getBackground());
                g2.fillPolygon(px, py, px.length);
                g2.dispose();
            }
        }
    }
}

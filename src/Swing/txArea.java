
package Swing;

import Assest.skin;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class txArea extends JTextArea{
    public txArea(){
     setLineWrap(true);
     setOpaque(true);
     setBackground(skin.blc13);
     setForeground(skin.wc3);
     setFont(skin.ttf(16, 1));
     setPreferredSize(new Dimension(520,200));
     setMargin(new Insets(0,5,0,5));
     //setBorder(new BorderFactory.);
    }   
}

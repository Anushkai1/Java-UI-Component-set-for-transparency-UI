
package Swing;

import Assest.skin;
import java.awt.Dimension;
import javax.swing.JLabel;

public class fmTitle extends JLabel{
    
    public fmTitle(){
        setOpaque(true);
        setFont(skin.ttf(20, 2));
        setForeground(skin.wc4);
        setBackground(skin.wc8);
        setPreferredSize(new Dimension(1160, 40));
    }

}

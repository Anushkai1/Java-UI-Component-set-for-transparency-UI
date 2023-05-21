
package Swing;

import Assest.skin;
import java.awt.Dimension;
import javax.swing.JLabel;

public class fmBg extends JLabel{
    
    public fmBg(){
        setOpaque(true);
        setBackground(skin.blc13);
        setPreferredSize(new Dimension(1160, 610));
        setText("");
    }

}

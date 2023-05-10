
package Elements;


import java.awt.Dimension;
import javax.swing.JScrollBar;
import Assest.skin;

public class ScrollBarCustome extends JScrollBar{
    
    
    public ScrollBarCustome(){
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(skin.bc4);
        setBackground(skin.wc9);
        
    }
    


    
}

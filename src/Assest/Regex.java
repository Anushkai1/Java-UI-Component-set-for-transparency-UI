
package Assest;

import java.awt.Color;
import java.awt.event.KeyEvent;
import Swing.TxFld1;
import Swing.subBtn;

public class Regex {
    public static void rxPhone(java.awt.event.KeyEvent evt) { 
        TxFld1 textFld = (TxFld1) evt.getSource();
        String st = textFld.getText();
        int intg = -2;
        try{
            intg = Integer.parseInt(st);
        }catch(Exception e){}
        if(intg!=-2 && 110000000<intg && intg < 800000000){
            textFld.setVldInput(true);
            textFld.setBackground(textFld.bg);
            textFld.setLn(textFld.activeC);
            textFld.repaint();       
        }else if((st=="") && (textFld.getRequired()==false)){
            textFld.setVldInput(true);
            textFld.setBackground(textFld.bg);
            textFld.setLn(textFld.activeC);
            textFld.repaint(); 
        }
        else{
           textFld.setVldInput(false);
           textFld.setBackground(textFld.errorC);
           textFld.setLn(skin.rc1);
           textFld.repaint();
        }
        
        subBtn y = textFld.getSb1();
        
        subBtn.isReady();
    }

    
    @SuppressWarnings("empty-statement")
    
    
    public static boolean isName(java.awt.event.KeyEvent evt) {
        
 

    }
    

    
}

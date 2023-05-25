package Swing;
import Swing.Btn2_;
import java.awt.Color;

public class subBtn extends Btn2_{

    public subBtn(){}
    public TxFld1[] getTxtList() {
        return txtList;
    }
    public void setTxtList(TxFld1[] txtList) {
        this.txtList = txtList;
    }
   
    public static void isReady(){
       int i, len ;
       len =  txtList.length;
       TxFld1  x;
       int validItemCount = 0;
        
      for(i=0; (i<len && 0 < len); i++){
            x = txtList[i];
            if(x.getVldInput()){validItemCount++;}
       }
        
       if(validItemCount==len){System.out.println("Swing.subBtn.isReady()");}
    }
    
  
    public static TxFld1[] txtList;
}

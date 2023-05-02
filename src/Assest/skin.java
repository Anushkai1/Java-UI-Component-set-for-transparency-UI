
package Assest;

import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;


public class skin {
    
    // font return
    public static Font ttf( float fsize, int sel){
        String path = "SairaSemiCondensed-Medium.ttf";
        if(sel == 2){
                    path = "SairaSemiCondensed-SemiBold.ttf";
        }
        
        try(InputStream is = skin.class.getResourceAsStream(path)){
            Font f = Font.createFont(Font.TRUETYPE_FONT, is);
            return f.deriveFont(fsize);
        }catch (Exception e){return null;}
        
    }
    


}

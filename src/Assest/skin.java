
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
    
    //Blue Color Range
    public static Color bc1 = new Color(0, 127, 240);
    public static Color bc2 = new Color(0, 112, 192);
    public static Color bc3 = new Color(0, 112, 192,10);
    
    public static Color bc4 = new Color(0, 124, 168);
    public static Color bc5 = new Color(0, 124, 168,200);
    public static Color bc6 = new Color(0, 124, 168,150);
    
    public static Color bc7 = new Color(0, 65, 88);
    
    public static Color bc8 = new Color(6, 14, 88,255);
    public static Color bc9 = new Color(6, 14, 88, 160);
    public static Color bc10 = new Color(6, 14, 88, 50);
    
    //Black Color Range
    public static Color blc1 = new Color(0,0,0);
    public static Color blc12 = new Color(0,0,0,200);
    public static Color blc13 = new Color(0,0,0,150);
    public static Color blc14 = new Color(0,0,0,100);

    public static Color blc2 = new Color(13,13,13);
    public static Color blc3 = new Color(25,25,25);
    public static Color blc4 = new Color(40,40,40);
    public static Color blc5 = new Color(64,64,64);
    public static Color blc6 = new Color(13,13,13, 30);
  
    

}

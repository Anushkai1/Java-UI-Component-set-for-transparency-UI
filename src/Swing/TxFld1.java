/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;
import Assest.skin;
import javax.swing.JTextField;
import Swing.Btn1_;
import Swing.Btn2_;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import  Assest.Regex;

public class TxFld1 extends JTextField{



    private Boolean vldInput;
    private Boolean Required = false;
    private subBtn  sb1;
    private subBtn  sb2;
    private Color hoverC;
    public Color activeC;
    public Color errorC;
    public Color emptyC;
    private Color ln;
    public Color bg;
    private int maxLength;
    private String oldVal = "";


    

    
}

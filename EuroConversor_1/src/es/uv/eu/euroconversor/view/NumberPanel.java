package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 /*
 * @author hesham
 */

public class NumberPanel extends JPanel{
    //Creating Buttons
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnC;
    
    public NumberPanel(){
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnDot = new JButton(".");
        btnC = new JButton("C");
        
        setLayout(new GridLayout(3,4));
        this.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        
        btn0.setActionCommand("0");
        btn1.setActionCommand("1");
        btn2.setActionCommand("2");
        btn3.setActionCommand("3");
        btn4.setActionCommand("4");
        btn5.setActionCommand("5");
        btn6.setActionCommand("6");
        btn7.setActionCommand("7");
        btn8.setActionCommand("8");
        btn9.setActionCommand("9");
        btnC.setActionCommand("C");
        btnDot.setActionCommand(".");
        
        this.add(btn0);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btnDot);
        this.add(btnC);
    }   
    /*
    public static void main(String[] args) {
        JFrame f = new JFrame("Buttons");
        f.add(new NumberPanel());
        f.setSize(400, 300);
        f.setVisible(true);
    }
    */
}
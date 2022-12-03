/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

/**
 *
 * @author hesham
 */
public class StatusPanel extends JPanel{
    private JLabel grosor, color1, color2, c1, c2;
    private JTextArea sizeValue;
    
    public void setColorStatus(Color color, int id){
        if(id ==1)
            c1.setBackground(color);
        else
            c2.setBackground(color);
    }
    
    public void setSize(int size){
        sizeValue.setText(Integer.toString(size));
    }
    
    public StatusPanel(){
         grosor = new JLabel("Grosor del rectangulo:");
         sizeValue = new JTextArea(1,3);
         color1 = new JLabel("Color 1:");
         color2 = new JLabel("Color 2:");
         c1 = new JLabel("      ");
         c2 = new JLabel("      ");
         
         c1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
         c2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
         sizeValue.setBorder(BorderFactory.createLineBorder(Color.black, 1));
         color1.setBorder(BorderFactory.createEmptyBorder(3,90,3,0));
         color2.setBorder(BorderFactory.createEmptyBorder(3,60,3,0));
         
         c1.setBackground(Color.red);
         c2.setBackground(Color.red);
         c1.setOpaque(true);
         c2.setOpaque(true);
         
         this.add(grosor);
         this.add(sizeValue);
         this.add(color1);
         this.add(c1);
         this.add(color2);
         this.add(c2);
         
         this.setBorder(BorderFactory.createLineBorder(Color.black,2));
    }
}

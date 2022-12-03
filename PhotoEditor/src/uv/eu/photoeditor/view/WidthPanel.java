/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author hesham
 */
public class WidthPanel extends JPanel{
    private JLabel label;
    private JSlider slider;
    
    public WidthPanel(){
        label = new JLabel("Grosor del rectangulo:");
        
        slider = new JSlider(1,1000,100);
        slider.setMajorTickSpacing(100);  
        slider.setPaintTicks(true);  
        slider.setPaintLabels(true);  
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        slider.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 0));
        
        add(label);
        add(slider);
        
        this.setBorder(BorderFactory.createLineBorder(Color.black,2));
    }
}

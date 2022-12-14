/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author hesham
 */
public class SelectPanel extends JPanel{
    private ColorPanel panel1;
    private ColorPanel panel2;
    
    public SelectPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        panel1 = new ColorPanel(1);
        panel2 = new ColorPanel(2);
        
        add(panel1);
        add(panel2);
        
        this.setBorder(BorderFactory.createLineBorder(Color.black,2));
    }
    
    public void setActionListener(ActionListener listener){
        
    }
}

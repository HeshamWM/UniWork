/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author hesham
 */
public class SelectPanel extends JPanel{
    public SelectPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        add(new ColorPanel(1));
        add(new ColorPanel(2));
        this.setBorder(BorderFactory.createLineBorder(Color.black,2));
    }
}

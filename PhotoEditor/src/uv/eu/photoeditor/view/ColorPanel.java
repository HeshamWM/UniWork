/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hesham
 */
public class ColorPanel extends JPanel{
    private ArrayList<JButton> buttons;
    private static ArrayList<Color> colors;
    private ArrayList<String> colorsName;
    
    private int id;
    
    public JButton getButton(int index){return buttons.get(index);}
    
    public int getID(){return id;}
    
    public ColorPanel(int id){
        this.id = id;
        buttons = new ArrayList<>();
        colors = new ArrayList<>();
        colorsName = new ArrayList<>();
        
        Collections.addAll(colors, Color.BLACK,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY, Color.MAGENTA,
        Color.ORANGE,Color.PINK, Color.YELLOW, Color.WHITE, Color.RED, Color.BLUE, Color.GREEN);
        Collections.addAll(colorsName, "Negro","Cyan","Gris oscuro","Gris","Gris claro","Magenta",
        "Naranja","Rosa","Amarilo","Blanco","Rojo","Azul","Verde");
        
        setLayout(new GridLayout(7,2));
        
        add(new JLabel("Color "+ Integer.toString(id) + ":"));
        for(int i =0; i<13 ; i++){
            JButton button = new JButton(colorsName.get(i));
            
            button.setBackground(colors.get(i));
            button.setOpaque(true);
            //button.setBorderPainted(false);
            button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            
            add(button);
            buttons.add(button);
        }
        this.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    }
}

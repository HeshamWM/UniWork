package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 /*
 * @author hesham
 */

public class NumberPanel extends JPanel{
    //Creating Buttons
    private ArrayList<JButton> buttons;
    //JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    JButton btnDot,btnC;
    
    public JButton getButton(int index){return buttons.get(index);}
    
    public NumberPanel(){
        buttons = new ArrayList<JButton>();
        for(int i =0; i<10;i++){
            String number = Integer.toString(i);
            JButton button = new JButton(number);
            button.setActionCommand(number);
            add(button);
            buttons.add(button);
        }
        btnDot = new JButton(".");
        btnC = new JButton("C");
        
        setLayout(new GridLayout(3,4));
        this.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

        btnC.setActionCommand("C");
        btnDot.setActionCommand(".");
        add(btnDot);
        add(btnC);
    }   
}
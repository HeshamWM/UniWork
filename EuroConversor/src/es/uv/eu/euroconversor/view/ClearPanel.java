

package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

 /*
 * @author hesham
 */

public class ClearPanel extends JPanel{
    JButton clear;
    
    public ClearPanel(){
        setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        
        clear = new JButton("CLEAR");
        clear.setForeground(Color.BLUE);
        clear.setFont(new Font(Font.SANS_SERIF, Font.BOLD,  20));
        
        clear.setActionCommand("clear");
        add(clear);
    }
    
    public void setActionListener(ActionListener actionListener){
        clear.addActionListener(actionListener);
    }
}


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
        clear = new JButton("CLEAR");
        clear.setForeground(Color.BLUE);
        add(clear);
    }
}
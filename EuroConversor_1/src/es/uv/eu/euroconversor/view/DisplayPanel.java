package es.uv.eu.euroconversor.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author hesham
 */

public class DisplayPanel extends JPanel{
    public JLabel tasaCambio,number;
    
    public DisplayPanel(){
        setLayout(new BorderLayout());
        tasaCambio = new JLabel("Exchange rate: 1");
        number = new JLabel("0");
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 10, false));
        number.setFont(new Font(Font.SANS_SERIF, Font.BOLD,  70));
        tasaCambio.setFont(new Font(Font.SANS_SERIF, Font.BOLD,  15));
        this.setBackground(Color.getHSBColor(130, 100, 51));
        
        add(tasaCambio, BorderLayout.SOUTH);
        add(number,BorderLayout.EAST);
    }
    /*
    public static void main(String[] args) {
        JFrame f = new JFrame("Operational Panel");
        f.add(new DisplayPanel());
        f.setSize(600, 300);
        f.setVisible(true);
    }
    */
}
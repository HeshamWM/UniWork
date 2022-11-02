package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

 /*
 * @author hesham
 */

public class OperationPanel extends JPanel{
    JRadioButton dolarToEuro, euroToDolar;
    ButtonGroup radio;
    JButton convert;
    
    public OperationPanel(){
        dolarToEuro = new JRadioButton("Dolar-Euro");
        euroToDolar = new JRadioButton("Euro-Dolar");
        radio = new ButtonGroup();
        radio.add(dolarToEuro);
        radio.add(euroToDolar);
        convert = new JButton("Convert");
        
        convert.setForeground(Color.BLUE);
        convert.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,  18));
        convert.setMargin(new Insets(3,5,3,5));

        this.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 15));
        setLayout(new BoxLayout(this ,BoxLayout.Y_AXIS));
        
        dolarToEuro.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,  17));
        euroToDolar.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,  17));
        
        dolarToEuro.setAlignmentX(CENTER_ALIGNMENT);
        euroToDolar.setAlignmentX(CENTER_ALIGNMENT);
        convert.setAlignmentX(CENTER_ALIGNMENT);
        
        add(dolarToEuro);
        add(euroToDolar);
        add(convert);
    }
    /*
    public static void main(String[] args) {
        JFrame f = new JFrame("Operational Panel");
        f.add(new OperationPanel());
        f.setSize(200, 300);
        f.setVisible(true);
    }
    */
}
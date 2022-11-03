package es.uv.eu.euroconversor.view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hesham
 */

public class EuroConversorView extends JFrame{
    private EuroConversorMenu menu;
    private DisplayPanel display;
    private NumberPanel numberPane;
    private OperationPanel operationPane;
    private ClearPanel clear;
    
    public EuroConversorView(){
        this.setLayout(new BorderLayout());
        
        menu = new EuroConversorMenu();
        this.setJMenuBar(menu);
        
        display = new DisplayPanel();
        numberPane = new NumberPanel();
        operationPane = new OperationPanel();
        clear = new ClearPanel();
        
        numberPane.setPreferredSize(new Dimension(250,200));
        
        this.add(display, BorderLayout.NORTH);
        this.add(numberPane, BorderLayout.WEST);
        this.add(operationPane, BorderLayout.EAST);
        this.add(clear, BorderLayout.SOUTH);
    }
    
    public void setActionListener(ActionListener actionListener){
        clear.clear.addActionListener(actionListener);
        
        numberPane.btn0.addActionListener(actionListener);
        numberPane.btn1.addActionListener(actionListener);
        numberPane.btn2.addActionListener(actionListener);
        numberPane.btn3.addActionListener(actionListener);
        numberPane.btn4.addActionListener(actionListener);
        numberPane.btn5.addActionListener(actionListener);
        numberPane.btn6.addActionListener(actionListener);
        numberPane.btn7.addActionListener(actionListener);
        numberPane.btn8.addActionListener(actionListener);
        numberPane.btn9.addActionListener(actionListener);
        numberPane.btnC.addActionListener(actionListener);
        numberPane.btnDot.addActionListener(actionListener);
        
        operationPane.convert.addActionListener(actionListener);
        
        menu.changeRate.addActionListener(actionListener);
        menu.salir.addActionListener(actionListener);
    }
    
    public static void main(String[] args) {
        EuroConversorView f = new EuroConversorView();
        f.setSize(400, 400);
        f.setVisible(true);
    }   
}
    


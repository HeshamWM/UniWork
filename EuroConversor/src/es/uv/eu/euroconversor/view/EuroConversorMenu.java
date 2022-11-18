/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.euroconversor.view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

 /*
 * @author hesham
 */

public class EuroConversorMenu extends JMenuBar {

    JMenu Calculadora;
    JMenuItem changeRate, salir;
    
    public EuroConversorMenu() {
        Calculadora = new JMenu("Calculadora");
        changeRate = new JMenuItem("Change Rate");
        salir = new JMenuItem("Salir");
        
        changeRate.setActionCommand("change rate");
        salir.setActionCommand("salir");
        
        Calculadora.add(changeRate);
        Calculadora.add(salir);
        this.add(Calculadora);
    }

    public void setActionListener(ActionListener actionListener){
        changeRate.addActionListener(actionListener);
        salir.addActionListener(actionListener);
    }
}
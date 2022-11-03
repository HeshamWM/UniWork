package es.uv.eu.euroconversor.controller;


import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author EU (2016)
 */
public class EuroConversorController {
    private EuroConversorModel model;
    private EuroConversorView view;
    
    public EuroConversorController(EuroConversorModel model, EuroConversorView view){
        this.model = model;
        this.view = view;
        
        view.addWindowListener(new EuroConversorControllerWindowListener());
        view.setActionListener(new EuroConversorControllerActionListener());
    }
    
    // Clases empotradas
    class EuroConversorControllerWindowListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println(" PeliculaController : Cerrar ventana.");
            System.exit(0);
        }
    }
    
    class EuroConversorControllerActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            switch (command) {
                case "salir":
                    System.out.println("EuroConversorController : Boton ’salir ’. ");
                    System.exit(0);
                    break;
                case "0":
                    System.out.println("Number 0 pressed");                   
                    break;
                case "1":
                    System.out.println("Number 1 pressed");                   
                    break;
                case "2":
                    System.out.println("Number 2 pressed");                   
                    break;
                case "3":
                    System.out.println("Number 3 pressed");                   
                    break;
                case "4":
                    System.out.println("Number 4 pressed");                   
                    break;
                case "5":
                    System.out.println("Number 5 pressed");                   
                    break;
                case "6":
                    System.out.println("Number 6 pressed");                   
                    break;
                case "7":
                    System.out.println("Number 7 pressed");                   
                    break;
                case "8":
                    System.out.println("Number 8 pressed");                   
                    break;
                case "9":
                    System.out.println("Number 9 pressed");                   
                    break;
                case "C":
                    System.out.println("C pressed");                   
                    break;
                case ".":
                    System.out.println("dot pressed");                   
                    break;
                case "change rate":
                    System.out.println("change rate pressed");                   
                    break;
                case "clear":
                    System.out.println("clear pressed");                   
                    break;
                case "convert":
                    System.out.println("convert pressed");                   
                    break;
                default:
                    System.out.println(" EuroConversorController : Comando ’" + command + "’ no reconocido.");
                    break;
            }
        }
    }
}
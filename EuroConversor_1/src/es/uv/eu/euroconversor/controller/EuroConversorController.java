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
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "C":
                case ".":
                    view.getDisplay().number.setText(model.addDigit(command));
                    break;
                case "change rate": 
                    String newRate = JOptionPane.showInputDialog(null,"Enter new exchange rate: ");
                    model.setExchangeRate(Float.parseFloat(newRate));
                    view.getDisplay().tasaCambio.setText("Exchange rate: " + model.getExchangeRate());
                    break;
                case "clear":
                    view.getDisplay().number.setText(model.reset());              
                    break;
                case "convert":
                    switch (view.getOperation().getConvertOption()) {
                        case 1:
                            String message = "The value of " + view.getDisplay().number.getText() + "$ is equal to " + model.convertmult() + "€";
                            JOptionPane.showMessageDialog(null,message,"Conversion Result",1);
                            break;
                        case 2:
                            message = "The value of " + view.getDisplay().number.getText() + "€ is equal to " + model.convertdiv()+ "$";
                            JOptionPane.showMessageDialog(null,message,"Conversion Result",1);
                            break;
                        default:
                            break;
                    }                 
                    break;
                default:
                    System.out.println(" EuroConversorController : Comando ’" + command + "’ no reconocido.");
                    break;
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.euroconversor;

import es.uv.eu.euroconversor.controller.EuroConversorController;
import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;

/**
 *
 * @author 
 */
public class EuroConversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EuroConversorModel model = new EuroConversorModel();
        EuroConversorView view = new EuroConversorView();
        EuroConversorController controller = new EuroConversorController(model, view);
        
        view.getDisplay().tasaCambio.setText("Exchange rate :" + model.getExchangeRate());
        
        view.setSize(400, 400);
        view.setVisible(true);
    }
    
}

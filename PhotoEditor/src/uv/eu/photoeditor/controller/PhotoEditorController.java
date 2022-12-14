/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import uv.eu.photoeditor.model.PhotoEditorModel;
import uv.eu.photoeditor.view.PhotoEditorView;

/**
 *
 * @author hesham
 */
public class PhotoEditorController {
    private PhotoEditorModel model;
    private PhotoEditorView view;
    
    public PhotoEditorController (PhotoEditorModel model, PhotoEditorView view){
        this.model = model;
        this.view = view;
        
        view.addWindowListener(new PhotoEditorControllerWindowListener());
        view.setActionListener(new PhotoEditorControllerActionListener());
    }
    
    class PhotoEditorControllerWindowListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println(" PeliculaController : Cerrar ventana.");
            System.exit(0);
        }
    }
    
    class PhotoEditorControllerActionListener implements ActionListener {

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
                    break;
                case "change rate": 
                    break;
                case "clear":
                               
                    break;
                case "convert":
             
                    break;
                default:
                    System.out.println(" EuroConversorController : Comando ’" + command + "’ no reconocido.");
                    break;
            }
        }
    }
}

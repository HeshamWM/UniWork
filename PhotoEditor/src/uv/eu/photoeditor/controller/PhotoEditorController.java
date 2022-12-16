/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.controller;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import uv.eu.photoeditor.model.PhotoEditorModel;
import uv.eu.photoeditor.view.LoadImage;
import uv.eu.photoeditor.view.PhotoEditorView;

/**
 *
 * @author hesham
 */
public class PhotoEditorController {
    private PhotoEditorModel model;
    private PhotoEditorView view;
    private LoadImage loadImage;
    private Color selectedColor1;
    private Color selectedColor2;
    int ID;
    
    public Color getSelectedColor(int ID){
        if (ID == 1){
            return selectedColor1;
        }else{
            return selectedColor2;
        }
    }
    
    
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
            Character firstChar = command.charAt(0);
            if (firstChar.equals('1') || firstChar.equals('2')){
                ID = Integer.parseInt(Character.toString(command.charAt(0)));
                command = command.substring(1);
                if (ID == 1){
                    selectedColor1 = view.select.panel1.getColor(command);
                    view.status.setColorStatus(selectedColor1, ID);
                } 
                else if (ID == 2){
                    selectedColor2 = view.select.panel2.getColor(command);
                    view.status.setColorStatus(selectedColor2, ID);
                }
            }
            else
            {
                switch (command) {
                    case "Salir":
                        System.out.println("Boton ’salir ’. ");
                        System.exit(0);
                        break;
                    case "Cargar Imagen":
                        loadImage = new LoadImage();
                        model.loadImagen(loadImage.getFile());
                        view.repaintImage();
                        break;
                    case "change rate": 
                        break;
                    case "clear":
                        break;
                    case "convert":
                        break;
                    default:
                        System.out.println("Comando ’" + command + "’ no reconocido.");
                        break;
                }
            }
        }
    }
    public class PhotoEditorMouseListener implements MouseListener{
        private ArrayList<Integer> x = new ArrayList<>();;
        private ArrayList<Integer> y = new ArrayList<>();;

        @Override
        public void mouseClicked(MouseEvent e) {
            Graphics g = view.image.getGraphics();
            Graphics2D g2d = (Graphics2D)g;

            if (SwingUtilities.isRightMouseButton(e)){
                int nPoints = x.size();
                int[] xArray = new int[x.size()];
                int[] yArray = new int[y.size()];

                for (int i=0;i<x.size();i++){
                    xArray[i] = x.get(i);
                    yArray[i] = y.get(i);
                }
                /*
                Color color1 = Color.RED;
                Color color2 = Color.GREEN;
                GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
                g2d.setPaint(gp);
                */
                g2d.setStroke(new BasicStroke(20.0f));
                g.drawPolygon(xArray, yArray, nPoints);
                x.clear();
                y.clear();
            }
            else
            {
                x.add(e.getX());
                y.add(e.getY());
                g.fillOval(e.getX()-10, e.getY()-10, 20, 20);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
}

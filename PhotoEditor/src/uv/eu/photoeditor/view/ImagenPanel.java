/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import uv.eu.photoeditor.model.PhotoEditorModel;

/**
 *
 * @author hesham
 */
public class ImagenPanel extends JPanel{
    
    private BufferedImage image;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 2, 2, this);
    }
    
    public ImagenPanel(PhotoEditorModel model){
        image = model.getImagen();
        this.setBorder(BorderFactory.createLineBorder(Color.black,2));
    }
}

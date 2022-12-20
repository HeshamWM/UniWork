/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hesham
 */
public class TestPanel extends JPanel{
    private BufferedImage image;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(image, 0, 0,500,500, this);
    }
    
    public TestPanel(){
        try {                
          image = ImageIO.read(new File("/Users/hesham/Dropbox/UNI/L3/EtornosU/UniWork/PhotoEditor/src/uv/eu/photoeditor/view/perro.jpg"));
       } catch (IOException ex) {
            // handle exception...
            System.out.println("What the fucking is happening");
       }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Fucking frame");
        f.add(new TestPanel());
        f.setSize(600,600);
        f.setVisible(true);
    }
}

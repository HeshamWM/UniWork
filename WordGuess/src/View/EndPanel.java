package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class EndPanel extends JPanel {
    public JTextField playerNameInput;
    public JButton register;
    private String imageFileName;
    private BufferedImage image;
    public JButton start;

    public EndPanel(boolean gameWon){
        if(gameWon){
            try {
                imageFileName = "/Users/hesham/Library/CloudStorage/Dropbox/UNI/L3/EtornosU/UniWork/WordGuess/src/Images/DiCaprio.jpeg";
                image = ImageIO.read(new File(imageFileName));
            }
            catch (IOException e) {
                System.out.println("Problemas leyendo la imagen '" + this.imageFileName + "'.");
                System.out.println("Motivo: " + e.getLocalizedMessage());
            }
            setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
            JLabel label1 = new JLabel("Join the ranking table: ");
            JLabel label2 = new JLabel("Please enter your username: ");
            playerNameInput = new JTextField(6);
            register = new JButton("Register");
            add(label1);
            add(label2);
            add(playerNameInput);
            add(register);
        }
        else{
            try {
                imageFileName = "/Users/hesham/Library/CloudStorage/Dropbox/UNI/L3/EtornosU/UniWork/WordGuess/src/Images/losertrump.jpeg";
                image = ImageIO.read(new File(imageFileName));
            }
            catch (IOException e) {
                System.out.println("Problemas leyendo la imagen '" + this.imageFileName + "'.");
                System.out.println("Motivo: " + e.getLocalizedMessage());
            }
        }
        start = new JButton("Start New Game!");
        start.setPreferredSize(new Dimension(600,50));
        start.setActionCommand("start");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image,100,100,this);
    }
}

package View;

import Model.WordModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WordGuessView extends JFrame {
    WordModel model;
    public StartPanel startPanel;
    public GamePanel gamePanel;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public WordGuessView(WordModel model){
        this.model = model;
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPanel = new StartPanel(model);
        add(startPanel);
        setVisible(true);
        setTitle("Player 1");
    }

    public void gameOn(){
        startPanel.removeAll();
        this.repaint();
        gamePanel = new GamePanel(model);
        add(gamePanel);
        setTitle("Player 2");
    }

    public void setActionListener(ActionListener actionListener) {
        startPanel.start.addActionListener(actionListener);
    }
}

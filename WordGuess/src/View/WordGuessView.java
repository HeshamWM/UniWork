package View;

import Model.WordModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WordGuessView extends JFrame {
    WordModel model;
    public StartPanel startPanel;
    public GamePanel gamePanel;
    WordGuessMenu menu;
    private ActionListener actionListener;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public WordGuessView(WordModel model){
        this.model = model;

        menu = new WordGuessMenu();
        setJMenuBar(menu);
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startGame();
    }

    public void startGame(){
        model.emptyAll();
        startPanel = new StartPanel(model, actionListener);
        setContentPane(startPanel);
        setVisible(true);
        setTitle("Player 1");
        revalidate();
        repaint();
        startPanel.start.addActionListener(actionListener);
    }

    public void gameOn(){
        startPanel.removeAll();
        gamePanel = new GamePanel(model);
        setContentPane(gamePanel);
        setTitle("Player 2");
        revalidate();
        repaint();
        gamePanel.check.addActionListener(actionListener);
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
        startPanel.start.addActionListener(actionListener);
        menu.newGame.addActionListener(actionListener);
        menu.ranking.addActionListener(actionListener);
        menu.about.addActionListener(actionListener);
        menu.exit.addActionListener(actionListener);
    }
}

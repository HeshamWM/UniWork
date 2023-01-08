package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class WordGuessMenu extends JMenuBar {
    private JMenu wordGuess;
    public JMenuItem newGame, ranking, about, exit;

    public WordGuessMenu() {
        wordGuess = new JMenu("WordGuess");
        newGame = new JMenuItem("New Game");
        ranking = new JMenuItem("Players Ranking");
        about = new JMenuItem("About");
        exit = new JMenuItem("Exit");

        newGame.setActionCommand("new");
        ranking.setActionCommand("ranking");
        exit.setActionCommand("exit");

        wordGuess.add(newGame);
        wordGuess.add(ranking);
        wordGuess.add(about);
        wordGuess.add(exit);
        this.add(wordGuess);
    }

    public void setActionListener(ActionListener actionListener){
        newGame.addActionListener(actionListener);
        ranking.addActionListener(actionListener);
        about.addActionListener(actionListener);
        exit.addActionListener(actionListener);
    }
}

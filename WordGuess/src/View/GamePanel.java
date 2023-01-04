package View;

import Model.WordModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Delayed;

public class GamePanel extends JPanel {
    WordModel model;
    ArrayList<Square> squares;
    public JButton check;
    JPanel main;
    private boolean gameWon = false;

    public GamePanel(WordModel model){
        this.model = model;
        setBorder(BorderFactory.createEmptyBorder(80,0,0,0));
        squares = new ArrayList<>();

        main = new JPanel();
        main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
        newLine();
        add(main);

        check = new JButton("check");
        check.setPreferredSize(new Dimension(80,40));
        add(check);
    }

    public void newLine(){
        model.setNOfAttempts(model.getNOfAttempts() - 1);
        squares.clear();
        System.out.println("newLine(): new line created");
        JPanel linePanel = new JPanel();
        for (int i = 0; i < model.getWordLength(); i++) {
            Square square = new Square();
            linePanel.add(square);
            squares.add(square);
        }
        main.add(linePanel);
        revalidate();
        repaint();
    }

    public void checkAnswer(){
        int nOfCorrectLetters = 0;
        for (int i = 0; i < model.getWordLength(); i++) {
            char letterLower = squares.get(i).getText().toLowerCase().charAt(0);
            char letterUpper = squares.get(i).getText().toUpperCase().charAt(0);
            squares.get(i).setEnabled(false);
            if(model.doesExist(letterLower) | model.doesExist(letterUpper)){
                if (model.correctPosition(letterLower, i) | model.correctPosition(letterUpper, i)){
                    squares.get(i).setCorrect();
                    nOfCorrectLetters += 1;
                }else{
                    squares.get(i).setWrongPlace();
                }
            }
            else{
                squares.get(i).setWrong();
            }
        }
        if (nOfCorrectLetters == model.getWordLength()){
            GameWon();
        }
    }

    public boolean guessDone(){
        int fullFields = 0;
        for (int i = 0; i < model.getWordLength(); i++) {
            if(!squares.get(i).getText().equals("")){
                fullFields += 1;
            }
        }
        return fullFields == model.getWordLength();
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public void GameWon(){
        this.gameWon = true;
        removeAll();
        JLabel congrats = new JLabel("Congratulations!!! You Have Won");
        add(congrats);
        revalidate();
        repaint();
    }

    public void setActionListener(ActionListener actionListener) {
        check.addActionListener(actionListener);
    }
}

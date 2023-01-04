package Controller;

import Model.WordModel;
import View.StartPanel;
import View.WordGuessView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordGuessController {
    private WordModel model;
    private WordGuessView view;
    private WordGuessActionListener listener = new WordGuessActionListener();

    public WordGuessController(WordModel model, WordGuessView view){
        this.model = model;
        this.view = view;

        view.setActionListener(listener);
    }

    public class WordGuessActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command){
                case "start":
                    System.out.println("Command start");
                    int length = Integer.parseInt(String.valueOf(view.startPanel.wordLength.getSelectedItem()));
                    int attempts = Integer.parseInt(String.valueOf(view.startPanel.nOfAttemptsInput.getSelectedItem()));
                    String word = view.startPanel.wordInput.getText();
                    if (word.length() == length){
                        model.setWord(word);
                        model.setNOfAttempts(attempts);
                        view.gameOn();
                    }else{
                        String message = word + " has " + word.length() + " characters, expected only "+  length;
                        JOptionPane.showMessageDialog(null,message,"Invalid word",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case "check":
                    if(view.gamePanel.guessDone()){
                        view.gamePanel.checkAnswer();
                        if(!model.attemptsDone()){
                            view.gamePanel.newLine();
                        }else{
                            System.out.println("Out of attempts!!");
                        }
                    }else{
                        System.out.println("All fields are filled: "+view.gamePanel.guessDone());
                    }
                    break;
                case "new":
                    view.startPanel.emptyPanel();
                    if(view.startPanel != null){
                        view.startPanel.removeAll();
                    } else if (view.gamePanel != null) {
                        view.gamePanel.removeAll();
                    }
                    view.startGame();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command: "+command);
                    break;
            }
        }
    }
}

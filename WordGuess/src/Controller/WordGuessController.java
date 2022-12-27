package Controller;

import Model.WordModel;
import View.WordGuessView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordGuessController {
    private WordModel model;
    private WordGuessView view;

    public WordGuessController(WordModel model, WordGuessView view){
        this.model = model;
        this.view = view;

        view.setActionListener(new WordGuessActionListener());
    }

    public class WordGuessActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command){
                case "start":
                    int length = Integer.parseInt(String.valueOf(view.startPanel.wordLength.getSelectedItem()));
                    String word = view.startPanel.wordInput.getText();
                    if (word.length() == length){
                        model.setWordLength(length);
                        model.setWord(word);
                        view.gameOn();
                    }else{
                        String message = word + " has " + word.length() + " characters, expected only "+  length;
                        JOptionPane.showMessageDialog(null,message,"Invalid word",JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Unknown command: "+command);
            }
        }
    }
}

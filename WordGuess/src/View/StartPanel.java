package View;

import Model.WordModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Vector;

public class StartPanel extends JPanel {
    JButton start;
    public JComboBox<String> wordLength;
    public JTextField wordInput;
    private final String[] numbers = {"3","4","5"};

    public StartPanel(WordModel model){
        JLabel gameNameLabel = new JLabel("WordGuess");
        JLabel wordLabel = new JLabel("Please enter word here: ");
        JLabel wordLengthLabel = new JLabel("Please choose word length: ");
        wordInput = new JTextField(6);

        wordLength = new JComboBox<String>(numbers);
        start = new JButton("Start Game!");
        start.setActionCommand("start");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        Border space = BorderFactory.createEmptyBorder(30, 30, 30, 30);
        gameNameLabel.setBorder(space);
        panel1.setBorder(space);
        panel2.setBorder(space);

        panel1.add(wordLabel); panel1.add(wordInput);
        panel2.add(wordLengthLabel); panel2.add(wordLength);
        add(gameNameLabel);
        add(panel1);
        add(panel2);
        add(start);
    }
}

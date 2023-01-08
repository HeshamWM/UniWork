package View;

import Model.WordModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Vector;

public class StartPanel extends JPanel {
    JButton start;
    public JComboBox<String> wordLength, nOfAttemptsInput;
    public JTextField wordInput;
    Font titleFont = new Font(this.getFont().getName(),Font.BOLD,50);

    public void emptyPanel(){
        wordLength = null;
        nOfAttemptsInput = null;
        wordInput = null;
        System.gc();
    }

    public StartPanel(WordModel model, ActionListener actionListener){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(80,300,30,300));

        JLabel gameNameLabel = new JLabel("WordGuess");
        gameNameLabel.setFont(titleFont);
        JLabel wordLabel = new JLabel("Please enter word here: ");
        JLabel wordLengthLabel = new JLabel("Please choose word length: ");
        JLabel attemptsLabel = new JLabel("Please enter number of attempts: ");
        wordInput = new JTextField(6);

        final String[] numbers1 = {"3","4","5","6","7"};
        final String[] numbers2 = {"4","5","6","7","8"};
        wordLength = new JComboBox<String>(numbers1);
        nOfAttemptsInput = new JComboBox<String>(numbers2);
        nOfAttemptsInput.setSelectedIndex(4);

        start = new JButton("Start Game!");
        start.setPreferredSize(new Dimension(600,50));
        start.setActionCommand("start");
        start.addActionListener(actionListener);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        Border space = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        gameNameLabel.setBorder(space);
        panel1.setBorder(space);
        panel2.setBorder(space);
        panel3.setBorder(space);

        panel1.add(wordLabel); panel1.add(wordInput);
        panel2.add(wordLengthLabel); panel2.add(wordLength);
        panel3.add(attemptsLabel); panel3.add(nOfAttemptsInput);

        add(gameNameLabel);
        add(panel1);
        add(panel2);
        add(panel3);
        add(start);
    }
}

package View;

import Model.WordModel;

import javax.swing.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {
    ArrayList<Square> squares;

    public GamePanel(WordModel model){
        //setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        squares = new ArrayList<>();
        for (int i = 0; i < model.getWordLength(); i++) {
            Square square = new Square();
            add(square);
            squares.add(square);
        }
        System.out.println("Game is On with the word: " + model.getWord());
    }
}

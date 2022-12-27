package View;

import javax.swing.*;
import java.awt.*;

public class Square extends JTextField {

    private boolean isCorrect;
    private boolean isWrongPlace;
    private boolean isWong;

    public void emptyBooleans(){
        isCorrect = false;
        isWrongPlace = false;
        isWong = false;
    }
    public void setCorrect(){
        emptyBooleans();
        isCorrect = true;
    }
    public void setWrongPlace(){
        emptyBooleans();
        isWrongPlace = true;
    }
    public void setWong(){
        emptyBooleans();
        isWong = true;
    }

    public Square(){
        Font mainFont = new Font(this.getFont().getName(),Font.BOLD,50);
        setPreferredSize(new Dimension(70,70));
        setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        setFont(mainFont);
        setHorizontalAlignment(JTextField.CENTER);
    }
}

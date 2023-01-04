package View;

import javax.swing.*;
import java.awt.*;

public class Square extends JTextField {
    private boolean isCorrect;
    private boolean isWrongPlace;
    private boolean isWrong;

    public void emptyBooleans(){
        isCorrect = false;
        isWrongPlace = false;
        isWrong = false;
    }
    public void setCorrect(){
        emptyBooleans();
        isCorrect = true;
        this.setBackground(Color.green);
    }
    public void setWrongPlace(){
        emptyBooleans();
        isWrongPlace = true;
        this.setBackground(Color.yellow);
    }
    public void setWrong(){
        emptyBooleans();
        isWrong = true;
        this.setBackground(Color.red);
    }

    public Square(){
        Font mainFont = new Font(this.getFont().getName(),Font.BOLD,50);
        setPreferredSize(new Dimension(70,70));
        setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        setBorder(BorderFactory.createLineBorder(Color.BLACK,4,true));
        setFont(mainFont);
        setHorizontalAlignment(JTextField.CENTER);
    }
}

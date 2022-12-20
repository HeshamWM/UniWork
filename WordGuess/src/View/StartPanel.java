package View;

import Model.WordModel;

import javax.swing.*;
import java.awt.*;

public class StartPanel extends JFrame {

    public class mainPanel extends JPanel{
        private final JLabel gameNameLabel = new JLabel("");
        private final JLabel wordLabel = new JLabel("");
        private final JLabel wordLengthLabel = new JLabel("");
        private JTextField wordInput;
        private JComboBox<Integer> wordLength;

        public mainPanel(){
            this.setLayout(new BorderLayout());
            this.add(gameNameLabel);
        }
    }

    public StartPanel(WordModel model){

    }

}

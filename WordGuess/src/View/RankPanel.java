package View;

import Model.WordModel;

import javax.swing.*;
import java.util.ArrayList;

public class RankPanel extends JPanel {
    private WordModel model;

    public RankPanel(WordModel model){
        this.model = model;

        String[] columnNames = { "Ranking", "Name" };
        JTable table = new JTable();
    }

}

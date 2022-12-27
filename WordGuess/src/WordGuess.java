import Controller.WordGuessController;
import Model.WordModel;
import View.WordGuessView;

public class WordGuess {
    public static void main(String[] args) {
        WordModel model = new WordModel();
        WordGuessView view = new WordGuessView(model);
        WordGuessController controller = new WordGuessController(model, view);
    }
}

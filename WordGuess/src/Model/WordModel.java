package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WordModel {
    private String word;
    private int wordLength;
    private int nOfAttempts;
    private ArrayList<String> topPlayersName;
    private ArrayList<Integer> topPlayersNAttempts;

    public WordModel(){
        topPlayersName = new ArrayList<>(); // Arrays.asList("a","b","c","d","e")
        topPlayersNAttempts = new ArrayList<>(); // Arrays.asList(1,2,3,4,5)
    }

    //Setters and getters methods
    public void setWord(String word){ this.word = word; }
    public String getWord(){ return word; }

    public void setWordLength(int wordLength) { this.wordLength = wordLength; }
    public int getWordLength() { return wordLength; }

    public void setNOfAttempts(int nOfAttempts) { this.nOfAttempts = nOfAttempts;}
    public int getNOfAttempts() {return nOfAttempts;}

    public int checkRanking(int nOfAttempts){
        int index = 10;
        for (int i=0; i <= topPlayersName.size(); i++){
            if (nOfAttempts < topPlayersNAttempts.get(i)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void addPlayer(String playerName, int nOfAttempts){
        topPlayersName.add(playerName);
        topPlayersNAttempts.add(nOfAttempts);
    }

    public static void main(String[] args) {
        WordModel model = new WordModel();
        System.out.println("Current ranking: " + model.topPlayersName);
        model.addPlayer("Hesham", 2);
        System.out.println("New ranking: " + model.topPlayersName);
    }

}

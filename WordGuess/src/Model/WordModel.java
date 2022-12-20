package Model;

import java.util.ArrayList;

public class WordModel {
    private String word;
    private int wordLength;
    private int nOfAttempts;
    private ArrayList<String> topPlayersName;
    private ArrayList<Integer> topPlayersNAttempts;

    //Setters and getters methods
    public void setWord(String word){ this.word = word; }
    public String getWord(){ return word; }

    public void setWordLength(int wordLength) { this.wordLength = wordLength; }
    public int getWordLength() { return wordLength; }

    public void setNOfAttempts(int nOfAttempts) { this.nOfAttempts = nOfAttempts;}
    public int getNOfAttempts() {return nOfAttempts;}

    public void addPlayer(String playerName, int nOfAttempts){
        int index = 11;
        if (topPlayersNAttempts.size() < 10){
            for (int i=0; i < 10; i++){
                if (nOfAttempts < topPlayersNAttempts.get(i)){
                    index = i;
                    break;
                }
            }
            topPlayersName.add(index, playerName);
            topPlayersNAttempts.add(index, nOfAttempts);
        }
    }
}

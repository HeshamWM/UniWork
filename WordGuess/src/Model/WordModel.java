package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WordModel {
    private String word;
    private ArrayList<Character> wordLetters;
    private int wordLength;
    private int nOfAttempts;
    private ArrayList<String> topPlayersName;
    private ArrayList<Integer> topPlayersNAttempts;

    public void emptyAll(){
        word = "";
        wordLetters.clear();
        wordLength = 0;
    }

    public WordModel(){
        topPlayersName = new ArrayList<>(); // Arrays.asList("a","b","c","d","e")
        topPlayersNAttempts = new ArrayList<>(); // Arrays.asList(1,2,3,4,5)
        wordLetters = new ArrayList<>();
        nOfAttempts = 2;
    }

    //Setters and getters methods
    public void setWord(String word){
        this.word = word;
        setWordLength(word.length());
        for (int i = 0; i < word.length(); i++) {
            wordLetters.add(word.charAt(i));
        }
    }

    public String getWord(){ return word; }

    public void setWordLength(int wordLength) { this.wordLength = wordLength; }
    public int getWordLength() { return wordLength; }

    public void setNOfAttempts(int nOfAttempts) { this.nOfAttempts = nOfAttempts;}
    public int getNOfAttempts() {return nOfAttempts;}

    public boolean doesExist(char letter){
        return wordLetters.contains(letter);
    }

    public boolean correctPosition(char letter, int index){
        return wordLetters.get(index) == letter;
    }

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

    public boolean attemptsDone(){
        return nOfAttempts == 0;
    }
}

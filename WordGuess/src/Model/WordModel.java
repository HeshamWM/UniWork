package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WordModel {
    private String word;
    private ArrayList<Character> wordLetters;
    private int wordLength;
    private int nOfAttempts;
    private int attemptsUsed = 0;
    private ArrayList<Player> playerList;

    public void emptyAll(){
        word = "";
        wordLetters.clear();
        wordLength = 0;
        attemptsUsed = 0;
    }

    public WordModel(){
        playerList = new ArrayList<>(); // Arrays.asList("a","b","c","d","e")
        wordLetters = new ArrayList<>();
        nOfAttempts = 8;
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

    public void setAttemptsUsed(int attemptsUsed){
        this.attemptsUsed = attemptsUsed;
    }

    public boolean doesExist(char letter){
        return wordLetters.contains(letter);
    }

    public boolean correctPosition(char letter, int index){
        return wordLetters.get(index) == letter;
    }

    public boolean attemptsDone(){
        return nOfAttempts == 0;
    }

    public void addPlayer(String playerName, int attemptsUsed){
        Player player = new Player(playerName,attemptsUsed);
        if (playerList.size() == 0){
            playerList.add(player);
        }else{
            int index = player.checkRanking(attemptsUsed);
            if(index == 1000){
                playerList.add(player);
            }else{
                playerList.add(index, player);
            }
        }
    }

    public String listTopPlayers(){
        String text = null;
        int max;
        if(playerList.size() > 10){
            max = 10;
        }else{
            max = playerList.size();
        }
        for (int i = 0; i < max; i++) {
            text += "Player: " + playerList.get(i).getPlayerName()+" Attempts Used: " +playerList.get(i).getAttemptsUsed();
        }
        return text;
    }

    public class Player{
        private final String playerName;
        private final int attemptsUsed;

        public int getAttemptsUsed(){return attemptsUsed;}

        public String getPlayerName(){return playerName;}

        public int checkRanking(int nOfAttempts){
            int index = 1000;
            for (int i=0; i < playerList.size(); i++){
                if (attemptsUsed < playerList.get(i).getAttemptsUsed()){
                    index = i;
                    break;
                }
            }
            return index;
        }

        public Player(String name, int attemptsUsed){
            this.playerName = name;
            this.attemptsUsed = attemptsUsed;
        }
    }
}

package similarity;

public class Token {

    private String word;
    private int frequency;

    public Token(String word, int frequency) {
        this.word = word;
        if (frequency >= 0) {
            this.frequency = frequency;
        }
    }

    public void increaseFrequency(int value) {
        if (value >= 0) {
            this.frequency += value;
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    
}

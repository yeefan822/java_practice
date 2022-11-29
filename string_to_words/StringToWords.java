package string_to_words;
public class StringToWords{
    private String str;
    private int index;
    private int length;
    private String word;
    private boolean hasNext;
    public StringToWords(String str){
        this.str = str;
        this.index = 0;
        this.length = str.length();
        this.word = "";
        this.hasNext = true;
    }
    public boolean hasNext(){
        if (this.index == this.length){
            this.hasNext = false;
        }
        return this.hasNext;
    }
    public String next(){
        this.word = "";
        while (this.index < this.length && this.str.charAt(this.index) == ' '){
            this.index++;
        }
        while (this.index < this.length && this.str.charAt(this.index) != ' '){
            this.word += this.str.charAt(this.index);
            this.index++;
        }
        return this.word;
    }
}
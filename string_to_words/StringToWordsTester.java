package string_to_words;
public class StringToWordsTester {
    public static void main(String args[]) {
        StringToWords stw = new StringToWords("  This is 6.005.   ");
        while (stw.hasNext()) {
            System.out.println("<"+stw.next()+">");    
        }  
    }
}
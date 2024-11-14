package Assignment8;
public class Bai6 {

   
    public static int countWords(String str) {
       
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String testString = "Java is fun";
        int wordCount = countWords(testString);
        
        System.out.println("The number of words in the string \"" + testString + "\" is: " + wordCount);
    }
}

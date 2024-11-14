package Assignment8;
public class Bai8{
      public static String findLongestWord(String str) {
        String[] words = str.trim().split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
    public static void main(String[] args) {
        String testString = "I love programming";
        String longestWord = findLongestWord(testString);
        
        System.out.println("The longest word in the string \"" + testString + "\" is: " + longestWord);
    }
}

 
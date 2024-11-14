
package Assignment8;
public class Bai5 {
    public static String[] splitWords(String str) {
        return str.trim().split("\\s+");
    }
    public static void main(String[] args) {
        String testString = "Java is fun";
        String[] wordArray = splitWords(testString);
        System.out.print("Array of words: ");
        for (String word : wordArray) {
            System.out.print(word + " ");
        }
    }
}


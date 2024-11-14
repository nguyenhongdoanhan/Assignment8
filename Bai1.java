
package Assignment8;
public class Bai1 {
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

        public static void main(String[] args) {
        String testStr = "hello world";
        char testChar = 'o';
        int occurrences = countOccurrences(testStr, testChar);
        System.out.println("The character '" + testChar + "' appears " + occurrences + " times in the string \"" + testStr + "\".");
    }
}


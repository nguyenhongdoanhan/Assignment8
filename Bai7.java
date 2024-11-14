package Assignment8;
public class Bai7 {

    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        String testString = "   Hello    World   ";
        String result = removeExtraSpaces(testString);
        System.out.println("String after removing extra spaces: \"" + result + "\"");
    }
}


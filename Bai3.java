
package Assignment8;
import java.util.Scanner;
public class Bai3 {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chuoi kiem tra: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();
        if (isPalindrome(input)) {
            System.out.println("Chuoi nay la chuoi hoi van.");
        } else {
            System.out.println("Chuoi nay khong phai la chuoi hoi van.");
        }

        scanner.close();
    }
}


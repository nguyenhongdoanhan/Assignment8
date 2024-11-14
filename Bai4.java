/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment8;
import java.util.Scanner;

public class Bai4 {

    public static String convertCase(String str) {
        String result = ""; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
       
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); 
            } 
            
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } 
            else {
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi can chuyen: ");
        String input = scanner.nextLine();

        String convertedString = convertCase(input);

        System.out.println("Chuoi sau khi chuyen: " + convertedString);

        scanner.close();
    }
}

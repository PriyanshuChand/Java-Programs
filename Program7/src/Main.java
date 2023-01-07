import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String RevStr = "";
        char ch;
        // Reversing str
        for (int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            RevStr = ch + RevStr;
        }
        // Checking if str is palindrome
        if (str.equals(RevStr)) {
            System.out.println("Given string is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
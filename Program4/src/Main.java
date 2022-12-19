import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any positive integer ");
        int num = in.nextInt();

        // Logic to check whether given number is even or odd

        if (num%2==0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
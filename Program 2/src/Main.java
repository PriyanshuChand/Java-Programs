import java.util.Scanner;

//Make a program that prints the table of a number that is input by the user.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
    }
}
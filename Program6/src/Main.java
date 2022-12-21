import java.util.Scanner;

// Fibonacci series in Java without recursion
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter how many fibonacci number you want to print");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int a=0, b=1, fibNum;
        System.out.print(a+" "+b);
        for (int i = 2; i < count; i++) {
            fibNum = a+b;
            System.out.print(" "+fibNum);
            a = b;
            b = fibNum;
        }
    }
}
import java.util.Scanner;
//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//        1 : + (Addition) a + b//
//        2 : - (Subtraction) a - b//
//        3 : * (Multiplication) a * b//
//        4 : / (Division) a/b//
//        5 : % (Modulo or remainder) a%b
//        Calculate the result according to the operation given and display it to the user.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        float b = sc.nextFloat();
        System.out.println("Choose an operation - '+','-','*','/','%'");
        char oper = sc.next().charAt(0);
        // Calculating value
         if (oper=='+') {
             System.out.println(a+b);
         } else if (oper=='-') {
             System.out.println(a-b);
         } else if (oper=='*') {
             System.out.println(a*b);
         } else if (oper=='/') {
             System.out.println(a/b);
         } else if (oper=='%') {
             System.out.println(a%b);
         } else {
             System.out.println("Error! Please choose a valid operation.");
         }
    }
}
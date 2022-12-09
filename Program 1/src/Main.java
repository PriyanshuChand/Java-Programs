// Make a program that takes the radius of a circle as input,calculates its radius and area and
// prints it as output to the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle (in cm) = ");
        float r = sc.nextFloat();
        // Calculating area of the circle
        float area = 3.14f*r*r;
        System.out.println("Area of circle is "+area+" cm");
    }
}
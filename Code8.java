import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter length of side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter length of side c: ");
        double c = sc.nextDouble();

        // calculate semi-perimeter
        double s = (a + b + c) / 2;

        // calculate area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the triangle: " + area);
    }
}


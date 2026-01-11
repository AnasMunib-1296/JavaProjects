import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter discounted price: ");
        double discountedPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double originalPrice = discountedPrice / (1 - discount / 100);

        System.out.println("Original Selling Price: " + originalPrice);
    }
}

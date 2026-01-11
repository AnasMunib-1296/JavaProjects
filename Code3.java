import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * discount / 100);

        System.out.println("Discounted Selling Price: " + discountedPrice);
    }
}

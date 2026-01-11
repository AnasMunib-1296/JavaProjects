import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter current (A): ");
        double current = sc.nextDouble();

        double watts = voltage * current;

        System.out.println("Power Consumption (Watts): " + watts + " W");
    }
}

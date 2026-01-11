import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        int obtained = sc.nextInt();

        System.out.print("Enter maximum marks: ");
        int maximum = sc.nextInt();

        double percentage = (obtained * 100.0) / maximum;

        System.out.println("Percentage: " + percentage + "%");
    }
}

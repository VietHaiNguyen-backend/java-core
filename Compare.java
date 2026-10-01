import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int num1 = scanner.nextInt();

        System.out.println("Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Maximum: " + Math.max(num1, num2));

        scanner.close();
    }
}

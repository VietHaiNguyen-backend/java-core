import java.util.Scanner;

public class Lab3Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int value = scanner.nextInt();

        // 1 < xxx < value
        int count = 0;
        for (int i = 2; i <= value - 1; i++) {
            if (value % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.printf("%d la so nguyen to", value);
        } else {
            System.out.printf("%d khong la so nguyen to ", value);
        }
        scanner.close();
    }
}
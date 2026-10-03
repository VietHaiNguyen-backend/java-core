import java.util.Scanner;

public class Lab3Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen bat ki cho bang cua chuong x = ");
        int x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", x, i, x * i);
        }
        scanner.close();
    }
}

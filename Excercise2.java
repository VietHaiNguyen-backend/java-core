import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh nhap tu ban phim 2 canh cua hinh chu nhat");

        System.out.print("Nhap canh a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh b = ");
        double b = scanner.nextDouble();

        System.out.println("Chu vi hinh chu nhat la: " + (a + b) * 2);
        System.out.println("Dien tich hinh chu nay la: " + a * b);
        System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(a, b));

        scanner.close();

    }
}

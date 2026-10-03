import java.util.Scanner;

public class Lab2Excercise3 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh so tien dien");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dien: ");
        double soDien = scanner.nextDouble();
        if (soDien >= 0 && soDien <= 100) {
            System.out.println("So tien dien phai tra la: " + (soDien * 1000));
        } else {
            System.out.println("So tien dien phai tra la: " + (100 * 1000 + (soDien - 100) * 1500));
        }
    }

}

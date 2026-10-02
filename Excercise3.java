import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh tinh the tich cua hinh lap phuong");
        System.out.print("Nhap canh cua hinh lap phuong a = ");
        double a = scanner.nextDouble();
        System.out.println("The tich cua hinh lap phuong la: " + Math.pow(a, 3));

        scanner.close();
    }
}

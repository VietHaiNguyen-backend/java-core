import java.util.Scanner;

public class Lab2Excercise2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh nghiem cua phuong trinh bac nhat ax + b = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap he so b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = (double) -b / a;
            System.out.println("Phuong trinh co nghiem day nhat x = " + x);
        }
    }
}

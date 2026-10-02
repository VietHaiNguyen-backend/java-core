import java.util.Scanner;

public class Lab2Excercise2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh toan nghiem cua phuong trinh bac 2 ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap he so b = ");
        int b = scanner.nextInt();
        System.out.print("Nhap he so c = ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("Phuong trinh co nghiem duy nhat x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
            }
        }
        scanner.close();
    }
}

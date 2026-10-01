import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.println("Nhap diem cua sinh vien: ");
        double score = scanner.nextDouble();

        System.out.println("Ten sinh vien: " + name + ", Diem: " + score);

        scanner.close();

    }
}
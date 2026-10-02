
import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien thu nhap: ");
        int tax = scanner.nextInt();

        if (tax < 10) {
            System.out.println("Khong dong thue!");
        } else if (10 <= tax && tax <= 15) {
            System.out.println("Dong thue 10%");
        } else if (15 < tax && tax <= 30) {
            System.out.println("Dong thue 20%");
        } else {
            System.out.println("Thue 50%");
        }
        scanner.close();
    }
}

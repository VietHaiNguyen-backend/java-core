import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Lua chon tinh nang");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Ket thuc");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lua chon cua ban la: ");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Ban da lua chon phep cong");
                break;
            case 2:
                System.out.println("Ban da lua chon phep tru");
                break;
            default:
                System.out.println("Ban da lua chon ket thuc chuong trinh");
                break;
        }
        scanner.close();
    }
}

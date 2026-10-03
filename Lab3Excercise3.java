import java.util.Scanner;

public class Lab3Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // cach 1: Arrays.sort(arr);
        // cach 2: dung bien luu tru tam thoi
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep la: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        // cach 1: dung thu vien Math
        /*
         * int min = arr[0];
         * int max = arr[0];
         * for (int i = 1; i < n; i++) {
         * min = Math.min(min, arr[i]);
         * max = Math.max(max, arr[i]);
         * }
         * System.out.println("Phan tu nho nhat: " + min);
         * System.out.println("Phan tu lon nhat: " + max);
         */
        // cach 2: nguyen thuy
        int min = arr[0];
        int max = arr[n - 1];
        System.out.println("Phan tu nho nhat: " + min);
        System.out.println("Phan tu lon nhat: " + max);

        scanner.close();
    }
}

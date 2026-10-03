import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] number = { 7, 9, 5, 10, 11, 6 };
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}

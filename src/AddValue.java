import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter index:");
        int index = scanner.nextInt();

        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }
}

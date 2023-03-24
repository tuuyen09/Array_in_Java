import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index = 0;
        System.out.println("Enter x:");
        int x = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                arr[arr.length - 1] = 0;
            }
        }
        for (int j = index; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];

        }
        System.out.println(Arrays.toString(arr));
    }
}


import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + i + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println( "Element in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - j - 1];
            array[size - j - 1] = temp;
        }
        System.out.println("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

    }
}

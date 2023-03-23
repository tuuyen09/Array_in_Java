import java.util.Scanner;

public class Max_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + i + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j ;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}

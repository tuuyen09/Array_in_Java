import java.util.Scanner;

public class Find_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = scanner.nextLine();
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        boolean isExit = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}

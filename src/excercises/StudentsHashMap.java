package excercises;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class StudentsHashMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String studentName;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student name: ");
            studentName = in.nextLine();

            if (!studentName.equals("")) {
                System.out.println("Enter student's ID:");
                Integer studentID = in.nextInt();
                students.put(studentID, studentName);
                in.nextLine();
            }

        } while (!studentName.equals(""));

        System.out.print("\nClass roster:\n");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + "(" + student.getValue() + ")");
        }
    }


}

import java.util.ArrayList;
import java.util.List;

public class Class {

    List<String> students = new ArrayList<>();

    void addStudent(String name) {
        students.add(name);
    }

    void displayStudents() {

        if (students.isEmpty()) {
            System.out.print("There's no students");
        } else {
            System.out.print("Sudents: ");

            System.out.println(String.join(", ", students) + ".");

        }
    }

    int getGirlsCount() {

        int count = 0;
        for (String s : students) {
            if (s.endsWith("a")) {

                count = students.size() - 2;

            }
            return count;

        }

        return 0;
    }
}






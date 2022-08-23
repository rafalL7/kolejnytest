public class Main {
    public static void main(String[] args) {
        Class student = new Class();
        student.addStudent("Sara");
        student.addStudent("Julek");
        student.addStudent("Patrycja");
        student.addStudent("Rafał");
        student.addStudent("Eleonora");
        student.addStudent("Walencja");
        student.addStudent("Patrycja");
        student.addStudent("Izydora");
        student.addStudent("Agata");
        student.addStudent("Walencja");
        student.addStudent("Jadwiga");
        student.addStudent("Walencja");
        student.addStudent("Monika");
        student.addStudent("Walencja");
        student.addStudent("Hana");
        student.displayStudents();
        System.out.println("This class has " + student.getGirlsCount() + " girls");
    }
}

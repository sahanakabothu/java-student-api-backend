import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class StudentService {
    private List<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added");
    }

    // READ
    public void getStudents() {
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }
    }

    // UPDATE
    public void updateStudent(int id, String name) {
        for (Student s : students) {
            if (s.id == id) {
                s.name = name;
                System.out.println("Updated");
                return;
            }
        }
        System.out.println("Not found");
    }

    // DELETE
    public void deleteStudent(int id) {
        students.removeIf(s -> s.id == id);
        System.out.println("Deleted if existed");
    }
}

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent(1, "Sahi");
        service.addStudent(2, "Ram");

        service.getStudents();

        service.updateStudent(1, "Sahana");

        service.deleteStudent(2);

        service.getStudents();
    }
}

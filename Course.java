import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private Department department;
    private List<Student> students = new ArrayList<>();

    public Course(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }
}

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}

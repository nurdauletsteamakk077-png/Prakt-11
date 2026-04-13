import java.util.ArrayList;
import java.util.List;

class Student extends User {
    private String recordBookNumber;
    private List<Course> courses = new ArrayList<>();

    public Student(int id, String name, String email, String recordBookNumber) {
        super(id, name, email);
        this.recordBookNumber = recordBookNumber;
    }

    public void registerCourse(Course course) {
        courses.add(course);
        System.out.println("Student registered to course: " + course.getName());
    }

    public void viewGrades() {
        System.out.println("Viewing grades...");
    }

    @Override
    public void login() {
        System.out.println("Student logged in");
    }
}

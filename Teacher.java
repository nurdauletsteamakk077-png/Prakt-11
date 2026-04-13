import java.util.ArrayList;
import java.util.List;

class Teacher extends User {
    private String position;
    private List<Course> courses = new ArrayList<>();

    public Teacher(int id, String name, String email, String position) {
        super(id, name, email);
        this.position = position;
    }

    public void conductLesson() {
        System.out.println("Lesson conducted");
    }

    public void assignGrade(Student student, Grade grade) {
        System.out.println("Grade assigned");
    }

    @Override
    public void login() {
        System.out.println("Teacher logged in");
    }
}

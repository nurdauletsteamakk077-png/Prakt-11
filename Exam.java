import java.util.ArrayList;
import java.util.List;

class Exam {
    private Course course;
    private String date;
    private List<Grade> grades = new ArrayList<>();

    public Exam(Course course, String date) {
        this.course = course;
        this.date = date;
    }

    public void assignExam() {
        System.out.println("Exam assigned");
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}

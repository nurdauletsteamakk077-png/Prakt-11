public class Main {
    public static void main(String[] args) {

        University uni = new University("Satbayev University", "Almaty");

        Faculty faculty = new Faculty("IT Faculty");
        Department dept = new Department("Computer Science");

        Teacher teacher = new Teacher(1, "Aman", "aman@mail.com", "Professor");
        Student student = new Student(2, "Nurdaulet", "n@mail.com", "RB123");

        Course course = new Course("Java", dept);

        uni.addFaculty(faculty);
        faculty.addDepartment(dept);

        dept.addTeacher(teacher);
        dept.addCourse(course);

        course.addStudent(student);
        student.registerCourse(course);

        Exam exam = new Exam(course, "2026-05-01");
        Grade grade = new Grade(student, 95);

        exam.addGrade(grade);

        teacher.assignGrade(student, grade);
    }
}

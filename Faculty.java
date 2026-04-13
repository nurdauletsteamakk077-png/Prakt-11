import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }
}

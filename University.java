import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private String address;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }
}

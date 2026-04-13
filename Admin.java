class Admin extends User {

    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void manageFaculty(Faculty faculty) {
        System.out.println("Managing faculty: " + faculty.getName());
    }

    @Override
    public void login() {
        System.out.println("Admin logged in");
    }
}

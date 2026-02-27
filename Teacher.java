public class Teacher extends Person {

    String department;
    String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public String[] getCourses() { return courses; }

    public void setDepartment(String department) { this.department = department; }
    public void setCourses(String[] courses) { this.courses = courses; }

    public String toString() {
        String list = "";
        for (String c : courses) list += c + " ";
        return super.toString() + ", Dept: " + department + ", Courses: " + list;
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        if (!department.equals(t.department)) return false;
        if (courses.length != t.courses.length) return false;
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(t.courses[i])) return false;
        }
        return true;
    }
}
// this class extends person and represents a teacher with additional attributes and methods.
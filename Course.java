import java.util.List;

public class Course {
    private String name;
    private int duration;
    private List<Subject> offeredSubjects;
    private List<Student> enrolledStudents;

    public Course(String name, int duration, List<Subject> offeredSubjects, List<Student> enrolledStudents) {
        this.name = name;
        this.duration = duration;
        this.offeredSubjects = offeredSubjects;
        this.enrolledStudents = enrolledStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Subject> getOfferedSubjects() {
        return offeredSubjects;
    }

    public void setOfferedSubjects(List<Subject> offeredSubjects) {
        this.offeredSubjects = offeredSubjects;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}

import java.util.List;

public class Subject {
    private String name;
    private String code;
    private int workload;
    private Teacher responsibleTeacher;
    private List<Student> enrolledStudents;

    public Subject(String name, String code, int workload, Teacher responsibleTeacher, List<Student> enrolledStudents) {
        this.name = name;
        this.code = code;
        this.workload = workload;
        this.responsibleTeacher = responsibleTeacher;
        this.enrolledStudents = enrolledStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public Teacher getResponsibleTeacher() {
        return responsibleTeacher;
    }

    public void setResponsibleTeacher(Teacher responsibleTeacher) {
        this.responsibleTeacher = responsibleTeacher;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    public void assignGrade(Student student, double grade) {
        student.getGrades().add(grade);
    }
}

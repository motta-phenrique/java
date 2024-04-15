import java.util.List;

public class Student extends Person {
    private String registrationNumber;
    private List<Course> enrolledCourses;
    private List<Subject> enrolledSubjects;
    private List<Double> grades;

    public Student(String name, int age, String registrationNumber, List<Course> enrolledCourses, List<Subject> enrolledSubjects, List<Double> grades) {
        super(name, age);
        this.registrationNumber = registrationNumber;
        this.enrolledCourses = enrolledCourses;
        this.enrolledSubjects = enrolledSubjects;
        this.grades = grades;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
    
}

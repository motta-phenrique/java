import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

         Teacher teacher1 = new Teacher("Fernando", 35, "Computer Science");

        List<Student> enrolledStudents = new ArrayList<>();
        List <Subject> offeredSubjects = new ArrayList<>();
        List<Subject> taughSubjects = new ArrayList<>();
        List<Course> enrolledCourses = new ArrayList<>();
        List<Double> grades = new ArrayList<>();

        Subject javaPrograming = new Subject("Java Programing", "JV01", 80, teacher1, enrolledStudents);
        offeredSubjects.add(javaPrograming);
        Subject databaseManagement = new Subject("Database Management", "DB01", 35, teacher1, enrolledStudents);
        offeredSubjects.add(databaseManagement);

        taughSubjects.add(databaseManagement);
        taughSubjects.add(javaPrograming);

    
        Student newstudent1 = new Student("Paulo", 25, "154422", enrolledCourses, offeredSubjects, grades);
        enrolledStudents.add(newstudent1);
        Student newstudent2 = new Student("Maria", 23, "154423", enrolledCourses, offeredSubjects, grades);
        enrolledStudents.add(newstudent2);


        Course course1 = new Course("Computer Science", 40, offeredSubjects, enrolledStudents);


        for (Subject subject : taughSubjects) {

            String subjectName = subject.getName();
            String teacherName = subject.getResponsibleTeacher().getName();
        

            System.out.println("Subject: " + subjectName);
            System.out.println("Responsible Teacheer: " + teacherName);
            System.out.println("--------------------------------------");
        }
        System.out.println("Name: " + course1.getName());
        System.out.println("Duration: " + course1.getDuration() + " hours");
        System.out.println("Offered Subjects:");
        for (Subject subject : course1.getOfferedSubjects()) {
            System.out.println("- " + subject.getName() + " (" + subject.getCode() + ")");
        }
        System.out.println("Enrolled Students:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("- " + student.getName() + " (Registration Number: " + student.getRegistrationNumber() + ")");
        }

        double grade = 8.5;
        Subject subject = javaPrograming;
        Student student = newstudent1;
        subject.assignGrade(student, grade);


        double grade1 = 9.2;
        Subject subject1 = databaseManagement;
        Student student1 = newstudent2;
        subject1.assignGrade(student1, grade1);


        System.out.println("--------------------------------------");
        System.out.println("Grade given to " + student.getName() + " in subject " + subject.getName() + ": " + grade);
        System.out.println("Grade given to " + student1.getName() + " in subject " + subject1.getName() + ": "+ grade1);

        System.out.println(teacher1);
    }
    
}

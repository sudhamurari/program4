import java.util.*;

class Course {
    String courseName;
    int marks;

    Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    List<Course> courses;

    Student(String name, String program, int semester, List<Course> courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course course : courses) {
            System.out.println(" - " + course.courseName);
        }
    }

    void displayLowScores() {
        for (Course course : courses) {
            if (course.marks < 40) {
                System.out.println("Low Score - " + course.courseName + ": " + course.marks + " marks");
            }
        }
    }
}

public class program4{
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("Mathematics", 35));
        courseList.add(new Course("Physics", 75));
        courseList.add(new Course("Chemistry", 30));

        Student student = new Student("Alice", "BSc", 3, courseList);

        System.out.println("=== Student Details ===");
        student.displayDetails();

        System.out.println("\n=== Courses with Marks < 40 ===");
        student.displayLowScores();
    }
}

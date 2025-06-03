import java.util.ArrayList;
import java.util.List;

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

    Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    void registerCourse(String courseName, int marks) {
        courses.add(new Course(courseName, marks));
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        for (Course course : courses) {
            System.out.println("Course Registered: " + course.courseName);
        }
        System.out.println();
    }

    void displayLowMarks() {
        for (Course course : courses) {
            if (course.marks < 40) {
                System.out.println("Student: " + name + " | Course: " + course.courseName + " | Marks: " + course.marks);
            }
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Anjali", "B.Tech CSE", 4);
        s1.registerCourse("Data Structures", 45);
        s1.registerCourse("Operating Systems", 35);

        Student s2 = new Student("Rahul", "B.Sc Physics", 2);
        s2.registerCourse("Mechanics", 39);
        s2.registerCourse("Electromagnetism", 42);

        Student s3 = new Student("Sneha", "B.Com", 3);
        s3.registerCourse("Accountancy", 75);
        s3.registerCourse("Business Law", 28);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("---- Student Details ----");
        for (Student s : students) {
            s.displayStudentDetails();
        }

        System.out.println("---- Students with Marks Less Than 40 ----");
        for (Student s : students) {
            s.displayLowMarks();
        }
    }
}
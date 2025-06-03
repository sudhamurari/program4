class Course:
    def __init__(self, course_name, marks):
        self.course_name = course_name
        self.marks = marks

    def __str__(self):
        return f"Course: {self.course_name}, Marks: {self.marks}"

class Student:
    def __init__(self, name, program, semester):
        self.name = name
        self.program = program
        self.semester = semester
        self.courses = []

    def add_course(self, course):
        self.courses.append(course)

    def get_student_details(self):
        return f"Student: {self.name}, Program: {self.program}, Semester: {self.semester}"

    def get_courses(self):
        return [course.course_name for course in self.courses]

    def get_courses_with_marks_below_40(self):
        return [course for course in self.courses if course.marks < 40]

# Example Usage
course1 = Course("Math", 35)
course2 = Course("Science", 45)
course3 = Course("History", 30)

student = Student("John Doe", "Engineering", "Semester 1")
student.add_course(course1)
student.add_course(course2)
student.add_course(course3)

print(student.get_student_details())
print("Courses registered:", student.get_courses())
print("Courses with marks below 40:", [str(course) for course in student.get_courses_with_marks_below_40()])

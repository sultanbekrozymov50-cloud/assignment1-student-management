public class Course {
    private String courseName;
    private String instructor;
    private Student[] students; // Массив объектов Student

    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            this.students[index] = s;
        } else {
            System.out.println("Ошибка: Неверный индекс для добавления студента.");
        }
    }

    public double courseAverageGPA() {
        double totalGPA = 0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                totalGPA += s.getGpa();
                count++;
            }
        }
        return (count == 0) ? 0.0 : totalGPA / count;
    }

    public Student highestCreditStudent() {
        if (students.length == 0) return null;

        Student topStudent = null;
        for (Student s : students) {
            if (s != null) {
                if (topStudent == null || s.getCredits() > topStudent.getCredits()) {
                    topStudent = s;
                }
            }
        }
        return topStudent;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " | Instructor: " + instructor +
                " | Students Enrolled: " + students.length;
    }
}
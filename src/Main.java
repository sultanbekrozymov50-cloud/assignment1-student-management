public class Main {
    public static void main(String[] args) {
        Student[] studentList = new Student[5];

        studentList[0] = new Student("Alice Johnson", "S101", "Computer Science");
        studentList[1] = new Student("Bob Smith", "S102", "Mathematics");
        studentList[2] = new Student("Charlie Brown", "S103", "Physics");
        studentList[3] = new Student("Diana Prince", "S104", "Engineering");
        studentList[4] = new Student("Ethan Hunt", "S105", "Cybersecurity");

        studentList[0].updateGPA(3.9); studentList[0].addCredits(15);
        studentList[1].updateGPA(3.4); studentList[1].addCredits(12);
        studentList[2].updateGPA(3.6); studentList[2].addCredits(18);
        studentList[3].updateGPA(2.8); studentList[3].addCredits(9);
        studentList[4].updateGPA(4.0); studentList[4].addCredits(21);

        Course myCourse = new Course("Advanced Java", "Dr. Oracle", 5);
        for (int i = 0; i < studentList.length; i++) {
            myCourse.addStudent(studentList[i], i);
        }

        System.out.println(myCourse.toString());
        System.out.println("Average GPA of Course: " + myCourse.courseAverageGPA());
        System.out.println("Student with max credits: " + myCourse.highestCreditStudent());

        System.out.println("\n--- Data Processing Tasks ---");
        System.out.println("Top Student (GPA): " + getTopStudent(studentList).getName());
        System.out.println("Number of Honors Students: " + countHonors(studentList));
        System.out.println("Total Credits Earned: " + totalCredits(studentList));
    }


    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];
        for (Student s : arr) {
            if (s != null && s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            if (s != null) {
                total += s.getCredits();
            }
        }
        return total;
    }
}
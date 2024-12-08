package niedermayer_david_10.pkg14;

import java.util.ArrayList;

public class StudentGroup {

    ArrayList<Student> students;

    // Constructor
    public StudentGroup() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) throws Exception {
        if (student == null) {
            throw new Exception("Student cannot be null.");
        }
        students.add(student);
    }

    // Remove student
    public void removeStudent(Student student) throws Exception {
        if (!students.contains(student)) {
            throw new Exception("Student does not exist in the group.");
        }
        students.remove(student);
    }

    // Group average based on final grades
    public double groupAverage() {
        if (students.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Student student : students) {
            sum += student.finalGrade();
        }
        return sum / students.size();
    }

    // Check if any student is failing
    public boolean isFailing() {
        for (Student student : students) {
            if (student.finalGrade() == 1) {
                return true;
            }
        }
        return false;
    }
}

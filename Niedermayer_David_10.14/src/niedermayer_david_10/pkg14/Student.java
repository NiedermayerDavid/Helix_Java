package niedermayer_david_10.pkg14;

import java.util.ArrayList;


public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(int id, String name) throws Exception {
        if (String.valueOf(id).length() != 4) {
            throw new Exception("The ID must be a 4-digit number.");
        }
        if (name == null || name.isEmpty()) {
            throw new Exception("Name cannot be empty.");
        }
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // Setters
    public void setId(int id) throws Exception {
        if (String.valueOf(id).length() != 4) {
            throw new Exception("The ID must be a 4-digit number.");
        }
        this.id = id;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("Name cannot be empty.");
        }
        this.name = name;
    }

    // Add Grade
    public void addGrade(int grade) throws Exception {
        if (grade < 1 || grade > 5) {
            throw new Exception("Grade must be between 1 and 5.");
        }
        grades.add(grade);
    }
    public static int customRound(double value) {
        // Elválasztjuk a tizedesrészt a szám egészrészétől
        double fractionalPart = value - Math.floor(value);
        
        // Ha a tizedesrész nagyobb vagy egyenlő 0.6, akkor felfelé kerekítünk
        if (fractionalPart >= 0.6) {
            return (int) Math.ceil(value);  // Felfelé kerekítés
        } else {
            return (int) Math.floor(value); // Lefelé kerekítés
        }
    }

    // Average calculation
    public double average() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Final grade calculation
    public int finalGrade() {
        double avg = average();
        return (int) customRound(avg);
    }

}

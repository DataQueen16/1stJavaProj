package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();
    private double grade;

    public Student(String name) {
        this.name = name;
        this.grades.add(grade);
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        if (grades.isEmpty()) {
            System.out.println("I'm sorry, this student has no grades");
            return 0;
        } else {

            double totalScore = 0;

            for (int i = 0; i < grades.size(); i++) {
                double score = grades.get(i);
                totalScore += score;
                System.out.println(totalScore);
            }

            double total = totalScore / grades.size();
            return total;
        }
    }

    public static void main(String[] args) {
        Student Michael = new Student("Michael");
        Michael.addGrade(89.53);
        Michael.addGrade(75);
        Michael.addGrade(88.75);
        Michael.addGrade(69.90);

        System.out.println(Michael.grades);
        System.out.println(Michael.getGradeAverage());
    }

}

package grades;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GradesApplication {
    public static void main(String[] args) {

        Student Julius = new Student("LovecraftNow");
        Student Jennifer = new Student("DataQueen16");
        Student Jackie = new Student("DegrassiJrHigh");
        Student Stella = new Student("NewMexicoMama");

        Julius.addGrade(98.0);
        Julius.addGrade(92.89);
        Julius.addGrade(89.8);

        System.out.println(Julius);

        Jennifer.addGrade(99.54);
        Jennifer.addGrade(92.34);
        Jennifer.addGrade(97.64);

        System.out.println(Jennifer);

        Jackie.addGrade(69.54);
        Jackie.addGrade(75.87);
        Jackie.addGrade(89.54);

        System.out.println(Jackie);

        Stella.addGrade(89.54);
        Stella.addGrade(93.56);
        Stella.addGrade(92.25);

        System.out.println(Stella);


        HashMap<String, Student> students = new HashMap<>();

        students.put(Julius.getName(), Julius);
        students.put(Jennifer.getName(), Jennifer);
        students.put(Jackie.getName(), Jackie);
        students.put(Stella.getName(), Stella);


        System.out.println(students);

    }
}

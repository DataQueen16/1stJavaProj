package grades;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {

        Student Julius = new Student("LovecraftNow");
        Student Jennifer = new Student("DataQueen16");
        Student Jackie = new Student("DegrassiJrHigh");
        Student Stella = new Student("NewMexicoMama");

        Julius.addGrade(98.0);
        Julius.addGrade(92.89);
        Julius.addGrade(89.8);

        Jennifer.addGrade(99.54);
        Jennifer.addGrade(92.34);
        Jennifer.addGrade(97.64);

        Jackie.addGrade(69.54);
        Jackie.addGrade(75.87);
        Jackie.addGrade(89.54);

        Stella.addGrade(89.54);
        Stella.addGrade(93.56);
        Stella.addGrade(92.25);



        HashMap<String, Student> students = new HashMap<>();

        students.put(Julius.getName(), Julius);
        students.put(Jennifer.getName(), Jennifer);
        students.put(Jackie.getName(), Jackie);
        students.put(Stella.getName(), Stella);

//        for (Map.Entry<String, Student> entry : students.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }

        System.out.println("Welcome folks!\nHere is the list of github usernames of our students: ");
        System.out.println("1. LovecraftNow\n2. DataQueen16\n3. DegrassiJrHigh\n4. NewMexicoMama");
        studentMenu();
    }


    public static String studentMenu() {
        Scanner input = new Scanner(System.in);
        int answer;

        System.out.println("Please choose a number to see a student's grades: ");
        answer = input.nextInt();

//        if (students.containsKey(answer)) {
//
//        }

        String output = "Hey there";
        return output;
    }

//    public static String nameMatch() {
//
//    }


}

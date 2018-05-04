package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String answer;

//        System.out.println("Tell me your name today: ");
//        answer = input.getString();
//        System.out.println("Your name is " + answer);

//        input.yesNo();
//        input.getInt(75, 100);

//        int num = input.getInt();
//        System.out.println(num);

//        input.getDouble(25, 50);

        double num2 = input.getDouble();
        System.out.println(num2);
    }
}

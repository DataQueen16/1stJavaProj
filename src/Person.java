import java.util.Scanner;

public class Person {
    private String name;

    // returns the person's name
    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        String greeting = getName();
        System.out.print("Greetings " + greeting);
    }

    public Person(String personName) {
        name = personName;
    }

    public static void main(String[] args) {

//        Person girl = new Person("Jennifer");
//
//        girl.getName();
//
//        girl.sayHello();
//
//        girl.setName("Julia");
//
//        girl.getName();
//
//        girl.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}

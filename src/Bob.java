import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//                He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//                He answers 'Whatever.' to anything else.
        String answer;
        String bobSays;
        Scanner bob = new Scanner(System.in);

        System.out.println("Please talk to Bob -");
        answer = bob.nextLine();


        if (answer.endsWith("?")) {
            bobSays = "Sure man!";
        } else if (answer.trim().equals("")) {
            bobSays = "Fine, be that way man!";
        } else if (answer.equals(answer.toUpperCase())) {
            bobSays = "Whoa, chill out dude!";
        } else {
            bobSays = "Whatever";
        }

        System.out.println(bobSays);
    }
}

import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        length();
//        einstein();
    }


        public static int length(){
            Scanner sc = new Scanner(System.in);
            String[] words;

            System.out.println("Input a sentence: ");
            String sentence = sc.nextLine();

            words = sentence.split("\\s");

            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("[^\\w]", "");
                System.out.println(words[i]);

            }

            String longest = words[0];
                for(int i = 1; i < words.length; i++) {
                   String word = words[i];
                    if(word.length() > longest.length())
                        longest = word;
                }

            System.out.println(longest.length());
            return longest.length();
        }

        public static boolean einstein(){
            System.out.println("Please enter a number:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            System.out.println("Please enter another number:");
            int b = sc.nextInt();

            System.out.println("Please enter another number:");
            int c = sc.nextInt();

            int squareA = a * a;
            int squareB = b * b;
            int squareC = c * c;

            System.out.println(squareA);
            System.out.println(squareB);
            System.out.println(squareC);

            if((squareA + squareB) == squareC){
                return true;
            }

            return false;
        }
}

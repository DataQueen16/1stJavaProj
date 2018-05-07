import java.util.Random;

public class ServerNameGenerator {
    static String[] nouns =
            {"Monkey", "Chicken", "Volt", "Hairpiece", "Elephant", "Plug", "Cup", "Fan", "Wig", "Dreds"};
    static String[] adjectives =
            {"Silky", "Slippery", "Wild", "Volatile", "Fused", "Wrinkled", "Melted", "Lucid", "Beaded", "Vintage"};

    public static int randomNumber(int min, int max){
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static String generateSeverName(){
        int a = randomNumber(0, 9);
        int b = randomNumber(0, 9);

        String serverName = nouns[a] + "-" + adjectives[b];
        System.out.println("This is your server name: " + serverName);
        return serverName;
    }

    public static void main(String[] args) {
        generateSeverName();

    }

}

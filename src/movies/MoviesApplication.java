package movies;

import util.Input;

public class MoviesApplication {}

//    Movie[] movies = MoviesArray.findAll();
//    Input input = new Input();  // Create an input object to access the Input class

//    public String menuChoices() {
//        System.out.println("Greetings! What would you like to do today?"); // Greet the user
//        System.out.println();
//
//        System.out.println("1. See all movies\n2. Select a specific category\n3. Exit");
//        System.out.println();
//
//        int answer = input.getInt("Hello there"); // Prompt user for the 1st 3 part menu
//
//        switch (answer){
//            case 1:           // If choose see all movies, call iterateAllMovies method to display them to the user
//                System.out.println(iterateAllMovies());
//                break;
//            case 2:          // Call the Genre list/method
//                System.out.println(returnCategories());
//                break;
//            case 3:         // If user chooses to exit, leave the application
//                System.out.println("Thanks, come again!");
//                break;
//            default:        // Default - if user chooses something besides 1-3 uses recursion to call menuChoices again
//                System.out.println("Oops, not a valid choice.\nPlease try again:");
//                return menuChoices();
//        }
//        String yep = "Thanks for playing today."; // Thanks user for trying
//        return yep;
//    }

//    public String iterateAllMovies(){  // Iterate through the movies array to display all moves & their categories
//        for (Movie movie: movies){
//            System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
//        }
//        String end = "End of List";
//        return end;
//    };

//    public String returnCategories() {
//        System.out.println("Greetings! What genre are you interested in?");
//        System.out.println("1. Drama\n2. Musical\n3. Sci-fi\n4. Horror\n5. Comedy\n6. Animated");

//        int answer = input.getInt();  // List choices 1-6
//        switch (answer){
//            case 1:
//                String input1 = "Drama";
//                iterateCategories(input1);
//                break;
//            case 2:
//                String input2 = "Musical";
//                iterateCategories(input2);
//                break;
//            case 3:
//                String input3 = "Scifi";
//                iterateCategories(input3);
//                break;
//            case 4:
//                String input4 = "Horror";
//                iterateCategories(input4);
//                break;
//            case 5:
//                String input5 = "Comedy";
//                iterateCategories(input5);
//                break;
//            case 6:
//                String input6 = "Animated";
//                iterateCategories(input6);
//                break;
//            default:
//                System.out.println("Incorrect number entered. Please try again.");
//                return returnCategories();
//        }
//        String end = "End of List";
//        return end;
//    }
//
//    public void iterateCategories(String input){
//        for (Movie movie: movies){
//            if (input.equalsIgnoreCase(movie.getCategory())){
//                System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MoviesApplication movies = new MoviesApplication();
//        movies.menuChoices();
//    }
//}

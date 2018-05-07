package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {


    }

    Movie[] movies = MoviesArray.findAll();
    Input input = new Input();  // Create an input object to access the Input class

    public String menuChoices() {
        input.getString("Greetings! What would you like to do today?"); // Greet the user

        int answer = input.getInt("1. See all movies\n2. Select a specific category\n3. Exit"); // Prompt user for the 1st 3 part menu

        switch (answer){
            case 1:           // If choose see all movies, call iterateAllMovies method to display them to the user
                System.out.println(iterateAllMovies());
                break;
            case 2:          // Call the Genre list/method
                System.out.println("Movies");
                break;
            case 3:         // If user chooses to exit, leave the application
                System.out.println("Thanks, come again!");
                break;
            default:        // Default - if user chooses something besides 1-3 uses recursion to call menuChoices again
                System.out.println("Oops, not a valid choice.\nPlease try again:");
                return menuChoices();
        }
        String yep = "Thanks for playing today."; // Thanks user for trying
        return yep;
    }

    public String iterateAllMovies(){  // Iterate through the movies array to display all moves & their categories
        for (Movie movie: movies){
            System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
        }
        String end = "End of List";
        return end;
    }

    public String returnCategories() {
        input.getString("Greetings! What genre are you interested in?"); // Prompt user for genre

        int answer = input.getInt("1. Drama\n2. Musical\n3. Sci-fi\n4. Horror\n\n5. Comedy\n6. Animated");  // List choices 1-6
        switch (answer){
            case 1:
                String input1 = "Drama";
                for (Movie movie: movies){
                    if (input1.equalsIgnoreCase(movie.getCategory())){
                        System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
                    }
                }
                break;
            case 2:
                String input2 = "Musical";
                for (Movie movie: movies){
                    if (input2.equalsIgnoreCase(movie.getCategory())){
                        System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
                    }
                }
                break;
            case 3:
                String input3 = "Scifi";
                for (Movie movie: movies){
                    if (input3.equalsIgnoreCase(movie.getCategory())){
                        System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
                    }
                }
                break;
            case 4:
                String input4 = "Horror";
                for (Movie movie: movies){
                    if (input4.equalsIgnoreCase(movie.getCategory())){
                        System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
                    }
                }
                break;
            case 5:
                String input5 = "Comedy";
                for (Movie movie: movies){
                    if (input5.equalsIgnoreCase(movie.getCategory())){
                        System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
                    }
                }
                break;
            case 6:
                String input6 = "Animated";
                for (Movie movie: movies){
                    if (input6.equalsIgnoreCase(movie.getCategory())){
                        System.out.println("Title: " + movie.getName() + ", Genre: " + movie.getCategory());
                    }
                }
                break;
            default:
                System.out.println("Incorrect number entered. Please try again.");
                return returnCategories();
        }
        String end = "End of List";
        return end;
    }
}

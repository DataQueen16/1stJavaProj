package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setCategory(String category) {
        return this.category = category;
    }

    public String getCategory() {
        return category;
    }
}

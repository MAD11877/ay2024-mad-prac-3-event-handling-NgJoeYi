package sg.edu.np.mad.madpractical3;

import java.util.Random;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    // Constructor with id parameter
    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    // Method to generate a random ID
    public static int generateRandomId() {
        // Generate a random integer between 1 and 10000
        Random random = new Random();
        return random.nextInt(10000) + 1;
    }
}

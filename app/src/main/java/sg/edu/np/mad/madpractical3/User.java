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


}

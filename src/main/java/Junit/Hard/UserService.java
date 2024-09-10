package Junit.Hard;

public class UserService {
    public User getUserById(int id) {
        // Simulate database interaction
        UserDatabase userDatabase = new UserDatabase();
        return userDatabase.findUserById(id);
    }
}

class UserDatabase {
    public User findUserById(int id) {
        return new User(id, "John Doe");
    }
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
}


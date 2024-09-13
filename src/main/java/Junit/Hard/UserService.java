package Junit.Hard;

public class UserService {
    private UserDatabase userDatabase;

    // Constructor injection
    public UserService(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    // Setter for dependency injection
//    public void setUserDatabase(UserDatabase userDatabase) {
//        this.userDatabase = userDatabase;
//    }

    public User getUserById(int id) {
        return userDatabase.findUserById(id);
    }
}

class  UserDatabase {
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

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


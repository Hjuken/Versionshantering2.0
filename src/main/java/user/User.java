package user;

public class User {

    //private datatype attributeName
    //private int number;
    private String username;
    private String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setUserName(String newUsername) {

        this.username = newUsername;
    }
}

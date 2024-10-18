package testuser;

import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {

    @Test
    public void testUsername() {
        //Skapa ett objekt av klassen User
        User myUser = new User("henryviii", "password");

        String myUsername = myUser.getUsername();

        assertEquals("henryviii", myUsername);

    }
    @Test
    public void testChangeUserName(){
        User myUser = new User("henryviii", "password");
        myUser.setUserName("henry10");
        String updateUsername = myUser.getUsername();
        assertEquals("henry10",updateUsername);
    }

    @Test
    public void testPassword() {
        //Skapa ett objekt av klassen User
        User myUser = new User("username", "lollipopp");

        String myPassword = myUser.getPassword();

        assertEquals("lollipopp", myPassword);

    }


}

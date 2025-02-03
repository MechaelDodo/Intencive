package ru.aston.adod_mu.task1;

import ru.aston.odod_mu.task1.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private User user = new User(26, "Misha", "Odod");

    @Test
    public void getSourNameTest(){
        String result =  this.user.getSourName();
        assertEquals("Odod", result);
    }
}

package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    void test1(){

        //Given
        User user = new User("Giovanni", "Gatto", "ggatto@catsyndicate.com");

        //When
        String useremail = user.getEmail();

        //Then
        assertEquals("ggatto@catsyndicate.com", useremail);
    }

    @Test
    void test2(){

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new User("Giovanni", "Gatto", "ggatto.catsyndicate.com");
        });

        assertEquals("Nem megfelelő e-mail cím!", ex.getMessage());
    }
}

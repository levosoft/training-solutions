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
        String fullname = user.getFullName();

        //Then
        assertEquals("Giovanni Gatto", fullname);
    }

    @Test
    void test2(){

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new User("Giovanni", "Gatto", "ggatto.catsyndicate.com");
        });

        assertEquals("Nem megfelelő e-mail cím!", ex.getMessage());
    }

    @Test
    void test3(){

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new User("Giovanni", "Gatto", "ggatto@catsyndicatecom");
        });

        assertEquals("Nem megfelelő e-mail cím!", ex.getMessage());
    }

}

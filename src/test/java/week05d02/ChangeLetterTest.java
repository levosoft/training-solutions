package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    void test1(){
        //Given
        ChangeLetter cl = new ChangeLetter();

        //When
        String testedText = cl.changeVowels("Geronimo");

        //Then
        assertEquals("G*r*n*m*", testedText);

    }

    @Test
    void test2(){
        //Given
        ChangeLetter cl = new ChangeLetter();

        //When
        String testedText = cl.changeVowels("Eleonora Albright");

        //Then
        assertEquals("*l**n*r* *lbr*ght", testedText);

    }
}

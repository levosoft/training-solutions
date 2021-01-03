package week0801;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void test1(){

        Position defaultPosition = new Position(0,0);
        Robot robot = new Robot(defaultPosition);

        Position expectedPosition = robot.move("FFJJ");

        assertEquals(expectedPosition.getX(), 2);
        assertEquals(expectedPosition.getY(), 2);

    }

    @Test
    public void test2(){

        Position defaultPosition = new Position(0,0);
        Robot robot = new Robot(defaultPosition);

        Position expectedPosition = robot.move("FFBBBJLLLJJJ");

        assertEquals(expectedPosition.getX(), 1);
        assertEquals(expectedPosition.getY(), -1);

    }
}

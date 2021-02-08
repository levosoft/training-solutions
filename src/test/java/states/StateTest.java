package states;

import ioreader.states.State;
import ioreader.states.StateRegister;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {

    @Test
    public void test1(){

        State state = new State("Wyoming", "Cheyenne");

        assertEquals("Wyoming", state.getStateName());
        assertEquals("Cheyenne", state.getCapital());
    }

    @Test
    public void test2(){

        StateRegister sr = new StateRegister();
        sr.readStatesfromFile("stateregister.txt");

        assertEquals("Cheyenne", sr.findCapitalByStateName("Wyoming"));

    }

    @Test
    public void test3(){

        StateRegister sr = new StateRegister();
        sr.readStatesfromFile("stateregister.txt");

        assertEquals("Sacramento", sr.findCapitalByStateName("Kalifornia"));

    }
}

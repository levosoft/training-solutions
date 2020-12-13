package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BugetTest {

    @Test
    void test1(){
        Item item1 = new Item(470, 1,"Staropramen");
        Item item2 = new Item(290, 2,"Borsodi");
        Item item3 = new Item(490, 2,"Pilsner Urquell");
        Item item4 = new Item(420, 3,"Heineken");
        Item item5 = new Item(690, 4,"Hoegaarden");
        Item item6 = new Item(380, 4,"Löwenbrau");

        List<Item> testList = Arrays.asList(item1, item2, item3, item4, item5, item6);
        Budget testBudget = new Budget(testList);

        int testResult = testBudget.getItemsByMonth(4).size();

        //A lista méretét (a tartalmazott Item-ek számát) tesztelem
        assertEquals(2, testResult);
    }

    @Test
    void test2(){
        Item item1 = new Item(470, 1,"Staropramen");
        Item item2 = new Item(290, 2,"Borsodi");
        Item item3 = new Item(490, 2,"Pilsner Urquell");
        Item item4 = new Item(420, 3,"Heineken");
        Item item5 = new Item(690, 4,"Hoegaarden");
        Item item6 = new Item(380, 4,"Löwenbrau");

        List<Item> testList = Arrays.asList(item1, item2, item3, item4, item5, item6);
        Budget testBudget = new Budget(testList);

        int testResult = testBudget.getItemsByMonth(3).size();

        //A lista méretét (a tartalmazott Item-ek számát) tesztelem
        assertEquals(1, testResult);
    }
}

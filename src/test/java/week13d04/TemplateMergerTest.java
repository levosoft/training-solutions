package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

public class TemplateMergerTest {

    @Test
    public void test1(){

        TemplateMerger tm = new TemplateMerger();

        List<Employee> employees = List.of(new Employee("Kevin McAllister", "1981"), new Employee("Marty McFly", "1970"));
        Path file = Path.of("employeesnames.txt");

        System.out.println(tm.merge(file, employees));

    }

}

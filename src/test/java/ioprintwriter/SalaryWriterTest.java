package ioprintwriter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SalaryWriterTest {

    @Test
    public void test1(){
        SalaryWriter sw = new SalaryWriter(Arrays.asList("Dr. Alban", "Mr. LovaLova", "Mrs. Robinson", "Donald Duck"));
    }
}

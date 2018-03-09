package dk.cphbusiness.junitparameterizeddemo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest {

    Calculator c = new Calculator();

    private int expected, value1, value2;

    @Parameterized.Parameters
    public static Collection getTestParameters() {
        return Arrays.asList(new Object[][]{
            {3, 2, 1}, {2, 1, 1}, {1, 1, 0}});
    }

    //constructor uses @Parameters
    public CalculatorTest(int n1, int n2, int n3) {
        expected = n1;
        value1 = n2;
        value2 = n3;
    }

    @Test
    public void testSum() {
        int res = c.sum(value1, value2);
        assertEquals(expected, res);
    }

}

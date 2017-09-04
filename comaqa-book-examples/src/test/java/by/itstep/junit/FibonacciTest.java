package by.itstep.junit;

import com.googlecode.junittoolbox.ParallelParameterized;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {
    private long input;
    private long expected;
    FibonacciProgram fibonacciProgram;

    @Parameters
    public static List data() {
        return Arrays.asList(new Integer[][]{{-1, -1} ,{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}});
    }

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Before Class");
    }

    public FibonacciTest(Integer input, Integer expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        fibonacciProgram = new FibonacciProgram();
        System.out.println("Before Test");
    }

    @After
    public void tearDown() throws Exception {
        fibonacciProgram = null;
        System.out.println("After Test");
    }


    @Test
    public void FibonacciTest() {
        System.out.println("Input: " + input + ". Expected: " + expected);
        assertEquals(expected, fibonacciProgram.computeFibonacci(input));
    }
}

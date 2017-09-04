package by.itstep.junit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SuiteTest1 {

    private JunitDemonstrateProgram target;

    @Before
    public void setup() {
        target = new JunitDemonstrateProgram();
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithExceptionTest() {
        target.calculateDivideByZero();;
    }

    @Ignore("Not Ready to Run")
    @Test
    public void notImplementedTest() {
        System.out.println("Method is not ready yet");
    }

    @Test(timeout = 1000)
    public void runForever() {
        target.infiniteLoop();
    }
}

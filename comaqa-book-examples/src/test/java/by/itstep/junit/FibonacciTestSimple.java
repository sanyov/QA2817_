package by.itstep.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTestSimple {

    FibonacciProgram fibonacciProgram = new FibonacciProgram();

    @Test
    public void FibonacciTest() {
        System.out.println("Input: " + 10 + ". Expected: " + 13);
        assertEquals(5, fibonacciProgram.computeFibonacci(16));
    }

    @Test
    public void FibonacciTest2() {
        System.out.println("Input: " + (-3) + ". Expected: " + 2);
        assertEquals(2, fibonacciProgram.computeFibonacci(-3));
    }
}

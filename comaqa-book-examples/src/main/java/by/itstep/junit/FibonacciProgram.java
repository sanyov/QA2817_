package by.itstep.junit;

public class FibonacciProgram {

    public long computeFibonacci(long number) {
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return computeFibonacci(number - 1) + computeFibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        FibonacciProgram fibonacciProgram = new FibonacciProgram();

        for (int counter = 0; counter <= 10; counter++) {
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacciProgram.computeFibonacci(counter));
        }
    }
}

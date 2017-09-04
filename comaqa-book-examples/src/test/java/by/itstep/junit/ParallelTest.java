package by.itstep.junit;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelTest {
    @Test
    public void test() {
        Class[] cls = {ParallelTest1.class, ParallelTest2.class};

        //Parallel among classes
        JUnitCore.runClasses(ParallelComputer.classes(), cls);

        //Parallel among methods in a class
        JUnitCore.runClasses(ParallelComputer.methods(), cls);

        //Parallel all methods in all classes
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }

    public static class ParallelTest1 {
        @Test
        public void a() {
            System.out.println("ParallelTest1.a");
        }

        @Test
        public void b() {
            System.out.println("ParallelTest1.b");
        }
    }

    public static class ParallelTest2 {
        @Test
        public void a() {
            System.out.println("ParallelTest2.a");
        }

        @Test
        public void b() {
            System.out.println("ParallelTest2.b");
        }
    }
}

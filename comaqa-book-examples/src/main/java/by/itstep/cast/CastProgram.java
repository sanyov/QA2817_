package by.itstep.cast;

public class CastProgram {

    public static void main(String[] args) {

        double a = 17.6;
        double b = 14.8;

        int c = (int)(a + b);
        int d = (int) a + (int) b;

        System.out.print("c = " + c);
        System.out.print("d = " + d);
    }
}

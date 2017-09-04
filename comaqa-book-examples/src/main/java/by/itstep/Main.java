package by.itstep;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int rand(int inputStart, int inputFinish) {
        if (inputStart > inputFinish) {
            return (int) (Math.random() * (inputStart - inputFinish + 1) + inputFinish);
        } else {
            return (int) (Math.random() * (inputFinish - inputStart + 1) + inputStart);
        }
    }

    public static void prin(int[] mass, int i) {
        System.out.print(mass[i] + " ");
    }

    public static void arraySort(int[] mass) {
        Arrays.sort(mass);
        System.out.print(mass.toString() + " ");

    }

    /**

     *
     * @param mass not null array...
     *
     * @throws IllegalArgumentException if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *     if {@code fromIndex < 0} or {@code toIndex > a.length}
     */
    public static void logic(int[] mass, int inputStart, int inputFinish) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand(inputStart, inputFinish);
            System.out.print(mass[i] + " ");
            if (i == mass.length - 1) {
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите начальноезначение массивов a= ");
        int inputStart = scan.nextInt();
        System.out.print("Введите начальноезначение массивов a= ");
        int inputFinish = scan.nextInt();

        int[] mass1 = new int[10];
        rand(inputStart, inputFinish);
        logic(mass1, inputStart, inputFinish);
        arraySort(mass1);

        System.out.println(mass1);

        int[] mass2 = new int[10];
        logic(mass2, inputStart, inputFinish);
        arraySort(mass2);

        int[] mass3 = new int[10];
        logic(mass3, inputStart, inputFinish);
        arraySort(mass3);

        ArrayUtils.reverse(mass3);
    }

}



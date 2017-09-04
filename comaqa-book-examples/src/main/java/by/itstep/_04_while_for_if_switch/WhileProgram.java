package by.itstep._04_while_for_if_switch;

public class WhileProgram {
    public static void main(String[] args) {
        // WHILE
        int count = 1;
        while (count < 11) {
            System.out.println(count);
            ++count;
        }

        // FOR
        for (int i = 1; i < 11; ++i) {
            System.out.println(i);
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println(item);
        }

        // IF
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        //SWITCH
        int a = 10;

        switch (a) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Out of range");
                break;
        }
    }
}

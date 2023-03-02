package homework_2;

import java.util.Scanner;

/**
 * Homework 2.
 * @author Ruben
 */
public class Methods {
    /**
     * Task 1.
     * @param a
     * @param b
     * @return number 0
     */
    public static int met1(int a, int b) {
        return 0;
    }

    /**
     * Task 2.
     */
    public static void met2() {

    }

    /**
     * Task 3.
     * @param a
     * @param b
     */
    public static void met3(boolean a, boolean b) {
        System.out.print("Hello World");
    }

    /**
     * Task 4.
     * @param a
     * @return param
     */
    public static char met4(char a) {
        return a;
    }

    /**
     * Task 5.
     * @param a
     * @param b
     * @return one of params
     */
    public static float met5(float a, float b) {
        return a;
    }

    /**
     * Task 6.
     */
    public static void met6() {
        int count = 0;
        if (count < 2) {
            count++;
            met6();
        }
    }

    /**
     * Working method:)
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        met1(sc.nextInt(), sc.nextInt());
        met2();
        met3(sc.hasNextBoolean(), sc.hasNextBoolean());
        met4(sc.next().charAt(0));
        met5(sc.nextFloat(), sc.nextFloat());
        met6();
    }
}

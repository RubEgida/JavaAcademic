package homework3;

import java.util.Scanner;

/**
 * Homework 3.
 * @author Ruben
 */
public class Statements {
    /**
     * A call to the given methods.
     * @param args
     */
    public static void main(String[] args) {
        //Object creating.
        Statements a = new Statements();
        //Methods calling.
        a.evenOrOdd(354);
        System.out.println(' ');
        a.positiveOrNegative(34);
        System.out.println(' ');
        a.review(17);
        System.out.println(' ');
        a.theNumberIsDivisibleByFiveAndSeven(35);
        System.out.println(' ');
        a.threeDigitNumber(274);
        System.out.println(' ');
        a.circle(4, 3);
        System.out.println(' ');
        a.largestNumber(3, 5, 7);
        System.out.println(' ');
        a.leapYear(2020);
        System.out.println(' ');
        a.printNumbers();
        System.out.println('\n');
        a.firstNum(3123);
        System.out.println(' ');
        a.twoNumbersAddition();
        System.out.println('\n');
        a.square();
        System.out.println(' ');
        a.takeNumber();
        System.out.println(' ');
        a.numbersProduct(54);
        System.out.println(' ');
        a.arithmeticMean(12);
        System.out.println(' ');
        a.fiveDigitsNumber(36782);

    }
    /**
     * Check x is even or odd.Task 1.
     * @param x
     */
    public void evenOrOdd(int x) {

        if (x % 2 == 0) {
            System.out.println("x is even number.");
        } else {
            System.out.println("x is odd number.");
        }

    }

    /**
     * Check x is positive or negative.Task 2.
     * @param x
     */
    public void positiveOrNegative(int x) {

        if (x > 0) {
            System.out.println("x is a positive number.");
        } else if (x < 0){
            System.out.println("x is a negative number.");
        } else {
            System.out.println("x is a zero.");
        }

    }

    /**
     * Check x is in the given range or not.Task 3.
     * @param x
     */
    public void review(int x) {

        if (x > 5 && x < 8 || x > 15 && x < 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    /**
     * Check x is divisible by 5 and 7 with no remainder.Task 4.
     * @param x
     */
    public void theNumberIsDivisibleByFiveAndSeven(int x){

        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println("x is divisible by 5 & 7.");
        } else {
            System.out.println("x = " + x);
        }

    }

    /**
     * Check if x is a three-digit number, the second digit is 7 or not.Task 5.
     * @param x
     */
    public void threeDigitNumber(int x) {

        if (x > 99 && x < 1000 && x % 100 / 10 == 7) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    /**
     * Check with (x,y) coordinates point in K(0,0)(R = 5) circle or no.Task 6.
     * @param x
     * @param y
     */
    public void circle(int x, int y) {

        int kx0 = 0;
        int ky0 = 0;
        int kr = 5;

        if (Math.pow(x - kx0, 2) + Math.pow(y - ky0, 2) <= Math.pow(kr, 2)) {
            System.out.println("A point with coordinates (x,y) is in region K.");
        } else {
            System.out.println("A point with coordinates (x,y) is not in region K.");
        }

    }

    /**
     * Find the largest of the three numbers.Task 7.
     * @param x
     * @param y
     * @param z
     */
    public void largestNumber(int x, int y, int z) {

        if (x > y && x > z) {
            System.out.println("The largest number is x.");
        } else if (y > x && y > z) {
            System.out.println("The largest number is y.");
        } else if (z > x && z > y) {
            System.out.println("The largest number is z.");
        } else {
            System.out.println("Two or three of the numbers are equal to each other.");
        }

    }

    /**
     * Check this x year is leap or no.Task 8.
     * @param x
     */
    public void leapYear(int x) {

        if (x % 4 == 0 && x % 400 == 0 || x % 4 == 0 && x % 100 != 0) {
            System.out.println(x + " is a leap year. ");
        } else {
            System.out.println(x + " is not a leap year.");
        }

    }

    /**
     * What to add to print 8.Task 9.
     */
    public void loop1() {

        int x = 0;
        while (x++ < 10) {
            x += 7;
            break;
        }
        System.out.println(x);

    }

    /**
     * Find the error and fix it.Task 10.
     */
    public void loop2() {

        int x1 = 0;
        int y = 5;
        while (x1 < 10) {
            x1++; //No y++.
        }

        int x2 = 15;
        while (x2 > 10) {
            x2--; // No x = x--.
        }

    }

    /**
     * Method that prints the numbers 1 to 200 in the console.Task 11.
     */
    public void printNumbers() {

        int x = 1;

        while (x > 0 && x <= 200) {
            System.out.print(x + " ");
            x++;
        }

    }

    /**
     * Method that prints the first digit of the x in the console.Task 12.
     * @param x
     */
    public void firstNum(int x) {

        if (x >= 10){
            while (x >= 10) {
                x /= 10;
                if (x < 10) {
                    System.out.println(x);
                }
            }
        } else if (x <= -10) {
            while (x <= -10) {
                x /= 10;
                if (x > -10) {
                    System.out.println(-x);
                }
            }
        } else if (x > -10 && x < 0) {
            System.out.println(-x);
        } else {
            System.out.println(x);
        }

    }

    /**
     * As long as x < 5 and y < 10 print x+y the phrase(x=1, y=0).Task 13.
     */
    public void twoNumbersAddition() {

        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.print(x + y + " ");
            x++;
            y++;
        }

    }

    /**
     * With * symbol print in the console square.Task 14.
     */
    public void square() {

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

    /**
     * Which receives the number N from the console and calculates the sum of [1-N] all divisible by 5 numbers.
     * Task 15.
     */
    public void takeNumber() {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++){
            if (i % 5 == 0){
                sum += i;
            }
        }

        System.out.println(sum);

    }

    /**
     * Calculates the product of all two-digit even numbers [1-N].Task 16.
     * @param N
     */
    public void numbersProduct(int N) {

        double sum = 1;
        for (int i = 1; i <= N; i++){
            if (i > 9 && i < 100 && i % 2 == 0){
                sum *= i;
            }
        }

        System.out.println(sum);

    }

    /**
     * [1-N] finds the largest and smallest elements in consecutive numbers and calculates their arithmetic mean.
     * Task 17.
     * @param N
     */
    public void arithmeticMean(int N) {

        int first = 1;
        double mean = (double) (first + N) / 2;
        if (N > first) {
            System.out.println(mean);
        } else {
            System.out.println("N must be greater than 1.");
        }

    }

    /**
     * Receives a 5-digit integer and calculates the sum of the digits of that number.Task 18.
     * @param x
     */
    public void fiveDigitsNumber(int x) {

        if (x > 9999 && x < 100000) {
            System.out.println(x / 10000 + x % 10000 / 1000 + x % 1000 / 100 + x % 100 / 10 + x % 10);
        } else {
            System.out.println("x must be a five-digit number.");
        }

    }
}

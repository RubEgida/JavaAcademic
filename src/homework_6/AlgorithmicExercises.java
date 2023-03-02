package homework_6;

import java.util.Scanner;

/**
 * Homework 6.
 * @author Ruben
 */
public class AlgorithmicExercises {
    /**
     * Print multiplication tabla for given number.Task 1.
     * @param positiveNum given number
     */
    public static void positiveIntegerNumMultiplicationTable(int positiveNum) {
        for (int i = 0; i < 10; i++) {
            System.out.println(positiveNum + " * " + (i + 1) + " = " + (positiveNum * (i + 1)));
        }
    }

    /**
     * Find the value of first number raced power at second.Task 2.
     * @param num1 given first number
     * @param num2 given second number
     * @return value first raced power at second
     */
     public static int sqrTwoNumbers(int num1, int num2) {
        int racedPower = num1;
         for (int i = 1; i < num2; i++) {
             racedPower *= num1;
         }
         return racedPower;
     }

    /**
     * Reverse the given number digits.Task 3.
     * @param num given number
     */
     public static void digitReversed(int num) {
         System.out.print("Your number reversed : ");
         for (int i = num; i > 0; i /= 10) {
             System.out.print(i % 10);
         }
     }

    /**
     * Check given number is prime or no.Task 4.
     * @param num given number
     */
     public static void primeNum(int num) {
         if (homework_5.AlgorithmicExercises.isPrime(num)) {
             System.out.println("Your number is prime.");
         } else {
             System.out.println("Your number is not prime.");
         }
     }

    /**
     * Take two numbers and print sum of them.After work more time if user want.Task 5.
     */
     public static void twoNumbers() {
         String answer;
         do {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter first integer number : ");
             int num1 = sc.nextInt();
             System.out.print("Enter second integer number : ");
             int num2 = sc.nextInt();
             System.out.println("Your number sum is " + (num1 + num2));
             System.out.print("You want worked this program more time? For Yes enter yes : For No enter no : ");
             answer = sc.next();
         } while (answer.equals("yes"));
     }

    /**
     * For checking entered numbers.Task 6.
     * @return howe mach numbers enter user
     */
     public static String enteredNumbers() {
         Scanner sc = new Scanner(System.in);
         String answer;
         int negativeNums = 0;
         int positiveNums = 0;
         int zeros = 0;
         do {
             System.out.print("Enter number : ");
             int num = sc.nextInt();
             if (num < 0 ) {
                 negativeNums++;
             } else if (num == 0) {
                 zeros++;
             } else {
                 positiveNums++;
             }
             System.out.print("Do you want enter more number? For Yes/enter yes : ");
             answer = sc.next();
         } while (answer.equals("yes"));


         return "You enter " + negativeNums + " negative numbers, " + zeros + " time number zero and "
                 + positiveNums + " positive numbers!";
     }

    /**
     * Find the largest and smaller entered numbers.Task 7.
     * @return largest and smaller numbers
     */
     public static String enteredLargestSmaller() {
         Scanner sc = new Scanner(System.in);
         String answer;
         int smaller = 0;
         int largest = 0;
         int count = 0;
         do {
             System.out.print("Enter number : ");
             int num = sc.nextInt();
             while (count <= 0) {
                 smaller = num;
                 count++;
             }
             if (num < smaller) {
                 smaller = num;
             } else if (num > largest) {
                 largest = num;
             }
             System.out.print("Do you want enter more number? For Yes/enter yes : ");
             answer = sc.next();
         } while (answer.equals("yes"));

         return "Largest entered number is " + largest + " and smaller is " + smaller;
     }

    /**
     * Find the Armstrong numbers at 1 of 500.Task 8;
     */
    public static void armstrongNumbers() {
         int tempNumber, digit, digitCubeSum;

         for (int inputArmstrongNumber = 0; inputArmstrongNumber < 500; inputArmstrongNumber++) {
             tempNumber = inputArmstrongNumber;
             digitCubeSum = 0;
             while (tempNumber != 0) {

                 digit = tempNumber % 10;

                 digitCubeSum = digitCubeSum + digit * digit * digit;

                 tempNumber /= 10;

             }

             if (digitCubeSum == inputArmstrongNumber) {
                 System.out.println(inputArmstrongNumber + " is an Armstrong Number");
             }
         }
     }

    /**
     * Print sum at 1/1 of 1/n.Task 9.
     * @param n given number
     */
     public static void numbersSum(int n) {
        double sum = 0;
         for (int i = 1; i < n; i++) sum +=(double) 1/i;
         System.out.print(sum);
     }

    /**
     * Find natural logarithm.Task 10.
     * @param positiveIntegerNum given number
     */
     public static void naturalLogarithm2(int positiveIntegerNum) {
         double sum = 0;
         for (int i = 1; i <= positiveIntegerNum; i++) {
             if (i % 2 != 0) {
                 sum += (double) 1/i;
             } else  {
                 sum -= (double) 1/i;
             }
         }
         System.out.println(sum);
     }

    /**
     * Compare random number and given number and finish if the both is same.Task 11.
     * @param number given number
     */
     public static void userRandom(int number) {
         Scanner sc = new Scanner(System.in);
         int b = 10;
         int random = (int) (Math.random() * b);
         while (random != number) {
             if (number > random) {
                 System.out.println("Random number is " + random);
                 System.out.println("Too high, try again.");
                 random = (int) (Math.random() * b);
                 System.out.print("Enter another number at 0 of 10 : ");
                 number = sc.nextInt();
             } else {
                 System.out.println("Random number is " + random);
                 System.out.println("Too low, try again.");
                 random = (int) (Math.random() * b);
                 System.out.print("Enter another number at 0 of 10 : ");
                 number = sc.nextInt();
             }
         }
         System.out.println("Random number is " + random);
         System.out.println("You got it!!!");

     }

    /**
     * Pick printing.Task 12.
     * @param count size for pick
     */
     public static void printing12_i(int count) {
         for (int i = 0; i < count; i++) {
             for (int j = 0; j < count; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
    /**
     * Pick printing.Task 12.
     * @param count size for pick
     */
     public static void printing12_ii(int count) {
         for (int i = 1; i <= count; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
    /**
     * Pick printing.Task 12.
     * @param count size for pick
     */
     public static void printing12_iii(int count) {
         for (int i = 1; i <= count; i++) {
             for (int j = count; j > i; j--) {
                 System.out.print(" ");
             }
             for (int j = 0; j < i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
    /**
     * Pick printing.Task 12.
     * @param count size for pick
     */
     public static void printing12_iv(int count) {
         for (int i = 1; i <= count; i++) {
             for (int j = count; j > i; j--) {
                 System.out.print(" ");
             }
             for (int j = 0; j < i; j++) {
                 System.out.print("*");
             }
             for (int j = 1; j < i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
    /**
     * Pick printing.Task 12.
     * @param count size for pick
     */
     public static void printing12_v(int count) {
         for (int i = 1; i <= count; i++) {
             for (int j = count; j > i; j--) {
                 System.out.print(" ");
             }
             for (int j = 0; j < i; j++) {
                 System.out.print(i);
             }
             for (int j = 1; j < i; j++) {
                 System.out.print(i);
             }
             System.out.println();
         }
     }
    /**
     * Pick printing.Task 12.
     * @param count size for pick
     */
     public static void printing12_vi(int count) {
         int num;
         for (int i = 1; i <= count; i++) {
             num = i;
             for (int j = count; j > i; j--) {
                 System.out.print(" ");
             }
             for (int j = 0; j < i; j++) {
                 System.out.print(num--);
             }
             for (int j = 1; j < i; j++) {
                 System.out.print(++num + 1);
             }
             System.out.println();
         }
     }

    /**
     * Compute sin for given x with series Tailor.Task 13.
     * @param x number in degree
     * @param series number for series Tailor
     * @return sinX
     */
     public static double sinForGivenNum(double x, int series) {
         int sign = 1;

         int f = 1;
         int m = 1;

         x = x * 3.14 / 180;

         double d = x;
         double sin = 0;

          for (int i = 0; i < series; i++) {
              sin = sin + sign * (d / f);

              d = d * x * x;

              f = f * (m +1) * (m + 2);
              m += 2;

              sign = -sign;
          }
          return sin;
     }

    /**
     * Compute cos for given x with series.Task 14.
     * @param x number in degree
     * @param n number for series
     * @return cosX
     */
     public static double cosForGivenNum(double x, int n) {
         int sign = 1;

         int f = 1;
         int m = 0;

         x = x * 3.14 / 180;

         double d = 1;
         double cos = 0;

         for (int i = 0; i < n; i++) {
             cos = cos + sign * (d / f);

             d = d * x * x;

             f = f * (m + 1) * (m + 2);
             m+=2;

             sign = -sign;
         }

         return cos;
     }
    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        positiveIntegerNumMultiplicationTable(sc.nextInt());

        System.out.print("Enter two numbers : ");
        System.out.println("First raced to power second : " + sqrTwoNumbers(sc.nextInt(), sc.nextInt()));

        System.out.print("Enter integer number : ");
        digitReversed(sc.nextInt());

        System.out.print("Enter positive integer number : ");
        primeNum(sc.nextInt());

        twoNumbers();

        System.out.println(enteredNumbers());

        System.out.println(enteredLargestSmaller());

        armstrongNumbers();

        System.out.print("Enter number : ");
        numbersSum(sc.nextInt());

        System.out.print("Enter integer positive number : ");
        naturalLogarithm2(sc.nextInt());

        System.out.print("Enter number at 0 of 10 : ");
        userRandom(sc.nextInt());

        System.out.print("Enter size for pick : ");
        printing12_i(sc.nextInt());

        System.out.print("Enter size for pick : ");
        printing12_ii(sc.nextInt());

        System.out.print("Enter size for pick : ");
        printing12_iii(sc.nextInt());

        System.out.print("Enter size for pick : ");
        printing12_iv(sc.nextInt());

        System.out.print("Enter size for pick : ");
        printing12_v(sc.nextInt());

        System.out.print("Enter size for pick : ");
        printing12_vi(sc.nextInt());

        System.out.print("Enter x number for sin and positive integer number : ");
        System.out.println(sinForGivenNum(sc.nextDouble(), sc.nextInt()));

        System.out.print("Enter x number for cos and positive integer number : ");
        System.out.println(cosForGivenNum(sc.nextDouble(), sc.nextInt()));
    }
}

package homework_5;

import java.util.Random;

/**
 * Homework 5.
 *  @author Ruben
 */
public class AlgorithmicExercises {
    /**
     * Calculate given z kg is valid at (x * 1kg) + (y * 5kg).Task 1.
     * @param x how many small packs
     * @param y how many large packs
     * @param z how many kgs
     * @return that is true or false
     */
    public static boolean riceCalculate(int x, int y, int z) {
        int smallPack = 1;
        int largePack = 5;
        boolean b = true;
        if (x*smallPack + y*largePack == z) {
            return b;
        } else {
            return !b;
        }
    }

    /**
     * Find the largest prime factor for given number.Task 2.
     * @param givenNum .
     * @return largest prime number
     */
    public static int largestPrimeNumber(int givenNum) {
        int largest = 2;
        int i = 2;
        while (i <= givenNum) {
            if (givenNum % i == 0) {
                largest = i;
            }
            i = nextPrime(i);
        }
        return largest;
    }

    /**
     * Find the next prime factor.
     * @param num .
     * @return prime number
     */
    public static int nextPrime(int num) {
        if (isPrime(++num)) {
            return num;
        } else {
            return nextPrime(num);
        }
    }

    /**
     * Analise given number prime or no.
     * @param n .
     * @return num is prime or no
     */
    public static boolean isPrime(int n) {
        int m = n / 2;
        if(n == 0 || n == 1){
            return false;
        }else{
            for(int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Generate the random number and checked is odd or even.Task 3.
     * @return odd or even
     */
    public static String evenOrOdd() {
        int b = 100;
        int randomNum = (int) (Math.random() * b);
        System.out.println("randomNum = " + randomNum);
        if(randomNum % 2 == 0) {
            return "Number is even.";
        }
        return "Number is odd.";
    }

    /**
     * Find the largest and smaller numbers at 10 random numbers.Task 4.
     * @return largest and smallest numbers
     */
    public static String  randomLargestAndSmallest() {
        Random r = new Random();
        int upperbound = 100;
        int count = 0;
        int smaller = 0;
        int largest = 0;
        int random;

        while (count < 10) {
            random = r.nextInt(upperbound);
            System.out.println((count + 1) + " random number is " + random);
            if (smaller == 0) {
                smaller = random;
            }
            if (random < smaller) {
                smaller = random;
            } else if (random > largest) {
                largest = random;
            }
            count++;
        }
        return "Smallest at 10 random numbers is " + smaller + " and largest is " + largest;
    }

    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        System.out.println(riceCalculate(2, 3, 13));
        System.out.println(largestPrimeNumber(455));
        System.out.println(evenOrOdd());
        System.out.println(randomLargestAndSmallest());
    }
}

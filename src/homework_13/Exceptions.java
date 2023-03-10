package homework_13;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Homework adding.
 * @author Ruben
 */
public class Exceptions {
    /**
     * If user take number 0 program print error message.Task 1.
     * @param param .
     */
    public void reciprocalNum(int param) {
        if(param == 0) {
            throw new ArithmeticException("Can't divide 1 to 0 !!!");
        } else {
            System.out.println(1/param);
        }
    }

    /**
     * If in array not all elems are integer program print error message.Task 2.
     * @param param .
     */
    public void arraySum(String[] param) {
        int sum = 0;
        for (String i : param) {
            sum += parseInt(i);
        }
        System.out.println("Your array elements sum is " + sum);
    }

    /**
     * At two integers if second is zero print error message.Task 3.
     * @param a .
     * @param b .
     */
    public void twoNumbersDividing(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide to 0 !!!");
        } else {
            System.out.println(a/b);
        }
    }

    /**
     * If file not found or invalid print error message.Task 4.
     * @param fileName .
     */
    public void fileName(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * If given num is negative or invalid print error message.Task 5.
     * @param param .
     */
    public void numSQRT(int param) {
        try {
            if (param < 0) {
                throw new IllegalArgumentException("Invalid number");
            }
            double squareRoot = Math.sqrt(param);
            System.out.println("The square root of " + param + " is " + squareRoot);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Good bye");
        }
    }

    /**
     * Program print one of 3 new exceptions.Task 6.
     * @throws Exception1 new ex
     * @throws Exception2 new ex
     * @throws Exception3 new ex
     */
    public void myExceptions() throws Exception1, Exception2, Exception3 {
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 0) {
            throw new Exception1("This is exception 1");
        } else if (randomNumber == 1) {
            throw new Exception2("This is exception 2");
        } else {
            throw new Exception3("This is exception 3");
        }
    }

    /**
     * If user entered age is negative or larger 120 print error message.Task 7.
     * @param age .
     */
    public void userAge(int age) {
        try {
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Invalid age.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * If email address is not valid print error message.Task 8.
     * @param email .
     */
    public void emailAddress(String email) {
        try {
            if (email.charAt(email.length() - 10) == '@') {
                throw new IllegalArgumentException("Not email address.");
            } else if ( email.charAt(email.length() - 8) == '@') {
                throw new IllegalArgumentException("Not email address.");
            } else {
                System.out.println("Email is Valid.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * File don't found print error message.Task 10.
     * @param fileName .
     */
    public void fileLines(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int wordCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
            System.out.println("The file contains " + wordCount + " words.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            System.err.println("Error: Failed to read file.");
        }
    }

    /**
     * If string empty or null print error message.Task 11.
     * @param inputString .
     */
    public void paramOperations(String inputString) {
        try {
            if (inputString == null || inputString.isEmpty()) {
                throw new IllegalArgumentException("Error: Input string is empty or null.");
            }
            // Convert to uppercase
            String upperCaseString = inputString.toUpperCase();
            System.out.println("Uppercase string: " + upperCaseString);
            // Reverse string
            StringBuilder reversedString = new StringBuilder(inputString).reverse();
            System.out.println("Reversed string: " + reversedString);
            // Count vowels
            int vowelCount = 0;
            for (int i = 0; i < inputString.length(); i++) {
                char ch = Character.toLowerCase(inputString.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Working method for test.
     * @param args .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exceptions ex = new Exceptions();

        System.out.print("Enter Integer number >>> ");
        ex.reciprocalNum(sc.nextInt());

        System.out.print("Enter 5 Integer elements for array >>> ");
        ex.arraySum(new String[] {sc.next(), sc.next(), sc.next(), sc.next(), sc.next()});

        System.out.print("Enter two integer numbers >>> ");
        ex.twoNumbersDividing(sc.nextInt(), sc.nextInt());

        System.out.print("Enter file name >>> ");
        ex.fileName(sc.next());

        System.out.print("Enter any number >>> ");
        ex.numSQRT(-7);

        try {
            ex.myExceptions();
        } catch (Exception1 | Exception2 | Exception3 e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter your age >>> ");
        ex.userAge(sc.nextInt());

        System.out.print("Enter your email address(@gmail.com/@mail.ru) >>> ");
        ex.emailAddress(sc.next());

        System.out.print("Enter file name >>> ");
        ex.fileLines(sc.next());

        System.out.print("Enter string line >>> ");
        ex.paramOperations(sc.next());

    }
}

/**
 * New exception class.
 * @author Ruben
 */
class Exception1 extends Exception {
    public Exception1(String message) {
        super(message);
    }
}

/**
 * New exception class.
 * @author Ruben
 */
class Exception2 extends Exception {
    public Exception2(String message) {
        super(message);
    }
}

/**
 * New exception class.
 * @author Ruben
 */
class Exception3 extends Exception {
    public Exception3(String message) {
        super(message);
    }
}

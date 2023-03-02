package homework_10.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Homework 10.
 * @author Ruben
 */
public class StringUtil {
    /**
     * Find String Palindrome or no.
     * @param str param
     * @return Palindrome or no
     */
    public static boolean findPalindrome(String str) {
        int[] wordCounter = new int[52];
        Arrays.fill(wordCounter, 0);
        int asciiValue = 0, oddCount = 0;

        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                asciiValue = (int)c - 65;
                wordCounter[asciiValue]++;
            }else if (c >= 97 && c <= 122) {
                asciiValue = (int)c - 71;
                wordCounter[asciiValue]++;
            }else {
                return false;
            }
        }
        for (int word : wordCounter) {
            if (word % 2 != 0) {
                oddCount++;
            }
            if (oddCount >= 2) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(findPalindrome("ppaattxtr") ? "This String is Palindrome" : "This String is NOT Palindrome");

    }
}

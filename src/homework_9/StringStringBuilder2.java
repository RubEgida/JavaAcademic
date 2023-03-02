package homework_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringStringBuilder2 {
    /**
     * Check the first two chars in line and if then equals given parameters return it.Task 1.
     * @param param given line
     * @return oz if first two chars equals oz
     */
    public String firstTwoCharPrinting(String param) {
        String result = "";
        if (param.length() > 0 && param.charAt(0) == 'o') {
             result += "o";
        }
        if (param.length() > 0 && param.charAt(1) == 'z') {
            result += "z";

        }
        return result;
    }

    /**
     * Check a given line and return count of xx in line.Task 2.
     * @param param .
     * @return how much xx in line
     */
    public String xxInLineCount(String param) {
        int count = 0;
        for (int i = 0; i < param.length() - 1; i++) {
            if (param.charAt(i) == 'x' && param.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return "Count of xx in given line  is " + count;
    }

    /**
     * Check given word and return word is palindrome or no.Task 3.
     * @param param given word
     * @return word is palindrome or no
     */
    public String palindromeWord(String param) {
        if (param.equals(new StringBuilder(param).reverse().toString())) {
            return "This word is palindrome!";
        }
        return "This word is not palindrome!";
    }

    /**
     * Check the given String list and return list of Strings which elems
       have exactly 3 letters and start with the letter 'a'.Task 4.
     * @param param given list
     * @return String list
     */
    public List<String> stringList(List<String> param) {
        List<String> valid = new ArrayList<>();
        for (String a : param) {
            if (a.charAt(0) == 'a' && a.length() == 3) {
                valid.add(a);
            }
        }
        return valid;
    }

    /**
     * Returns a comma-separated string based on a param.
        Each element should be preceded by the letter 'e' if the number
        is even, and preceded by the letter 'o' if the number is odd. Task 5.
     * @param param given list
     * @return line with param elems
     */
    public String oddEven(List<Integer> param) {
        StringBuilder result = new StringBuilder();
        for (Integer a : param) {
            if (a % 2 == 0) {
                result.append("e").append(a).append(",");
            } else {
                result.append("o").append(a).append(",");
            }
        }
        return result.toString();
    }

    /**
     * Decoded Caesar coded text.Task 6.
     * @param cipher text
     * @param shiftingNum num for decoding
     * @return decoded text
     */
    public String cipherOfCaesar(String cipher, int shiftingNum) {
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            char c = cipher.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                decodedMessage.append((char) ((c - base + (26 - shiftingNum)) % 26 + base));
            } else {
                decodedMessage.append(c);
            }
        }

        return decodedMessage.toString();
    }

    /**
     * Find in word longest-palindrome subString and return.Task 7.
     * @param s given word
     * @return longest palindrome subString
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * Check palindrome indexes.Task 7.
     * @param s word
     * @param left word char index
     * @param right word char index
     * @return num
     */
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    /**
     * Task 8.
     * @param str1 param
     * @param str2 param
     * @return longest substring in two strings
     */
    public static String findLCS(String str1, String str2) {
        int pairIndex = -1, pairValue = -1;
        List<Integer> matches = new ArrayList<>();
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        for (int i = 0; i < str1.length(); ) {
            int wc = 1;
            String subStr = str1.substring(i, i + wc);
            for (int j = str2.indexOf(subStr, 0); j <= str2.lastIndexOf(subStr) && j >= 0; ) {
                if (str2.substring(j).length() > wc+1 & subStr.equals(str2.substring(j, j + wc))) {
                    matches.add(j);
                }
                if (str2.indexOf(subStr, 0) == str2.lastIndexOf(subStr)) {
                    break;
                }
                j = str2.indexOf(subStr, ++j);
            }
            outer:
            while (matches.size() > 0) {
                boolean lastLetter = false;
                for (int j = 0; j < matches.size(); j++) {
                    wc++;
                    if ((str1.length() >= i + wc) && (str2.length() >= matches.get(j) + wc)) {
                        subStr = str1.substring(i, i + wc);
                    }else { lastLetter = true; }
                    if (lastLetter || !subStr.equals(str2.substring(matches.get(j), matches.get(j) + wc))) {
                        wc--;
                        if(matches.size() > 1) {
                            matches.remove(j);
                            j--;
                        }else {
                            break outer;
                        }
                    }
                }
            }
            if (pairValue <= wc & matches.size() > 0) {
                pairValue = wc;
                pairIndex = matches.get(0);
                i += pairValue;
                matches.remove(0);
            }else { i++; }
        }
        if (pairIndex == -1) { return "No matches in strings!!!"; }
        else {  return str2.substring(pairIndex, pairIndex+pairValue); }
    }

    /**
     * Find number of common chars between Strings.Task 9.
     * @param first string
     * @param second string
     * @return chars count
     */
    public int numberOfCommonChars(String first, String second) {
        int count = 0;
        if (first.length() > second.length()) {
            String str = first;
            first = second;
            second = str;
        }
        StringBuilder sec = new StringBuilder(second);
        for (int i = 0; i < first.length(); i++) {
            int tmp = sec.indexOf(String.valueOf(first.charAt(i)));
            if (tmp > -1) {
                count++;
                sec.deleteCharAt(tmp);
            }
        }
        return count;
    }

    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        StringStringBuilder2 s = new StringStringBuilder2();

        System.out.println(s.firstTwoCharPrinting("ozymandias"));

        System.out.println(s.xxInLineCount("xxx"));

        System.out.println(s.palindromeWord("anna"));

        System.out.println(s.stringList(new ArrayList<>(Arrays.asList("abv", "asap", "as", "hero"))));

        System.out.println(s.oddEven(new ArrayList<>(Arrays.asList(2, 22, 3, 46, 77))));

        System.out.println(s.cipherOfCaesar("hfresdfdf", 5));

        System.out.println(longestPalindrome("abaerdfdreaasaa"));

        System.out.println("There are " + s.numberOfCommonChars("aaaaa", "aaaaaaa") + " common chars.");

    }
}

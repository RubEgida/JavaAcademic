package homework_8;

import java.util.Scanner;

/**
 * Homework execution.
 * @author Ruben
 */
public class StringStringBuilder {
    /**
     * String concatenation.Task 1.
     */
    public void concat() {
        int a = 1;
        int b = 2;
        String one = "1";
        String h = "hello";
        String w = "world";
        System.out.println(h + w);
        System.out.println(a + b + h);
        System.out.println(one + b + h);
        System.out.println(h + a + b + w);
    }

    /**
     * StringBuilder concatenation.Task 1.
     */
    public void concatBuilder() {
        int a = 1;
        int b = 2;
        StringBuilder one = new StringBuilder("1");
        StringBuilder h = new StringBuilder("hello");
        StringBuilder w = new StringBuilder("world");
        System.out.println(h.toString() + w);
        System.out.println(a + b + h.toString());
        System.out.println(one.toString() + b + h);
        System.out.println(h.toString() + a + b + w);
    }

    /**
     * Take String param and replace spaces with \n literal.Task 2.
     * @param param given line
     */
    public void wordNewLine(String param) {
        System.out.print(param.replace(' ', '\n'));
    }

    /**
     * String reverse.Task 3.
     * @param param given param
     */
    public void reverseString(String param) {
        StringBuilder rev = new StringBuilder(param);
        System.out.println(rev.reverse());
    }

    /**
     * Find and return how many times we find given token in line.Task 4.
     * @param line given line
     * @param token given word
     * @return how many times token in line
     */
    public int countSubString(String line, String token) {
        int count = 0;
        int index = line.indexOf(token);
        while (index != -1) {
            count++;
            index = line.indexOf(token, index + 1);
        }
        return count;
    }

    /**
     * All later print UpperCase for String.Task 5.
     * @param param given param
     */
    public void stringUpperCase(String param) {
        System.out.println(param.toUpperCase());
    }

    /**
     * All later print UpperCase for StringBuilder.Task 5.
     * @param param given param
     */
    public void stringBuilderUpperCase(StringBuilder param) {
        System.out.println(param.toString().toUpperCase());
    }

    /**
     * Check if param length is smaller 20 append * symbol when length equal 20.Task 6.
     * @param param given line
     * @return param
     */
    public StringBuilder twentyLengthString(StringBuilder param) {
        for (int i = 0; i < 20; i++) {
            if (param.length() < 20) {
                param.append('*');
            } else {
                param.delete(20, 100);
            }
        }
        return param;
    }

    /**
     * Delete a symbols in text and print text.Task 7.
     * @param param given param
     */
    public void delete_a_symbol(String param) {
        String[] par = param.split("a");
        for (String i : par) {
            System.out.print(i);
        }
    }

    /**
     * Delete a symbols in text and print text StringBuilder.Task 7.
     * @param param
     */
    public void delete_a_symbolBuilder(StringBuilder param) {
        System.out.println(param.toString().replace("a", ""));
    }

    /**
     * Find and replace a symbols with * symbol.Task 8.
     * @param param given param
     */
    public void replace_a_with_asterisk(String param) {
        System.out.println(param.replace('a', '*'));
    }

    /**
     * Find and print largest word in text.Task 9.
     * @param param given param
     * @return largest word
     */
    public String largestWordInText(String param) {
        String largest = "";
        String[] arr = param.split(" ");
        for (String i : arr) {
            if (i.length() > largest.length()) {
                largest = i;
            }
        }
        return largest;
    }

    /**
     * Find and return first index for given symbol.Task 10.
     * @param param given param
     * @return index
     */
    public int symbolIndex(String param) {
        return param.indexOf('a');
    }

    /**
     * Print at 0 index to n index text.Task 11.
     * @param param given param
     * @param n end index
     */
    public void printSubLine(String param, int n) {
        System.out.println(param.substring(0, n));
    }

    /**
     * Print at 0 index to n index text for StringBuilder.Task 11.
     * @param param given param
     * @param n end index
     */
    public void printSubLine(StringBuilder param, int n) {
        System.out.println(param.substring(0, n));
    }

    /**
     * Check this param is empty and null or no.Task 12.
     * @param param given param
     * @return null or empty or no
     */
    public boolean isStringNullAndEmpty(String param) {
        return param == null || param.isEmpty();
    }

    /**
     * Find the largest word between commas(,).
     * @param text given param
     * @return largest word
     */
    public String largestWordBetweenCommas(String text) {
        String[] arr = text.split(",");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() > arr[i+1].length()){
                arr[i+1] = arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        StringStringBuilder s = new StringStringBuilder();
        Scanner sc = new Scanner(System.in);
        s.concat();

        s.concatBuilder();

        s.wordNewLine("We are living in");

        s.reverseString("simple");

        System.out.println(s.countSubString("We are living in an yellow submarine. We don't  have anything", "in"));

        s.stringUpperCase("hello world");

        s.stringBuilderUpperCase(new StringBuilder("hello world"));

        System.out.print("Enter some word or text >>>");
        System.out.println(s.twentyLengthString(new StringBuilder(sc.nextLine())));

        s.delete_a_symbol("We are living in an yellow submarine. We don't  have anything");

        s.delete_a_symbolBuilder(new StringBuilder("We are living in an yellow submarine. We don't  have anything"));

        s.replace_a_with_asterisk("We are living in an yellow submarine. We don't  have anythingWe are living in an yellow submarine. We don't  have anything");

        System.out.println(s.largestWordInText("We are living in an yellow submarine . We don't  have anything"));

        System.out.println(s.symbolIndex("We are living in an yellow submarine. We don't  have anything"));

        s.printSubLine("We are living in an yellow submarine. We don't  have anything" , 9);
        s.printSubLine(new StringBuilder("We are living in an yellow submarine. We don't  have anything") , 9);

        System.out.println(s.isStringNullAndEmpty(""));

        System.out.println(s.largestWordBetweenCommas("We, are, living, in an, yellow, submarine, We don't, have anything"));
    }
}

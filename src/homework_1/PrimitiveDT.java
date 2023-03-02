package homework_1;

import java.util.Scanner;

public class PrimitiveDT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Group Integers

        //task 1
        System.out.println("Enter integer byte number for variable a >>>> ");
        byte a = sc.nextByte();

        System.out.println("Enter integer byte number for variable b >>>> ");
        byte b = sc.nextByte();

        System.out.println("a = " + a + " b = " +b);

        //task 2
        System.out.println("Enter integer short number for variable c >>>> ");
        short c = sc.nextShort();

        System.out.println("Enter integer short number for variable d >>>> ");
        short d = sc.nextShort();

        System.out.println("c = " + c + " d = " + d);

        //task 3
        System.out.println("Enter integer int number for variable e >>>> ");
        int e = sc.nextInt();

        System.out.println("Enter integer int number for variable f >>>> ");
        int f = sc.nextInt();

        System.out.println("e = " + e + " f = " + f);

        //task 4
        System.out.println("Enter integer long number for variable g >>>> ");
        long g = sc.nextLong();

        System.out.println("Enter integer long number for variable h >>>> ");
        long h = sc.nextLong();

        System.out.println("g = " + g + " h = " + h);

        //task 5
        System.out.println("byte MIN value = " + Byte.MIN_VALUE + " byte MAX value = " + Byte.MAX_VALUE);
        System.out.println("short MIN value = " + Short.MIN_VALUE + " short MAX value = " + Short.MAX_VALUE);
        System.out.println("int MIN value = " + Integer.MIN_VALUE + " int MAX value = " + Integer.MAX_VALUE);
        System.out.println("long MIN value = " + Long.MIN_VALUE + " long MAX value = " + Long.MAX_VALUE);


        //Group Floating point numbers

        //task 6
        System.out.println("Enter float point float number for variable j >>>> ");
        float j = sc.nextFloat();

        System.out.println("Enter float point float number for variable k >>>> ");
        float k = sc.nextFloat();

        System.out.println("j = " + j + " k + " + k);

        //task 7
        System.out.println("Enter float point double number for variable l >>>> ");
        double l = sc.nextDouble();

        System.out.println("Enter float point double number for variable m >>>> ");
        double m = sc.nextDouble();

        System.out.println("l + " + l + " m = " + m);

        //task 8
        System.out.println("float MIN value = " + Float.MIN_VALUE + " float MAX value = " + Float.MAX_VALUE);
        System.out.println("double MIN value = " + Double.MIN_VALUE + " double MAX value = " + Double.MAX_VALUE);

        //task 9
        /*
            * double >>> 34.567839023 , 12.345 , 8923.1234857 , 3456.091
            * float  >>> 12.345 , 3456.091
         */

        //Group Characters

        //task 10
        System.out.println("Enter char for variable n >>>> ");
        char n = sc.next().charAt(0);

        System.out.println("Enter char for variable o >>>> ");
        char o = sc.next().charAt(0);

        System.out.println("n + " + n + " o = " + o);

        //task 11.1
        char s = 'M';
        char w = 'm';

        System.out.println("char s = " + (int) s + " char w = " + (int) w);

        //task 11.2
        char t = '\t';
        System.out.println((int) t);

        //Group Boolean

        //task 12
        System.out.println("Enter boolean for variable p (true or false) >>>> ");
        boolean p = sc.hasNext();

        System.out.println("Enter boolean for variable q (true or false) >>>> ");
        boolean q = sc.hasNext();

        System.out.println("p = " + p + " q = " + q);

        //task 13
        /*
         * int year = 201l;
         * System.out.print (year);
         * This code take compile error, we can't take int variable long number without cast.
         */

        //Widening Casting

        //task 14
        int aa = 7;
        long bb = aa;
        System.out.println(bb);

        //task 15
        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myDouble);

        //Narrowing Casting

        //task 16
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(ii);

        //task 17
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);

        //task 18
        long max = 3123456789L;//long with L
        double ddd = 1000.00;//without _
        char i ='i'; char jj='j'; char ij = (char) (i +jj);//two chars with casting
        int a7 = 8;//variable name can't start with number
        long hhh = 0;
        hhh += 8;//we have not hhh value
        int nnn, mmm = 11; nnn = mmm;//not mmm=nnn

    }
}

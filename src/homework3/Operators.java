package homework3;

public class Operators {
    public static void main(String[] args) {
        //Task 1.

        int a = 8;
        int b = 6;

        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));

        //Task 2.

        double c = 6.4;
        double d = 0.003;

        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c % d = " + (c % d));

        //Task 3.

        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Task 4.

        int e = 10;
        int f = -88;
        boolean n1 = true;

        System.out.println("-e = " + (-e));
        System.out.println("-f = " + (-f));
        System.out.println("+e = " + (+e));
        System.out.println("-e + 92 = " + (-e + 92));
        System.out.println("!n1 = " + !n1);
        System.out.println("!(!n1) = " + !(!n1));
        System.out.println("e++ = " + e++);
        System.out.println("--f = " + (--f));

        int x1 = 3;
        int y1 = ++x * 5 / x-- + --x;

        System.out.println("x is " + x1);
        System.out.println("y is " + y1);

        //Task 5.

        int xx = (int)1.0;
        System.out.println(xx);

        short yy = (short)1921222;
        System.out.println(yy);

        System.out.print(2147483647+1);

        long yl = (x=3);
        System.out.println(yl);

        boolean yb = false;
        boolean xb = (yb = true);
        System.out.println(xb);

        //Task 6.

        int aa = 10;
        int bb = 20;

        System.out.println(aa < bb);
        System.out.println(aa <= bb);
        System.out.println(aa >= bb);
        System.out.println(aa > bb);

        //Task 7.

        float yf = 2.1f; // float with f

        byte xby = 5;
        byte yby = 10;
        byte z = (byte) (xby + yby); //two byte + is int

        short xsh = 10;
        short ysh = 2;
        short zsh = (short) (xsh * ysh); // two shorts * is int

        long xl = 10L;
        int yi = 5;
        yi = (int) (yi * xl); // with int cast

        //Task 8.

        int i = 10;
        int j = 5;
        int l = i;

        System.out.println("j = " + l);
        System.out.println("i = " + j);

        //Task 9.

        System.out.println("i = " + (i = j));
        System.out.println("j = " + (2 * j));

        //Task 10.

        int v = 100;
        System.out.println(v * (v - 1) / 2);

        //Task 11.

        int k = 8;
        int h = 3;

        System.out.println("k & h = " + (k & h));
        System.out.println("k ^ h = " + (k ^ h));
        System.out.println("k | h = " + (k | h));
        System.out.println("~k = " + ~k);
        System.out.println("true || (k < 4) = " + (true || (k < 4)));
        System.out.println(" (h >= 6) || (++k <= 7) = " + ((h >= 6) || (++k <= 7)));
        System.out.println("(k<h)?k:h = " + ((k<h)?k:h));
        System.out.println("h^h = " + (h^h));

        //Task 12.

        System.out.println(10 << 2);
        System.out.println(-10 << 2);
        System.out.println(20 >> 2);
        System.out.println(15 >> 2);

        // Task 13.

        int q = 3;

        System.out.println(q << 3);
        System.out.println(q << 4);
    }

}

package homework_10.inheritance;

public class SubClass extends SuperClass {
    String message = "Hello SubClass class";

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        System.out.println(sc.message);
        System.out.println(((SuperClass)sc).message);
    }
}

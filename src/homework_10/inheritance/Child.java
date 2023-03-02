package homework_10.inheritance;

public class Child extends Parent {
    @Override
    public void showMessage() {
        System.out.println("Hello Child class");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.showMessage();
        ((Parent)ch).showMessage();
    }
}

package homework_10.abstract_and_interface;

public class ChildSecond extends Parent {
    @Override
    public void message() {

    }

    public static void main(String[] args) {
        ChildOne one = new ChildOne();
        one.message();
        ChildSecond two = new ChildSecond();
        two.message();
    }
}

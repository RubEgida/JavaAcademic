package homework_10.abstract_and_interface;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square is drawn");
    }

    @Override
    void erase() {
        System.out.println("Square is erased");
    }
}
